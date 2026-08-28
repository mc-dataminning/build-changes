import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class dcc implements ddd {
   public static final dcc a = new dcc(List.of());
   public static final Codec<dcc> b = czy.b.listOf().xmap(dcc::new, $$0 -> $$0.d);
   public static final yy<wl, dcc> c = czy.i.a(yw.a()).a(dcc::new, $$0 -> $$0.d);
   private final List<czy> d;

   private dcc(List<czy> $$0) {
      this.d = $$0;
   }

   public static dcc a(czy $$0) {
      return new dcc(List.of($$0.v()));
   }

   public static dcc a(List<czy> $$0) {
      return new dcc(List.copyOf(Lists.transform($$0, czy::v)));
   }

   public boolean a(czu $$0) {
      for (czy $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<czy> a() {
      return Lists.transform(this.d, czy::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dcc $$1 && czy.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return czy.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      czy $$4 = null;
      int $$5 = 0;

      for (czy $$6 : this.d) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if (czy.a($$4, $$6)) {
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

   private static void a(czu.b $$0, Consumer<xa> $$1, czy $$2, int $$3) {
      if ($$3 == 1) {
         $$1.accept(xa.a("item.minecraft.crossbow.projectile.single", $$2.K()));
      } else {
         $$1.accept(xa.a("item.minecraft.crossbow.projectile.multiple", $$3, $$2.K()));
      }

      ddc $$4 = $$2.a(kk.q, ddc.c);
      $$2.a($$0, $$4, null, dbn.a, $$1x -> $$1.accept(xa.b("  ").b($$1x).a(o.h)));
   }
}
