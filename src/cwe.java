import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cwe {
   public static final cwe a = new cwe(List.of());
   public static final Codec<cwe> b = ctq.a.listOf().xmap(cwe::new, $$0 -> $$0.d);
   public static final yv<wi, cwe> c = ctq.f.a(yt.a()).a(cwe::new, $$0 -> $$0.d);
   private final List<ctq> d;

   private cwe(List<ctq> $$0) {
      this.d = $$0;
   }

   public static cwe a(ctq $$0) {
      return new cwe(List.of($$0.s()));
   }

   public static cwe a(List<ctq> $$0) {
      return new cwe(Lists.transform($$0, ctq::s));
   }

   public boolean a(ctl $$0) {
      for (ctq $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<ctq> a() {
      return Lists.transform(this.d, ctq::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwe $$1 && ctq.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return ctq.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
