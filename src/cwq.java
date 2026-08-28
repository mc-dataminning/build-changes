import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cwq {
   public static final cwq a = new cwq(List.of());
   public static final Codec<cwq> b = cud.b.listOf().xmap(cwq::new, $$0 -> $$0.d);
   public static final ys<wf, cwq> c = cud.i.a(yq.a()).a(cwq::new, $$0 -> $$0.d);
   private final List<cud> d;

   private cwq(List<cud> $$0) {
      this.d = $$0;
   }

   public static cwq a(cud $$0) {
      return new cwq(List.of($$0.s()));
   }

   public static cwq a(List<cud> $$0) {
      return new cwq(List.copyOf(Lists.transform($$0, cud::s)));
   }

   public boolean a(cty $$0) {
      for (cud $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cud> a() {
      return Lists.transform(this.d, cud::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwq $$1 && cud.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cud.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
