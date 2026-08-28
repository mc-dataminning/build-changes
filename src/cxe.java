import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cxe {
   public static final cxe a = new cxe(List.of());
   public static final Codec<cxe> b = cuo.b.listOf().xmap(cxe::new, $$0 -> $$0.d);
   public static final yw<wj, cxe> c = cuo.i.a(yu.a()).a(cxe::new, $$0 -> $$0.d);
   private final List<cuo> d;

   private cxe(List<cuo> $$0) {
      this.d = $$0;
   }

   public static cxe a(cuo $$0) {
      return new cxe(List.of($$0.s()));
   }

   public static cxe a(List<cuo> $$0) {
      return new cxe(List.copyOf(Lists.transform($$0, cuo::s)));
   }

   public boolean a(cuj $$0) {
      for (cuo $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cuo> a() {
      return Lists.transform(this.d, cuo::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxe $$1 && cuo.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cuo.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
