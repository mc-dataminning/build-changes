import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cys {
   public static final cys a = new cys(List.of());
   public static final Codec<cys> b = cwn.a.listOf().xmap(cys::new, $$0 -> $$0.d);
   public static final ym<vz, cys> c = cwn.h.a(yk.a()).a(cys::new, $$0 -> $$0.d);
   private final List<cwn> d;

   private cys(List<cwn> $$0) {
      this.d = $$0;
   }

   public static cys a(cwn $$0) {
      return new cys(List.of($$0.v()));
   }

   public static cys a(List<cwn> $$0) {
      return new cys(List.copyOf(Lists.transform($$0, cwn::v)));
   }

   public boolean a(cwj $$0) {
      for (cwn $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cwn> a() {
      return Lists.transform(this.d, cwn::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cys $$1 && cwn.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwn.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
