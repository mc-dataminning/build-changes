import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddb extends dcx {
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
   private cjh l = cjh.b;
   @Nullable
   private hc m;
   @Nullable
   private aey n;
   private long r;

   public ddb(gw $$0, dfl $$1) {
      super(dcz.N, $$0, $$1);
   }

   public boolean a(long $$0, cbw $$1, hc $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof aks) {
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
               dfl $$5 = this.q();
               dfl $$6 = $$5.a(dgb.bv, Integer.valueOf($$4));
               this.o.a(this.p(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cbw $$0) {
      if (this.n != null && this.o != null && !this.o.w_() && this.o.n() != null) {
         eda $$1 = this.o.n().aH().getLootTable(this.n);
         if ($$0 instanceof akt $$2) {
            al.N.a($$2, this.n);
         }

         ecy $$3 = new ecy.a((aks)this.o).a(efd.f, ehp.b(this.p)).a($$0.gn()).a(efd.a, $$0).a(efc.c);
         ObjectArrayList<cjh> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cjh.b;
            case 1 -> (cjh)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (cjh)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cbw $$0) {
      if (this.o != null && this.o.n() != null) {
         this.c($$0);
         dfl $$1 = this.q();
         this.o.c(3008, this.p(), csx.i($$1));
         csx $$4;
         if (this.q().b() instanceof ctb $$3) {
            $$4 = $$3.a();
         } else {
            $$4 = csy.a;
         }

         this.o.a(this.p, $$4.n(), 3);
      }
   }

   private void c(cbw $$0) {
      if (this.o != null && this.o.n() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)biw.ad.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            hc $$4 = Objects.requireNonNullElse(this.m, hc.b);
            gw $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(biw.ad.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            byp $$9 = new byp(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.f(ehp.b);
            this.o.b($$9);
            this.l = cjh.b;
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
               this.o.a(this.p(), this.q().a(dgb.bv, Integer.valueOf($$1)), 3);
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

   private boolean d(qy $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new aey($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean e(qy $$0) {
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
   public qy as_() {
      qy $$0 = super.as_();
      if (this.m != null) {
         $$0.a("hit_direction", this.m.ordinal());
      }

      $$0.a("item", this.l.b(new qy()));
      return $$0;
   }

   public xf d() {
      return xf.a(this);
   }

   @Override
   public void a(qy $$0) {
      if (!this.d($$0) && $$0.e("item")) {
         this.l = cjh.a($$0.p("item"));
      }

      if ($$0.e("hit_direction")) {
         this.m = hc.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(qy $$0) {
      if (!this.e($$0)) {
         $$0.a("item", this.l.b(new qy()));
      }
   }

   public void a(aey $$0, long $$1) {
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
   public hc f() {
      return this.m;
   }

   public cjh g() {
      return this.l;
   }
}
