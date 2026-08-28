import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cxf {
   public static final cxf a = new cxf(List.of());
   public static final Codec<cxf> b = cur.b.listOf().xmap(cxf::new, $$0 -> $$0.d);
   public static final zn<xa, cxf> c = cur.i.a(zl.a()).a(cxf::new, $$0 -> $$0.d);
   private final List<cur> d;

   private cxf(List<cur> $$0) {
      this.d = $$0;
   }

   public static cxf a(cur $$0) {
      return new cxf(List.of($$0.s()));
   }

   public static cxf a(List<cur> $$0) {
      return new cxf(List.copyOf(Lists.transform($$0, cur::s)));
   }

   public boolean a(cum $$0) {
      for (cur $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cur> a() {
      return Lists.transform(this.d, cur::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxf $$1 && cur.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cur.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
