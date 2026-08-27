import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cpd {
   public static final String b = "SpawnData";
   private static final Logger a = LogUtils.getLogger();
   private static final int c = 1;
   private int d = 20;
   private bfo<cqs> e = bfo.b();
   @Nullable
   private cqs f;
   private double g;
   private double h;
   private int i = 200;
   private int j = 800;
   private int k = 4;
   @Nullable
   private biw l;
   private int m = 6;
   private int n = 16;
   private int o = 4;

   public void a(bja<?> $$0, @Nullable cqb $$1, ash $$2, gw $$3) {
      this.b($$1, $$2, $$3).a().a("id", jb.h.b($$0).toString());
   }

   private boolean b(cqb $$0, gw $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.n);
   }

   public void a(cqb $$0, gw $$1) {
      if (!this.b($$0, $$1)) {
         this.h = this.g;
      } else if (this.l != null) {
         ash $$2 = $$0.D_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(iv.Z, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(iv.C, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.d > 0) {
            this.d--;
         }

         this.h = this.g;
         this.g = (this.g + (double)(1000.0F / ((float)this.d + 200.0F))) % 360.0;
      }
   }

   public void a(akt $$0, gw $$1) {
      if (this.b($$0, $$1)) {
         if (this.d == -1) {
            this.c($$0, $$1);
         }

         if (this.d > 0) {
            this.d--;
         } else {
            boolean $$2 = false;
            ash $$3 = $$0.D_();
            cqs $$4 = this.b($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.k; $$5++) {
               qw $$6 = $$4.a();
               Optional<bja<?>> $$7 = bja.a($$6);
               if ($$7.isEmpty()) {
                  this.c($$0, $$1);
                  return;
               }

               rc $$8 = $$6.c("Pos", 6);
               int $$9 = $$8.size();
               double $$10 = $$9 >= 1 ? $$8.h(0) : (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               double $$11 = $$9 >= 2 ? $$8.h(1) : (double)($$1.v() + $$3.a(3) - 1);
               double $$12 = $$9 >= 3 ? $$8.h(2) : (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               if ($$0.b($$7.get().a($$10, $$11, $$12))) {
                  gw $$13 = gw.a($$10, $$11, $$12);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.ai() == bhb.a) {
                        continue;
                     }

                     cqs.a $$14 = $$4.b().get();
                     if (!$$14.a().a($$0.a(cqk.b, $$13)) || !$$14.b().a($$0.a(cqk.a, $$13))) {
                        continue;
                     }
                  } else if (!bkg.a($$7.get(), $$0, bjq.c, $$13, $$0.D_())) {
                     continue;
                  }

                  biw $$15 = bja.a($$6, $$0, $$3x -> {
                     $$3x.b($$10, $$11, $$12, $$3x.dB(), $$3x.dD());
                     return $$3x;
                  });
                  if ($$15 == null) {
                     this.c($$0, $$1);
                     return;
                  }

                  int $$16 = $$0.a(
                        $$15.getClass(),
                        new ehc((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.o)
                     )
                     .size();
                  if ($$16 >= this.m) {
                     this.c($$0, $$1);
                     return;
                  }

                  $$15.b($$15.dq(), $$15.ds(), $$15.dw(), $$3.i() * 360.0F, 0.0F);
                  if ($$15 instanceof bjo $$17) {
                     if ($$4.b().isEmpty() && !$$17.a($$0, bjq.c) || !$$17.a($$0)) {
                        continue;
                     }

                     if ($$4.a().f() == 1 && $$4.a().b("id", 8)) {
                        ((bjo)$$15).a($$0, $$0.d_($$15.dl()), bjq.c, null, null);
                     }
                  }

                  if (!$$0.e($$15)) {
                     this.c($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$15, djn.t, $$13);
                  if ($$15 instanceof bjo) {
                     ((bjo)$$15).Q();
                  }

                  $$2 = true;
               }
            }

            if ($$2) {
               this.c($$0, $$1);
            }
         }
      }
   }

   private void c(cqb $$0, gw $$1) {
      ash $$2 = $$0.z;
      if (this.j <= this.i) {
         this.d = this.i;
      } else {
         this.d = this.i + $$2.a(this.j - this.i);
      }

      this.e.b($$2).ifPresent($$2x -> this.a($$0, $$1, (cqs)$$2x.b()));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable cqb $$0, gw $$1, qw $$2) {
      this.d = $$2.g("Delay");
      boolean $$3 = $$2.b("SpawnData", 10);
      if ($$3) {
         cqs $$4 = cqs.b.parse(ri.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(cqs::new);
         this.a($$0, $$1, $$4);
      }

      boolean $$5 = $$2.b("SpawnPotentials", 9);
      if ($$5) {
         rc $$6 = $$2.c("SpawnPotentials", 10);
         this.e = cqs.c.parse(ri.a, $$6).resultOrPartial($$0x -> a.warn("Invalid SpawnPotentials list: {}", $$0x)).orElseGet(bfo::b);
      } else {
         this.e = bfo.a(this.f != null ? this.f : new cqs());
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

   public qw a(qw $$0) {
      $$0.a("Delay", (short)this.d);
      $$0.a("MinSpawnDelay", (short)this.i);
      $$0.a("MaxSpawnDelay", (short)this.j);
      $$0.a("SpawnCount", (short)this.k);
      $$0.a("MaxNearbyEntities", (short)this.m);
      $$0.a("RequiredPlayerRange", (short)this.n);
      $$0.a("SpawnRange", (short)this.o);
      if (this.f != null) {
         $$0.a("SpawnData", (rq)cqs.b.encodeStart(ri.a, this.f).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData")));
      }

      $$0.a("SpawnPotentials", (rq)cqs.c.encodeStart(ri.a, this.e).result().orElseThrow());
      return $$0;
   }

   @Nullable
   public biw a(cqb $$0, ash $$1, gw $$2) {
      if (this.l == null) {
         qw $$3 = this.b($$0, $$1, $$2).a();
         if (!$$3.b("id", 8)) {
            return null;
         }

         this.l = bja.a($$3, $$0, Function.identity());
         if ($$3.f() == 1 && this.l instanceof bjo) {
         }
      }

      return this.l;
   }

   public boolean a(cqb $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.B) {
            this.d = this.i;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable cqb $$0, gw $$1, cqs $$2) {
      this.f = $$2;
   }

   private cqs b(@Nullable cqb $$0, ash $$1, gw $$2) {
      if (this.f != null) {
         return this.f;
      } else {
         this.a($$0, $$2, this.e.b($$1).map(bfq.b::b).orElseGet(cqs::new));
         return this.f;
      }
   }

   public abstract void a(cqb var1, gw var2, int var3);

   public double a() {
      return this.g;
   }

   public double b() {
      return this.h;
   }
}
