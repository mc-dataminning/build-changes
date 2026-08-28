import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyh extends dyc {
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
   private czy l = czy.k;
   @Nullable
   private jb m;
   @Nullable
   private alh<fam> q;
   private long r;

   public dyh(iv $$0, ebe $$1) {
      super(dye.O, $$0, $$1);
   }

   public boolean a(long $$0, ars $$1, bxu $$2, jb $$3, czy $$4) {
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
               ebe $$7 = this.m();
               ebe $$8 = $$7.b(ebu.by, Integer.valueOf($$6));
               $$1.a(this.aB_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(ars $$0, bxu $$1, czy $$2) {
      if (this.q != null) {
         fam $$3 = $$0.p().bc().b(this.q);
         if ($$1 instanceof art $$4) {
            aq.Q.a($$4, this.q);
         }

         fak $$5 = new fak.a($$0).a(fdb.f, ffq.b(this.o)).a($$1.eh()).a(fdb.a, $$1).a(fdb.i, $$2).a(fda.i);
         ObjectArrayList<czy> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> czy.k;
            case 1 -> (czy)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$6.size());
               yield (czy)$$6.getFirst();
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(ars $$0, bxu $$1, czy $$2) {
      this.c($$0, $$1, $$2);
      ebe $$3 = this.m();
      $$0.c(3008, this.aB_(), dnc.j($$3));
      dnc $$6;
      if (this.m().b() instanceof dni $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dne.a;
      }

      $$0.a(this.o, $$6.m(), 3);
   }

   private void c(ars $$0, bxu $$1, czy $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bxc.ar.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jb $$6 = Objects.requireNonNullElse(this.m, jb.b);
         iv $$7 = this.o.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bxc.ar.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         coc $$11 = new coc($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.i(ffq.c);
         $$0.b($$11);
         this.l = czy.k;
      }
   }

   public void a(ars $$0) {
      if (this.i != 0 && $$0.ae() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aB_(), this.m().b(ebu.by, Integer.valueOf($$2)), 3);
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

   private boolean c(tz $$0) {
      this.q = $$0.<alh<fam>>a("LootTable", fam.a).orElse(null);
      this.r = $$0.b("LootTableSeed", 0L);
      return this.q != null;
   }

   private boolean d(tz $$0) {
      if (this.q == null) {
         return false;
      } else {
         $$0.a("LootTable", fam.a, this.q);
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
         alg<uy> $$2 = $$0.a(un.a);
         $$1.a("item", czy.b, $$2, this.l);
      }

      return $$1;
   }

   public acc a() {
      return acc.a(this);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      alg<uy> $$2 = $$1.a(un.a);
      if (!this.c($$0)) {
         this.l = $$0.<czy>a("item", czy.b, $$2).orElse(czy.k);
      } else {
         this.l = czy.k;
      }

      this.m = $$0.<jb>a("hit_direction", jb.k).orElse(null);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         alg<uy> $$2 = $$1.a(un.a);
         $$0.a("item", czy.b, $$2, this.l);
      }
   }

   public void a(alh<fam> $$0, long $$1) {
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

   public czy d() {
      return this.l;
   }
}
