import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnh extends dnd {
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
   private csd l = csd.i;
   @Nullable
   private ir m;
   @Nullable
   private akf n;
   private long r;

   public dnh(im $$0, dpy $$1) {
      super(dnf.N, $$0, $$1);
   }

   public boolean a(long $$0, ckl $$1, ir $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof aqe) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.j();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.az_(), this.n().b(), 2);
            int $$4 = this.j();
            if ($$3 != $$4) {
               dpy $$5 = this.n();
               dpy $$6 = $$5.a(dqo.bv, Integer.valueOf($$4));
               this.o.a(this.az_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(ckl $$0) {
      if (this.n != null && this.o != null && !this.o.x_() && this.o.o() != null) {
         eoi $$1 = this.o.o().aM().getLootTable(this.n);
         if ($$0 instanceof aqf $$2) {
            am.Q.a($$2, this.n);
         }

         eog $$3 = new eog.a((aqe)this.o).a(eqt.f, etf.b(this.p)).a($$0.gw()).a(eqt.a, $$0).a(eqs.c);
         ObjectArrayList<csd> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> csd.i;
            case 1 -> (csd)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (csd)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(ckl $$0) {
      if (this.o != null && this.o.o() != null) {
         this.c($$0);
         dpy $$1 = this.n();
         this.o.c(3008, this.az_(), dcv.i($$1));
         dcv $$4;
         if (this.n().b() instanceof dda $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dcx.a;
         }

         this.o.a(this.p, $$4.n(), 3);
      }
   }

   private void c(ckl $$0) {
      if (this.o != null && this.o.o() != null) {
         this.a($$0);
         if (!this.l.d()) {
            double $$1 = (double)bqr.ag.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            ir $$4 = Objects.requireNonNullElse(this.m, ir.b);
            im $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bqr.ag.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cgv $$9 = new cgv(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.g(etf.b);
            this.o.b($$9);
            this.l = csd.i;
         }
      }
   }

   public void b() {
      if (this.o != null) {
         if (this.i != 0 && this.o.Y() >= this.j) {
            int $$0 = this.j();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.j();
            if ($$0 != $$1) {
               this.o.a(this.az_(), this.n().a(dqo.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.Y() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.az_(), this.n().b(), 2);
         }
      }
   }

   private boolean c(ty $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new akf($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(ty $$0) {
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
   public ty a(ix.a $$0) {
      ty $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.d()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public abr c() {
      return abr.a(this);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      if (!this.c($$0) && $$0.e("item")) {
         this.l = csd.a($$1, (uv)$$0.p("item")).orElse(csd.i);
      } else {
         this.l = csd.i;
      }

      if ($$0.e("hit_direction")) {
         this.m = ir.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      if (!this.d($$0) && !this.l.d()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(akf $$0, long $$1) {
      this.n = $$0;
      this.r = $$1;
   }

   private int j() {
      if (this.i == 0) {
         return 0;
      } else if (this.i < 3) {
         return 1;
      } else {
         return this.i < 6 ? 2 : 3;
      }
   }

   @Nullable
   public ir d() {
      return this.m;
   }

   public csd f() {
      return this.l;
   }
}
