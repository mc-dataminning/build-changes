import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dql extends dqh {
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
   private cuq l;
   @Nullable
   private ji m;
   @Nullable
   private akq<eru> q;
   private long r;

   public dql(jd $$0, dtc $$1) {
      super(dqj.N, $$0, $$1);
      this.l = cuq.l;
   }

   public boolean a(long $$0, cmx $$1, ji $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.n instanceof aqu) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.j();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.n.a(this.aD_(), this.n().b(), 2);
            int $$4 = this.j();
            if ($$3 != $$4) {
               dtc $$5 = this.n();
               dtc $$6 = $$5.a(dts.bv, Integer.valueOf($$4));
               this.n.a(this.aD_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cmx $$0) {
      if (this.q != null && this.n != null && !this.n.x_() && this.n.o() != null) {
         eru $$1 = this.n.o().be().b(this.q);
         if ($$0 instanceof aqv $$2) {
            an.Q.a($$2, this.q);
         }

         ers $$3 = new ers.a((aqu)this.n).a(eul.f, exa.b(this.o)).a($$0.gv()).a(eul.a, $$0).a(euk.c);
         ObjectArrayList<cuq> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cuq.l;
            case 1 -> (cuq)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$4.size());
               yield (cuq)$$4.get(0);
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(cmx $$0) {
      if (this.n != null && this.n.o() != null) {
         this.c($$0);
         dtc $$1 = this.n();
         this.n.c(3008, this.aD_(), dfy.i($$1));
         dfy $$4;
         if (this.n().b() instanceof dgd $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dga.a;
         }

         this.n.a(this.o, $$4.o(), 3);
      }
   }

   private void c(cmx $$0) {
      if (this.n != null && this.n.o() != null) {
         this.a($$0);
         if (!this.l.e()) {
            double $$1 = (double)bsx.ag.l();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            ji $$4 = Objects.requireNonNullElse(this.m, ji.b);
            jd $$5 = this.o.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bsx.ag.m() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cjh $$9 = new cjh(this.n, $$6, $$7, $$8, this.l.a(this.n.z.a(21) + 10));
            $$9.i(exa.b);
            this.n.b($$9);
            this.l = cuq.l;
         }
      }
   }

   public void b() {
      if (this.n != null) {
         if (this.i != 0 && this.n.Z() >= this.j) {
            int $$0 = this.j();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.j();
            if ($$0 != $$1) {
               this.n.a(this.aD_(), this.n().a(dts.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.n.Z() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.n.a(this.aD_(), this.n().b(), 2);
         }
      }
   }

   private boolean c(ub $$0) {
      if ($$0.b("LootTable", 8)) {
         this.q = akq.a(lu.bc, akr.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(ub $$0) {
      if (this.q == null) {
         return false;
      } else {
         $$0.a("LootTable", this.q.a().toString());
         if (this.r != 0L) {
            $$0.a("LootTableSeed", this.r);
         }

         return true;
      }
   }

   @Override
   public ub a(jo.a $$0) {
      ub $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.e()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public acb c() {
      return acb.a(this);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cuq.a($$1, (uy)$$0.p("item")).orElse(cuq.l);
      } else {
         this.l = cuq.l;
      }

      if ($$0.e("hit_direction")) {
         this.m = ji.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(akq<eru> $$0, long $$1) {
      this.q = $$0;
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
   public ji d() {
      return this.m;
   }

   public cuq f() {
      return this.l;
   }
}
