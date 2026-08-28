import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class czl {
   public static final czl a = new czl(List.of());
   public static final Codec<czl> b = cxg.a.listOf().xmap(czl::new, $$0 -> $$0.d);
   public static final zi<wv, czl> c = cxg.h.a(zg.a()).a(czl::new, $$0 -> $$0.d);
   private final List<cxg> d;

   private czl(List<cxg> $$0) {
      this.d = $$0;
   }

   public static czl a(cxg $$0) {
      return new czl(List.of($$0.v()));
   }

   public static czl a(List<cxg> $$0) {
      return new czl(List.copyOf(Lists.transform($$0, cxg::v)));
   }

   public boolean a(cxc $$0) {
      for (cxg $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cxg> a() {
      return Lists.transform(this.d, cxg::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czl $$1 && cxg.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxg.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
