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

public class fng implements fnd {
   private final djm a;
   private final List<fnj> b;
   private final Set<dxz<?>> c = Sets.newHashSet();
   private final List<fnh> d = Lists.newArrayList();

   private fng(djm $$0, List<fnj> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fng a(fnh $$0) {
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
      Stream<Pair<fni, List<fnj>>> $$0 = Stream.of(Pair.of(fni.a(), this.b));

      for (fnh $$1 : this.d) {
         Map<fni, List<fnj>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fni $$2x = ((fni)$$1.getFirst()).a((fni)$$1xx.getKey());
               List<fnj> $$3 = a((List<fnj>)$$1.getSecond(), (List<fnj>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fni)$$1.getFirst()).b(), fnj.a((List<fnj>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<fnj> a(List<fnj> $$0, List<fnj> $$1) {
      Builder<fnj> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(fnj.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public djm a() {
      return this.a;
   }

   public static fng a(djm $$0) {
      return new fng($$0, ImmutableList.of(fnj.a()));
   }

   public static fng a(djm $$0, fnj $$1) {
      return new fng($$0, ImmutableList.of($$1));
   }

   public static fng a(djm $$0, fnj... $$1) {
      return new fng($$0, ImmutableList.copyOf($$1));
   }
}
