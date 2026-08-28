import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cyc {
   public static final cyc a = new cyc(List.of());
   public static final Codec<cyc> b = cvx.b.listOf().xmap(cyc::new, $$0 -> $$0.d);
   public static final zf<ws, cyc> c = cvx.i.a(zd.a()).a(cyc::new, $$0 -> $$0.d);
   private final List<cvx> d;

   private cyc(List<cvx> $$0) {
      this.d = $$0;
   }

   public static cyc a(cvx $$0) {
      return new cyc(List.of($$0.v()));
   }

   public static cyc a(List<cvx> $$0) {
      return new cyc(List.copyOf(Lists.transform($$0, cvx::v)));
   }

   public boolean a(cvt $$0) {
      for (cvx $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cvx> a() {
      return Lists.transform(this.d, cvx::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyc $$1 && cvx.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cvx.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
