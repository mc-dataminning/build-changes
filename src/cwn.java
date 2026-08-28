import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cwn {
   public static final cwn a = new cwn(List.of());
   public static final Codec<cwn> b = cua.b.listOf().xmap(cwn::new, $$0 -> $$0.d);
   public static final ys<wf, cwn> c = cua.i.a(yq.a()).a(cwn::new, $$0 -> $$0.d);
   private final List<cua> d;

   private cwn(List<cua> $$0) {
      this.d = $$0;
   }

   public static cwn a(cua $$0) {
      return new cwn(List.of($$0.s()));
   }

   public static cwn a(List<cua> $$0) {
      return new cwn(List.copyOf(Lists.transform($$0, cua::s)));
   }

   public boolean a(ctv $$0) {
      for (cua $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cua> a() {
      return Lists.transform(this.d, cua::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwn $$1 && cua.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cua.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
