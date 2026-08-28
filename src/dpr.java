import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpr extends dpn {
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
   private cua l;
   @Nullable
   private jf m;
   @Nullable
   private akj<eqt> q;
   private long r;

   public dpr(ja $$0, dsh $$1) {
      super(dpp.N, $$0, $$1);
      this.l = cua.l;
   }

   public boolean a(long $$0, cmh $$1, jf $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.n instanceof aqk) {
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
               dsh $$5 = this.n();
               dsh $$6 = $$5.a(dsx.bv, Integer.valueOf($$4));
               this.n.a(this.az_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cmh $$0) {
      if (this.q != null && this.n != null && !this.n.x_() && this.n.o() != null) {
         eqt $$1 = this.n.o().be().b(this.q);
         if ($$0 instanceof aql $$2) {
            am.Q.a($$2, this.q);
         }

         eqr $$3 = new eqr.a((aqk)this.n).a(etk.f, evz.b(this.o)).a($$0.gu()).a(etk.a, $$0).a(etj.c);
         ObjectArrayList<cua> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cua.l;
            case 1 -> (cua)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$4.size());
               yield (cua)$$4.get(0);
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(cmh $$0) {
      if (this.n != null && this.n.o() != null) {
         this.c($$0);
         dsh $$1 = this.n();
         this.n.c(3008, this.az_(), dff.i($$1));
         dff $$4;
         if (this.n().b() instanceof dfk $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dfh.a;
         }

         this.n.a(this.o, $$4.o(), 3);
      }
   }

   private void c(cmh $$0) {
      if (this.n != null && this.n.o() != null) {
         this.a($$0);
         if (!this.l.e()) {
            double $$1 = (double)bsj.ag.l();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            jf $$4 = Objects.requireNonNullElse(this.m, jf.b);
            ja $$5 = this.o.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bsj.ag.m() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cir $$9 = new cir(this.n, $$6, $$7, $$8, this.l.a(this.n.z.a(21) + 10));
            $$9.h(evz.b);
            this.n.b($$9);
            this.l = cua.l;
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
               this.n.a(this.az_(), this.n().a(dsx.bv, Integer.valueOf($$1)), 3);
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

   private boolean c(tx $$0) {
      if ($$0.b("LootTable", 8)) {
         this.q = akj.a(lr.bb, new akk($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(tx $$0) {
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
   public tx a(jl.a $$0) {
      tx $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.e()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public abu c() {
      return abu.a(this);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cua.a($$1, (uu)$$0.p("item")).orElse(cua.l);
      } else {
         this.l = cua.l;
      }

      if ($$0.e("hit_direction")) {
         this.m = jf.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(akj<eqt> $$0, long $$1) {
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
   public jf d() {
      return this.m;
   }

   public cua f() {
      return this.l;
   }
}
