import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cvl {
   public static final cvl a = new cvl(List.of());
   public static final Codec<cvl> b = csz.a.listOf().xmap(cvl::new, $$0 -> $$0.d);
   public static final ys<wf, cvl> c = csz.f.a(yq.a()).a(cvl::new, $$0 -> $$0.d);
   private final List<csz> d;

   private cvl(List<csz> $$0) {
      this.d = $$0;
   }

   public static cvl a(csz $$0) {
      return new cvl(List.of($$0.r()));
   }

   public static cvl a(List<csz> $$0) {
      return new cvl(Lists.transform($$0, csz::r));
   }

   public boolean a(csu $$0) {
      for (csz $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<csz> a() {
      return Lists.transform(this.d, csz::r);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cvl $$1 && csz.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return csz.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
