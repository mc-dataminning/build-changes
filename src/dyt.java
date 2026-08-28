import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyt extends dyo {
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
   private dak l;
   @Nullable
   private jc m;
   @Nullable
   private alq<fay> q;
   private long r;

   public dyt(iw $$0, ebq $$1) {
      super(dyq.O, $$0, $$1);
      this.l = dak.l;
   }

   public boolean a(long $$0, asb $$1, byf $$2, jc $$3, dak $$4) {
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
               ebq $$7 = this.m();
               ebq $$8 = $$7.b(ecg.by, Integer.valueOf($$6));
               $$1.a(this.ax_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(asb $$0, byf $$1, dak $$2) {
      if (this.q != null) {
         fay $$3 = $$0.p().bc().b(this.q);
         if ($$1 instanceof asc $$4) {
            aq.Q.a($$4, this.q);
         }

         faw $$5 = new faw.a($$0).a(fdn.f, fgc.b(this.o)).a($$1.eh()).a(fdn.a, $$1).a(fdn.i, $$2).a(fdm.i);
         ObjectArrayList<dak> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> dak.l;
            case 1 -> (dak)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$6.size());
               yield (dak)$$6.getFirst();
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(asb $$0, byf $$1, dak $$2) {
      this.c($$0, $$1, $$2);
      ebq $$3 = this.m();
      $$0.c(3008, this.ax_(), dno.j($$3));
      dno $$6;
      if (this.m().b() instanceof dnu $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dnq.a;
      }

      $$0.a(this.o, $$6.m(), 3);
   }

   private void c(asb $$0, byf $$1, dak $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bxn.ar.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jc $$6 = Objects.requireNonNullElse(this.m, jc.b);
         iw $$7 = this.o.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bxn.ar.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         coo $$11 = new coo($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.i(fgc.c);
         $$0.b($$11);
         this.l = dak.l;
      }
   }

   public void a(asb $$0) {
      if (this.i != 0 && $$0.ae() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.ax_(), this.m().b(ecg.by, Integer.valueOf($$2)), 3);
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

   private boolean b(ua $$0) {
      this.q = $$0.<alq<fay>>a("LootTable", fay.a).orElse(null);
      this.r = $$0.b("LootTableSeed", 0L);
      return this.q != null;
   }

   private boolean c(ua $$0) {
      if (this.q == null) {
         return false;
      } else {
         $$0.a("LootTable", fay.a, this.q);
         if (this.r != 0L) {
            $$0.a("LootTableSeed", this.r);
         }

         return true;
      }
   }

   @Override
   public ua a(ji.a $$0) {
      ua $$1 = super.a($$0);
      $$1.b("hit_direction", jc.k, this.m);
      if (!this.l.f()) {
         alp<va> $$2 = $$0.a(uo.a);
         $$1.a("item", dak.b, $$2, this.l);
      }

      return $$1;
   }

   public acl a() {
      return acl.a(this);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      alp<va> $$2 = $$1.a(uo.a);
      if (!this.b($$0)) {
         this.l = $$0.<dak>a("item", dak.b, $$2).orElse(dak.l);
      } else {
         this.l = dak.l;
      }

      this.m = $$0.<jc>a("hit_direction", jc.k).orElse(null);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.c($$0) && !this.l.f()) {
         alp<va> $$2 = $$1.a(uo.a);
         $$0.a("item", dak.b, $$2, this.l);
      }
   }

   public void a(alq<fay> $$0, long $$1) {
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
   public jc c() {
      return this.m;
   }

   public dak d() {
      return this.l;
   }
}
