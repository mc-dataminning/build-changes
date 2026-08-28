import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class dco implements ddp {
   public static final dco a = new dco(List.of());
   public static final Codec<dco> b = dak.b.listOf().xmap(dco::new, $$0 -> $$0.d);
   public static final ze<wp, dco> c = dak.j.a(zc.a()).a(dco::new, $$0 -> $$0.d);
   private final List<dak> d;

   private dco(List<dak> $$0) {
      this.d = $$0;
   }

   public static dco a(dak $$0) {
      return new dco(List.of($$0.v()));
   }

   public static dco a(List<dak> $$0) {
      return new dco(List.copyOf(Lists.transform($$0, dak::v)));
   }

   public boolean a(dag $$0) {
      for (dak $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<dak> a() {
      return Lists.transform(this.d, dak::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dco $$1 && dak.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return dak.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      dak $$4 = null;
      int $$5 = 0;

      for (dak $$6 : this.d) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if (dak.a($$4, $$6)) {
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

   private static void a(dag.b $$0, Consumer<xg> $$1, dak $$2, int $$3) {
      if ($$3 == 1) {
         $$1.accept(xg.a("item.minecraft.crossbow.projectile.single", $$2.K()));
      } else {
         $$1.accept(xg.a("item.minecraft.crossbow.projectile.multiple", $$3, $$2.K()));
      }

      ddo $$4 = $$2.a(kl.q, ddo.c);
      $$2.a($$0, $$4, null, dbz.a, $$1x -> $$1.accept(xg.b("  ").b($$1x).a(o.h)));
   }
}
