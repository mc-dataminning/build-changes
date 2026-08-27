import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfm extends dfi {
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
   private clo l = clo.b;
   @Nullable
   private ib m;
   @Nullable
   private agm n;
   private long r;

   public dfm(hx $$0, dhn $$1) {
      super(dfk.N, $$0, $$1);
   }

   public boolean a(long $$0, cdz $$1, ib $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof ami) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.k();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.aC_(), this.r().b(), 2);
            int $$4 = this.k();
            if ($$3 != $$4) {
               dhn $$5 = this.r();
               dhn $$6 = $$5.a(did.bv, Integer.valueOf($$4));
               this.o.a(this.aC_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cdz $$0) {
      if (this.n != null && this.o != null && !this.o.y_() && this.o.n() != null) {
         efk $$1 = this.o.n().aJ().getLootTable(this.n);
         if ($$0 instanceof amj $$2) {
            al.N.a($$2, this.n);
         }

         efi $$3 = new efi.a((ami)this.o).a(ehn.f, ejz.b(this.p)).a($$0.gp()).a(ehn.a, $$0).a(ehm.c);
         ObjectArrayList<clo> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> clo.b;
            case 1 -> (clo)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (clo)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cdz $$0) {
      if (this.o != null && this.o.n() != null) {
         this.c($$0);
         dhn $$1 = this.r();
         this.o.c(3008, this.aC_(), cvf.i($$1));
         cvf $$4;
         if (this.r().b() instanceof cvk $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = cvh.a;
         }

         this.o.a(this.p, $$4.o(), 3);
      }
   }

   private void c(cdz $$0) {
      if (this.o != null && this.o.n() != null) {
         this.a($$0);
         if (!this.l.b()) {
            double $$1 = (double)bkz.ad.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            ib $$4 = Objects.requireNonNullElse(this.m, ib.b);
            hx $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bkz.ad.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cas $$9 = new cas(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.g(ejz.b);
            this.o.b($$9);
            this.l = clo.b;
         }
      }
   }

   public void c() {
      if (this.o != null) {
         if (this.i != 0 && this.o.W() >= this.j) {
            int $$0 = this.k();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.k();
            if ($$0 != $$1) {
               this.o.a(this.aC_(), this.r().a(did.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.W() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.aC_(), this.r().b(), 2);
         }
      }
   }

   private boolean d(sd $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new agm($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean e(sd $$0) {
      if (this.n == null) {
         return false;
      } else {
         $$0.a("LootTable", this.n.toString());
         if (this.r != 0L) {
            $$0.a("LootTableSeed", this.r);
         }

         return true;
      }
   }

   @Override
   public sd ay_() {
      sd $$0 = super.ay_();
      if (this.m != null) {
         $$0.a("hit_direction", this.m.ordinal());
      }

      $$0.a("item", this.l.b(new sd()));
      return $$0;
   }

   public yo d() {
      return yo.a(this);
   }

   @Override
   public void a(sd $$0) {
      if (!this.d($$0) && $$0.e("item")) {
         this.l = clo.a($$0.p("item"));
      }

      if ($$0.e("hit_direction")) {
         this.m = ib.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(sd $$0) {
      if (!this.e($$0)) {
         $$0.a("item", this.l.b(new sd()));
      }
   }

   public void a(agm $$0, long $$1) {
      this.n = $$0;
      this.r = $$1;
   }

   private int k() {
      if (this.i == 0) {
         return 0;
      } else if (this.i < 3) {
         return 1;
      } else {
         return this.i < 6 ? 2 : 3;
      }
   }

   @Nullable
   public ib f() {
      return this.m;
   }

   public clo g() {
      return this.l;
   }
}
