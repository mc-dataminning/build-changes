import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cxg {
   public static final cxg a = new cxg(List.of());
   public static final Codec<cxg> b = cuq.b.listOf().xmap(cxg::new, $$0 -> $$0.d);
   public static final yx<wk, cxg> c = cuq.i.a(yv.a()).a(cxg::new, $$0 -> $$0.d);
   private final List<cuq> d;

   private cxg(List<cuq> $$0) {
      this.d = $$0;
   }

   public static cxg a(cuq $$0) {
      return new cxg(List.of($$0.s()));
   }

   public static cxg a(List<cuq> $$0) {
      return new cxg(List.copyOf(Lists.transform($$0, cuq::s)));
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
         if ($$0 instanceof cxg $$1 && cuq.a(this.d, $$1.d)) {
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
