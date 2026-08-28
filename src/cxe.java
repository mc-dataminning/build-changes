import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cxe {
   public static final cxe a = new cxe(List.of());
   public static final Codec<cxe> b = cuq.b.listOf().xmap(cxe::new, $$0 -> $$0.d);
   public static final zn<xa, cxe> c = cuq.i.a(zl.a()).a(cxe::new, $$0 -> $$0.d);
   private final List<cuq> d;

   private cxe(List<cuq> $$0) {
      this.d = $$0;
   }

   public static cxe a(cuq $$0) {
      return new cxe(List.of($$0.s()));
   }

   public static cxe a(List<cuq> $$0) {
      return new cxe(List.copyOf(Lists.transform($$0, cuq::s)));
   }

   public boolean a(cul $$0) {
      for (cuq $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cuq> a() {
      return Lists.transform(this.d, cuq::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxe $$1 && cuq.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cuq.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
