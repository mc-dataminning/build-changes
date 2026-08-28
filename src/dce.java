import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class dce implements ddf {
   public static final dce a = new dce(List.of());
   public static final Codec<dce> b = daa.b.listOf().xmap(dce::new, $$0 -> $$0.d);
   public static final za<wn, dce> c = daa.i.a(yy.a()).a(dce::new, $$0 -> $$0.d);
   private final List<daa> d;

   private dce(List<daa> $$0) {
      this.d = $$0;
   }

   public static dce a(daa $$0) {
      return new dce(List.of($$0.v()));
   }

   public static dce a(List<daa> $$0) {
      return new dce(List.copyOf(Lists.transform($$0, daa::v)));
   }

   public boolean a(czw $$0) {
      for (daa $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<daa> a() {
      return Lists.transform(this.d, daa::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dce $$1 && daa.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return daa.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      daa $$4 = null;
      int $$5 = 0;

      for (daa $$6 : this.d) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if (daa.a($$4, $$6)) {
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

   private static void a(czw.b $$0, Consumer<xc> $$1, daa $$2, int $$3) {
      if ($$3 == 1) {
         $$1.accept(xc.a("item.minecraft.crossbow.projectile.single", $$2.K()));
      } else {
         $$1.accept(xc.a("item.minecraft.crossbow.projectile.multiple", $$3, $$2.K()));
      }

      dde $$4 = $$2.a(kl.q, dde.c);
      $$2.a($$0, $$4, null, dbp.a, $$1x -> $$1.accept(xc.b("  ").b($$1x).a(o.h)));
   }
}
