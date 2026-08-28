import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpn extends dpj {
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
   private cur l;
   @Nullable
   private je m;
   @Nullable
   private ale<eqp> q;
   private long r;

   public dpn(iz $$0, dse $$1) {
      super(dpl.N, $$0, $$1);
      this.l = cur.l;
   }

   public boolean a(long $$0, cmz $$1, je $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.n instanceof arf) {
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
               dse $$5 = this.n();
               dse $$6 = $$5.a(dsu.bv, Integer.valueOf($$4));
               this.n.a(this.ay_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cmz $$0) {
      if (this.q != null && this.n != null && !this.n.x_() && this.n.o() != null) {
         eqp $$1 = this.n.o().be().b(this.q);
         if ($$0 instanceof arg $$2) {
            am.Q.a($$2, this.q);
         }

         eqn $$3 = new eqn.a((arf)this.n).a(etg.f, evt.b(this.o)).a($$0.gy()).a(etg.a, $$0).a(etf.c);
         ObjectArrayList<cur> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> cur.l;
            case 1 -> (cur)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$4.size());
               yield (cur)$$4.get(0);
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(cmz $$0) {
      if (this.n != null && this.n.o() != null) {
         this.c($$0);
         dse $$1 = this.n();
         this.n.c(3008, this.ay_(), dfb.i($$1));
         dfb $$4;
         if (this.n().b() instanceof dfg $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dfd.a;
         }

         this.n.a(this.o, $$4.o(), 3);
      }
   }

   private void c(cmz $$0) {
      if (this.n != null && this.n.o() != null) {
         this.a($$0);
         if (!this.l.e()) {
            double $$1 = (double)btc.ag.l();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            je $$4 = Objects.requireNonNullElse(this.m, je.b);
            iz $$5 = this.o.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(btc.ag.m() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cjj $$9 = new cjj(this.n, $$6, $$7, $$8, this.l.a(this.n.z.a(21) + 10));
            $$9.h(evt.b);
            this.n.b($$9);
            this.l = cur.l;
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
               this.n.a(this.ay_(), this.n().a(dsu.bv, Integer.valueOf($$1)), 3);
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

   private boolean c(us $$0) {
      if ($$0.b("LootTable", 8)) {
         this.q = ale.a(lq.aU, new alf($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(us $$0) {
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
   public us a(jk.a $$0) {
      us $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.e()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public acp c() {
      return acp.a(this);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cur.a($$1, (vp)$$0.p("item")).orElse(cur.l);
      } else {
         this.l = cur.l;
      }

      if ($$0.e("hit_direction")) {
         this.m = je.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(ale<eqp> $$0, long $$1) {
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

   public cur f() {
      return this.l;
   }
}
