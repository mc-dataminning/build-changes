import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cup {
   public static final cup a = new cup(List.of());
   public static final Codec<cup> b = csd.a.listOf().xmap(cup::new, $$0 -> $$0.d);
   public static final yq<wd, cup> c = csd.f.a(yo.a()).a(cup::new, $$0 -> $$0.d);
   private final List<csd> d;

   private cup(List<csd> $$0) {
      this.d = $$0;
   }

   public static cup a(csd $$0) {
      return new cup(List.of($$0.r()));
   }

   public static cup a(List<csd> $$0) {
      return new cup(Lists.transform($$0, csd::r));
   }

   public boolean a(cry $$0) {
      for (csd $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<csd> a() {
      return Lists.transform(this.d, csd::r);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cup $$1 && csd.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return csd.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
