import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class deb extends ddx {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "LootTable";
   private static final String c = "LootTableSeed";
   private static final String d = "hit_direction";
   private static final String e = "item";
   private static final int f = 10;
   private static final int g = 40;
   private static final int h = 10;
   private int i;
   private long j;
   private long k;
   private ckj l = ckj.b;
   @Nullable
   private hx m;
   @Nullable
   private afw n;
   private long r;

   public deb(ht $$0, dgb $$1) {
      super(ddz.N, $$0, $$1);
   }

   public boolean a(long $$0, ccx $$1, hx $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof alq) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.i();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.p(), this.q().b(), 2);
            int $$4 = this.i();
            if ($$3 != $$4) {
               dgb $$5 = this.q();
               dgb $$6 = $$5.a(dgr.bv, Integer.valueOf($$4));
               this.o.a(this.p(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(ccx $$0) {
      if (this.n != null && this.o != null && !this.o.x_() && this.o.n() != null) {
         edq $$1 = this.o.n().aH().getLootTable(this.n);
         if ($$0 instanceof alr $$2) {
            al.N.a($$2, this.n);
         }

         edo $$3 = new edo.a((alq)this.o).a(eft.f, eif.b(this.p)).a($$0.go()).a(eft.a, $$0).a(efs.c);
         ObjectArrayList<ckj> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> ckj.b;
            case 1 -> (ckj)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (ckj)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(ccx $$0) {
      if (this.o != null && this.o.n() != null) {
         this.c($$0);
         dgb $$1 = this.q();
         this.o.c(3008, this.p(), cua.i($$1));
         cua $$4;
         if (this.q().b() instanceof cuf $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = cuc.a;
         }

         this.o.a(this.p, $$4.o(), 3);
      }
   }

   private void c(ccx $$0) {
      if (this.o != null && this.o.n() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)bjx.ad.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            hx $$4 = Objects.requireNonNullElse(this.m, hx.b);
            ht $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bjx.ad.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            bzq $$9 = new bzq(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.f(eif.b);
            this.o.b($$9);
            this.l = ckj.b;
         }
      }
   }

   public void c() {
      if (this.o != null) {
         if (this.i != 0 && this.o.V() >= this.j) {
            int $$0 = this.i();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.i();
            if ($$0 != $$1) {
               this.o.a(this.p(), this.q().a(dgr.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.V() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.p(), this.q().b(), 2);
         }
      }
   }

   private boolean d(rt $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new afw($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean e(rt $$0) {
      if (this.n == null) {
         return false;
      } else {
         $$0.a("LootTable", this.n.toString());
         if (this.r != 0L) {
            $$0.a("LootTableSeed", this.r);
         }

         return true;
      }
   }

   @Override
   public rt av_() {
      rt $$0 = super.av_();
      if (this.m != null) {
         $$0.a("hit_direction", this.m.ordinal());
      }

      $$0.a("item", this.l.b(new rt()));
      return $$0;
   }

   public yb d() {
      return yb.a(this);
   }

   @Override
   public void a(rt $$0) {
      if (!this.d($$0) && $$0.e("item")) {
         this.l = ckj.a($$0.p("item"));
      }

      if ($$0.e("hit_direction")) {
         this.m = hx.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(rt $$0) {
      if (!this.e($$0)) {
         $$0.a("item", this.l.b(new rt()));
      }
   }

   public void a(afw $$0, long $$1) {
      this.n = $$0;
      this.r = $$1;
   }

   private int i() {
      if (this.i == 0) {
         return 0;
      } else if (this.i < 3) {
         return 1;
      } else {
         return this.i < 6 ? 2 : 3;
      }
   }

   @Nullable
   public hx f() {
      return this.m;
   }

   public ckj g() {
      return this.l;
   }
}
