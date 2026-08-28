import com.google.common.collect.ImmutableMap;
import com.google.common.math.LongMath;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunction;
import java.io.Reader;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fri extends avk<Map<String, List<fri.a>>> implements AutoCloseable {
   private static final Codec<Map<String, List<fri.a>>> a = Codec.unboundedMap(
      Codec.STRING,
      RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.LONG.optionalFieldOf("delay", 0L).forGetter(fri.a::a),
                     Codec.LONG.fieldOf("period").forGetter(fri.a::b),
                     Codec.STRING.fieldOf("title").forGetter(fri.a::c),
                     Codec.STRING.fieldOf("message").forGetter(fri.a::d)
                  )
                  .apply($$0, fri.a::new)
         )
         .listOf()
   );
   private static final Logger b = LogUtils.getLogger();
   private final ali c;
   private final Object2BooleanFunction<String> d;
   @Nullable
   private Timer e;
   @Nullable
   private fri.b f;

   public fri(ali $$0, Object2BooleanFunction<String> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected Map<String, List<fri.a>> a(avf $$0, brb $$1) {
      try {
         Map var4;
         try (Reader $$2 = $$0.openAsReader(this.c)) {
            var4 = (Map)a.parse(JsonOps.INSTANCE, JsonParser.parseReader($$2)).result().orElseThrow();
         }

         return var4;
      } catch (Exception var8) {
         b.warn("Failed to load {}", this.c, var8);
         return ImmutableMap.of();
      }
   }

   protected void a(Map<String, List<fri.a>> $$0, avf $$1, brb $$2) {
      List<fri.a> $$3 = $$0.entrySet()
         .stream()
         .filter($$0x -> (Boolean)this.d.apply((String)$$0x.getKey()))
         .map(Entry::getValue)
         .flatMap(Collection::stream)
         .collect(Collectors.toList());
      if ($$3.isEmpty()) {
         this.a();
      } else if ($$3.stream().anyMatch($$0x -> $$0x.b == 0L)) {
         ag.b("A periodic notification in " + this.c + " has a period of zero minutes");
         this.a();
      } else {
         long $$4 = this.a($$3);
         long $$5 = this.a($$3, $$4);
         if (this.e == null) {
            this.e = new Timer();
         }

         if (this.f == null) {
            this.f = new fri.b($$3, $$4, $$5);
         } else {
            this.f = this.f.a($$3, $$5);
         }

         this.e.scheduleAtFixedRate(this.f, TimeUnit.MINUTES.toMillis($$4), TimeUnit.MINUTES.toMillis($$5));
      }
   }

   @Override
   public void close() {
      this.a();
   }

   private void a() {
      if (this.e != null) {
         this.e.cancel();
      }
   }

   private long a(List<fri.a> $$0, long $$1) {
      return $$0.stream().mapToLong($$1x -> {
         long $$2 = $$1x.a - $$1;
         return LongMath.gcd($$2, $$1x.b);
      }).reduce(LongMath::gcd).orElseThrow(() -> new IllegalStateException("Empty notifications from: " + this.c));
   }

   private long a(List<fri.a> $$0) {
      return $$0.stream().mapToLong($$0x -> $$0x.a).min().orElse(0L);
   }

   public static record a(long a, long b, String c, String d) {

      public a(final long a, final long b, final String c, final String d) {
         this.a = a != 0L ? a : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }
   }

   static class b extends TimerTask {
      private final frd a = frd.Q();
      private final List<fri.a> b;
      private final long c;
      private final AtomicLong d;

      public b(List<fri.a> $$0, long $$1, long $$2) {
         this.b = $$0;
         this.c = $$2;
         this.d = new AtomicLong($$1);
      }

      public fri.b a(List<fri.a> $$0, long $$1) {
         this.cancel();
         return new fri.b($$0, this.d.get(), $$1);
      }

      @Override
      public void run() {
         long $$0 = this.d.getAndAdd(this.c);
         long $$1 = this.d.get();

         for (fri.a $$2 : this.b) {
            if ($$0 >= $$2.a) {
               long $$3 = $$0 / $$2.b;
               long $$4 = $$1 / $$2.b;
               if ($$3 != $$4) {
                  this.a.execute(() -> fwu.a(frd.Q().aA(), fwu.a.g, xa.a($$2.c, $$3), xa.a($$2.d, $$3)));
                  return;
               }
            }
         }
      }
   }
}
