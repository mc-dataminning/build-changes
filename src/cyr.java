import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cyr {
   public static final cyr a = new cyr(List.of());
   public static final Codec<cyr> b = cwm.b.listOf().xmap(cyr::new, $$0 -> $$0.d);
   public static final zh<wu, cyr> c = cwm.i.a(zf.a()).a(cyr::new, $$0 -> $$0.d);
   private final List<cwm> d;

   private cyr(List<cwm> $$0) {
      this.d = $$0;
   }

   public static cyr a(cwm $$0) {
      return new cyr(List.of($$0.v()));
   }

   public static cyr a(List<cwm> $$0) {
      return new cyr(List.copyOf(Lists.transform($$0, cwm::v)));
   }

   public boolean a(cwi $$0) {
      for (cwm $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cwm> a() {
      return Lists.transform(this.d, cwm::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyr $$1 && cwm.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwm.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
