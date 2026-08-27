import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dcz extends dcv {
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
   private cjf l = cjf.b;
   @Nullable
   private hc m;
   @Nullable
   private aex n;
   private long r;

   public dcz(gw $$0, dfj $$1) {
      super(dcx.N, $$0, $$1);
   }

   public boolean a(long $$0, cbu $$1, hc $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof akr) {
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
               dfj $$5 = this.q();
               dfj $$6 = $$5.a(dfz.bv, Integer.valueOf($$4));
               this.o.a(this.p(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cbu $$0) {
      if (this.n != null && this.o != null && !this.o.w_() && this.o.n() != null) {
         ecy $$1 = this.o.n().aH().getLootTable(this.n);
         if ($$0 instanceof aks $$2) {
            al.N.a($$2, this.n);
         }

         ecw $$3 = new ecw.a((akr)this.o).a(efb.f, ehn.b(this.p)).a($$0.gn()).a(efb.a, $$0).a(efa.c);
         ObjectArrayList<cjf> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cjf.b;
            case 1 -> (cjf)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (cjf)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cbu $$0) {
      if (this.o != null && this.o.n() != null) {
         this.c($$0);
         dfj $$1 = this.q();
         this.o.c(3008, this.p(), csv.i($$1));
         csv $$4;
         if (this.q().b() instanceof csz $$3) {
            $$4 = $$3.a();
         } else {
            $$4 = csw.a;
         }

         this.o.a(this.p, $$4.n(), 3);
      }
   }

   private void c(cbu $$0) {
      if (this.o != null && this.o.n() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)biu.ad.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            hc $$4 = Objects.requireNonNullElse(this.m, hc.b);
            gw $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(biu.ad.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            byn $$9 = new byn(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.f(ehn.b);
            this.o.b($$9);
            this.l = cjf.b;
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
               this.o.a(this.p(), this.q().a(dfz.bv, Integer.valueOf($$1)), 3);
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
         this.n = new aex($$0.l("LootTable"));
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

   public xe d() {
      return xe.a(this);
   }

   @Override
   public void a(qy $$0) {
      if (!this.d($$0) && $$0.e("item")) {
         this.l = cjf.a($$0.p("item"));
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

   public void a(aex $$0, long $$1) {
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

   public cjf g() {
      return this.l;
   }
}
