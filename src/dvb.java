import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvb extends dux {
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
   private cxp l = cxp.j;
   @Nullable
   private jm m;
   @Nullable
   private aly<ewu> n;
   private long r;

   public dvb(jh $$0, dxv $$1) {
      super(duz.O, $$0, $$1);
   }

   public boolean a(long $$0, ash $$1, cpx $$2, jm $$3, cxp $$4) {
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
            $$1.a(this.aB_(), this.m().b(), 2);
            int $$6 = this.f();
            if ($$5 != $$6) {
               dxv $$7 = this.m();
               dxv $$8 = $$7.b(dyl.bw, Integer.valueOf($$6));
               $$1.a(this.aB_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(ash $$0, cpx $$1, cxp $$2) {
      if (this.n != null) {
         ewu $$3 = $$0.p().bc().b(this.n);
         if ($$1 instanceof asi $$4) {
            ao.Q.a($$4, this.n);
         }

         ews $$5 = new ews.a($$0).a(ezj.f, fby.b(this.p)).a($$1.gF()).a(ezj.a, $$1).a(ezj.i, $$2).a(ezi.i);
         ObjectArrayList<cxp> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> cxp.j;
            case 1 -> (cxp)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$6.size());
               yield (cxp)$$6.getFirst();
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(ash $$0, cpx $$1, cxp $$2) {
      this.c($$0, $$1, $$2);
      dxv $$3 = this.m();
      $$0.c(3008, this.aB_(), dkm.j($$3));
      dkm $$6;
      if (this.m().b() instanceof dks $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dko.a;
      }

      $$0.a(this.p, $$6.m(), 3);
   }

   private void c(ash $$0, cpx $$1, cxp $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bvr.ar.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jm $$6 = Objects.requireNonNullElse(this.m, jm.b);
         jh $$7 = this.p.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bvr.ar.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         cmb $$11 = new cmb($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.h(fby.c);
         $$0.b($$11);
         this.l = cxp.j;
      }
   }

   public void a(ash $$0) {
      if (this.i != 0 && $$0.ac() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aB_(), this.m().b(dyl.bw, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.ac() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.aB_(), this.m().b(), 2);
      }
   }

   private boolean c(ux $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = aly.a(mb.bg, alz.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(ux $$0) {
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
   public ux a(js.a $$0) {
      ux $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public acy b() {
      return acy.a(this);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cxp.a($$1, (vu)$$0.p("item")).orElse(cxp.j);
      } else {
         this.l = cxp.j;
      }

      if ($$0.e("hit_direction")) {
         this.m = jm.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(aly<ewu> $$0, long $$1) {
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
   public jm c() {
      return this.m;
   }

   public cxp d() {
      return this.l;
   }
}
