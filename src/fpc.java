import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class fpc implements foz {
   private final dku a;
   private final List<fpf> b;
   private final Set<dzp<?>> c = Sets.newHashSet();
   private final List<fpd> d = Lists.newArrayList();

   private fpc(dku $$0, List<fpf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fpc a(fpd $$0) {
      $$0.b().forEach($$0x -> {
         if (this.a.l().a($$0x.f()) != $$0x) {
            throw new IllegalStateException("Property " + $$0x + " is not defined for block " + this.a);
         } else if (!this.c.add($$0x)) {
            throw new IllegalStateException("Values of property " + $$0x + " already defined for block " + this.a);
         }
      });
      this.d.add($$0);
      return this;
   }

   public JsonElement b() {
      Stream<Pair<fpe, List<fpf>>> $$0 = Stream.of(Pair.of(fpe.a(), this.b));

      for (fpd $$1 : this.d) {
         Map<fpe, List<fpf>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fpe $$2x = ((fpe)$$1.getFirst()).a((fpe)$$1xx.getKey());
               List<fpf> $$3 = a((List<fpf>)$$1.getSecond(), (List<fpf>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fpe)$$1.getFirst()).b(), fpf.a((List<fpf>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<fpf> a(List<fpf> $$0, List<fpf> $$1) {
      Builder<fpf> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(fpf.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dku a() {
      return this.a;
   }

   public static fpc a(dku $$0) {
      return new fpc($$0, ImmutableList.of(fpf.a()));
   }

   public static fpc a(dku $$0, fpf $$1) {
      return new fpc($$0, ImmutableList.of($$1));
   }

   public static fpc a(dku $$0, fpf... $$1) {
      return new fpc($$0, ImmutableList.copyOf($$1));
   }
}
