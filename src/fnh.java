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

public class fnh implements fne {
   private final djm a;
   private final List<fnk> b;
   private final Set<dxz<?>> c = Sets.newHashSet();
   private final List<fni> d = Lists.newArrayList();

   private fnh(djm $$0, List<fnk> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fnh a(fni $$0) {
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
      Stream<Pair<fnj, List<fnk>>> $$0 = Stream.of(Pair.of(fnj.a(), this.b));

      for (fni $$1 : this.d) {
         Map<fnj, List<fnk>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fnj $$2x = ((fnj)$$1.getFirst()).a((fnj)$$1xx.getKey());
               List<fnk> $$3 = a((List<fnk>)$$1.getSecond(), (List<fnk>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fnj)$$1.getFirst()).b(), fnk.a((List<fnk>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<fnk> a(List<fnk> $$0, List<fnk> $$1) {
      Builder<fnk> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(fnk.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public djm a() {
      return this.a;
   }

   public static fnh a(djm $$0) {
      return new fnh($$0, ImmutableList.of(fnk.a()));
   }

   public static fnh a(djm $$0, fnk $$1) {
      return new fnh($$0, ImmutableList.of($$1));
   }

   public static fnh a(djm $$0, fnk... $$1) {
      return new fnh($$0, ImmutableList.copyOf($$1));
   }
}
