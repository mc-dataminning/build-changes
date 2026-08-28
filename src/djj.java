import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class djj {
   public static final String b = "SpawnData";
   private static final int a = 1;
   private static final int c = 20;
   private static final int d = 200;
   private static final int e = 800;
   private static final int f = 4;
   private static final int g = 6;
   private static final int h = 16;
   private static final int i = 4;
   private int j = 20;
   private btm<dld> k = btm.a();
   @Nullable
   private dld l;
   private double m;
   private double n;
   private int o = 200;
   private int p = 800;
   private int q = 4;
   @Nullable
   private bxe r;
   private int s = 6;
   private int t = 16;
   private int u = 4;

   public void a(bxn<?> $$0, @Nullable dkj $$1, bai $$2, iw $$3) {
      this.a($$1, $$2, $$3).a().a("id", mh.f.b($$0).toString());
   }

   private boolean c(dkj $$0, iw $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.t);
   }

   public void a(dkj $$0, iw $$1) {
      if (!this.c($$0, $$1)) {
         this.n = this.m;
      } else if (this.r != null) {
         bai $$2 = $$0.G_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(lz.ah, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(lz.F, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.j > 0) {
            this.j--;
         }

         this.n = this.m;
         this.m = (this.m + (double)(1000.0F / ((float)this.j + 200.0F))) % 360.0;
      }
   }

   public void a(asb $$0, iw $$1) {
      if (this.c($$0, $$1)) {
         if (this.j == -1) {
            this.d($$0, $$1);
         }

         if (this.j > 0) {
            this.j--;
         } else {
            boolean $$2 = false;
            bai $$3 = $$0.G_();
            dld $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.q; $$5++) {
               ua $$6 = $$4.a();
               Optional<bxn<?>> $$7 = bxn.a($$6);
               if ($$7.isEmpty()) {
                  this.d($$0, $$1);
                  return;
               }

               fgc $$8 = $$6.<fgc>a("Pos", fgc.a)
                  .orElseGet(
                     () -> new fgc(
                           (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.u + 0.5,
                           (double)($$1.v() + $$3.a(3) - 1),
                           (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.u + 0.5
                        )
                  );
               if ($$0.b($$7.get().a($$8.d, $$8.e, $$8.f))) {
                  iw $$9 = iw.a((jq)$$8);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.an() == buz.a) {
                        continue;
                     }

                     dld.a $$10 = $$4.b().get();
                     if (!$$10.a($$9, $$0)) {
                        continue;
                     }
                  } else if (!bza.a($$7.get(), $$0, bxm.c, $$9, $$0.G_())) {
                     continue;
                  }

                  bxe $$11 = bxn.a($$6, $$0, bxm.c, $$1x -> {
                     $$1x.b($$8.d, $$8.e, $$8.f, $$1x.dL(), $$1x.dN());
                     return $$1x;
                  });
                  if ($$11 == null) {
                     this.d($$0, $$1);
                     return;
                  }

                  int $$12 = $$0.a(
                        egc.b($$11.getClass()),
                        new ffx((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.u),
                        bxl.f
                     )
                     .size();
                  if ($$12 >= this.s) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$11.b($$11.dA(), $$11.dC(), $$11.dG(), $$3.i() * 360.0F, 0.0F);
                  if ($$11 instanceof byh $$13) {
                     if ($$4.b().isEmpty() && !$$13.a($$0, bxm.c) || !$$13.a((dkm)$$0)) {
                        continue;
                     }

                     boolean $$14 = $$4.a().i() == 1 && $$4.a().i("id").isPresent();
                     if ($$14) {
                        ((byh)$$11).a($$0, $$0.d_($$11.dv()), bxm.c, null);
                     }

                     $$4.c().ifPresent($$13::a);
                  }

                  if (!$$0.e($$11)) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$11, egq.t, $$9);
                  if ($$11 instanceof byh) {
                     ((byh)$$11).T();
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

   private void d(dkj $$0, iw $$1) {
      bai $$2 = $$0.A;
      if (this.p <= this.o) {
         this.j = this.o;
      } else {
         this.j = this.o + $$2.a(this.p - this.o);
      }

      this.k.a($$2).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable dkj $$0, iw $$1, ua $$2) {
      this.j = $$2.b("Delay", (short)20);
      $$2.<dld>a("SpawnData", dld.b).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.k = $$2.<btm<dld>>a("SpawnPotentials", dld.c).orElseGet(() -> btm.a(this.l != null ? this.l : new dld()));
      this.o = $$2.b("MinSpawnDelay", 200);
      this.p = $$2.b("MaxSpawnDelay", 800);
      this.q = $$2.b("SpawnCount", 4);
      this.s = $$2.b("MaxNearbyEntities", 6);
      this.t = $$2.b("RequiredPlayerRange", 16);
      this.u = $$2.b("SpawnRange", 4);
      this.r = null;
   }

   public ua a(ua $$0) {
      $$0.a("Delay", (short)this.j);
      $$0.a("MinSpawnDelay", (short)this.o);
      $$0.a("MaxSpawnDelay", (short)this.p);
      $$0.a("SpawnCount", (short)this.q);
      $$0.a("MaxNearbyEntities", (short)this.s);
      $$0.a("RequiredPlayerRange", (short)this.t);
      $$0.a("SpawnRange", (short)this.u);
      $$0.b("SpawnData", dld.b, this.l);
      $$0.a("SpawnPotentials", dld.c, this.k);
      return $$0;
   }

   @Nullable
   public bxe b(dkj $$0, iw $$1) {
      if (this.r == null) {
         ua $$2 = this.a($$0, $$0.G_(), $$1).a();
         if ($$2.i("id").isEmpty()) {
            return null;
         }

         this.r = bxn.a($$2, $$0, bxm.c, Function.identity());
         if ($$2.i() == 1 && this.r instanceof byh) {
         }
      }

      return this.r;
   }

   public boolean a(dkj $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.C) {
            this.j = this.o;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable dkj $$0, iw $$1, dld $$2) {
      this.l = $$2;
   }

   private dld a(@Nullable dkj $$0, bai $$1, iw $$2) {
      if (this.l != null) {
         return this.l;
      } else {
         this.a($$0, $$2, this.k.a($$1).orElseGet(dld::new));
         return this.l;
      }
   }

   public abstract void a(dkj var1, iw var2, int var3);

   public double a() {
      return this.m;
   }

   public double b() {
      return this.n;
   }
}
