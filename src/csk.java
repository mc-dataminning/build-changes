import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class csk {
   public static final String b = "SpawnData";
   private static final Logger a = LogUtils.getLogger();
   private static final int c = 1;
   private int d = 20;
   private bif<ctz> e = bif.b();
   @Nullable
   private ctz f;
   private double g;
   private double h;
   private int i = 200;
   private int j = 800;
   private int k = 4;
   @Nullable
   private blp l;
   private int m = 6;
   private int n = 16;
   private int o = 4;

   public void a(blt<?> $$0, @Nullable cti $$1, aup $$2, hx $$3) {
      this.a($$1, $$2, $$3).a().a("id", kd.g.b($$0).toString());
   }

   private boolean c(cti $$0, hx $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.n);
   }

   public void a(cti $$0, hx $$1) {
      if (!this.c($$0, $$1)) {
         this.h = this.g;
      } else if (this.l != null) {
         aup $$2 = $$0.F_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(jx.ab, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(jx.E, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.d > 0) {
            this.d--;
         }

         this.h = this.g;
         this.g = (this.g + (double)(1000.0F / ((float)this.d + 200.0F))) % 360.0;
      }
   }

   public void a(amz $$0, hx $$1) {
      if (this.c($$0, $$1)) {
         if (this.d == -1) {
            this.d($$0, $$1);
         }

         if (this.d > 0) {
            this.d--;
         } else {
            boolean $$2 = false;
            aup $$3 = $$0.F_();
            ctz $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.k; $$5++) {
               sl $$6 = $$4.a();
               Optional<blt<?>> $$7 = blt.a($$6);
               if ($$7.isEmpty()) {
                  this.d($$0, $$1);
                  return;
               }

               sr $$8 = $$6.c("Pos", 6);
               int $$9 = $$8.size();
               double $$10 = $$9 >= 1 ? $$8.h(0) : (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               double $$11 = $$9 >= 2 ? $$8.h(1) : (double)($$1.v() + $$3.a(3) - 1);
               double $$12 = $$9 >= 3 ? $$8.h(2) : (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               if ($$0.b($$7.get().a($$10, $$11, $$12))) {
                  hx $$13 = hx.a($$10, $$11, $$12);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.ak() == bjs.a) {
                        continue;
                     }

                     ctz.a $$14 = $$4.b().get();
                     if (!$$14.a().a($$0.a(ctr.b, $$13)) || !$$14.b().a($$0.a(ctr.a, $$13))) {
                        continue;
                     }
                  } else if (!bmz.a($$7.get(), $$0, bmj.c, $$13, $$0.F_())) {
                     continue;
                  }

                  blp $$15 = blt.a($$6, $$0, $$3x -> {
                     $$3x.b($$10, $$11, $$12, $$3x.dC(), $$3x.dE());
                     return $$3x;
                  });
                  if ($$15 == null) {
                     this.d($$0, $$1);
                     return;
                  }

                  int $$16 = $$0.a(
                        dmy.b($$15.getClass()),
                        new elh((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.o),
                        bls.f
                     )
                     .size();
                  if ($$16 >= this.m) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$15.b($$15.dr(), $$15.dt(), $$15.dx(), $$3.i() * 360.0F, 0.0F);
                  if ($$15 instanceof bmh $$17) {
                     if ($$4.b().isEmpty() && !$$17.a($$0, bmj.c) || !$$17.a($$0)) {
                        continue;
                     }

                     if ($$4.a().f() == 1 && $$4.a().b("id", 8)) {
                        ((bmh)$$15).a($$0, $$0.d_($$15.dm()), bmj.c, null, null);
                     }
                  }

                  if (!$$0.e($$15)) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$15, dnk.t, $$13);
                  if ($$15 instanceof bmh) {
                     ((bmh)$$15).S();
                  }

                  $$2 = true;
               }
            }

            if ($$2) {
               this.d($$0, $$1);
            }
         }
      }
   }

   private void d(cti $$0, hx $$1) {
      aup $$2 = $$0.z;
      if (this.j <= this.i) {
         this.d = this.i;
      } else {
         this.d = this.i + $$2.a(this.j - this.i);
      }

      this.e.b($$2).ifPresent($$2x -> this.a($$0, $$1, (ctz)$$2x.b()));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable cti $$0, hx $$1, sl $$2) {
      this.d = $$2.g("Delay");
      boolean $$3 = $$2.b("SpawnData", 10);
      if ($$3) {
         ctz $$4 = ctz.b.parse(sz.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(ctz::new);
         this.a($$0, $$1, $$4);
      }

      boolean $$5 = $$2.b("SpawnPotentials", 9);
      if ($$5) {
         sr $$6 = $$2.c("SpawnPotentials", 10);
         this.e = ctz.c.parse(sz.a, $$6).resultOrPartial($$0x -> a.warn("Invalid SpawnPotentials list: {}", $$0x)).orElseGet(bif::b);
      } else {
         this.e = bif.a(this.f != null ? this.f : new ctz());
      }

      if ($$2.b("MinSpawnDelay", 99)) {
         this.i = $$2.g("MinSpawnDelay");
         this.j = $$2.g("MaxSpawnDelay");
         this.k = $$2.g("SpawnCount");
      }

      if ($$2.b("MaxNearbyEntities", 99)) {
         this.m = $$2.g("MaxNearbyEntities");
         this.n = $$2.g("RequiredPlayerRange");
      }

      if ($$2.b("SpawnRange", 99)) {
         this.o = $$2.g("SpawnRange");
      }

      this.l = null;
   }

   public sl a(sl $$0) {
      $$0.a("Delay", (short)this.d);
      $$0.a("MinSpawnDelay", (short)this.i);
      $$0.a("MaxSpawnDelay", (short)this.j);
      $$0.a("SpawnCount", (short)this.k);
      $$0.a("MaxNearbyEntities", (short)this.m);
      $$0.a("RequiredPlayerRange", (short)this.n);
      $$0.a("SpawnRange", (short)this.o);
      if (this.f != null) {
         $$0.a("SpawnData", (ti)ctz.b.encodeStart(sz.a, this.f).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData")));
      }

      $$0.a("SpawnPotentials", (ti)ctz.c.encodeStart(sz.a, this.e).result().orElseThrow());
      return $$0;
   }

   @Nullable
   public blp b(cti $$0, hx $$1) {
      if (this.l == null) {
         sl $$2 = this.a($$0, $$0.F_(), $$1).a();
         if (!$$2.b("id", 8)) {
            return null;
         }

         this.l = blt.a($$2, $$0, Function.identity());
         if ($$2.f() == 1 && this.l instanceof bmh) {
         }
      }

      return this.l;
   }

   public boolean a(cti $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.B) {
            this.d = this.i;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable cti $$0, hx $$1, ctz $$2) {
      this.f = $$2;
   }

   private ctz a(@Nullable cti $$0, aup $$1, hx $$2) {
      if (this.f != null) {
         return this.f;
      } else {
         this.a($$0, $$2, this.e.b($$1).map(bih.b::b).orElseGet(ctz::new));
         return this.f;
      }
   }

   public abstract void a(cti var1, hx var2, int var3);

   public double a() {
      return this.g;
   }

   public double b() {
      return this.h;
   }
}
