import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class dbr implements dcs {
   public static final dbr a = new dbr(List.of());
   public static final Codec<dbr> b = czn.b.listOf().xmap(dbr::new, $$0 -> $$0.d);
   public static final yw<wj, dbr> c = czn.i.a(yu.a()).a(dbr::new, $$0 -> $$0.d);
   private final List<czn> d;

   private dbr(List<czn> $$0) {
      this.d = $$0;
   }

   public static dbr a(czn $$0) {
      return new dbr(List.of($$0.v()));
   }

   public static dbr a(List<czn> $$0) {
      return new dbr(List.copyOf(Lists.transform($$0, czn::v)));
   }

   public boolean a(czj $$0) {
      for (czn $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<czn> a() {
      return Lists.transform(this.d, czn::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbr $$1 && czn.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return czn.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      czn $$4 = null;
      int $$5 = 0;

      for (czn $$6 : this.d) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if (czn.a($$4, $$6)) {
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

   private static void a(czj.b $$0, Consumer<wy> $$1, czn $$2, int $$3) {
      if ($$3 == 1) {
         $$1.accept(wy.a("item.minecraft.crossbow.projectile.single", $$2.K()));
      } else {
         $$1.accept(wy.a("item.minecraft.crossbow.projectile.multiple", $$3, $$2.K()));
      }

      dcr $$4 = $$2.a(kk.q, dcr.c);
      $$2.a($$0, $$4, null, dbc.a, $$1x -> $$1.accept(wy.b("  ").b($$1x).a(o.h)));
   }
}
