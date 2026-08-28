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

public class fne implements fnb {
   private final djk a;
   private final List<fnh> b;
   private final Set<dxx<?>> c = Sets.newHashSet();
   private final List<fnf> d = Lists.newArrayList();

   private fne(djk $$0, List<fnh> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fne a(fnf $$0) {
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
      Stream<Pair<fng, List<fnh>>> $$0 = Stream.of(Pair.of(fng.a(), this.b));

      for (fnf $$1 : this.d) {
         Map<fng, List<fnh>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fng $$2x = ((fng)$$1.getFirst()).a((fng)$$1xx.getKey());
               List<fnh> $$3 = a((List<fnh>)$$1.getSecond(), (List<fnh>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fng)$$1.getFirst()).b(), fnh.a((List<fnh>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<fnh> a(List<fnh> $$0, List<fnh> $$1) {
      Builder<fnh> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(fnh.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public djk a() {
      return this.a;
   }

   public static fne a(djk $$0) {
      return new fne($$0, ImmutableList.of(fnh.a()));
   }

   public static fne a(djk $$0, fnh $$1) {
      return new fne($$0, ImmutableList.of($$1));
   }

   public static fne a(djk $$0, fnh... $$1) {
      return new fne($$0, ImmutableList.copyOf($$1));
   }
}
