import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dms extends dmo {
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
   private crs l = crs.i;
   @Nullable
   private ij m;
   @Nullable
   private ajv n;
   private long r;

   public dms(id $$0, dpi $$1) {
      super(dmq.N, $$0, $$1);
   }

   public boolean a(long $$0, cka $$1, ij $$2) {
      if (this.m == null) {
         this.m = $$2;
      }

      this.j = $$0 + 40L;
      if ($$0 >= this.k && this.o instanceof apu) {
         this.k = $$0 + 10L;
         this.a($$1);
         int $$3 = this.j();
         if (++this.i >= 10) {
            this.b($$1);
            return true;
         } else {
            this.o.a(this.az_(), this.n().b(), 2);
            int $$4 = this.j();
            if ($$3 != $$4) {
               dpi $$5 = this.n();
               dpi $$6 = $$5.a(dpy.bv, Integer.valueOf($$4));
               this.o.a(this.az_(), $$6, 3);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void a(cka $$0) {
      if (this.n != null && this.o != null && !this.o.x_() && this.o.o() != null) {
         ens $$1 = this.o.o().aM().getLootTable(this.n);
         if ($$0 instanceof apv $$2) {
            am.Q.a($$2, this.n);
         }

         enq $$3 = new enq.a((apu)this.o).a(epx.f, esj.b(this.p)).a($$0.gv()).a(epx.a, $$0).a(epw.c);
         ObjectArrayList<crs> $$4 = $$1.a($$3, this.r);

         this.l = switch ($$4.size()) {
            case 0 -> crs.i;
            case 1 -> (crs)$$4.get(0);
            default -> {
               a.warn("Expected max 1 loot from loot table " + this.n + " got " + $$4.size());
               yield (crs)$$4.get(0);
            }
         };
         this.n = null;
         this.e();
      }
   }

   private void b(cka $$0) {
      if (this.o != null && this.o.o() != null) {
         this.c($$0);
         dpi $$1 = this.n();
         this.o.c(3008, this.az_(), dch.i($$1));
         dch $$4;
         if (this.n().b() instanceof dcm $$3) {
            $$4 = $$3.b();
         } else {
            $$4 = dcj.a;
         }

         this.o.a(this.p, $$4.n(), 3);
      }
   }

   private void c(cka $$0) {
      if (this.o != null && this.o.o() != null) {
         this.a($$0);
         if (!this.l.d()) {
            double $$1 = (double)bqg.ag.k();
            double $$2 = 1.0 - $$1;
            double $$3 = $$1 / 2.0;
            ij $$4 = Objects.requireNonNullElse(this.m, ij.b);
            id $$5 = this.p.a($$4, 1);
            double $$6 = (double)$$5.u() + 0.5 * $$2 + $$3;
            double $$7 = (double)$$5.v() + 0.5 + (double)(bqg.ag.l() / 2.0F);
            double $$8 = (double)$$5.w() + 0.5 * $$2 + $$3;
            cgk $$9 = new cgk(this.o, $$6, $$7, $$8, this.l.a(this.o.z.a(21) + 10));
            $$9.g(esj.b);
            this.o.b($$9);
            this.l = crs.i;
         }
      }
   }

   public void b() {
      if (this.o != null) {
         if (this.i != 0 && this.o.Y() >= this.j) {
            int $$0 = this.j();
            this.i = Math.max(0, this.i - 2);
            int $$1 = this.j();
            if ($$0 != $$1) {
               this.o.a(this.az_(), this.n().a(dpy.bv, Integer.valueOf($$1)), 3);
            }

            int $$2 = 4;
            this.j = this.o.Y() + 4L;
         }

         if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
         } else {
            this.o.a(this.az_(), this.n().b(), 2);
         }
      }
   }

   private boolean c(to $$0) {
      if ($$0.b("LootTable", 8)) {
         this.n = new ajv($$0.l("LootTable"));
         this.r = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   private boolean d(to $$0) {
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
   public to a(ip.a $$0) {
      to $$1 = super.a($$0);
      if (this.m != null) {
         $$1.a("hit_direction", this.m.ordinal());
      }

      if (!this.l.d()) {
         $$1.a("item", this.l.a($$0));
      }

      return $$1;
   }

   public abh c() {
      return abh.a(this);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      if (!this.c($$0) && $$0.e("item")) {
         this.l = crs.a($$1, (ul)$$0.p("item")).orElse(crs.i);
      } else {
         this.l = crs.i;
      }

      if ($$0.e("hit_direction")) {
         this.m = ij.values()[$$0.h("hit_direction")];
      }
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      if (!this.d($$0) && !this.l.d()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   public void a(ajv $$0, long $$1) {
      this.n = $$0;
      this.r = $$1;
   }

   private int j() {
      if (this.i == 0) {
         return 0;
      } else if (this.i < 3) {
         return 1;
      } else {
         return this.i < 6 ? 2 : 3;
      }
   }

   @Nullable
   public ij d() {
      return this.m;
   }

   public crs f() {
      return this.l;
   }
}
