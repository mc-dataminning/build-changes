import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvq extends dvl {
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
   private cxy l = cxy.k;
   @Nullable
   private jo m;
   @Nullable
   private alc<exq> q;
   private long r;

   public dvq(jj $$0, dym $$1) {
      super(dvn.O, $$0, $$1);
   }

   public boolean a(long $$0, arn $$1, bwr $$2, jo $$3, cxy $$4) {
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
            $$1.a(this.aw_(), this.m().b(), 2);
            int $$6 = this.f();
            if ($$5 != $$6) {
               dym $$7 = this.m();
               dym $$8 = $$7.b(dzc.by, Integer.valueOf($$6));
               $$1.a(this.aw_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(arn $$0, bwr $$1, cxy $$2) {
      if (this.q != null) {
         exq $$3 = $$0.p().bc().b(this.q);
         if ($$1 instanceof aro $$4) {
            ap.Q.a($$4, this.q);
         }

         exo $$5 = new exo.a($$0).a(faf.f, fcu.b(this.o)).a($$1.eg()).a(faf.a, $$1).a(faf.i, $$2).a(fae.i);
         ObjectArrayList<cxy> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> cxy.k;
            case 1 -> (cxy)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$6.size());
               yield (cxy)$$6.getFirst();
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(arn $$0, bwr $$1, cxy $$2) {
      this.c($$0, $$1, $$2);
      dym $$3 = this.m();
      $$0.c(3008, this.aw_(), dku.j($$3));
      dku $$6;
      if (this.m().b() instanceof dla $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dkw.a;
      }

      $$0.a(this.o, $$6.m(), 3);
   }

   private void c(arn $$0, bwr $$1, cxy $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = (double)bwb.aq.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jo $$6 = Objects.requireNonNullElse(this.m, jo.b);
         jj $$7 = this.o.a($$6, 1);
         double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
         double $$9 = (double)$$7.v() + 0.5 + (double)(bwb.aq.m() / 2.0F);
         double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
         cmn $$11 = new cmn($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.i(fcu.c);
         $$0.b($$11);
         this.l = cxy.k;
      }
   }

   public void a(arn $$0) {
      if (this.i != 0 && $$0.ae() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aw_(), this.m().b(dzc.by, Integer.valueOf($$2)), 3);
         }

         int $$3 = 4;
         this.j = $$0.ae() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.aw_(), this.m().b(), 2);
      }
   }

   private boolean c(tw $$0) {
      if ($$0.b("LootTable", 8)) {
         this.q = alc.a(me.bn, ald.a($$0.l("LootTable")));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(tw $$0) {
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
   public tw a(ju.a $$0) {
      tw $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.f()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public abx a() {
      return abx.a(this);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      if (!this.c($$0) && $$0.e("item")) {
         this.l = cxy.a($$1, (ut)$$0.p("item")).orElse(cxy.k);
      } else {
         this.l = cxy.k;
      }

      if ($$0.e("hit_direction")) {
         this.m = jo.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      if (!this.d($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(alc<exq> $$0, long $$1) {
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
   public jo c() {
      return this.m;
   }

   public cxy d() {
      return this.l;
   }
}
