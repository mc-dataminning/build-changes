import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dsf {
   public static final int a = 40;
   private static final int b = 47;
   private static final int c = aym.h(47);
   private static final float d = 0.02F;
   private final dsg e;
   private final dsh f;
   private final dsf.a g;
   private dse h;
   private final dse.a i;
   private boolean j;

   public Codec<dsf> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(dsg.b.forGetter(dsf::b), dsh.b.forGetter(dsf::c)).apply($$0, ($$0x, $$1) -> new dsf($$0x, $$1, this.g, this.h, this.i))
      );
   }

   public dsf(dsf.a $$0, dse $$1, dse.a $$2) {
      this(dsg.a, new dsh(), $$0, $$1, $$2);
   }

   public dsf(dsg $$0, dsh $$1, dsf.a $$2, dse $$3, dse.a $$4) {
      this.e = $$0;
      this.f = $$1;
      this.f.a($$0);
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
   }

   public dsg b() {
      return this.e;
   }

   public dsh c() {
      return this.f;
   }

   public dsi d() {
      return this.g.d();
   }

   public void a(dca $$0, dsi $$1) {
      this.g.a($$0, $$1);
   }

   public void e() {
      this.g.f();
   }

   public dse f() {
      return this.h;
   }

   public dse.a g() {
      return this.i;
   }

   public boolean a(dca $$0) {
      if (this.j) {
         return true;
      } else {
         return $$0.al() == bpx.a ? false : $$0.ab().b(dbw.e);
      }
   }

   public Optional<UUID> a(aqt $$0, ir $$1) {
      ayt $$2 = $$0.F_();
      dcr $$3 = this.f.b(this, $$0.F_());
      uk $$4 = $$3.c();
      uq $$5 = $$4.c("Pos", 6);
      Optional<bsb<?>> $$6 = bsb.a($$4);
      if ($$6.isEmpty()) {
         return Optional.empty();
      } else {
         int $$7 = $$5.size();
         double $$8 = $$7 >= 1 ? $$5.h(0) : (double)$$1.u() + ($$2.j() - $$2.j()) * (double)this.e.b() + 0.5;
         double $$9 = $$7 >= 2 ? $$5.h(1) : (double)($$1.v() + $$2.a(3) - 1);
         double $$10 = $$7 >= 3 ? $$5.h(2) : (double)$$1.w() + ($$2.j() - $$2.j()) * (double)this.e.b() + 0.5;
         if (!$$0.b($$6.get().a($$8, $$9, $$10))) {
            return Optional.empty();
         } else {
            ewu $$11 = new ewu($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               ir $$12 = ir.a($$11);
               if (!btj.a($$6.get(), $$0, bss.q, $$12, $$0.F_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dcr.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  brv $$14 = bsb.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bsq $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.du()), bss.q, null);
                        }

                        $$15.gc();
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        $$0.c(3011, $$1, 0);
                        $$0.c(3012, $$12, 0);
                        $$0.a($$14, dxv.t, $$12);
                        return Optional.of($$14.cE());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(aqt $$0, ir $$1, aks<eru> $$2) {
      eru $$3 = $$0.o().be().b($$2);
      ers $$4 = new ers.a($$0).a(euf.b);
      ObjectArrayList<cuh> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cuh $$6 = (cuh)var7.next();
            kl.a($$0, $$6, 2, iw.b, ewu.c($$1).a(iw.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dca $$0, ir $$1) {
      if (!this.a($$0)) {
         this.f.m = this.f.l;
      } else {
         dsi $$2 = this.d();
         $$2.a($$0, $$1);
         if ($$2.d()) {
            double $$3 = (double)Math.max(0L, this.f.f - $$0.Z());
            this.f.m = this.f.l;
            this.f.l = (this.f.l + $$2.b() / ($$3 + 200.0)) % 360.0;
         }

         if ($$2.e()) {
            ayt $$4 = $$0.F_();
            if ($$4.i() <= 0.02F) {
               $$0.a($$1, avo.mz, avq.e, $$4.i() * 0.25F + 0.75F, $$4.i() + 0.5F, false);
            }
         }
      }
   }

   public void b(aqt $$0, ir $$1) {
      dsi $$2 = this.d();
      if (!this.a($$0)) {
         if ($$2.e()) {
            this.f.a();
            this.a($$0, dsi.a);
         }
      } else {
         if (this.f.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.f.f = $$0.Z() + (long)this.e.g();
         }

         dsi $$3 = $$2.a($$1, this, $$0);
         if ($$3 != $$2) {
            this.a($$0, $$3);
         }
      }
   }

   private static boolean a(aqt $$0, ir $$1, UUID $$2) {
      brv $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bI() || !$$3.dU().af().equals($$0.af()) || $$3.du().j($$1) > (double)c;
   }

   private static boolean a(dca $$0, ewu $$1, ewu $$2) {
      ewq $$3 = $$0.a(new dbj($$2, $$1, dbj.a.c, dbj.b.a, ewz.a()));
      return $$3.a().equals(ir.a($$1)) || $$3.c() == ews.a.a;
   }

   public static void a(dca $$0, ir $$1, ayt $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lb.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
         $$0.a(lb.E, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dca $$0, ir $$1, ayt $$2, int $$3) {
      for (int $$4 = 0; $$4 < 30 + Math.min($$3, 10) * 5; $$4++) {
         double $$5 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)$$1.u() + 0.5 + $$5;
         double $$8 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$9 = (double)$$1.w() + 0.5 + $$6;
         $$0.a(lb.aZ, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dca $$0, ir $$1, ayt $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lb.aK, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(lb.ac, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dse $$0) {
      this.h = $$0;
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void h() {
      this.j = true;
   }

   public interface a {
      void a(dca var1, dsi var2);

      dsi d();

      void f();
   }
}
