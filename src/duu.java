import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duu extends duq {
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
   private cxg l = cxg.j;
   @Nullable
   private jm m;
   @Nullable
   private alo<ewn> n;
   private long r;

   public duu(jh $$0, dxo $$1) {
      super(dus.O, $$0, $$1);
   }

   public boolean a(long $$0, arx $$1, cpo $$2, jm $$3, cxg $$4) {
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
               dxo $$7 = this.m();
               dxo $$8 = $$7.b(dye.by, Integer.valueOf($$6));
               $$1.a(this.aB_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(arx $$0, cpo $$1, cxg $$2) {
      if (this.n != null) {
         ewn $$3 = $$0.p().bc().b(this.n);
         if ($$1 instanceof ary $$4) {
            ao.Q.a($$4, this.n);
         }

         ewl $$5 = new ewl.a($$0).a(ezc.f, fbr.b(this.p)).a($$1.gF()).a(ezc.a, $$1).a(ezc.i, $$2).a(ezb.i);
         ObjectArrayList<cxg> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> cxg.j;
            case 1 -> (cxg)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$6.size());
               yield (cxg)$$6.getFirst();
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(arx $$0, cpo $$1, cxg $$2) {
      this.c($$0, $$1, $$2);
      dxo $$3 = this.m();
      $$0.c(3008, this.aB_(), dkd.j($$3));
      dkd $$6;
      if (this.m().b() instanceof dkj $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dkf.a;
      }

      $$0.a(this.p, $$6.m(), 3);
   }

   private void c(arx $$0, cpo $$1, cxg $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bvi.ar.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jm $$6 = Objects.requireNonNullElse(this.m, jm.b);
         jh $$7 = this.p.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bvi.ar.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         cls $$11 = new cls($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.h(fbr.c);
         $$0.b($$11);
         this.l = cxg.j;
      }
   }

   public void a(arx $$0) {
      if (this.i != 0 && $$0.ad() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aB_(), this.m().b(dye.by, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.ad() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.aB_(), this.m().b(), 2);
      }
   }

   private boolean c(um $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = alo.a(mb.bg, alp.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(um $$0) {
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
   public um a(js.a $$0) {
      um $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public acn b() {
      return acn.a(this);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cxg.a($$1, (vj)$$0.p("item")).orElse(cxg.j);
      } else {
         this.l = cxg.j;
      }

      if ($$0.e("hit_direction")) {
         this.m = jm.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(alo<ewn> $$0, long $$1) {
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

   public cxg d() {
      return this.l;
   }
}
