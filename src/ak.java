import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public record ak(List<List<String>> c) {
   public static final Codec<ak> a = Codec.STRING.listOf().listOf().xmap(ak::new, ak::d);
   public static final ak b = new ak(List.of());

   public ak(wi $$0) {
      this($$0.a((zk<? super wi, List<String>>)($$0x -> $$0x.a(wi::p))));
   }

   public void a(wi $$0) {
      $$0.a(this.c, ($$0x, $$1) -> $$0x.a($$1, wi::a));
   }

   public static ak a(Collection<String> $$0) {
      return new ak($$0.stream().map(List::of).toList());
   }

   public static ak b(Collection<String> $$0) {
      return new ak(List.of(List.copyOf($$0)));
   }

   public int a() {
      return this.c.size();
   }

   public boolean a(Predicate<String> $$0) {
      if (this.c.isEmpty()) {
         return false;
      } else {
         for (List<String> $$1 : this.c) {
            if (!a($$1, $$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public int b(Predicate<String> $$0) {
      int $$1 = 0;

      for (List<String> $$2 : this.c) {
         if (a($$2, $$0)) {
            $$1++;
         }
      }

      return $$1;
   }

   private static boolean a(List<String> $$0, Predicate<String> $$1) {
      for (String $$2 : $$0) {
         if ($$1.test($$2)) {
            return true;
         }
      }

      return false;
   }

   public DataResult<ak> a(Set<String> $$0) {
      Set<String> $$1 = new ObjectOpenHashSet();

      for (List<String> $$2 : this.c) {
         if ($$2.isEmpty() && $$0.isEmpty()) {
            return DataResult.error(() -> "Requirement entry cannot be empty");
         }

         $$1.addAll($$2);
      }

      if (!$$0.equals($$1)) {
         Set<String> $$3 = Sets.difference($$0, $$1);
         Set<String> $$4 = Sets.difference($$1, $$0);
         return DataResult.error(() -> "Advancement completion requirements did not exactly match specified criteria. Missing: " + $$3 + ". Unknown: " + $$4);
      } else {
         return DataResult.success(this);
      }
   }

   public boolean b() {
      return this.c.isEmpty();
   }

   @Override
   public String toString() {
      return this.c.toString();
   }

   public Set<String> c() {
      Set<String> $$0 = new ObjectOpenHashSet();

      for (List<String> $$1 : this.c) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public List<List<String>> d() {
      return this.c;
   }

   public interface a {
      ak.a a = ak::a;
      ak.a b = ak::b;

      ak create(Collection<String> var1);
   }
}
