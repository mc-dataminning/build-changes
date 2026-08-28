import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cxd {
   public static final cxd a = new cxd(List.of());
   public static final Codec<cxd> b = cup.b.listOf().xmap(cxd::new, $$0 -> $$0.d);
   public static final zn<xa, cxd> c = cup.i.a(zl.a()).a(cxd::new, $$0 -> $$0.d);
   private final List<cup> d;

   private cxd(List<cup> $$0) {
      this.d = $$0;
   }

   public static cxd a(cup $$0) {
      return new cxd(List.of($$0.s()));
   }

   public static cxd a(List<cup> $$0) {
      return new cxd(List.copyOf(Lists.transform($$0, cup::s)));
   }

   public boolean a(cuk $$0) {
      for (cup $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cup> a() {
      return Lists.transform(this.d, cup::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxd $$1 && cup.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cup.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
