import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsv extends dsr {
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
   private cwf l = cwf.k;
   @Nullable
   private jm m;
   @Nullable
   private alk<eul> n;
   private long r;

   public dsv(jh $$0, dvo $$1) {
      super(dst.N, $$0, $$1);
   }

   public boolean a(long $$0, arq $$1, cor $$2, jm $$3, cwf $$4) {
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
               dvo $$7 = this.m();
               dvo $$8 = $$7.b(dwe.bv, Integer.valueOf($$6));
               $$1.a(this.aB_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(arq $$0, cor $$1, cwf $$2) {
      if (this.n != null) {
         eul $$3 = $$0.o().bc().b(this.n);
         if ($$1 instanceof arr $$4) {
            ao.Q.a($$4, this.n);
         }

         euj $$5 = new euj.a($$0).a(exc.f, ezr.b(this.p)).a($$1.gI()).a(exc.a, $$1).a(exc.i, $$2).a(exb.i);
         ObjectArrayList<cwf> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> cwf.k;
            case 1 -> (cwf)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$6.size());
               yield (cwf)$$6.getFirst();
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(arq $$0, cor $$1, cwf $$2) {
      this.c($$0, $$1, $$2);
      dvo $$3 = this.m();
      $$0.c(3008, this.aB_(), dij.j($$3));
      dij $$6;
      if (this.m().b() instanceof dio $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dil.a;
      }

      $$0.a(this.p, $$6.m(), 3);
   }

   private void c(arq $$0, cor $$1, cwf $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bup.ag.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jm $$6 = Objects.requireNonNullElse(this.m, jm.b);
         jh $$7 = this.p.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bup.ag.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         ckz $$11 = new ckz($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.h(ezr.c);
         $$0.b($$11);
         this.l = cwf.k;
      }
   }

   public void a(arq $$0) {
      if (this.i != 0 && $$0.aa() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aB_(), this.m().b(dwe.bv, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.aa() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.aB_(), this.m().b(), 2);
      }
   }

   private boolean c(un $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = alk.a(ma.bd, all.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(un $$0) {
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
   public un a(js.a $$0) {
      un $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public aco b() {
      return aco.a(this);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cwf.a($$1, (vk)$$0.p("item")).orElse(cwf.k);
      } else {
         this.l = cwf.k;
      }

      if ($$0.e("hit_direction")) {
         this.m = jm.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(alk<eul> $$0, long $$1) {
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

   public cwf d() {
      return this.l;
   }
}
