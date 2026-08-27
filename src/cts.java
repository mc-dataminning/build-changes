import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cts {
   public static final cts a = new cts(List.of());
   public static final Codec<cts> b = crj.a.listOf().xmap(cts::new, $$0 -> $$0.d);
   public static final ye<vr, cts> c = crj.f.a(yc.a()).a(cts::new, $$0 -> $$0.d);
   private final List<crj> d;

   private cts(List<crj> $$0) {
      this.d = $$0;
   }

   public static cts a(crj $$0) {
      return new cts(List.of($$0.r()));
   }

   public static cts a(List<crj> $$0) {
      return new cts(Lists.transform($$0, crj::r));
   }

   public boolean a(cre $$0) {
      for (crj $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<crj> a() {
      return Lists.transform(this.d, crj::r);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cts $$1 && crj.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return crj.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
