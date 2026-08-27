import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public record ai(List<List<String>> c) {
   public static final Codec<ai> a = Codec.STRING.listOf().listOf().xmap(ai::new, ai::d);
   public static final ai b = new ai(List.of());

   public ai(vx $$0) {
      this($$0.a((yw<? super vx, List<String>>)($$0x -> $$0x.a(vx::p))));
   }

   public void a(vx $$0) {
      $$0.a(this.c, ($$0x, $$1) -> $$0x.a($$1, vx::a));
   }

   public static ai a(Collection<String> $$0) {
      return new ai($$0.stream().map(List::of).toList());
   }

   public static ai b(Collection<String> $$0) {
      return new ai(List.of(List.copyOf($$0)));
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

   public DataResult<ai> a(Set<String> $$0) {
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
      ai.a a = ai::a;
      ai.a b = ai::b;

      ai create(Collection<String> var1);
   }
}
