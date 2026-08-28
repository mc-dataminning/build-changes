import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class czt {
   public static final czt a = new czt(List.of());
   public static final Codec<czt> b = cxo.b.listOf().xmap(czt::new, $$0 -> $$0.d);
   public static final zt<xg, czt> c = cxo.i.a(zr.a()).a(czt::new, $$0 -> $$0.d);
   private final List<cxo> d;

   private czt(List<cxo> $$0) {
      this.d = $$0;
   }

   public static czt a(cxo $$0) {
      return new czt(List.of($$0.v()));
   }

   public static czt a(List<cxo> $$0) {
      return new czt(List.copyOf(Lists.transform($$0, cxo::v)));
   }

   public boolean a(cxk $$0) {
      for (cxo $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cxo> a() {
      return Lists.transform(this.d, cxo::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czt $$1 && cxo.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxo.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
