import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class dhx {
   public static final String b = "SpawnData";
   private static final int a = 1;
   private int c = 20;
   private bsm<djp> d = bsm.a();
   @Nullable
   private djp e;
   private double f;
   private double g;
   private int h = 200;
   private int i = 800;
   private int j = 4;
   @Nullable
   private bwd k;
   private int l = 6;
   private int m = 16;
   private int n = 4;

   public void a(bwm<?> $$0, @Nullable div $$1, azv $$2, iu $$3) {
      this.a($$1, $$2, $$3).a().a("id", mf.f.b($$0).toString());
   }

   private boolean c(div $$0, iu $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.m);
   }

   public void a(div $$0, iu $$1) {
      if (!this.c($$0, $$1)) {
         this.g = this.f;
      } else if (this.k != null) {
         azv $$2 = $$0.C_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(lx.ah, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(lx.F, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.c > 0) {
            this.c--;
         }

         this.g = this.f;
         this.f = (this.f + (double)(1000.0F / ((float)this.c + 200.0F))) % 360.0;
      }
   }

   public void a(arq $$0, iu $$1) {
      if (this.c($$0, $$1)) {
         if (this.c == -1) {
            this.d($$0, $$1);
         }

         if (this.c > 0) {
            this.c--;
         } else {
            boolean $$2 = false;
            azv $$3 = $$0.C_();
            djp $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.j; $$5++) {
               tz $$6 = $$4.a();
               Optional<bwm<?>> $$7 = bwm.a($$6);
               if ($$7.isEmpty()) {
                  this.d($$0, $$1);
                  return;
               }

               uf $$8 = $$6.c("Pos", 6);
               int $$9 = $$8.size();
               double $$10 = $$9 >= 1 ? $$8.h(0) : (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.n + 0.5;
               double $$11 = $$9 >= 2 ? $$8.h(1) : (double)($$1.v() + $$3.a(3) - 1);
               double $$12 = $$9 >= 3 ? $$8.h(2) : (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.n + 0.5;
               if ($$0.b($$7.get().a($$10, $$11, $$12))) {
                  iu $$13 = iu.a($$10, $$11, $$12);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.an() == bty.a) {
                        continue;
                     }

                     djp.a $$14 = $$4.b().get();
                     if (!$$14.a($$13, $$0)) {
                        continue;
                     }
                  } else if (!bxx.a($$7.get(), $$0, bwl.c, $$13, $$0.C_())) {
                     continue;
                  }

                  bwd $$15 = bwm.a($$6, $$0, bwl.c, $$3x -> {
                     $$3x.b($$10, $$11, $$12, $$3x.dL(), $$3x.dN());
                     return $$3x;
                  });
                  if ($$15 == null) {
                     this.d($$0, $$1);
                     return;
                  }

                  int $$16 = $$0.a(
                        eel.b($$15.getClass()),
                        new fed((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.n),
                        bwk.f
                     )
                     .size();
                  if ($$16 >= this.l) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$15.b($$15.dA(), $$15.dC(), $$15.dG(), $$3.i() * 360.0F, 0.0F);
                  if ($$15 instanceof bxe $$17) {
                     if ($$4.b().isEmpty() && !$$17.a($$0, bwl.c) || !$$17.a((diy)$$0)) {
                        continue;
                     }

                     boolean $$18 = $$4.a().f() == 1 && $$4.a().b("id", 8);
                     if ($$18) {
                        ((bxe)$$15).a($$0, $$0.d_($$15.dv()), bwl.c, null);
                     }

                     $$4.c().ifPresent($$17::a);
                  }

                  if (!$$0.e($$15)) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$15, eez.t, $$13);
                  if ($$15 instanceof bxe) {
                     ((bxe)$$15).U();
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

   private void d(div $$0, iu $$1) {
      azv $$2 = $$0.A;
      if (this.i <= this.h) {
         this.c = this.h;
      } else {
         this.c = this.h + $$2.a(this.i - this.h);
      }

      this.d.a($$2).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable div $$0, iu $$1, tz $$2) {
      this.c = $$2.g("Delay");
      $$2.<djp>a("SpawnData", djp.b).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.d = $$2.<bsm<djp>>a("SpawnPotentials", djp.c).orElseGet(() -> bsm.a(this.e != null ? this.e : new djp()));
      if ($$2.b("MinSpawnDelay", 99)) {
         this.h = $$2.g("MinSpawnDelay");
         this.i = $$2.g("MaxSpawnDelay");
         this.j = $$2.g("SpawnCount");
      }

      if ($$2.b("MaxNearbyEntities", 99)) {
         this.l = $$2.g("MaxNearbyEntities");
         this.m = $$2.g("RequiredPlayerRange");
      }

      if ($$2.b("SpawnRange", 99)) {
         this.n = $$2.g("SpawnRange");
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
      if (this.e != null) {
         $$0.a("SpawnData", djp.b, this.e);
      }

      $$0.a("SpawnPotentials", djp.c, this.d);
      return $$0;
   }

   @Nullable
   public bwd b(div $$0, iu $$1) {
      if (this.k == null) {
         tz $$2 = this.a($$0, $$0.C_(), $$1).a();
         if (!$$2.b("id", 8)) {
            return null;
         }

         this.k = bwm.a($$2, $$0, bwl.c, Function.identity());
         if ($$2.f() == 1 && this.k instanceof bxe) {
         }
      }

      return this.k;
   }

   public boolean a(div $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.C) {
            this.c = this.h;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable div $$0, iu $$1, djp $$2) {
      this.e = $$2;
   }

   private djp a(@Nullable div $$0, azv $$1, iu $$2) {
      if (this.e != null) {
         return this.e;
      } else {
         this.a($$0, $$2, this.d.a($$1).orElseGet(djp::new));
         return this.e;
      }
   }

   public abstract void a(div var1, iu var2, int var3);

   public double a() {
      return this.f;
   }

   public double b() {
      return this.g;
   }
}
