import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cxz {
   public static final cxz a = new cxz(List.of());
   public static final Codec<cxz> b = cvl.b.listOf().xmap(cxz::new, $$0 -> $$0.d);
   public static final zb<wo, cxz> c = cvl.i.a(yz.a()).a(cxz::new, $$0 -> $$0.d);
   private final List<cvl> d;

   private cxz(List<cvl> $$0) {
      this.d = $$0;
   }

   public static cxz a(cvl $$0) {
      return new cxz(List.of($$0.u()));
   }

   public static cxz a(List<cvl> $$0) {
      return new cxz(List.copyOf(Lists.transform($$0, cvl::u)));
   }

   public boolean a(cvg $$0) {
      for (cvl $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cvl> a() {
      return Lists.transform(this.d, cvl::u);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxz $$1 && cvl.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cvl.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
