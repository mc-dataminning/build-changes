import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dhr {
   public static final String b = "SpawnData";
   private static final Logger a = LogUtils.getLogger();
   private static final int c = 1;
   private int d = 20;
   private bsj<djj> e = bsj.a();
   @Nullable
   private djj f;
   private double g;
   private double h;
   private int i = 200;
   private int j = 800;
   private int k = 4;
   @Nullable
   private bwa l;
   private int m = 6;
   private int n = 16;
   private int o = 4;

   public void a(bwj<?> $$0, @Nullable dip $$1, azt $$2, iu $$3) {
      this.a($$1, $$2, $$3).a().a("id", mf.f.b($$0).toString());
   }

   private boolean c(dip $$0, iu $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.n);
   }

   public void a(dip $$0, iu $$1) {
      if (!this.c($$0, $$1)) {
         this.h = this.g;
      } else if (this.l != null) {
         azt $$2 = $$0.C_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(lx.ah, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(lx.F, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.d > 0) {
            this.d--;
         }

         this.h = this.g;
         this.g = (this.g + (double)(1000.0F / ((float)this.d + 200.0F))) % 360.0;
      }
   }

   public void a(aro $$0, iu $$1) {
      if (this.c($$0, $$1)) {
         if (this.d == -1) {
            this.d($$0, $$1);
         }

         if (this.d > 0) {
            this.d--;
         } else {
            boolean $$2 = false;
            azt $$3 = $$0.C_();
            djj $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.k; $$5++) {
               tx $$6 = $$4.a();
               Optional<bwj<?>> $$7 = bwj.a($$6);
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
                  iu $$13 = iu.a($$10, $$11, $$12);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.an() == btv.a) {
                        continue;
                     }

                     djj.a $$14 = $$4.b().get();
                     if (!$$14.a($$13, $$0)) {
                        continue;
                     }
                  } else if (!bxu.a($$7.get(), $$0, bwi.c, $$13, $$0.C_())) {
                     continue;
                  }

                  bwa $$15 = bwj.a($$6, $$0, bwi.c, $$3x -> {
                     $$3x.b($$10, $$11, $$12, $$3x.dL(), $$3x.dN());
                     return $$3x;
                  });
                  if ($$15 == null) {
                     this.d($$0, $$1);
                     return;
                  }

                  int $$16 = $$0.a(
                        eea.b($$15.getClass()),
                        new fdr((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.o),
                        bwh.f
                     )
                     .size();
                  if ($$16 >= this.m) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$15.b($$15.dA(), $$15.dC(), $$15.dG(), $$3.i() * 360.0F, 0.0F);
                  if ($$15 instanceof bxb $$17) {
                     if ($$4.b().isEmpty() && !$$17.a($$0, bwi.c) || !$$17.a((dis)$$0)) {
                        continue;
                     }

                     boolean $$18 = $$4.a().f() == 1 && $$4.a().b("id", 8);
                     if ($$18) {
                        ((bxb)$$15).a($$0, $$0.d_($$15.dv()), bwi.c, null);
                     }

                     $$4.c().ifPresent($$17::a);
                  }

                  if (!$$0.e($$15)) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$15, eeo.t, $$13);
                  if ($$15 instanceof bxb) {
                     ((bxb)$$15).U();
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

   private void d(dip $$0, iu $$1) {
      azt $$2 = $$0.A;
      if (this.j <= this.i) {
         this.d = this.i;
      } else {
         this.d = this.i + $$2.a(this.j - this.i);
      }

      this.e.a($$2).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable dip $$0, iu $$1, tx $$2) {
      this.d = $$2.g("Delay");
      boolean $$3 = $$2.b("SpawnData", 10);
      if ($$3) {
         djj $$4 = djj.b.parse(ul.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(djj::new);
         this.a($$0, $$1, $$4);
      }

      boolean $$5 = $$2.b("SpawnPotentials", 9);
      if ($$5) {
         ud $$6 = $$2.c("SpawnPotentials", 10);
         this.e = djj.c.parse(ul.a, $$6).resultOrPartial($$0x -> a.warn("Invalid SpawnPotentials list: {}", $$0x)).orElseGet(bsj::a);
      } else {
         this.e = bsj.a(this.f != null ? this.f : new djj());
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
         $$0.a("SpawnData", (uu)djj.b.encodeStart(ul.a, this.f).getOrThrow($$0x -> new IllegalStateException("Invalid SpawnData: " + $$0x)));
      }

      $$0.a("SpawnPotentials", (uu)djj.c.encodeStart(ul.a, this.e).getOrThrow());
      return $$0;
   }

   @Nullable
   public bwa b(dip $$0, iu $$1) {
      if (this.l == null) {
         tx $$2 = this.a($$0, $$0.C_(), $$1).a();
         if (!$$2.b("id", 8)) {
            return null;
         }

         this.l = bwj.a($$2, $$0, bwi.c, Function.identity());
         if ($$2.f() == 1 && this.l instanceof bxb) {
         }
      }

      return this.l;
   }

   public boolean a(dip $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.C) {
            this.d = this.i;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable dip $$0, iu $$1, djj $$2) {
      this.f = $$2;
   }

   private djj a(@Nullable dip $$0, azt $$1, iu $$2) {
      if (this.f != null) {
         return this.f;
      } else {
         this.a($$0, $$2, this.e.a($$1).orElseGet(djj::new));
         return this.f;
      }
   }

   public abstract void a(dip var1, iu var2, int var3);

   public double a() {
      return this.g;
   }

   public double b() {
      return this.h;
   }
}
