import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class clo {
   public static final String b = "SpawnData";
   private static final Logger a = LogUtils.getLogger();
   private static final int c = 1;
   private int d = 20;
   private bch<cnd> e = bch.b();
   @Nullable
   private cnd f;
   private double g;
   private double h;
   private int i = 200;
   private int j = 800;
   private int k = 4;
   @Nullable
   private bfj l;
   private int m = 6;
   private int n = 16;
   private int o = 4;

   public void a(bfn<?> $$0, @Nullable cmm $$1, apf $$2, gu $$3) {
      this.b($$1, $$2, $$3).a().a("id", jb.h.b($$0).toString());
   }

   private boolean b(cmm $$0, gu $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.n);
   }

   public void a(cmm $$0, gu $$1) {
      if (!this.b($$0, $$1)) {
         this.h = this.g;
      } else if (this.l != null) {
         apf $$2 = $$0.y_();
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

   public void a(aif $$0, gu $$1) {
      if (this.b($$0, $$1)) {
         if (this.d == -1) {
            this.c($$0, $$1);
         }

         if (this.d > 0) {
            this.d--;
         } else {
            boolean $$2 = false;
            apf $$3 = $$0.y_();
            cnd $$4 = this.b($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.k; $$5++) {
               qr $$6 = $$4.a();
               Optional<bfn<?>> $$7 = bfn.a($$6);
               if ($$7.isEmpty()) {
                  this.c($$0, $$1);
                  return;
               }

               qx $$8 = $$6.c("Pos", 6);
               int $$9 = $$8.size();
               double $$10 = $$9 >= 1 ? $$8.h(0) : (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               double $$11 = $$9 >= 2 ? $$8.h(1) : (double)($$1.v() + $$3.a(3) - 1);
               double $$12 = $$9 >= 3 ? $$8.h(2) : (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               if ($$0.b($$7.get().a($$10, $$11, $$12))) {
                  gu $$13 = gu.a($$10, $$11, $$12);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.ai() == bdu.a) {
                        continue;
                     }

                     cnd.a $$14 = $$4.b().get();
                     if (!$$14.a().a($$0.a(cmv.b, $$13)) || !$$14.b().a($$0.a(cmv.a, $$13))) {
                        continue;
                     }
                  } else if (!bgu.a($$7.get(), $$0, bgd.c, $$13, $$0.y_())) {
                     continue;
                  }

                  bfj $$15 = bfn.a($$6, $$0, $$3x -> {
                     $$3x.b($$10, $$11, $$12, $$3x.dy(), $$3x.dA());
                     return $$3x;
                  });
                  if ($$15 == null) {
                     this.c($$0, $$1);
                     return;
                  }

                  int $$16 = $$0.a(
                        $$15.getClass(),
                        new eed((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.o)
                     )
                     .size();
                  if ($$16 >= this.m) {
                     this.c($$0, $$1);
                     return;
                  }

                  $$15.b($$15.dn(), $$15.dp(), $$15.dt(), $$3.i() * 360.0F, 0.0F);
                  if ($$15 instanceof bgb $$17) {
                     if ($$4.b().isEmpty() && !$$17.a($$0, bgd.c) || !$$17.a($$0)) {
                        continue;
                     }

                     if ($$4.a().f() == 1 && $$4.a().b("id", 8)) {
                        ((bgb)$$15).a($$0, $$0.d_($$15.di()), bgd.c, null, null);
                     }
                  }

                  if (!$$0.e($$15)) {
                     this.c($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$15, dgl.t, $$13);
                  if ($$15 instanceof bgb) {
                     ((bgb)$$15).O();
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

   private void c(cmm $$0, gu $$1) {
      apf $$2 = $$0.z;
      if (this.j <= this.i) {
         this.d = this.i;
      } else {
         this.d = this.i + $$2.a(this.j - this.i);
      }

      this.e.b($$2).ifPresent($$2x -> this.a($$0, $$1, (cnd)$$2x.b()));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable cmm $$0, gu $$1, qr $$2) {
      this.d = $$2.g("Delay");
      boolean $$3 = $$2.b("SpawnData", 10);
      if ($$3) {
         cnd $$4 = cnd.b.parse(rc.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(cnd::new);
         this.a($$0, $$1, $$4);
      }

      boolean $$5 = $$2.b("SpawnPotentials", 9);
      if ($$5) {
         qx $$6 = $$2.c("SpawnPotentials", 10);
         this.e = cnd.c.parse(rc.a, $$6).resultOrPartial($$0x -> a.warn("Invalid SpawnPotentials list: {}", $$0x)).orElseGet(bch::b);
      } else {
         this.e = bch.a(this.f != null ? this.f : new cnd());
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

   public qr a(qr $$0) {
      $$0.a("Delay", (short)this.d);
      $$0.a("MinSpawnDelay", (short)this.i);
      $$0.a("MaxSpawnDelay", (short)this.j);
      $$0.a("SpawnCount", (short)this.k);
      $$0.a("MaxNearbyEntities", (short)this.m);
      $$0.a("RequiredPlayerRange", (short)this.n);
      $$0.a("SpawnRange", (short)this.o);
      if (this.f != null) {
         $$0.a("SpawnData", (rk)cnd.b.encodeStart(rc.a, this.f).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData")));
      }

      $$0.a("SpawnPotentials", (rk)cnd.c.encodeStart(rc.a, this.e).result().orElseThrow());
      return $$0;
   }

   @Nullable
   public bfj a(cmm $$0, apf $$1, gu $$2) {
      if (this.l == null) {
         qr $$3 = this.b($$0, $$1, $$2).a();
         if (!$$3.b("id", 8)) {
            return null;
         }

         this.l = bfn.a($$3, $$0, Function.identity());
         if ($$3.f() == 1 && this.l instanceof bgb) {
         }
      }

      return this.l;
   }

   public boolean a(cmm $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.B) {
            this.d = this.i;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable cmm $$0, gu $$1, cnd $$2) {
      this.f = $$2;
   }

   private cnd b(@Nullable cmm $$0, apf $$1, gu $$2) {
      if (this.f != null) {
         return this.f;
      } else {
         this.a($$0, $$2, this.e.b($$1).map(bcj.b::b).orElseGet(cnd::new));
         return this.f;
      }
   }

   public abstract void a(cmm var1, gu var2, int var3);

   public double a() {
      return this.g;
   }

   public double b() {
      return this.h;
   }
}
