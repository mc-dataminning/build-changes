import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyj extends dye {
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
   private daa l = daa.k;
   @Nullable
   private jc m;
   @Nullable
   private alj<fao> q;
   private long r;

   public dyj(iw $$0, ebg $$1) {
      super(dyg.O, $$0, $$1);
   }

   public boolean a(long $$0, aru $$1, bxw $$2, jc $$3, daa $$4) {
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
               ebg $$7 = this.m();
               ebg $$8 = $$7.b(ebw.by, Integer.valueOf($$6));
               $$1.a(this.aB_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(aru $$0, bxw $$1, daa $$2) {
      if (this.q != null) {
         fao $$3 = $$0.p().bc().b(this.q);
         if ($$1 instanceof arv $$4) {
            aq.Q.a($$4, this.q);
         }

         fam $$5 = new fam.a($$0).a(fdd.f, ffs.b(this.o)).a($$1.eh()).a(fdd.a, $$1).a(fdd.i, $$2).a(fdc.i);
         ObjectArrayList<daa> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> daa.k;
            case 1 -> (daa)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$6.size());
               yield (daa)$$6.getFirst();
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(aru $$0, bxw $$1, daa $$2) {
      this.c($$0, $$1, $$2);
      ebg $$3 = this.m();
      $$0.c(3008, this.aB_(), dne.j($$3));
      dne $$6;
      if (this.m().b() instanceof dnk $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dng.a;
      }

      $$0.a(this.o, $$6.m(), 3);
   }

   private void c(aru $$0, bxw $$1, daa $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bxe.ar.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jc $$6 = Objects.requireNonNullElse(this.m, jc.b);
         iw $$7 = this.o.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bxe.ar.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         coe $$11 = new coe($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.i(ffs.c);
         $$0.b($$11);
         this.l = daa.k;
      }
   }

   public void a(aru $$0) {
      if (this.i != 0 && $$0.ae() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aB_(), this.m().b(ebw.by, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.ae() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.aB_(), this.m().b(), 2);
      }
   }

   private boolean c(ua $$0) {
      this.q = $$0.<alj<fao>>a("LootTable", fao.a).orElse(null);
      this.r = $$0.b("LootTableSeed", 0L);
      return this.q != null;
   }

   private boolean d(ua $$0) {
      if (this.q == null) {
         return false;
      } else {
         $$0.a("LootTable", fao.a, this.q);
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
         ali<va> $$2 = $$0.a(uo.a);
         $$1.a("item", daa.b, $$2, this.l);
      }

      return $$1;
   }

   public ace a() {
      return ace.a(this);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      ali<va> $$2 = $$1.a(uo.a);
      if (!this.c($$0)) {
         this.l = $$0.<daa>a("item", daa.b, $$2).orElse(daa.k);
      } else {
         this.l = daa.k;
      }

      this.m = $$0.<jc>a("hit_direction", jc.k).orElse(null);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         ali<va> $$2 = $$1.a(uo.a);
         $$0.a("item", daa.b, $$2, this.l);
      }
   }

   public void a(alj<fao> $$0, long $$1) {
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

   public daa d() {
      return this.l;
   }
}
