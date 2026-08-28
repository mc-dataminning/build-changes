import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drz extends drv {
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
   private cvs l = cvs.k;
   @Nullable
   private jk m;
   @Nullable
   private ald<etq> n;
   private long r;

   public drz(jf $$0, dus $$1) {
      super(drx.N, $$0, $$1);
   }

   public boolean a(long $$0, cnx $$1, jk $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof arj) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.j();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.aC_(), this.m().b(), 2);
            int $$4 = this.j();
            if ($$3 != $$4) {
               dus $$5 = this.m();
               dus $$6 = $$5.b(dvi.bv, Integer.valueOf($$4));
               this.o.a(this.aC_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cnx $$0) {
      if (this.n != null && this.o != null && !this.o.x_() && this.o.o() != null) {
         etq $$1 = this.o.o().bd().b(this.n);
         if ($$0 instanceof ark $$2) {
            an.Q.a($$2, this.n);
         }

         eto $$3 = new eto.a((arj)this.o).a(ewh.f, eyw.b(this.p)).a($$0.gz()).a(ewh.a, $$0).a(ewg.c);
         ObjectArrayList<cvs> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cvs.k;
            case 1 -> (cvs)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$4.size());
               yield (cvs)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cnx $$0) {
      if (this.o != null && this.o.o() != null) {
         this.c($$0);
         dus $$1 = this.m();
         this.o.c(3008, this.aC_(), dhm.j($$1));
         dhm $$4;
         if (this.m().b() instanceof dhr $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dho.a;
         }

         this.o.a(this.p, $$4.n(), 3);
      }
   }

   private void c(cnx $$0) {
      if (this.o != null && this.o.o() != null) {
         this.a($$0);
         if (!this.l.f()) {
            double $$1 = (double)bty.ag.l();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            jk $$4 = Objects.requireNonNullElse(this.m, jk.b);
            jf $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bty.ag.m() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            ckh $$9 = new ckh(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.h(eyw.c);
            this.o.b($$9);
            this.l = cvs.k;
         }
      }
   }

   public void b() {
      if (this.o != null) {
         if (this.i != 0 && this.o.aa() >= this.j) {
            int $$0 = this.j();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.j();
            if ($$0 != $$1) {
               this.o.a(this.aC_(), this.m().b(dvi.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.aa() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.aC_(), this.m().b(), 2);
         }
      }
   }

   private boolean c(ug $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = ald.a(lw.be, ale.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(ug $$0) {
      if (this.n == null) {
         return false;
      } else {
         $$0.a("LootTable", this.n.a().toString());
         if (this.r != 0L) {
            $$0.a("LootTableSeed", this.r);
         }

         return true;
      }
   }

   @Override
   public ug a(jq.a $$0) {
      ug $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public ach c() {
      return ach.a(this);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cvs.a($$1, (vd)$$0.p("item")).orElse(cvs.k);
      } else {
         this.l = cvs.k;
      }

      if ($$0.e("hit_direction")) {
         this.m = jk.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(ald<etq> $$0, long $$1) {
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
   public jk d() {
      return this.m;
   }

   public cvs f() {
      return this.l;
   }
}
