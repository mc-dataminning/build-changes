import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cwp {
   public static final cwp a = new cwp(List.of());
   public static final Codec<cwp> b = cuc.b.listOf().xmap(cwp::new, $$0 -> $$0.d);
   public static final ys<wf, cwp> c = cuc.i.a(yq.a()).a(cwp::new, $$0 -> $$0.d);
   private final List<cuc> d;

   private cwp(List<cuc> $$0) {
      this.d = $$0;
   }

   public static cwp a(cuc $$0) {
      return new cwp(List.of($$0.s()));
   }

   public static cwp a(List<cuc> $$0) {
      return new cwp(List.copyOf(Lists.transform($$0, cuc::s)));
   }

   public boolean a(ctx $$0) {
      for (cuc $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cuc> a() {
      return Lists.transform(this.d, cuc::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwp $$1 && cuc.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cuc.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
