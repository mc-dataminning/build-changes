import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dga {
   public static final String b = "SpawnData";
   private static final Logger a = LogUtils.getLogger();
   private static final int c = 1;
   private int d = 20;
   private bri<dht> e = bri.b();
   @Nullable
   private dht f;
   private double g;
   private double h;
   private int i = 200;
   private int j = 800;
   private int k = 4;
   @Nullable
   private bvb l;
   private int m = 6;
   private int n = 16;
   private int o = 4;

   public void a(bvi<?> $$0, @Nullable dgz $$1, bac $$2, jh $$3) {
      this.a($$1, $$2, $$3).a().a("id", ma.f.b($$0).toString());
   }

   private boolean c(dgz $$0, jh $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.n);
   }

   public void a(dgz $$0, jh $$1) {
      if (!this.c($$0, $$1)) {
         this.h = this.g;
      } else if (this.l != null) {
         bac $$2 = $$0.H_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(ls.ag, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(ls.F, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.d > 0) {
            this.d--;
         }

         this.h = this.g;
         this.g = (this.g + (double)(1000.0F / ((float)this.d + 200.0F))) % 360.0;
      }
   }

   public void a(arx $$0, jh $$1) {
      if (this.c($$0, $$1)) {
         if (this.d == -1) {
            this.d($$0, $$1);
         }

         if (this.d > 0) {
            this.d--;
         } else {
            boolean $$2 = false;
            bac $$3 = $$0.H_();
            dht $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.k; $$5++) {
               um $$6 = $$4.a();
               Optional<bvi<?>> $$7 = bvi.a($$6);
               if ($$7.isEmpty()) {
                  this.d($$0, $$1);
                  return;
               }

               us $$8 = $$6.c("Pos", 6);
               int $$9 = $$8.size();
               double $$10 = $$9 >= 1 ? $$8.h(0) : (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               double $$11 = $$9 >= 2 ? $$8.h(1) : (double)($$1.v() + $$3.a(3) - 1);
               double $$12 = $$9 >= 3 ? $$8.h(2) : (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               if ($$0.b($$7.get().a($$10, $$11, $$12))) {
                  jh $$13 = jh.a($$10, $$11, $$12);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.am() == bsx.a) {
                        continue;
                     }

                     dht.a $$14 = $$4.b().get();
                     if (!$$14.a($$13, $$0)) {
                        continue;
                     }
                  } else if (!bwt.a($$7.get(), $$0, bvh.c, $$13, $$0.H_())) {
                     continue;
                  }

                  bvb $$15 = bvi.a($$6, $$0, bvh.c, $$3x -> {
                     $$3x.b($$10, $$11, $$12, $$3x.dM(), $$3x.dO());
                     return $$3x;
                  });
                  if ($$15 == null) {
                     this.d($$0, $$1);
                     return;
                  }

                  int $$16 = $$0.a(
                        eby.b($$15.getClass()),
                        new fbm((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.o),
                        bvg.f
                     )
                     .size();
                  if ($$16 >= this.m) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$15.b($$15.dB(), $$15.dD(), $$15.dH(), $$3.i() * 360.0F, 0.0F);
                  if ($$15 instanceof bvz $$17) {
                     if ($$4.b().isEmpty() && !$$17.a($$0, bvh.c) || !$$17.a((dhc)$$0)) {
                        continue;
                     }

                     boolean $$18 = $$4.a().f() == 1 && $$4.a().b("id", 8);
                     if ($$18) {
                        ((bvz)$$15).a($$0, $$0.d_($$15.dw()), bvh.c, null);
                     }

                     $$4.c().ifPresent($$17::a);
                  }

                  if (!$$0.e($$15)) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$15, eck.t, $$13);
                  if ($$15 instanceof bvz) {
                     ((bvz)$$15).S();
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

   private void d(dgz $$0, jh $$1) {
      bac $$2 = $$0.A;
      if (this.j <= this.i) {
         this.d = this.i;
      } else {
         this.d = this.i + $$2.a(this.j - this.i);
      }

      this.e.b($$2).ifPresent($$2x -> this.a($$0, $$1, (dht)$$2x.b()));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable dgz $$0, jh $$1, um $$2) {
      this.d = $$2.g("Delay");
      boolean $$3 = $$2.b("SpawnData", 10);
      if ($$3) {
         dht $$4 = dht.b.parse(va.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(dht::new);
         this.a($$0, $$1, $$4);
      }

      boolean $$5 = $$2.b("SpawnPotentials", 9);
      if ($$5) {
         us $$6 = $$2.c("SpawnPotentials", 10);
         this.e = dht.c.parse(va.a, $$6).resultOrPartial($$0x -> a.warn("Invalid SpawnPotentials list: {}", $$0x)).orElseGet(bri::b);
      } else {
         this.e = bri.a(this.f != null ? this.f : new dht());
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

   public um a(um $$0) {
      $$0.a("Delay", (short)this.d);
      $$0.a("MinSpawnDelay", (short)this.i);
      $$0.a("MaxSpawnDelay", (short)this.j);
      $$0.a("SpawnCount", (short)this.k);
      $$0.a("MaxNearbyEntities", (short)this.m);
      $$0.a("RequiredPlayerRange", (short)this.n);
      $$0.a("SpawnRange", (short)this.o);
      if (this.f != null) {
         $$0.a("SpawnData", (vj)dht.b.encodeStart(va.a, this.f).getOrThrow($$0x -> new IllegalStateException("Invalid SpawnData: " + $$0x)));
      }

      $$0.a("SpawnPotentials", (vj)dht.c.encodeStart(va.a, this.e).getOrThrow());
      return $$0;
   }

   @Nullable
   public bvb b(dgz $$0, jh $$1) {
      if (this.l == null) {
         um $$2 = this.a($$0, $$0.H_(), $$1).a();
         if (!$$2.b("id", 8)) {
            return null;
         }

         this.l = bvi.a($$2, $$0, bvh.c, Function.identity());
         if ($$2.f() == 1 && this.l instanceof bvz) {
         }
      }

      return this.l;
   }

   public boolean a(dgz $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.C) {
            this.d = this.i;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable dgz $$0, jh $$1, dht $$2) {
      this.f = $$2;
   }

   private dht a(@Nullable dgz $$0, bac $$1, jh $$2) {
      if (this.f != null) {
         return this.f;
      } else {
         this.a($$0, $$2, this.e.b($$1).map(brk.b::b).orElseGet(dht::new));
         return this.f;
      }
   }

   public abstract void a(dgz var1, jh var2, int var3);

   public double a() {
      return this.g;
   }

   public double b() {
      return this.h;
   }
}
