import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cup {
   public static final String b = "SpawnData";
   private static final Logger a = LogUtils.getLogger();
   private static final int c = 1;
   private int d = 20;
   private bke<cwe> e = bke.b();
   @Nullable
   private cwe f;
   private double g;
   private double h;
   private int i = 200;
   private int j = 800;
   private int k = 4;
   @Nullable
   private bno l;
   private int m = 6;
   private int n = 16;
   private int o = 4;

   public void a(bnu<?> $$0, @Nullable cvn $$1, awo $$2, hz $$3) {
      this.a($$1, $$2, $$3).a().a("id", kf.g.b($$0).toString());
   }

   private boolean c(cvn $$0, hz $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.n);
   }

   public void a(cvn $$0, hz $$1) {
      if (!this.c($$0, $$1)) {
         this.h = this.g;
      } else if (this.l != null) {
         awo $$2 = $$0.F_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(jz.ab, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(jz.E, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.d > 0) {
            this.d--;
         }

         this.h = this.g;
         this.g = (this.g + (double)(1000.0F / ((float)this.d + 200.0F))) % 360.0;
      }
   }

   public void a(aov $$0, hz $$1) {
      if (this.c($$0, $$1)) {
         if (this.d == -1) {
            this.d($$0, $$1);
         }

         if (this.d > 0) {
            this.d--;
         } else {
            boolean $$2 = false;
            awo $$3 = $$0.F_();
            cwe $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.k; $$5++) {
               sw $$6 = $$4.a();
               Optional<bnu<?>> $$7 = bnu.a($$6);
               if ($$7.isEmpty()) {
                  this.d($$0, $$1);
                  return;
               }

               tc $$8 = $$6.c("Pos", 6);
               int $$9 = $$8.size();
               double $$10 = $$9 >= 1 ? $$8.h(0) : (double)$$1.u() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               double $$11 = $$9 >= 2 ? $$8.h(1) : (double)($$1.v() + $$3.a(3) - 1);
               double $$12 = $$9 >= 3 ? $$8.h(2) : (double)$$1.w() + ($$3.j() - $$3.j()) * (double)this.o + 0.5;
               if ($$0.b($$7.get().a($$10, $$11, $$12))) {
                  hz $$13 = hz.a($$10, $$11, $$12);
                  if ($$4.b().isPresent()) {
                     if (!$$7.get().f().d() && $$0.ak() == blr.a) {
                        continue;
                     }

                     cwe.a $$14 = $$4.b().get();
                     if (!$$14.a().a($$0.a(cvw.b, $$13)) || !$$14.b().a($$0.a(cvw.a, $$13))) {
                        continue;
                     }
                  } else if (!boz.a($$7.get(), $$0, bok.c, $$13, $$0.F_())) {
                     continue;
                  }

                  bno $$15 = bnu.a($$6, $$0, $$3x -> {
                     $$3x.b($$10, $$11, $$12, $$3x.dC(), $$3x.dE());
                     return $$3x;
                  });
                  if ($$15 == null) {
                     this.d($$0, $$1);
                     return;
                  }

                  int $$16 = $$0.a(
                        dpd.b($$15.getClass()),
                        new enn((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.o),
                        bnt.f
                     )
                     .size();
                  if ($$16 >= this.m) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$15.b($$15.dr(), $$15.dt(), $$15.dx(), $$3.i() * 360.0F, 0.0F);
                  if ($$15 instanceof boi $$17) {
                     if ($$4.b().isEmpty() && !$$17.a($$0, bok.c) || !$$17.a($$0)) {
                        continue;
                     }

                     boolean $$18 = $$4.a().f() == 1 && $$4.a().b("id", 8);
                     if ($$18) {
                        ((boi)$$15).a($$0, $$0.d_($$15.dm()), bok.c, null, null);
                     }
                  }

                  if (!$$0.e($$15)) {
                     this.d($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$15, dpp.t, $$13);
                  if ($$15 instanceof boi) {
                     ((boi)$$15).S();
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

   private void d(cvn $$0, hz $$1) {
      awo $$2 = $$0.z;
      if (this.j <= this.i) {
         this.d = this.i;
      } else {
         this.d = this.i + $$2.a(this.j - this.i);
      }

      this.e.b($$2).ifPresent($$2x -> this.a($$0, $$1, (cwe)$$2x.b()));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable cvn $$0, hz $$1, sw $$2) {
      this.d = $$2.g("Delay");
      boolean $$3 = $$2.b("SpawnData", 10);
      if ($$3) {
         cwe $$4 = cwe.b.parse(tk.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(cwe::new);
         this.a($$0, $$1, $$4);
      }

      boolean $$5 = $$2.b("SpawnPotentials", 9);
      if ($$5) {
         tc $$6 = $$2.c("SpawnPotentials", 10);
         this.e = cwe.c.parse(tk.a, $$6).resultOrPartial($$0x -> a.warn("Invalid SpawnPotentials list: {}", $$0x)).orElseGet(bke::b);
      } else {
         this.e = bke.a(this.f != null ? this.f : new cwe());
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

   public sw a(sw $$0) {
      $$0.a("Delay", (short)this.d);
      $$0.a("MinSpawnDelay", (short)this.i);
      $$0.a("MaxSpawnDelay", (short)this.j);
      $$0.a("SpawnCount", (short)this.k);
      $$0.a("MaxNearbyEntities", (short)this.m);
      $$0.a("RequiredPlayerRange", (short)this.n);
      $$0.a("SpawnRange", (short)this.o);
      if (this.f != null) {
         $$0.a("SpawnData", (tt)cwe.b.encodeStart(tk.a, this.f).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData")));
      }

      $$0.a("SpawnPotentials", (tt)cwe.c.encodeStart(tk.a, this.e).result().orElseThrow());
      return $$0;
   }

   @Nullable
   public bno b(cvn $$0, hz $$1) {
      if (this.l == null) {
         sw $$2 = this.a($$0, $$0.F_(), $$1).a();
         if (!$$2.b("id", 8)) {
            return null;
         }

         this.l = bnu.a($$2, $$0, Function.identity());
         if ($$2.f() == 1 && this.l instanceof boi) {
         }
      }

      return this.l;
   }

   public boolean a(cvn $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.B) {
            this.d = this.i;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable cvn $$0, hz $$1, cwe $$2) {
      this.f = $$2;
   }

   private cwe a(@Nullable cvn $$0, awo $$1, hz $$2) {
      if (this.f != null) {
         return this.f;
      } else {
         this.a($$0, $$2, this.e.b($$1).map(bkg.b::b).orElseGet(cwe::new));
         return this.f;
      }
   }

   public abstract void a(cvn var1, hz var2, int var3);

   public double a() {
      return this.g;
   }

   public double b() {
      return this.h;
   }
}
