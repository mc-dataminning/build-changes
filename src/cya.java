import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cya {
   public static final cya a = new cya(List.of());
   public static final Codec<cya> b = cvp.b.listOf().xmap(cya::new, $$0 -> $$0.d);
   public static final zb<wo, cya> c = cvp.i.a(yz.a()).a(cya::new, $$0 -> $$0.d);
   private final List<cvp> d;

   private cya(List<cvp> $$0) {
      this.d = $$0;
   }

   public static cya a(cvp $$0) {
      return new cya(List.of($$0.u()));
   }

   public static cya a(List<cvp> $$0) {
      return new cya(List.copyOf(Lists.transform($$0, cvp::u)));
   }

   public boolean a(cvk $$0) {
      for (cvp $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cvp> a() {
      return Lists.transform(this.d, cvp::u);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cya $$1 && cvp.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cvp.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
