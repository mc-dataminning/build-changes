import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class czp {
   public static final czp a = new czp(List.of());
   public static final Codec<czp> b = cxk.b.listOf().xmap(czp::new, $$0 -> $$0.d);
   public static final zt<xg, czp> c = cxk.i.a(zr.a()).a(czp::new, $$0 -> $$0.d);
   private final List<cxk> d;

   private czp(List<cxk> $$0) {
      this.d = $$0;
   }

   public static czp a(cxk $$0) {
      return new czp(List.of($$0.v()));
   }

   public static czp a(List<cxk> $$0) {
      return new czp(List.copyOf(Lists.transform($$0, cxk::v)));
   }

   public boolean a(cxg $$0) {
      for (cxk $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cxk> a() {
      return Lists.transform(this.d, cxk::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czp $$1 && cxk.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxk.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
