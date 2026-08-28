import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cyk {
   public static final cyk a = new cyk(List.of());
   public static final Codec<cyk> b = cwf.b.listOf().xmap(cyk::new, $$0 -> $$0.d);
   public static final zj<ww, cyk> c = cwf.i.a(zh.a()).a(cyk::new, $$0 -> $$0.d);
   private final List<cwf> d;

   private cyk(List<cwf> $$0) {
      this.d = $$0;
   }

   public static cyk a(cwf $$0) {
      return new cyk(List.of($$0.v()));
   }

   public static cyk a(List<cwf> $$0) {
      return new cyk(List.copyOf(Lists.transform($$0, cwf::v)));
   }

   public boolean a(cwb $$0) {
      for (cwf $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cwf> a() {
      return Lists.transform(this.d, cwf::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyk $$1 && cwf.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwf.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
