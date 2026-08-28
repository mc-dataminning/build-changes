import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class dbh implements dci {
   public static final dbh a = new dbh(List.of());
   public static final Codec<dbh> b = czd.b.listOf().xmap(dbh::new, $$0 -> $$0.d);
   public static final yw<wj, dbh> c = czd.i.a(yu.a()).a(dbh::new, $$0 -> $$0.d);
   private final List<czd> d;

   private dbh(List<czd> $$0) {
      this.d = $$0;
   }

   public static dbh a(czd $$0) {
      return new dbh(List.of($$0.v()));
   }

   public static dbh a(List<czd> $$0) {
      return new dbh(List.copyOf(Lists.transform($$0, czd::v)));
   }

   public boolean a(cyz $$0) {
      for (czd $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<czd> a() {
      return Lists.transform(this.d, czd::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbh $$1 && czd.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return czd.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      czd $$4 = null;
      int $$5 = 0;

      for (czd $$6 : this.d) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if (czd.a($$4, $$6)) {
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

   private static void a(cyz.b $$0, Consumer<wy> $$1, czd $$2, int $$3) {
      if ($$3 == 1) {
         $$1.accept(wy.a("item.minecraft.crossbow.projectile.single", $$2.K()));
      } else {
         $$1.accept(wy.a("item.minecraft.crossbow.projectile.multiple", $$3, $$2.K()));
      }

      dch $$4 = $$2.a(kj.q, dch.c);
      $$2.a($$0, $$4, null, das.a, $$1x -> $$1.accept(wy.b("  ").b($$1x).a(n.h)));
   }
}
