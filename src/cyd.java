import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cyd {
   public static final cyd a = new cyd(List.of());
   public static final Codec<cyd> b = cvs.b.listOf().xmap(cyd::new, $$0 -> $$0.d);
   public static final zc<wp, cyd> c = cvs.i.a(za.a()).a(cyd::new, $$0 -> $$0.d);
   private final List<cvs> d;

   private cyd(List<cvs> $$0) {
      this.d = $$0;
   }

   public static cyd a(cvs $$0) {
      return new cyd(List.of($$0.u()));
   }

   public static cyd a(List<cvs> $$0) {
      return new cyd(List.copyOf(Lists.transform($$0, cvs::u)));
   }

   public boolean a(cvn $$0) {
      for (cvs $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cvs> a() {
      return Lists.transform(this.d, cvs::u);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyd $$1 && cvs.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cvs.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
