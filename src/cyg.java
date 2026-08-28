import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cyg {
   public static final cyg a = new cyg(List.of());
   public static final Codec<cyg> b = cwb.b.listOf().xmap(cyg::new, $$0 -> $$0.d);
   public static final zg<wt, cyg> c = cwb.i.a(ze.a()).a(cyg::new, $$0 -> $$0.d);
   private final List<cwb> d;

   private cyg(List<cwb> $$0) {
      this.d = $$0;
   }

   public static cyg a(cwb $$0) {
      return new cyg(List.of($$0.v()));
   }

   public static cyg a(List<cwb> $$0) {
      return new cyg(List.copyOf(Lists.transform($$0, cwb::v)));
   }

   public boolean a(cvx $$0) {
      for (cwb $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cwb> a() {
      return Lists.transform(this.d, cwb::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyg $$1 && cwb.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwb.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
