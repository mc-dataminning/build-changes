import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djb extends dix {
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
   private cpd l = cpd.h;
   @Nullable
   private ie m;
   @Nullable
   private aiy n;
   private long r;

   public djb(hz $$0, dlj $$1) {
      super(diz.N, $$0, $$1);
   }

   public boolean a(long $$0, chl $$1, ie $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof aow) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.k();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.aE_(), this.r().b(), 2);
            int $$4 = this.k();
            if ($$3 != $$4) {
               dlj $$5 = this.r();
               dlj $$6 = $$5.a(dlz.bv, Integer.valueOf($$4));
               this.o.a(this.aE_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(chl $$0) {
      if (this.n != null && this.o != null && !this.o.y_() && this.o.o() != null) {
         ejk $$1 = this.o.o().aL().getLootTable(this.n);
         if ($$0 instanceof aox $$2) {
            am.Q.a($$2, this.n);
         }

         eji $$3 = new eji.a((aow)this.o).a(eln.f, enz.b(this.p)).a($$0.gp()).a(eln.a, $$0).a(elm.c);
         ObjectArrayList<cpd> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cpd.h;
            case 1 -> (cpd)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (cpd)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(chl $$0) {
      if (this.o != null && this.o.o() != null) {
         this.c($$0);
         dlj $$1 = this.r();
         this.o.c(3008, this.aE_(), cys.i($$1));
         cys $$4;
         if (this.r().b() instanceof cyx $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = cyu.a;
         }

         this.o.a(this.p, $$4.o(), 3);
      }
   }

   private void c(chl $$0) {
      if (this.o != null && this.o.o() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)bnw.af.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            ie $$4 = Objects.requireNonNullElse(this.m, ie.b);
            hz $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bnw.af.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cdw $$9 = new cdw(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.g(enz.b);
            this.o.b($$9);
            this.l = cpd.h;
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
               this.o.a(this.aE_(), this.r().a(dlz.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.X() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.aE_(), this.r().b(), 2);
         }
      }
   }

   private boolean d(sw $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new aiy($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean e(sw $$0) {
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
   public sw aA_() {
      sw $$0 = super.aA_();
      if (this.m != null) {
         $$0.a("hit_direction", this.m.ordinal());
      }

      $$0.a("item", this.l.b(new sw()));
      return $$0;
   }

   public aan d() {
      return aan.a(this);
   }

   @Override
   public void a(sw $$0) {
      if (!this.d($$0) && $$0.e("item")) {
         this.l = cpd.a($$0.p("item"));
      }

      if ($$0.e("hit_direction")) {
         this.m = ie.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(sw $$0) {
      if (!this.e($$0)) {
         $$0.a("item", this.l.b(new sw()));
      }
   }

   public void a(aiy $$0, long $$1) {
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
   public ie f() {
      return this.m;
   }

   public cpd g() {
      return this.l;
   }
}
