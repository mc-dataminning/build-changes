import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class czk {
   public static final czk a = new czk(List.of());
   public static final Codec<czk> b = cxh.b.listOf().xmap(czk::new, $$0 -> $$0.d);
   public static final yn<wa, czk> c = cxh.i.a(yl.a()).a(czk::new, $$0 -> $$0.d);
   private final List<cxh> d;

   private czk(List<cxh> $$0) {
      this.d = $$0;
   }

   public static czk a(cxh $$0) {
      return new czk(List.of($$0.v()));
   }

   public static czk a(List<cxh> $$0) {
      return new czk(List.copyOf(Lists.transform($$0, cxh::v)));
   }

   public boolean a(cxd $$0) {
      for (cxh $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cxh> a() {
      return Lists.transform(this.d, cxh::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czk $$1 && cxh.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxh.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
