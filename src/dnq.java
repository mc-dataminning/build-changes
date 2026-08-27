import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnq extends dnm {
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
   private csz l = csz.i;
   @Nullable
   private is m;
   @Nullable
   private akg<eoq> q;
   private long r;

   public dnq(in $$0, dqh $$1) {
      super(dno.N, $$0, $$1);
   }

   public boolean a(long $$0, clh $$1, is $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.n instanceof aqh) {
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
               dqh $$5 = this.n();
               dqh $$6 = $$5.a(dqx.bv, Integer.valueOf($$4));
               this.n.a(this.az_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(clh $$0) {
      if (this.q != null && this.n != null && !this.n.x_() && this.n.o() != null) {
         eoq $$1 = this.n.o().be().b(this.q);
         if ($$0 instanceof aqi $$2) {
            am.Q.a($$2, this.q);
         }

         eoo $$3 = new eoo.a((aqh)this.n).a(erc.f, etp.b(this.o)).a($$0.gw()).a(erc.a, $$0).a(erb.c);
         ObjectArrayList<csz> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> csz.i;
            case 1 -> (csz)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$4.size());
               yield (csz)$$4.get(0);
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(clh $$0) {
      if (this.n != null && this.n.o() != null) {
         this.c($$0);
         dqh $$1 = this.n();
         this.n.c(3008, this.az_(), dde.i($$1));
         dde $$4;
         if (this.n().b() instanceof ddj $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = ddg.a;
         }

         this.n.a(this.o, $$4.n(), 3);
      }
   }

   private void c(clh $$0) {
      if (this.n != null && this.n.o() != null) {
         this.a($$0);
         if (!this.l.d()) {
            double $$1 = (double)brn.ag.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            is $$4 = Objects.requireNonNullElse(this.m, is.b);
            in $$5 = this.o.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(brn.ag.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            chr $$9 = new chr(this.n, $$6, $$7, $$8, this.l.a(this.n.z.a(21) + 10));
            $$9.g(etp.b);
            this.n.b($$9);
            this.l = csz.i;
         }
      }
   }

   public void b() {
      if (this.n != null) {
         if (this.i != 0 && this.n.Y() >= this.j) {
            int $$0 = this.j();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.j();
            if ($$0 != $$1) {
               this.n.a(this.az_(), this.n().a(dqx.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.n.Y() + 4L;
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

   private boolean c(ua $$0) {
      if ($$0.b("LootTable", 8)) {
         this.q = akg.a(le.aU, new akh($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(ua $$0) {
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
   public ua a(iy.a $$0) {
      ua $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.d()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public abt c() {
      return abt.a(this);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      if (!this.c($$0) && $$0.e("item")) {
         this.l = csz.a($$1, (ux)$$0.p("item")).orElse(csz.i);
      } else {
         this.l = csz.i;
      }

      if ($$0.e("hit_direction")) {
         this.m = is.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      if (!this.d($$0) && !this.l.d()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(akg<eoq> $$0, long $$1) {
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
   public is d() {
      return this.m;
   }

   public csz f() {
      return this.l;
   }
}
