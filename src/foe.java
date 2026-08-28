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

public class foe implements fob {
   private final dke a;
   private final List<foh> b;
   private final Set<dyt<?>> c = Sets.newHashSet();
   private final List<fof> d = Lists.newArrayList();

   private foe(dke $$0, List<foh> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public foe a(fof $$0) {
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
      Stream<Pair<fog, List<foh>>> $$0 = Stream.of(Pair.of(fog.a(), this.b));

      for (fof $$1 : this.d) {
         Map<fog, List<foh>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               fog $$2x = ((fog)$$1.getFirst()).a((fog)$$1xx.getKey());
               List<foh> $$3 = a((List<foh>)$$1.getSecond(), (List<foh>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((fog)$$1.getFirst()).b(), foh.a((List<foh>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", af.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<foh> a(List<foh> $$0, List<foh> $$1) {
      Builder<foh> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(foh.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dke a() {
      return this.a;
   }

   public static foe a(dke $$0) {
      return new foe($$0, ImmutableList.of(foh.a()));
   }

   public static foe a(dke $$0, foh $$1) {
      return new foe($$0, ImmutableList.of($$1));
   }

   public static foe a(dke $$0, foh... $$1) {
      return new foe($$0, ImmutableList.copyOf($$1));
   }
}
