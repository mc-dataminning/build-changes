import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duc extends dty {
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
   private cwo l = cwo.j;
   @Nullable
   private jn m;
   @Nullable
   private aku<evv> n;
   private long r;

   public duc(ji $$0, dww $$1) {
      super(dua.O, $$0, $$1);
   }

   public boolean a(long $$0, ard $$1, cow $$2, jn $$3, cwo $$4) {
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
               dww $$7 = this.m();
               dww $$8 = $$7.b(dxm.by, Integer.valueOf($$6));
               $$1.a(this.aA_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(ard $$0, cow $$1, cwo $$2) {
      if (this.n != null) {
         evv $$3 = $$0.p().bc().b(this.n);
         if ($$1 instanceof are $$4) {
            ap.Q.a($$4, this.n);
         }

         evt $$5 = new evt.a($$0).a(eyk.f, faz.b(this.p)).a($$1.gF()).a(eyk.a, $$1).a(eyk.i, $$2).a(eyj.i);
         ObjectArrayList<cwo> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> cwo.j;
            case 1 -> (cwo)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$6.size());
               yield (cwo)$$6.getFirst();
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(ard $$0, cow $$1, cwo $$2) {
      this.c($$0, $$1, $$2);
      dww $$3 = this.m();
      $$0.c(3008, this.aA_(), djl.j($$3));
      djl $$6;
      if (this.m().b() instanceof djr $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = djn.a;
      }

      $$0.a(this.p, $$6.m(), 3);
   }

   private void c(ard $$0, cow $$1, cwo $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bur.aq.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jn $$6 = Objects.requireNonNullElse(this.m, jn.b);
         ji $$7 = this.p.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bur.aq.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         clb $$11 = new clb($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.i(faz.c);
         $$0.b($$11);
         this.l = cwo.j;
      }
   }

   public void a(ard $$0) {
      if (this.i != 0 && $$0.ad() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aA_(), this.m().b(dxm.by, Integer.valueOf($$2)), 3);
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
         this.n = aku.a(mc.bg, akv.a($$0.l("LootTable")));
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

   public abs b() {
      return abs.a(this);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cwo.a($$1, (un)$$0.p("item")).orElse(cwo.j);
      } else {
         this.l = cwo.j;
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

   public void a(aku<evv> $$0, long $$1) {
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

   public cwo d() {
      return this.l;
   }
}
