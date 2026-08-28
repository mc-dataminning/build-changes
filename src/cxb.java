import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cxb {
   public static final cxb a = new cxb(List.of());
   public static final Codec<cxb> b = cun.b.listOf().xmap(cxb::new, $$0 -> $$0.d);
   public static final zm<wz, cxb> c = cun.i.a(zk.a()).a(cxb::new, $$0 -> $$0.d);
   private final List<cun> d;

   private cxb(List<cun> $$0) {
      this.d = $$0;
   }

   public static cxb a(cun $$0) {
      return new cxb(List.of($$0.s()));
   }

   public static cxb a(List<cun> $$0) {
      return new cxb(List.copyOf(Lists.transform($$0, cun::s)));
   }

   public boolean a(cui $$0) {
      for (cun $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cun> a() {
      return Lists.transform(this.d, cun::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxb $$1 && cun.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cun.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
