import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dri extends dre {
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
   private cvl l = cvl.k;
   @Nullable
   private jj m;
   @Nullable
   private ala<esy> n;
   private long r;

   public dri(je $$0, dua $$1) {
      super(drg.N, $$0, $$1);
   }

   public boolean a(long $$0, cnp $$1, jj $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof arg) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.j();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.aD_(), this.m().b(), 2);
            int $$4 = this.j();
            if ($$3 != $$4) {
               dua $$5 = this.m();
               dua $$6 = $$5.b(duq.bv, Integer.valueOf($$4));
               this.o.a(this.aD_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cnp $$0) {
      if (this.n != null && this.o != null && !this.o.w_() && this.o.o() != null) {
         esy $$1 = this.o.o().bd().b(this.n);
         if ($$0 instanceof arh $$2) {
            an.Q.a($$2, this.n);
         }

         esw $$3 = new esw.a((arg)this.o).a(evp.f, eye.b(this.p)).a($$0.gy()).a(evp.a, $$0).a(evo.c);
         ObjectArrayList<cvl> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cvl.k;
            case 1 -> (cvl)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$4.size());
               yield (cvl)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cnp $$0) {
      if (this.o != null && this.o.o() != null) {
         this.c($$0);
         dua $$1 = this.m();
         this.o.c(3008, this.aD_(), dgv.j($$1));
         dgv $$4;
         if (this.m().b() instanceof dha $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dgx.a;
         }

         this.o.a(this.p, $$4.o(), 3);
      }
   }

   private void c(cnp $$0) {
      if (this.o != null && this.o.o() != null) {
         this.a($$0);
         if (!this.l.f()) {
            double $$1 = (double)btq.ag.l();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            jj $$4 = Objects.requireNonNullElse(this.m, jj.b);
            je $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(btq.ag.m() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cjz $$9 = new cjz(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.h(eye.c);
            this.o.b($$9);
            this.l = cvl.k;
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
               this.o.a(this.aD_(), this.m().b(duq.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.aa() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.aD_(), this.m().b(), 2);
         }
      }
   }

   private boolean c(uf $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = ala.a(lv.bc, alb.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(uf $$0) {
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
   public uf a(jp.a $$0) {
      uf $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public acg c() {
      return acg.a(this);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cvl.a($$1, (vc)$$0.p("item")).orElse(cvl.k);
      } else {
         this.l = cvl.k;
      }

      if ($$0.e("hit_direction")) {
         this.m = jj.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(ala<esy> $$0, long $$1) {
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
   public jj d() {
      return this.m;
   }

   public cvl f() {
      return this.l;
   }
}
