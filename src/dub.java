import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dub extends dtx {
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
   private cwn l = cwn.j;
   @Nullable
   private jn m;
   @Nullable
   private akt<evu> n;
   private long r;

   public dub(ji $$0, dwv $$1) {
      super(dtz.O, $$0, $$1);
   }

   public boolean a(long $$0, arc $$1, cov $$2, jn $$3, cwn $$4) {
      if (this.m == null) {
         this.m = $$3;
      }

      this.j = $$0 + 40L;
      if ($$0 < this.k) {
         return false;
      } else {
         this.k = $$0 + 10L;
         this.a($$1, $$2, $$4);
         int $$5 = this.f();
         if (++this.i >= 10) {
            this.b($$1, $$2, $$4);
            return true;
         } else {
            $$1.a(this.aA_(), this.m().b(), 2);
            int $$6 = this.f();
            if ($$5 != $$6) {
               dwv $$7 = this.m();
               dwv $$8 = $$7.b(dxl.by, Integer.valueOf($$6));
               $$1.a(this.aA_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(arc $$0, cov $$1, cwn $$2) {
      if (this.n != null) {
         evu $$3 = $$0.p().bc().b(this.n);
         if ($$1 instanceof ard $$4) {
            ap.Q.a($$4, this.n);
         }

         evs $$5 = new evs.a($$0).a(eyj.f, fay.b(this.p)).a($$1.gF()).a(eyj.a, $$1).a(eyj.i, $$2).a(eyi.i);
         ObjectArrayList<cwn> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> cwn.j;
            case 1 -> (cwn)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$6.size());
               yield (cwn)$$6.getFirst();
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(arc $$0, cov $$1, cwn $$2) {
      this.c($$0, $$1, $$2);
      dwv $$3 = this.m();
      $$0.c(3008, this.aA_(), djk.j($$3));
      djk $$6;
      if (this.m().b() instanceof djq $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = djm.a;
      }

      $$0.a(this.p, $$6.m(), 3);
   }

   private void c(arc $$0, cov $$1, cwn $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)buq.aq.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jn $$6 = Objects.requireNonNullElse(this.m, jn.b);
         ji $$7 = this.p.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(buq.aq.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         cla $$11 = new cla($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.h(fay.c);
         $$0.b($$11);
         this.l = cwn.j;
      }
   }

   public void a(arc $$0) {
      if (this.i != 0 && $$0.ad() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aA_(), this.m().b(dxl.by, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.ad() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.aA_(), this.m().b(), 2);
      }
   }

   private boolean c(tq $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = akt.a(mc.bg, aku.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(tq $$0) {
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
   public tq a(jt.a $$0) {
      tq $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cwn.a($$1, (un)$$0.p("item")).orElse(cwn.j);
      } else {
         this.l = cwn.j;
      }

      if ($$0.e("hit_direction")) {
         this.m = jn.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(akt<evu> $$0, long $$1) {
      this.n = $$0;
      this.r = $$1;
   }

   private int f() {
      if (this.i == 0) {
         return 0;
      } else if (this.i < 3) {
         return 1;
      } else {
         return this.i < 6 ? 2 : 3;
      }
   }

   @Nullable
   public jn c() {
      return this.m;
   }

   public cwn d() {
      return this.l;
   }
}
