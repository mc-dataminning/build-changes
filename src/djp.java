import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djp extends djl {
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
   private cpq l = cpq.h;
   @Nullable
   private ih m;
   @Nullable
   private ajc n;
   private long r;

   public djp(ib $$0, dme $$1) {
      super(djn.N, $$0, $$1);
   }

   public boolean a(long $$0, cia $$1, ih $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof apa) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.j();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.aD_(), this.n().b(), 2);
            int $$4 = this.j();
            if ($$3 != $$4) {
               dme $$5 = this.n();
               dme $$6 = $$5.a(dmu.bv, Integer.valueOf($$4));
               this.o.a(this.aD_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cia $$0) {
      if (this.n != null && this.o != null && !this.o.y_() && this.o.o() != null) {
         ekg $$1 = this.o.o().aM().getLootTable(this.n);
         if ($$0 instanceof apb $$2) {
            am.Q.a($$2, this.n);
         }

         eke $$3 = new eke.a((apa)this.o).a(emj.f, eov.b(this.p)).a($$0.gr()).a(emj.a, $$0).a(emi.c);
         ObjectArrayList<cpq> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cpq.h;
            case 1 -> (cpq)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (cpq)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cia $$0) {
      if (this.o != null && this.o.o() != null) {
         this.c($$0);
         dme $$1 = this.n();
         this.o.c(3008, this.aD_(), czf.i($$1));
         czf $$4;
         if (this.n().b() instanceof czk $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = czh.a;
         }

         this.o.a(this.p, $$4.o(), 3);
      }
   }

   private void c(cia $$0) {
      if (this.o != null && this.o.o() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)bol.af.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            ih $$4 = Objects.requireNonNullElse(this.m, ih.b);
            ib $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bol.af.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cel $$9 = new cel(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.g(eov.b);
            this.o.b($$9);
            this.l = cpq.h;
         }
      }
   }

   public void b() {
      if (this.o != null) {
         if (this.i != 0 && this.o.X() >= this.j) {
            int $$0 = this.j();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.j();
            if ($$0 != $$1) {
               this.o.a(this.aD_(), this.n().a(dmu.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.X() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.aD_(), this.n().b(), 2);
         }
      }
   }

   private boolean b(sy $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new ajc($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean c(sy $$0) {
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
   public sy a(in.a $$0) {
      sy $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      $$1.a("item", this.l.b(new sy()));
      return $$1;
   }

   public aap c() {
      return aap.a(this);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      if (!this.b($$0) && $$0.e("item")) {
         this.l = cpq.a($$0.p("item"));
      }

      if ($$0.e("hit_direction")) {
         this.m = ih.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      if (!this.c($$0)) {
         $$0.a("item", this.l.b(new sy()));
      }
   }

   public void a(ajc $$0, long $$1) {
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
   public ih d() {
      return this.m;
   }

   public cpq f() {
      return this.l;
   }
}
