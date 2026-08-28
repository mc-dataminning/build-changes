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

public class fqf implements fqc {
   private final dlu a;
   private final List<fqi> b;
   private final Set<ear<?>> c = Sets.newHashSet();
   private final List<fqg> d = Lists.newArrayList();

   private fqf(dlu $$0, List<fqi> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fqf a(fqg $$0) {
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
      Stream<Pair<fqh, List<fqi>>> $$0 = Stream.of(Pair.of(fqh.a(), this.b));

      for (fqg $$1 : this.d) {
         Map<fqh, List<fqi>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fqh $$2x = ((fqh)$$1.getFirst()).a((fqh)$$1xx.getKey());
               List<fqi> $$3 = a((List<fqi>)$$1.getSecond(), (List<fqi>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fqh)$$1.getFirst()).b(), fqi.a((List<fqi>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<fqi> a(List<fqi> $$0, List<fqi> $$1) {
      Builder<fqi> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(fqi.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dlu a() {
      return this.a;
   }

   public static fqf a(dlu $$0) {
      return new fqf($$0, ImmutableList.of(fqi.a()));
   }

   public static fqf a(dlu $$0, fqi $$1) {
      return new fqf($$0, ImmutableList.of($$1));
   }

   public static fqf a(dlu $$0, fqi... $$1) {
      return new fqf($$0, ImmutableList.copyOf($$1));
   }
}
