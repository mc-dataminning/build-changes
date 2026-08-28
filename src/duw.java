import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duw extends dus {
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
   private cxh l = cxh.k;
   @Nullable
   private jn m;
   @Nullable
   private akt<ewt> q;
   private long r;

   public duw(ji $$0, dxq $$1) {
      super(duu.O, $$0, $$1);
   }

   public boolean a(long $$0, ard $$1, bvy $$2, jn $$3, cxh $$4) {
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
               dxq $$7 = this.m();
               dxq $$8 = $$7.b(dyg.by, Integer.valueOf($$6));
               $$1.a(this.aA_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(ard $$0, bvy $$1, cxh $$2) {
      if (this.q != null) {
         ewt $$3 = $$0.p().bc().b(this.q);
         if ($$1 instanceof are $$4) {
            ap.Q.a($$4, this.q);
         }

         ewr $$5 = new ewr.a($$0).a(ezi.f, fbx.b(this.o)).a($$1.ef()).a(ezi.a, $$1).a(ezi.i, $$2).a(ezh.i);
         ObjectArrayList<cxh> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> cxh.k;
            case 1 -> (cxh)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$6.size());
               yield (cxh)$$6.getFirst();
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(ard $$0, bvy $$1, cxh $$2) {
      this.c($$0, $$1, $$2);
      dxq $$3 = this.m();
      $$0.c(3008, this.aA_(), dke.j($$3));
      dke $$6;
      if (this.m().b() instanceof dkk $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dkg.a;
      }

      $$0.a(this.o, $$6.m(), 3);
   }

   private void c(ard $$0, bvy $$1, cxh $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bvi.aq.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jn $$6 = Objects.requireNonNullElse(this.m, jn.b);
         ji $$7 = this.o.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bvi.aq.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         clw $$11 = new clw($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.i(fbx.c);
         $$0.b($$11);
         this.l = cxh.k;
      }
   }

   public void a(ard $$0) {
      if (this.i != 0 && $$0.ae() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aA_(), this.m().b(dyg.by, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.ae() + 4L;
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
         this.q = akt.a(mc.bi, aku.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(tq $$0) {
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
         this.l = cxh.a($$1, (un)$$0.p("item")).orElse(cxh.k);
      } else {
         this.l = cxh.k;
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

   public void a(akt<ewt> $$0, long $$1) {
      this.q = $$0;
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

   public cxh d() {
      return this.l;
   }
}
