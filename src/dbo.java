import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class dbo implements dcp {
   public static final dbo a = new dbo(List.of());
   public static final Codec<dbo> b = czk.b.listOf().xmap(dbo::new, $$0 -> $$0.d);
   public static final yw<wj, dbo> c = czk.i.a(yu.a()).a(dbo::new, $$0 -> $$0.d);
   private final List<czk> d;

   private dbo(List<czk> $$0) {
      this.d = $$0;
   }

   public static dbo a(czk $$0) {
      return new dbo(List.of($$0.v()));
   }

   public static dbo a(List<czk> $$0) {
      return new dbo(List.copyOf(Lists.transform($$0, czk::v)));
   }

   public boolean a(czg $$0) {
      for (czk $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<czk> a() {
      return Lists.transform(this.d, czk::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbo $$1 && czk.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return czk.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      czk $$4 = null;
      int $$5 = 0;

      for (czk $$6 : this.d) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if (czk.a($$4, $$6)) {
            $$5++;
         } else {
            a($$0, $$1, $$4, $$5);
            $$4 = $$6;
            $$5 = 1;
         }
      }

      if ($$4 != null) {
         a($$0, $$1, $$4, $$5);
      }
   }

   private static void a(czg.b $$0, Consumer<wy> $$1, czk $$2, int $$3) {
      if ($$3 == 1) {
         $$1.accept(wy.a("item.minecraft.crossbow.projectile.single", $$2.K()));
      } else {
         $$1.accept(wy.a("item.minecraft.crossbow.projectile.multiple", $$3, $$2.K()));
      }

      dco $$4 = $$2.a(kk.q, dco.c);
      $$2.a($$0, $$4, null, daz.a, $$1x -> $$1.accept(wy.b("  ").b($$1x).a(o.h)));
   }
}
