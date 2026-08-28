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

public class fqy implements fqv {
   private final dmf a;
   private final List<frb> b;
   private final Set<ebk<?>> c = Sets.newHashSet();
   private final List<fqz> d = Lists.newArrayList();

   private fqy(dmf $$0, List<frb> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fqy a(fqz $$0) {
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
      Stream<Pair<fra, List<frb>>> $$0 = Stream.of(Pair.of(fra.a(), this.b));

      for (fqz $$1 : this.d) {
         Map<fra, List<frb>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fra $$2x = ((fra)$$1.getFirst()).a((fra)$$1xx.getKey());
               List<frb> $$3 = a((List<frb>)$$1.getSecond(), (List<frb>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fra)$$1.getFirst()).b(), frb.a((List<frb>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<frb> a(List<frb> $$0, List<frb> $$1) {
      Builder<frb> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(frb.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dmf a() {
      return this.a;
   }

   public static fqy a(dmf $$0) {
      return new fqy($$0, ImmutableList.of(frb.a()));
   }

   public static fqy a(dmf $$0, frb $$1) {
      return new fqy($$0, ImmutableList.of($$1));
   }

   public static fqy a(dmf $$0, frb... $$1) {
      return new fqy($$0, ImmutableList.copyOf($$1));
   }
}
