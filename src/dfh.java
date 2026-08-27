import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfh extends dfd {
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
   private clj l = clj.b;
   @Nullable
   private hx m;
   @Nullable
   private agi n;
   private long r;

   public dfh(ht $$0, dhi $$1) {
      super(dff.N, $$0, $$1);
   }

   public boolean a(long $$0, cdu $$1, hx $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof ame) {
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
               dhi $$5 = this.q();
               dhi $$6 = $$5.a(dhy.bv, Integer.valueOf($$4));
               this.o.a(this.p(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cdu $$0) {
      if (this.n != null && this.o != null && !this.o.x_() && this.o.n() != null) {
         eff $$1 = this.o.n().aJ().getLootTable(this.n);
         if ($$0 instanceof amf $$2) {
            al.N.a($$2, this.n);
         }

         efd $$3 = new efd.a((ame)this.o).a(ehi.f, eju.b(this.p)).a($$0.gp()).a(ehi.a, $$0).a(ehh.c);
         ObjectArrayList<clj> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> clj.b;
            case 1 -> (clj)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (clj)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cdu $$0) {
      if (this.o != null && this.o.n() != null) {
         this.c($$0);
         dhi $$1 = this.q();
         this.o.c(3008, this.p(), cva.i($$1));
         cva $$4;
         if (this.q().b() instanceof cvf $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = cvc.a;
         }

         this.o.a(this.p, $$4.o(), 3);
      }
   }

   private void c(cdu $$0) {
      if (this.o != null && this.o.n() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)bku.ad.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            hx $$4 = Objects.requireNonNullElse(this.m, hx.b);
            ht $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bku.ad.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            can $$9 = new can(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.g(eju.b);
            this.o.b($$9);
            this.l = clj.b;
         }
      }
   }

   public void c() {
      if (this.o != null) {
         if (this.i != 0 && this.o.W() >= this.j) {
            int $$0 = this.i();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.i();
            if ($$0 != $$1) {
               this.o.a(this.p(), this.q().a(dhy.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.W() + 4L;
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

   private boolean d(rz $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new agi($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean e(rz $$0) {
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
   public rz aw_() {
      rz $$0 = super.aw_();
      if (this.m != null) {
         $$0.a("hit_direction", this.m.ordinal());
      }

      $$0.a("item", this.l.b(new rz()));
      return $$0;
   }

   public yk d() {
      return yk.a(this);
   }

   @Override
   public void a(rz $$0) {
      if (!this.d($$0) && $$0.e("item")) {
         this.l = clj.a($$0.p("item"));
      }

      if ($$0.e("hit_direction")) {
         this.m = hx.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(rz $$0) {
      if (!this.e($$0)) {
         $$0.a("item", this.l.b(new rz()));
      }
   }

   public void a(agi $$0, long $$1) {
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

   public clj g() {
      return this.l;
   }
}
