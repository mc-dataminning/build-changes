import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqg extends dqc {
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
   private cuh l = cuh.i;
   @Nullable
   private iw m;
   @Nullable
   private aks<eru> q;
   private long r;

   public dqg(ir $$0, dtc $$1) {
      super(dqe.O, $$0, $$1);
   }

   public boolean a(long $$0, cly $$1, iw $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.n instanceof aqt) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.j();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.n.a(this.az_(), this.n().b(), 2);
            int $$4 = this.j();
            if ($$3 != $$4) {
               dtc $$5 = this.n();
               dtc $$6 = $$5.a(dts.bv, Integer.valueOf($$4));
               this.n.a(this.az_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cly $$0) {
      if (this.q != null && this.n != null && !this.n.x_() && this.n.o() != null) {
         eru $$1 = this.n.o().be().b(this.q);
         if ($$0 instanceof aqu $$2) {
            an.Q.a($$2, this.q);
         }

         ers $$3 = new ers.a((aqt)this.n).a(eug.f, ewu.b(this.o)).a($$0.gJ()).a(eug.a, $$0).a(euf.c);
         ObjectArrayList<cuh> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cuh.i;
            case 1 -> (cuh)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$4.size());
               yield (cuh)$$4.get(0);
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(cly $$0) {
      if (this.n != null && this.n.o() != null) {
         this.c($$0);
         dtc $$1 = this.n();
         this.n.c(3008, this.az_(), dfc.i($$1));
         dfc $$4;
         if (this.n().b() instanceof dfh $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dfe.a;
         }

         this.n.a(this.o, $$4.n(), 3);
      }
   }

   private void c(cly $$0) {
      if (this.n != null && this.n.o() != null) {
         this.a($$0);
         if (!this.l.d()) {
            double $$1 = (double)bsb.ai.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            iw $$4 = Objects.requireNonNullElse(this.m, iw.b);
            ir $$5 = this.o.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bsb.ai.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cig $$9 = new cig(this.n, $$6, $$7, $$8, this.l.a(this.n.A.a(21) + 10));
            $$9.g(ewu.b);
            this.n.b($$9);
            this.l = cuh.i;
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
               this.n.a(this.az_(), this.n().a(dts.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.n.Z() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.n.a(this.az_(), this.n().b(), 2);
         }
      }
   }

   private boolean c(uk $$0) {
      if ($$0.b("LootTable", 8)) {
         this.q = aks.a(li.aU, new akt($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(uk $$0) {
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
   public uk a(jc.a $$0) {
      uk $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.d()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public ace c() {
      return ace.a(this);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cuh.a($$1, (vh)$$0.p("item")).orElse(cuh.i);
      } else {
         this.l = cuh.i;
      }

      if ($$0.e("hit_direction")) {
         this.m = iw.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      if (!this.d($$0) && !this.l.d()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(aks<eru> $$0, long $$1) {
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
   public iw d() {
      return this.m;
   }

   public cuh f() {
      return this.l;
   }
}
