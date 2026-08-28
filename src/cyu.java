import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cyu {
   public static final cyu a = new cyu(List.of());
   public static final Codec<cyu> b = cwp.a.listOf().xmap(cyu::new, $$0 -> $$0.d);
   public static final yn<wa, cyu> c = cwp.h.a(yl.a()).a(cyu::new, $$0 -> $$0.d);
   private final List<cwp> d;

   private cyu(List<cwp> $$0) {
      this.d = $$0;
   }

   public static cyu a(cwp $$0) {
      return new cyu(List.of($$0.v()));
   }

   public static cyu a(List<cwp> $$0) {
      return new cyu(List.copyOf(Lists.transform($$0, cwp::v)));
   }

   public boolean a(cwl $$0) {
      for (cwp $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cwp> a() {
      return Lists.transform(this.d, cwp::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyu $$1 && cwp.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwp.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
