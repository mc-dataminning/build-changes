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

public class fni implements fnf {
   private final djn a;
   private final List<fnl> b;
   private final Set<dya<?>> c = Sets.newHashSet();
   private final List<fnj> d = Lists.newArrayList();

   private fni(djn $$0, List<fnl> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fni a(fnj $$0) {
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
      Stream<Pair<fnk, List<fnl>>> $$0 = Stream.of(Pair.of(fnk.a(), this.b));

      for (fnj $$1 : this.d) {
         Map<fnk, List<fnl>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fnk $$2x = ((fnk)$$1.getFirst()).a((fnk)$$1xx.getKey());
               List<fnl> $$3 = a((List<fnl>)$$1.getSecond(), (List<fnl>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fnk)$$1.getFirst()).b(), fnl.a((List<fnl>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<fnl> a(List<fnl> $$0, List<fnl> $$1) {
      Builder<fnl> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(fnl.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public djn a() {
      return this.a;
   }

   public static fni a(djn $$0) {
      return new fni($$0, ImmutableList.of(fnl.a()));
   }

   public static fni a(djn $$0, fnl $$1) {
      return new fni($$0, ImmutableList.of($$1));
   }

   public static fni a(djn $$0, fnl... $$1) {
      return new fni($$0, ImmutableList.copyOf($$1));
   }
}
