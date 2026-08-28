import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpk extends dpg {
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
   private cuo l;
   @Nullable
   private je m;
   @Nullable
   private ald<eqm> q;
   private long r;

   public dpk(iz $$0, dsb $$1) {
      super(dpi.N, $$0, $$1);
      this.l = cuo.l;
   }

   public boolean a(long $$0, cmw $$1, je $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.n instanceof are) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.j();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.n.a(this.ay_(), this.n().b(), 2);
            int $$4 = this.j();
            if ($$3 != $$4) {
               dsb $$5 = this.n();
               dsb $$6 = $$5.a(dsr.bv, Integer.valueOf($$4));
               this.n.a(this.ay_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cmw $$0) {
      if (this.q != null && this.n != null && !this.n.x_() && this.n.o() != null) {
         eqm $$1 = this.n.o().be().b(this.q);
         if ($$0 instanceof arf $$2) {
            am.Q.a($$2, this.q);
         }

         eqk $$3 = new eqk.a((are)this.n).a(etd.f, evq.b(this.o)).a($$0.gy()).a(etd.a, $$0).a(etc.c);
         ObjectArrayList<cuo> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cuo.l;
            case 1 -> (cuo)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$4.size());
               yield (cuo)$$4.get(0);
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(cmw $$0) {
      if (this.n != null && this.n.o() != null) {
         this.c($$0);
         dsb $$1 = this.n();
         this.n.c(3008, this.ay_(), dey.i($$1));
         dey $$4;
         if (this.n().b() instanceof dfd $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dfa.a;
         }

         this.n.a(this.o, $$4.o(), 3);
      }
   }

   private void c(cmw $$0) {
      if (this.n != null && this.n.o() != null) {
         this.a($$0);
         if (!this.l.e()) {
            double $$1 = (double)bsz.ag.l();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            je $$4 = Objects.requireNonNullElse(this.m, je.b);
            iz $$5 = this.o.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bsz.ag.m() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cjg $$9 = new cjg(this.n, $$6, $$7, $$8, this.l.a(this.n.z.a(21) + 10));
            $$9.h(evq.b);
            this.n.b($$9);
            this.l = cuo.l;
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
               this.n.a(this.ay_(), this.n().a(dsr.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.n.Z() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.n.a(this.ay_(), this.n().b(), 2);
         }
      }
   }

   private boolean c(ur $$0) {
      if ($$0.b("LootTable", 8)) {
         this.q = ald.a(lq.aU, new ale($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(ur $$0) {
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
   public ur a(jk.a $$0) {
      ur $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.e()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public aco c() {
      return aco.a(this);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cuo.a($$1, (vo)$$0.p("item")).orElse(cuo.l);
      } else {
         this.l = cuo.l;
      }

      if ($$0.e("hit_direction")) {
         this.m = je.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(ald<eqm> $$0, long $$1) {
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
   public je d() {
      return this.m;
   }

   public cuo f() {
      return this.l;
   }
}
