import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dgz extends dgv {
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
   private cmy l = cmy.f;
   @Nullable
   private ic m;
   @Nullable
   private ahg n;
   private long r;

   public dgz(hx $$0, djh $$1) {
      super(dgx.N, $$0, $$1);
   }

   public boolean a(long $$0, cfi $$1, ic $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof and) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.k();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.aB_(), this.r().b(), 2);
            int $$4 = this.k();
            if ($$3 != $$4) {
               djh $$5 = this.r();
               djh $$6 = $$5.a(djx.bv, Integer.valueOf($$4));
               this.o.a(this.aB_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cfi $$0) {
      if (this.n != null && this.o != null && !this.o.y_() && this.o.o() != null) {
         ehe $$1 = this.o.o().aJ().getLootTable(this.n);
         if ($$0 instanceof ane $$2) {
            am.O.a($$2, this.n);
         }

         ehc $$3 = new ehc.a((and)this.o).a(ejh.f, elt.b(this.p)).a($$0.go()).a(ejh.a, $$0).a(ejg.c);
         ObjectArrayList<cmy> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cmy.f;
            case 1 -> (cmy)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (cmy)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cfi $$0) {
      if (this.o != null && this.o.o() != null) {
         this.c($$0);
         djh $$1 = this.r();
         this.o.c(3008, this.aB_(), cwq.i($$1));
         cwq $$4;
         if (this.r().b() instanceof cwv $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = cws.a;
         }

         this.o.a(this.p, $$4.o(), 3);
      }
   }

   private void c(cfi $$0) {
      if (this.o != null && this.o.o() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)blz.ae.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            ic $$4 = Objects.requireNonNullElse(this.m, ic.b);
            hx $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(blz.ae.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cbu $$9 = new cbu(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.g(elt.b);
            this.o.b($$9);
            this.l = cmy.f;
         }
      }
   }

   public void c() {
      if (this.o != null) {
         if (this.i != 0 && this.o.X() >= this.j) {
            int $$0 = this.k();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.k();
            if ($$0 != $$1) {
               this.o.a(this.aB_(), this.r().a(djx.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.X() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.aB_(), this.r().b(), 2);
         }
      }
   }

   private boolean d(sn $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new ahg($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean e(sn $$0) {
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
   public sn ax_() {
      sn $$0 = super.ax_();
      if (this.m != null) {
         $$0.a("hit_direction", this.m.ordinal());
      }

      $$0.a("item", this.l.b(new sn()));
      return $$0;
   }

   public zh d() {
      return zh.a(this);
   }

   @Override
   public void a(sn $$0) {
      if (!this.d($$0) && $$0.e("item")) {
         this.l = cmy.a($$0.p("item"));
      }

      if ($$0.e("hit_direction")) {
         this.m = ic.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(sn $$0) {
      if (!this.e($$0)) {
         $$0.a("item", this.l.b(new sn()));
      }
   }

   public void a(ahg $$0, long $$1) {
      this.n = $$0;
      this.r = $$1;
   }

   private int k() {
      if (this.i == 0) {
         return 0;
      } else if (this.i < 3) {
         return 1;
      } else {
         return this.i < 6 ? 2 : 3;
      }
   }

   @Nullable
   public ic f() {
      return this.m;
   }

   public cmy g() {
      return this.l;
   }
}
