import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class dij {
   public static final String b = "SpawnData";
   private static final int a = 1;
   private int c = 20;
   private bsq<dkb> d = bsq.a();
   @Nullable
   private dkb e;
   private double f;
   private double g;
   private int h = 200;
   private int i = 800;
   private int j = 4;
   @Nullable
   private bwi k;
   private int l = 6;
   private int m = 16;
   private int n = 4;

   public void a(bwr<?> $$0, @Nullable djh $$1, azv $$2, iv $$3) {
      this.a($$1, $$2, $$3).a().a("id", mg.f.b($$0).toString());
   }

   private boolean c(djh $$0, iv $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.m);
   }

   public void a(djh $$0, iv $$1) {
      if (!this.c($$0, $$1)) {
         this.g = this.f;
      } else if (this.k != null) {
         azv $$2 = $$0.C_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(ly.ah, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(ly.F, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.c > 0) {
            this.c--;
         }

         this.g = this.f;
         this.f = (this.f + (double)(1000.0F / ((float)this.c + 200.0F))) % 360.0;
      }
   }

   public void a(arq $$0, iv $$1) {
      if (this.c($$0, $$1)) {
         if (this.c == -1) {
            this.d($$0, $$1);
         }

         if (this.c > 0) {
            this.c--;
         } else {
            boolean $$2 = false;
            azv $$3 = $$0.C_();
            dkb $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.j; $$5++) {
               tz $$6 = $$4.a();
               Optional<bwr<?>> $$7 = bwr.a($$6);
               if ($$7.isEmpty()) {
                  this.d($$0, $$1);
                  return;
               }

               fex $$8 = $$6.<fex>a("Pos", fex.a)
                  .orElseGet(
                     () -> new fex(
                           (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.n + 0.5,
                           (double)($$1.v() + $$3.a(3) - 1),
                           (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.n + 0.5
                        )
                  );
               if ($$0.b($$7.get().a($$8.d, $$8.e, $$8.f))) {
                  iv $$9 = iv.a((jp)$$8);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.an() == bud.a) {
                        continue;
                     }

                     dkb.a $$10 = $$4.b().get();
                     if (!$$10.a($$9, $$0)) {
                        continue;
                     }
                  } else if (!bye.a($$7.get(), $$0, bwq.c, $$9, $$0.C_())) {
                     continue;
                  }

                  bwi $$11 = bwr.a($$6, $$0, bwq.c, $$1x -> {
                     $$1x.b($$8.d, $$8.e, $$8.f, $$1x.dK(), $$1x.dM());
                     return $$1x;
                  });
                  if ($$11 == null) {
                     this.d($$0, $$1);
                     return;
                  }

                  int $$12 = $$0.a(
                        efa.b($$11.getClass()),
                        new fes((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.n),
                        bwp.f
                     )
                     .size();
                  if ($$12 >= this.l) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$11.b($$11.dz(), $$11.dB(), $$11.dF(), $$3.i() * 360.0F, 0.0F);
                  if ($$11 instanceof bxl $$13) {
                     if ($$4.b().isEmpty() && !$$13.a($$0, bwq.c) || !$$13.a((djk)$$0)) {
                        continue;
                     }

                     boolean $$14 = $$4.a().f() == 1 && $$4.a().b("id", 8);
                     if ($$14) {
                        ((bxl)$$11).a($$0, $$0.d_($$11.du()), bwq.c, null);
                     }

                     $$4.c().ifPresent($$13::a);
                  }

                  if (!$$0.e($$11)) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$11, efo.t, $$9);
                  if ($$11 instanceof bxl) {
                     ((bxl)$$11).U();
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

   private void d(djh $$0, iv $$1) {
      azv $$2 = $$0.A;
      if (this.i <= this.h) {
         this.c = this.h;
      } else {
         this.c = this.h + $$2.a(this.i - this.h);
      }

      this.d.a($$2).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable djh $$0, iv $$1, tz $$2) {
      this.c = $$2.e("Delay");
      $$2.<dkb>a("SpawnData", dkb.b).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.d = $$2.<bsq<dkb>>a("SpawnPotentials", dkb.c).orElseGet(() -> bsq.a(this.e != null ? this.e : new dkb()));
      if ($$2.b("MinSpawnDelay", 99)) {
         this.h = $$2.e("MinSpawnDelay");
         this.i = $$2.e("MaxSpawnDelay");
         this.j = $$2.e("SpawnCount");
      }

      if ($$2.b("MaxNearbyEntities", 99)) {
         this.l = $$2.e("MaxNearbyEntities");
         this.m = $$2.e("RequiredPlayerRange");
      }

      if ($$2.b("SpawnRange", 99)) {
         this.n = $$2.e("SpawnRange");
      }

      this.k = null;
   }

   public tz a(tz $$0) {
      $$0.a("Delay", (short)this.c);
      $$0.a("MinSpawnDelay", (short)this.h);
      $$0.a("MaxSpawnDelay", (short)this.i);
      $$0.a("SpawnCount", (short)this.j);
      $$0.a("MaxNearbyEntities", (short)this.l);
      $$0.a("RequiredPlayerRange", (short)this.m);
      $$0.a("SpawnRange", (short)this.n);
      $$0.b("SpawnData", dkb.b, this.e);
      $$0.a("SpawnPotentials", dkb.c, this.d);
      return $$0;
   }

   @Nullable
   public bwi b(djh $$0, iv $$1) {
      if (this.k == null) {
         tz $$2 = this.a($$0, $$0.C_(), $$1).a();
         if (!$$2.b("id", 8)) {
            return null;
         }

         this.k = bwr.a($$2, $$0, bwq.c, Function.identity());
         if ($$2.f() == 1 && this.k instanceof bxl) {
         }
      }

      return this.k;
   }

   public boolean a(djh $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.C) {
            this.c = this.h;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable djh $$0, iv $$1, dkb $$2) {
      this.e = $$2;
   }

   private dkb a(@Nullable djh $$0, azv $$1, iv $$2) {
      if (this.e != null) {
         return this.e;
      } else {
         this.a($$0, $$2, this.d.a($$1).orElseGet(dkb::new));
         return this.e;
      }
   }

   public abstract void a(djh var1, iv var2, int var3);

   public double a() {
      return this.f;
   }

   public double b() {
      return this.g;
   }
}
