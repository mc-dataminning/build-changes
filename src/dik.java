import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dik {
   public static final int a = 40;
   private static final int b = 47;
   private static final int c = aui.h(47);
   private static final float d = 0.02F;
   private final dil e;
   private final dim f;
   private final dik.a g;
   private dij h;
   private boolean i;

   public Codec<dik> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(dil.b.forGetter(dik::b), dim.b.forGetter(dik::c)).apply($$0, ($$0x, $$1) -> new dik($$0x, $$1, this.g, this.h))
      );
   }

   public dik(dik.a $$0, dij $$1) {
      this(dil.a, new dim(), $$0, $$1);
   }

   public dik(dil $$0, dim $$1, dik.a $$2, dij $$3) {
      this.e = $$0;
      this.f = $$1;
      this.f.a($$0);
      this.g = $$2;
      this.h = $$3;
   }

   public dil b() {
      return this.e;
   }

   public dim c() {
      return this.f;
   }

   public din d() {
      return this.g.f();
   }

   public void a(cti $$0, din $$1) {
      this.g.a($$0, $$1);
   }

   public void e() {
      this.g.g();
   }

   public dij f() {
      return this.h;
   }

   public boolean a(cti $$0) {
      if (this.i) {
         return true;
      } else {
         return $$0.ak() == bjs.a ? false : $$0.Z().b(cte.e);
      }
   }

   public Optional<UUID> a(amz $$0, hx $$1) {
      aup $$2 = $$0.F_();
      ctz $$3 = this.f.a(this, $$0.F_());
      sl $$4 = $$3.c();
      sr $$5 = $$4.c("Pos", 6);
      Optional<blt<?>> $$6 = blt.a($$4);
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
            elm $$11 = new elm($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               hx $$12 = hx.a($$11);
               if (!bmz.a($$6.get(), $$0, bmj.q, $$12, $$0.F_())) {
                  return Optional.empty();
               } else {
                  blp $$13 = blt.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$13 == null) {
                     return Optional.empty();
                  } else {
                     if ($$13 instanceof bmh $$14) {
                        if (!$$14.a($$0)) {
                           return Optional.empty();
                        }

                        if ($$3.a().f() == 1 && $$3.a().b("id", 8)) {
                           $$14.a($$0, $$0.d_($$14.dm()), bmj.q, null, null);
                           $$14.fJ();
                        }
                     }

                     if (!$$0.e($$13)) {
                        return Optional.empty();
                     } else {
                        $$0.c(3011, $$1, 0);
                        $$0.c(3012, $$12, 0);
                        $$0.a($$13, dnk.t, $$12);
                        return Optional.of($$13.cw());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(amz $$0, hx $$1, ahd $$2) {
      egx $$3 = $$0.o().aJ().getLootTable($$2);
      egv $$4 = new egv.a($$0).a(eiz.b);
      ObjectArrayList<cmr> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cmr $$6 = (cmr)var7.next();
            ji.a($$0, $$6, 2, ic.b, elm.c($$1).a(ic.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(cti $$0, hx $$1) {
      if (!this.a($$0)) {
         this.f.m = this.f.l;
      } else {
         din $$2 = this.d();
         $$2.a($$0, $$1);
         if ($$2.d()) {
            double $$3 = (double)Math.max(0L, this.f.f - $$0.X());
            this.f.m = this.f.l;
            this.f.l = (this.f.l + $$2.b() / ($$3 + 200.0)) % 360.0;
         }

         if ($$2.e()) {
            aup $$4 = $$0.F_();
            if ($$4.i() <= 0.02F) {
               $$0.a($$1, arm.lv, arn.e, $$4.i() * 0.25F + 0.75F, $$4.i() + 0.5F, false);
            }
         }
      }
   }

   public void b(amz $$0, hx $$1) {
      din $$2 = this.d();
      if (!this.a($$0)) {
         if ($$2.e()) {
            this.f.a();
            this.a($$0, din.a);
         }
      } else {
         if (this.f.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.f.f = $$0.X() + (long)this.e.g();
         }

         din $$3 = $$2.a($$1, this, $$0);
         if ($$3 != $$2) {
            this.a($$0, $$3);
         }
      }
   }

   private static boolean a(amz $$0, hx $$1, UUID $$2) {
      blp $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bx() || !$$3.dM().ae().equals($$0.ae()) || $$3.dm().j($$1) > (double)c;
   }

   private static boolean a(cti $$0, elm $$1, elm $$2) {
      eli $$3 = $$0.a(new csr($$2, $$1, csr.a.c, csr.b.a, elr.a()));
      return $$3.a().equals(hx.a($$1)) || $$3.c() == elk.a.a;
   }

   public static void a(cti $$0, hx $$1, aup $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
         $$0.a(jx.E, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   public static void a(cti $$0, hx $$1, aup $$2, int $$3) {
      for (int $$4 = 0; $$4 < 30 + Math.min($$3, 10) * 5; $$4++) {
         double $$5 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)$$1.u() + 0.5 + $$5;
         double $$8 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$9 = (double)$$1.w() + 0.5 + $$6;
         $$0.a(jx.aW, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      }
   }

   public static void b(cti $$0, hx $$1, aup $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(jx.aG, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(jx.ab, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dij $$0) {
      this.h = $$0;
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void g() {
      this.i = true;
   }

   public interface a {
      void a(cti var1, din var2);

      din f();

      void g();
   }
}
