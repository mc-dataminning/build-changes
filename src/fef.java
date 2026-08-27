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

public class fef extends aub<Map<String, List<fef.a>>> implements AutoCloseable {
   private static final Codec<Map<String, List<fef.a>>> a = Codec.unboundedMap(
      Codec.STRING,
      RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.LONG.optionalFieldOf("delay", 0L).forGetter(fef.a::a),
                     Codec.LONG.fieldOf("period").forGetter(fef.a::b),
                     Codec.STRING.fieldOf("title").forGetter(fef.a::c),
                     Codec.STRING.fieldOf("message").forGetter(fef.a::d)
                  )
                  .apply($$0, fef.a::new)
         )
         .listOf()
   );
   private static final Logger b = LogUtils.getLogger();
   private final akm c;
   private final Object2BooleanFunction<String> d;
   @Nullable
   private Timer e;
   @Nullable
   private fef.b f;

   public fef(akm $$0, Object2BooleanFunction<String> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   protected Map<String, List<fef.a>> a(atw $$0, bmi $$1) {
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

   protected void a(Map<String, List<fef.a>> $$0, atw $$1, bmi $$2) {
      List<fef.a> $$3 = $$0.entrySet()
         .stream()
         .filter($$0x -> (Boolean)this.d.apply((String)$$0x.getKey()))
         .map(Entry::getValue)
         .flatMap(Collection::stream)
         .collect(Collectors.toList());
      if ($$3.isEmpty()) {
         this.a();
      } else if ($$3.stream().anyMatch($$0x -> $$0x.b == 0L)) {
         ac.a("A periodic notification in " + this.c + " has a period of zero minutes");
         this.a();
      } else {
         long $$4 = this.a($$3);
         long $$5 = this.a($$3, $$4);
         if (this.e == null) {
            this.e = new Timer();
         }

         if (this.f == null) {
            this.f = new fef.b($$3, $$4, $$5);
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

   private long a(List<fef.a> $$0, long $$1) {
      return $$0.stream().mapToLong($$1x -> {
         long $$2 = $$1x.a - $$1;
         return LongMath.gcd($$2, $$1x.b);
      }).reduce(LongMath::gcd).orElseThrow(() -> new IllegalStateException("Empty notifications from: " + this.c));
   }

   private long a(List<fef.a> $$0) {
      return $$0.stream().mapToLong($$0x -> $$0x.a).min().orElse(0L);
   }

   public static record a(long a, long b, String c, String d) {

      public a(long a, long b, String c, String d) {
         this.a = a != 0L ? a : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }
   }

   static class b extends TimerTask {
      private final fdz a = fdz.Q();
      private final List<fef.a> b;
      private final long c;
      private final AtomicLong d;

      public b(List<fef.a> $$0, long $$1, long $$2) {
         this.b = $$0;
         this.c = $$2;
         this.d = new AtomicLong($$1);
      }

      public fef.b a(List<fef.a> $$0, long $$1) {
         this.cancel();
         return new fef.b($$0, this.d.get(), $$1);
      }

      @Override
      public void run() {
         long $$0 = this.d.getAndAdd(this.c);
         long $$1 = this.d.get();

         for (fef.a $$2 : this.b) {
            if ($$0 >= $$2.a) {
               long $$3 = $$0 / $$2.b;
               long $$4 = $$1 / $$2.b;
               if ($$3 != $$4) {
                  this.a.execute(() -> fih.a(fdz.Q().aA(), fih.a.f, wx.a($$2.c, $$3), wx.a($$2.d, $$3)));
                  return;
               }
            }
         }
      }
   }
}
