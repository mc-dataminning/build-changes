import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class czu {
   public static final czu a = new czu(List.of());
   public static final Codec<czu> b = cxp.a.listOf().xmap(czu::new, $$0 -> $$0.d);
   public static final zt<xg, czu> c = cxp.h.a(zr.a()).a(czu::new, $$0 -> $$0.d);
   private final List<cxp> d;

   private czu(List<cxp> $$0) {
      this.d = $$0;
   }

   public static czu a(cxp $$0) {
      return new czu(List.of($$0.v()));
   }

   public static czu a(List<cxp> $$0) {
      return new czu(List.copyOf(Lists.transform($$0, cxp::v)));
   }

   public boolean a(cxl $$0) {
      for (cxp $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cxp> a() {
      return Lists.transform(this.d, cxp::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czu $$1 && cxp.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxp.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
