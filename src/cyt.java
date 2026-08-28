import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cyt {
   public static final cyt a = new cyt(List.of());
   public static final Codec<cyt> b = cwo.a.listOf().xmap(cyt::new, $$0 -> $$0.d);
   public static final yn<wa, cyt> c = cwo.h.a(yl.a()).a(cyt::new, $$0 -> $$0.d);
   private final List<cwo> d;

   private cyt(List<cwo> $$0) {
      this.d = $$0;
   }

   public static cyt a(cwo $$0) {
      return new cyt(List.of($$0.v()));
   }

   public static cyt a(List<cwo> $$0) {
      return new cyt(List.copyOf(Lists.transform($$0, cwo::v)));
   }

   public boolean a(cwk $$0) {
      for (cwo $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cwo> a() {
      return Lists.transform(this.d, cwo::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyt $$1 && cwo.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwo.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
