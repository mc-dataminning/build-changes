import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dcp extends dcl {
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
   private cix l = cix.b;
   @Nullable
   private ha m;
   @Nullable
   private aer n;
   private long r;

   public dcp(gu $$0, dez $$1) {
      super(dcn.N, $$0, $$1);
   }

   public boolean a(long $$0, cbm $$1, ha $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof akk) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.i();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.p(), this.q().b(), 40);
            int $$4 = this.i();
            if ($$3 != $$4) {
               dez $$5 = this.q();
               dez $$6 = $$5.a(dfp.bv, Integer.valueOf($$4));
               this.o.a(this.p(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cbm $$0) {
      if (this.n != null && this.o != null && !this.o.r_() && this.o.n() != null) {
         eco $$1 = this.o.n().aH().getLootTable(this.n);
         if ($$0 instanceof akl $$2) {
            ai.N.a($$2, this.n);
         }

         ecm $$3 = new ecm.a((akk)this.o).a(eer.f, ehd.b(this.p)).a($$0.gm()).a(eer.a, $$0).a(eeq.c);
         ObjectArrayList<cix> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cix.b;
            case 1 -> (cix)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (cix)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cbm $$0) {
      if (this.o != null && this.o.n() != null) {
         this.c($$0);
         dez $$1 = this.q();
         this.o.c(3008, this.p(), csl.i($$1));
         csl $$4;
         if (this.q().b() instanceof csp $$3) {
            $$4 = $$3.a();
         } else {
            $$4 = csm.a;
         }

         this.o.a(this.p, $$4.n(), 3);
      }
   }

   private void c(cbm $$0) {
      if (this.o != null && this.o.n() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)bim.ad.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            ha $$4 = Objects.requireNonNullElse(this.m, ha.b);
            gu $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bim.ad.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            byf $$9 = new byf(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.f(ehd.b);
            this.o.b($$9);
            this.l = cix.b;
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
               this.o.a(this.p(), this.q().a(dfp.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.V() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.p(), this.q().b(), (int)(this.j - this.o.V()));
         }
      }
   }

   private boolean d(qr $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new aer($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean e(qr $$0) {
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
   public qr an_() {
      qr $$0 = super.an_();
      if (this.m != null) {
         $$0.a("hit_direction", this.m.ordinal());
      }

      $$0.a("item", this.l.b(new qr()));
      return $$0;
   }

   public wx d() {
      return wx.a(this);
   }

   @Override
   public void a(qr $$0) {
      if (!this.d($$0) && $$0.e("item")) {
         this.l = cix.a($$0.p("item"));
      }

      if ($$0.e("hit_direction")) {
         this.m = ha.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(qr $$0) {
      if (!this.e($$0)) {
         $$0.a("item", this.l.b(new qr()));
      }
   }

   public void a(aer $$0, long $$1) {
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
   public ha f() {
      return this.m;
   }

   public cix g() {
      return this.l;
   }
}
