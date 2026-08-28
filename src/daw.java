import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class daw implements dbx {
   public static final daw a = new daw(List.of());
   public static final Codec<daw> b = cys.b.listOf().xmap(daw::new, $$0 -> $$0.d);
   public static final yu<wh, daw> c = cys.i.a(ys.a()).a(daw::new, $$0 -> $$0.d);
   private final List<cys> d;

   private daw(List<cys> $$0) {
      this.d = $$0;
   }

   public static daw a(cys $$0) {
      return new daw(List.of($$0.v()));
   }

   public static daw a(List<cys> $$0) {
      return new daw(List.copyOf(Lists.transform($$0, cys::v)));
   }

   public boolean a(cyo $$0) {
      for (cys $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cys> a() {
      return Lists.transform(this.d, cys::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof daw $$1 && cys.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cys.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      for (cys $$4 : this.d) {
         $$1.accept(ww.c("item.minecraft.crossbow.projectile").b(wv.v).b($$4.K()));
         dbw $$5 = $$4.a(kj.q, dbw.c);
         $$4.a($$0, $$5, null, dah.a, $$1x -> $$1.accept(ww.b("  ").b($$1x).a(n.h)));
      }
   }
}
