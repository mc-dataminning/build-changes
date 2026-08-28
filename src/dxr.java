import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxr extends dxm {
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
   private czk l = czk.k;
   @Nullable
   private jb m;
   @Nullable
   private alf<ezt> q;
   private long r;

   public dxr(iv $$0, eao $$1) {
      super(dxo.O, $$0, $$1);
   }

   public boolean a(long $$0, arq $$1, bxj $$2, jb $$3, czk $$4) {
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
            $$1.a(this.ax_(), this.m().b(), 2);
            int $$6 = this.f();
            if ($$5 != $$6) {
               eao $$7 = this.m();
               eao $$8 = $$7.b(ebe.by, Integer.valueOf($$6));
               $$1.a(this.ax_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(arq $$0, bxj $$1, czk $$2) {
      if (this.q != null) {
         ezt $$3 = $$0.p().bc().b(this.q);
         if ($$1 instanceof arr $$4) {
            aq.Q.a($$4, this.q);
         }

         ezr $$5 = new ezr.a($$0).a(fci.f, fex.b(this.o)).a($$1.eg()).a(fci.a, $$1).a(fci.i, $$2).a(fch.i);
         ObjectArrayList<czk> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> czk.k;
            case 1 -> (czk)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$6.size());
               yield (czk)$$6.getFirst();
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(arq $$0, bxj $$1, czk $$2) {
      this.c($$0, $$1, $$2);
      eao $$3 = this.m();
      $$0.c(3008, this.ax_(), dmm.j($$3));
      dmm $$6;
      if (this.m().b() instanceof dms $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dmo.a;
      }

      $$0.a(this.o, $$6.m(), 3);
   }

   private void c(arq $$0, bxj $$1, czk $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bwr.aq.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jb $$6 = Objects.requireNonNullElse(this.m, jb.b);
         iv $$7 = this.o.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bwr.aq.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         cno $$11 = new cno($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.i(fex.c);
         $$0.b($$11);
         this.l = czk.k;
      }
   }

   public void a(arq $$0) {
      if (this.i != 0 && $$0.ae() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.ax_(), this.m().b(ebe.by, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.ae() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.ax_(), this.m().b(), 2);
      }
   }

   private boolean c(tz $$0) {
      this.q = $$0.<alf<ezt>>a("LootTable", ezt.a).orElse(null);
      this.r = $$0.b("LootTableSeed", 0L);
      return this.q != null;
   }

   private boolean d(tz $$0) {
      if (this.q == null) {
         return false;
      } else {
         $$0.a("LootTable", ezt.a, this.q);
         if (this.r != 0L) {
            $$0.a("LootTableSeed", this.r);
         }

         return true;
      }
   }

   @Override
   public tz a(jh.a $$0) {
      tz $$1 = super.a($$0);
      $$1.b("hit_direction", jb.k, this.m);
      if (!this.l.f()) {
         ale<uw> $$2 = $$0.a(un.a);
         $$1.a("item", czk.b, $$2, this.l);
      }

      return $$1;
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      if (!this.c($$0)) {
         this.l = $$0.<czk>a("item", czk.b, $$2).orElse(czk.k);
      } else {
         this.l = czk.k;
      }

      this.m = $$0.<jb>a("hit_direction", jb.k).orElse(null);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         ale<uw> $$2 = $$1.a(un.a);
         $$0.a("item", czk.b, $$2, this.l);
      }
   }

   public void a(alf<ezt> $$0, long $$1) {
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
   public jb c() {
      return this.m;
   }

   public czk d() {
      return this.l;
   }
}
