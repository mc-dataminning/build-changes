import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cub {
   public static final cub a = new cub(List.of());
   public static final Codec<cub> b = crs.a.listOf().xmap(cub::new, $$0 -> $$0.d);
   public static final yg<vt, cub> c = crs.f.a(ye.a()).a(cub::new, $$0 -> $$0.d);
   private final List<crs> d;

   private cub(List<crs> $$0) {
      this.d = $$0;
   }

   public static cub a(crs $$0) {
      return new cub(List.of($$0.r()));
   }

   public static cub a(List<crs> $$0) {
      return new cub(Lists.transform($$0, crs::r));
   }

   public boolean a(crn $$0) {
      for (crs $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<crs> a() {
      return Lists.transform(this.d, crs::r);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cub $$1 && crs.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return crs.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
