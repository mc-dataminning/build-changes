import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtc extends dsy {
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
   private cwm l = cwm.k;
   @Nullable
   private jm m;
   @Nullable
   private ali<eus> n;
   private long r;

   public dtc(jh $$0, dvv $$1) {
      super(dta.N, $$0, $$1);
   }

   public boolean a(long $$0, arp $$1, cou $$2, jm $$3, cwm $$4) {
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
               dvv $$7 = this.m();
               dvv $$8 = $$7.b(dwl.bv, Integer.valueOf($$6));
               $$1.a(this.aA_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(arp $$0, cou $$1, cwm $$2) {
      if (this.n != null) {
         eus $$3 = $$0.p().bc().b(this.n);
         if ($$1 instanceof arq $$4) {
            ao.Q.a($$4, this.n);
         }

         euq $$5 = new euq.a($$0).a(exj.f, ezy.b(this.p)).a($$1.gD()).a(exj.a, $$1).a(exj.i, $$2).a(exi.i);
         ObjectArrayList<cwm> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> cwm.k;
            case 1 -> (cwm)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.n.a(), $$6.size());
               yield (cwm)$$6.getFirst();
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(arp $$0, cou $$1, cwm $$2) {
      this.c($$0, $$1, $$2);
      dvv $$3 = this.m();
      $$0.c(3008, this.aA_(), diq.j($$3));
      diq $$6;
      if (this.m().b() instanceof div $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dis.a;
      }

      $$0.a(this.p, $$6.m(), 3);
   }

   private void c(arp $$0, cou $$1, cwm $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bus.ap.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jm $$6 = Objects.requireNonNullElse(this.m, jm.b);
         jh $$7 = this.p.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bus.ap.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         clc $$11 = new clc($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.h(ezy.c);
         $$0.b($$11);
         this.l = cwm.k;
      }
   }

   public void a(arp $$0) {
      if (this.i != 0 && $$0.ab() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aA_(), this.m().b(dwl.bv, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.ab() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.aA_(), this.m().b(), 2);
      }
   }

   private boolean c(ul $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = ali.a(ma.bd, alj.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(ul $$0) {
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
   public ul a(js.a $$0) {
      ul $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public acm b() {
      return acm.a(this);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cwm.a($$1, (vi)$$0.p("item")).orElse(cwm.k);
      } else {
         this.l = cwm.k;
      }

      if ($$0.e("hit_direction")) {
         this.m = jm.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(ali<eus> $$0, long $$1) {
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

   public cwm d() {
      return this.l;
   }
}
