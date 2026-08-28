import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsk extends dsg {
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
   private cvx l = cvx.k;
   @Nullable
   private jl m;
   @Nullable
   private alg<eub> n;
   private long r;

   public dsk(jg $$0, dvd $$1) {
      super(dsi.N, $$0, $$1);
   }

   public boolean a(long $$0, coh $$1, jl $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof arm) {
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
               dvd $$5 = this.m();
               dvd $$6 = $$5.b(dvt.bv, Integer.valueOf($$4));
               this.o.a(this.aC_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(coh $$0) {
      if (this.n != null && this.o != null && !this.o.y_() && this.o.o() != null) {
         eub $$1 = this.o.o().bd().b(this.n);
         if ($$0 instanceof arn $$2) {
            an.Q.a($$2, this.n);
         }

         etz $$3 = new etz.a((arm)this.o).a(ews.f, ezh.b(this.p)).a($$0.gG()).a(ews.a, $$0).a(ewr.c);
         ObjectArrayList<cvx> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cvx.k;
            case 1 -> (cvx)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$4.size());
               yield (cvx)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(coh $$0) {
      if (this.o != null && this.o.o() != null) {
         this.c($$0);
         dvd $$1 = this.m();
         this.o.c(3008, this.aC_(), dhy.j($$1));
         dhy $$4;
         if (this.m().b() instanceof did $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dia.a;
         }

         this.o.a(this.p, $$4.m(), 3);
      }
   }

   private void c(coh $$0) {
      if (this.o != null && this.o.o() != null) {
         this.a($$0);
         if (!this.l.f()) {
            double $$1 = (double)bug.ag.l();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            jl $$4 = Objects.requireNonNullElse(this.m, jl.b);
            jg $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bug.ag.m() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            ckq $$9 = new ckq(this.o, $$6, $$7, $$8, this.l.a(this.o.A.a(21) + 10));
            $$9.h(ezh.c);
            this.o.b($$9);
            this.l = cvx.k;
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
               this.o.a(this.aC_(), this.m().b(dvt.bv, Integer.valueOf($$1)), 3);
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

   private boolean c(uj $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = alg.a(ly.bd, alh.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(uj $$0) {
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
   public uj a(jr.a $$0) {
      uj $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public ack c() {
      return ack.a(this);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cvx.a($$1, (vg)$$0.p("item")).orElse(cvx.k);
      } else {
         this.l = cvx.k;
      }

      if ($$0.e("hit_direction")) {
         this.m = jl.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(alg<eub> $$0, long $$1) {
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
   public jl d() {
      return this.m;
   }

   public cvx f() {
      return this.l;
   }
}
