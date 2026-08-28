import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dbh {
   public static final String b = "SpawnData";
   private static final Logger a = LogUtils.getLogger();
   private static final int c = 1;
   private int d = 20;
   private boq<dcx> e = boq.b();
   @Nullable
   private dcx f;
   private double g;
   private double h;
   private int i = 200;
   private int j = 800;
   private int k = 4;
   @Nullable
   private bsg l;
   private int m = 6;
   private int n = 16;
   private int o = 4;

   public void a(bsm<?> $$0, @Nullable dcf $$1, ayo $$2, ja $$3) {
      this.a($$1, $$2, $$3).a().a("id", lq.f.b($$0).toString());
   }

   private boolean c(dcf $$0, ja $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.n);
   }

   public void a(dcf $$0, ja $$1) {
      if (!this.c($$0, $$1)) {
         this.h = this.g;
      } else if (this.l != null) {
         ayo $$2 = $$0.E_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(lj.ae, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(lj.F, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.d > 0) {
            this.d--;
         }

         this.h = this.g;
         this.g = (this.g + (double)(1000.0F / ((float)this.d + 200.0F))) % 360.0;
      }
   }

   public void a(aqm $$0, ja $$1) {
      if (this.c($$0, $$1)) {
         if (this.d == -1) {
            this.d($$0, $$1);
         }

         if (this.d > 0) {
            this.d--;
         } else {
            boolean $$2 = false;
            ayo $$3 = $$0.E_();
            dcx $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.k; $$5++) {
               tx $$6 = $$4.a();
               Optional<bsm<?>> $$7 = bsm.a($$6);
               if ($$7.isEmpty()) {
                  this.d($$0, $$1);
                  return;
               }

               ud $$8 = $$6.c("Pos", 6);
               int $$9 = $$8.size();
               double $$10 = $$9 >= 1 ? $$8.h(0) : (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               double $$11 = $$9 >= 2 ? $$8.h(1) : (double)($$1.v() + $$3.a(3) - 1);
               double $$12 = $$9 >= 3 ? $$8.h(2) : (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               if ($$0.b($$7.get().a($$10, $$11, $$12))) {
                  ja $$13 = ja.a($$10, $$11, $$12);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.al() == bqd.a) {
                        continue;
                     }

                     dcx.a $$14 = $$4.b().get();
                     if (!$$14.a($$13, $$0)) {
                        continue;
                     }
                  } else if (!btx.a($$7.get(), $$0, btf.c, $$13, $$0.E_())) {
                     continue;
                  }

                  bsg $$15 = bsm.a($$6, $$0, $$3x -> {
                     $$3x.b($$10, $$11, $$12, $$3x.dG(), $$3x.dI());
                     return $$3x;
                  });
                  if ($$15 == null) {
                     this.d($$0, $$1);
                     return;
                  }

                  int $$16 = $$0.a(
                        dwu.b($$15.getClass()),
                        new ewa((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.o),
                        bsl.f
                     )
                     .size();
                  if ($$16 >= this.m) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$15.b($$15.dv(), $$15.dx(), $$15.dB(), $$3.i() * 360.0F, 0.0F);
                  if ($$15 instanceof btd $$17) {
                     if ($$4.b().isEmpty() && !$$17.a($$0, btf.c) || !$$17.a($$0)) {
                        continue;
                     }

                     boolean $$18 = $$4.a().f() == 1 && $$4.a().b("id", 8);
                     if ($$18) {
                        ((btd)$$15).a($$0, $$0.d_($$15.dq()), btf.c, null);
                     }

                     $$4.c().ifPresent($$17::a);
                  }

                  if (!$$0.e($$15)) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$15, dxg.t, $$13);
                  if ($$15 instanceof btd) {
                     ((btd)$$15).R();
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

   private void d(dcf $$0, ja $$1) {
      ayo $$2 = $$0.z;
      if (this.j <= this.i) {
         this.d = this.i;
      } else {
         this.d = this.i + $$2.a(this.j - this.i);
      }

      this.e.b($$2).ifPresent($$2x -> this.a($$0, $$1, (dcx)$$2x.b()));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable dcf $$0, ja $$1, tx $$2) {
      this.d = $$2.g("Delay");
      boolean $$3 = $$2.b("SpawnData", 10);
      if ($$3) {
         dcx $$4 = dcx.b.parse(ul.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(dcx::new);
         this.a($$0, $$1, $$4);
      }

      boolean $$5 = $$2.b("SpawnPotentials", 9);
      if ($$5) {
         ud $$6 = $$2.c("SpawnPotentials", 10);
         this.e = dcx.c.parse(ul.a, $$6).resultOrPartial($$0x -> a.warn("Invalid SpawnPotentials list: {}", $$0x)).orElseGet(boq::b);
      } else {
         this.e = boq.a(this.f != null ? this.f : new dcx());
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

   public tx a(tx $$0) {
      $$0.a("Delay", (short)this.d);
      $$0.a("MinSpawnDelay", (short)this.i);
      $$0.a("MaxSpawnDelay", (short)this.j);
      $$0.a("SpawnCount", (short)this.k);
      $$0.a("MaxNearbyEntities", (short)this.m);
      $$0.a("RequiredPlayerRange", (short)this.n);
      $$0.a("SpawnRange", (short)this.o);
      if (this.f != null) {
         $$0.a("SpawnData", (uu)dcx.b.encodeStart(ul.a, this.f).getOrThrow($$0x -> new IllegalStateException("Invalid SpawnData: " + $$0x)));
      }

      $$0.a("SpawnPotentials", (uu)dcx.c.encodeStart(ul.a, this.e).getOrThrow());
      return $$0;
   }

   @Nullable
   public bsg b(dcf $$0, ja $$1) {
      if (this.l == null) {
         tx $$2 = this.a($$0, $$0.E_(), $$1).a();
         if (!$$2.b("id", 8)) {
            return null;
         }

         this.l = bsm.a($$2, $$0, Function.identity());
         if ($$2.f() == 1 && this.l instanceof btd) {
         }
      }

      return this.l;
   }

   public boolean a(dcf $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.B) {
            this.d = this.i;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable dcf $$0, ja $$1, dcx $$2) {
      this.f = $$2;
   }

   private dcx a(@Nullable dcf $$0, ayo $$1, ja $$2) {
      if (this.f != null) {
         return this.f;
      } else {
         this.a($$0, $$2, this.e.b($$1).map(bos.b::b).orElseGet(dcx::new));
         return this.f;
      }
   }

   public abstract void a(dcf var1, ja var2, int var3);

   public double a() {
      return this.g;
   }

   public double b() {
      return this.h;
   }
}
