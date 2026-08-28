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

public class fqr implements fqo {
   private final dma a;
   private final List<fqu> b;
   private final Set<ebc<?>> c = Sets.newHashSet();
   private final List<fqs> d = Lists.newArrayList();

   private fqr(dma $$0, List<fqu> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fqr a(fqs $$0) {
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
      Stream<Pair<fqt, List<fqu>>> $$0 = Stream.of(Pair.of(fqt.a(), this.b));

      for (fqs $$1 : this.d) {
         Map<fqt, List<fqu>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fqt $$2x = ((fqt)$$1.getFirst()).a((fqt)$$1xx.getKey());
               List<fqu> $$3 = a((List<fqu>)$$1.getSecond(), (List<fqu>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fqt)$$1.getFirst()).b(), fqu.a((List<fqu>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<fqu> a(List<fqu> $$0, List<fqu> $$1) {
      Builder<fqu> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(fqu.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dma a() {
      return this.a;
   }

   public static fqr a(dma $$0) {
      return new fqr($$0, ImmutableList.of(fqu.a()));
   }

   public static fqr a(dma $$0, fqu $$1) {
      return new fqr($$0, ImmutableList.of($$1));
   }

   public static fqr a(dma $$0, fqu... $$1) {
      return new fqr($$0, ImmutableList.copyOf($$1));
   }
}
