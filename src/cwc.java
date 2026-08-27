import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public final class cwc {
   public static final cwc a = new cwc(List.of());
   public static final Codec<cwc> b = cto.a.listOf().xmap(cwc::new, $$0 -> $$0.d);
   public static final yv<wi, cwc> c = cto.f.a(yt.a()).a(cwc::new, $$0 -> $$0.d);
   private final List<cto> d;

   private cwc(List<cto> $$0) {
      this.d = $$0;
   }

   public static cwc a(cto $$0) {
      return new cwc(List.of($$0.s()));
   }

   public static cwc a(List<cto> $$0) {
      return new cwc(Lists.transform($$0, cto::s));
   }

   public boolean a(ctj $$0) {
      for (cto $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cto> a() {
      return Lists.transform(this.d, cto::s);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwc $$1 && cto.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cto.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }
}
