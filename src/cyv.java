import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cyv {
   public static final cyv a = new cyv(List.of());
   public static final Codec<cyv> b = cwq.a.listOf().xmap(cyv::new, $$0 -> $$0.d);
   public static final yn<wa, cyv> c = cwq.h.a(yl.a()).a(cyv::new, $$0 -> $$0.d);
   private final List<cwq> d;

   private cyv(List<cwq> $$0) {
      this.d = $$0;
   }

   public static cyv a(cwq $$0) {
      return new cyv(List.of($$0.v()));
   }

   public static cyv a(List<cwq> $$0) {
      return new cyv(List.copyOf(Lists.transform($$0, cwq::v)));
   }

   public boolean a(cwm $$0) {
      for (cwq $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cwq> a() {
      return Lists.transform(this.d, cwq::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyv $$1 && cwq.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwq.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
