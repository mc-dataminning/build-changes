import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cxe {
   public static final cxe a = new cxe(List.of());
   public static final Codec<cxe> b = cuh.a.listOf().xmap(cxe::new, $$0 -> $$0.d);
   public static final zc<wp, cxe> c = cuh.f.a(za.a()).a(cxe::new, $$0 -> $$0.d);
   private final List<cuh> d;

   private cxe(List<cuh> $$0) {
      this.d = $$0;
   }

   public static cxe a(cuh $$0) {
      return new cxe(List.of($$0.r()));
   }

   public static cxe a(List<cuh> $$0) {
      return new cxe(Lists.transform($$0, cuh::r));
   }

   public boolean a(cuc $$0) {
      for (cuh $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cuh> a() {
      return Lists.transform(this.d, cuh::r);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxe $$1 && cuh.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cuh.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
