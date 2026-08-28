import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cwy {
   public static final cwy a = new cwy(List.of());
   public static final Codec<cwy> b = cuk.b.listOf().xmap(cwy::new, $$0 -> $$0.d);
   public static final zj<ww, cwy> c = cuk.i.a(zh.a()).a(cwy::new, $$0 -> $$0.d);
   private final List<cuk> d;

   private cwy(List<cuk> $$0) {
      this.d = $$0;
   }

   public static cwy a(cuk $$0) {
      return new cwy(List.of($$0.s()));
   }

   public static cwy a(List<cuk> $$0) {
      return new cwy(List.copyOf(Lists.transform($$0, cuk::s)));
   }

   public boolean a(cuf $$0) {
      for (cuk $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cuk> a() {
      return Lists.transform(this.d, cuk::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwy $$1 && cuk.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cuk.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
