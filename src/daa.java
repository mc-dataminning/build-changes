import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class daa {
   public static final daa a = new daa(List.of());
   public static final Codec<daa> b = cxy.b.listOf().xmap(daa::new, $$0 -> $$0.d);
   public static final yt<wg, daa> c = cxy.i.a(yr.a()).a(daa::new, $$0 -> $$0.d);
   private final List<cxy> d;

   private daa(List<cxy> $$0) {
      this.d = $$0;
   }

   public static daa a(cxy $$0) {
      return new daa(List.of($$0.v()));
   }

   public static daa a(List<cxy> $$0) {
      return new daa(List.copyOf(Lists.transform($$0, cxy::v)));
   }

   public boolean a(cxu $$0) {
      for (cxy $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cxy> a() {
      return Lists.transform(this.d, cxy::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof daa $$1 && cxy.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxy.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
