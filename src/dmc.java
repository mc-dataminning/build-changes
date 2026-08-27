import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dmc {
   public static final int a = 40;
   private static final int b = 47;
   private static final int c = aww.h(47);
   private static final float d = 0.02F;
   private final dmd e;
   private final dme f;
   private final dmc.a g;
   private dmb h;
   private final dmb.a i;
   private boolean j;

   public Codec<dmc> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(dmd.b.forGetter(dmc::b), dme.b.forGetter(dmc::c)).apply($$0, ($$0x, $$1) -> new dmc($$0x, $$1, this.g, this.h, this.i))
      );
   }

   public dmc(dmc.a $$0, dmb $$1, dmb.a $$2) {
      this(dmd.a, new dme(), $$0, $$1, $$2);
   }

   public dmc(dmd $$0, dme $$1, dmc.a $$2, dmb $$3, dmb.a $$4) {
      this.e = $$0;
      this.f = $$1;
      this.f.a($$0);
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
   }

   public dmd b() {
      return this.e;
   }

   public dme c() {
      return this.f;
   }

   public dmf d() {
      return this.g.d();
   }

   public void a(cwz $$0, dmf $$1) {
      this.g.a($$0, $$1);
   }

   public void e() {
      this.g.f();
   }

   public dmb f() {
      return this.h;
   }

   public dmb.a g() {
      return this.i;
   }

   public boolean a(cwz $$0) {
      if (this.j) {
         return true;
      } else {
         return $$0.aj() == bmz.a ? false : $$0.Z().b(cwv.e);
      }
   }

   public Optional<UUID> a(apf $$0, ib $$1) {
      axd $$2 = $$0.E_();
      cxq $$3 = this.f.a(this, $$0.E_());
      ta $$4 = $$3.c();
      tg $$5 = $$4.c("Pos", 6);
      Optional<bpc<?>> $$6 = bpc.a($$4);
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
            epr $$11 = new epr($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               ib $$12 = ib.a($$11);
               if (!bqj.a($$6.get(), $$0, bps.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     cxq.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bow $$14 = bpc.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bpq $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dm()), bps.q, null);
                        }

                        $$15.fS();
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        $$0.c(3011, $$1, 0);
                        $$0.c(3012, $$12, 0);
                        $$0.a($$14, drn.t, $$12);
                        return Optional.of($$14.cw());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(apf $$0, ib $$1, ajh $$2) {
      elc $$3 = $$0.o().aM().getLootTable($$2);
      ela $$4 = new ela.a($$0).a(ene.b);
      ObjectArrayList<cqk> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cqk $$6 = (cqk)var7.next();
            jn.a($$0, $$6, 2, ih.b, epr.c($$1).a(ih.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(cwz $$0, ib $$1) {
      if (!this.a($$0)) {
         this.f.m = this.f.l;
      } else {
         dmf $$2 = this.d();
         $$2.a($$0, $$1);
         if ($$2.d()) {
            double $$3 = (double)Math.max(0L, this.f.f - $$0.X());
            this.f.m = this.f.l;
            this.f.l = (this.f.l + $$2.b() / ($$3 + 200.0)) % 360.0;
         }

         if ($$2.e()) {
            axd $$4 = $$0.E_();
            if ($$4.i() <= 0.02F) {
               $$0.a($$1, aty.lO, atz.e, $$4.i() * 0.25F + 0.75F, $$4.i() + 0.5F, false);
            }
         }
      }
   }

   public void b(apf $$0, ib $$1) {
      dmf $$2 = this.d();
      if (!this.a($$0)) {
         if ($$2.e()) {
            this.f.a();
            this.a($$0, dmf.a);
         }
      } else {
         if (this.f.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.f.f = $$0.X() + (long)this.e.g();
         }

         dmf $$3 = $$2.a($$1, this, $$0);
         if ($$3 != $$2) {
            this.a($$0, $$3);
         }
      }
   }

   private static boolean a(apf $$0, ib $$1, UUID $$2) {
      bow $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bA() || !$$3.dM().ad().equals($$0.ad()) || $$3.dm().j($$1) > (double)c;
   }

   private static boolean a(cwz $$0, epr $$1, epr $$2) {
      epn $$3 = $$0.a(new cwi($$2, $$1, cwi.a.c, cwi.b.a, epw.a()));
      return $$3.a().equals(ib.a($$1)) || $$3.c() == epp.a.a;
   }

   public static void a(cwz $$0, ib $$1, axd $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(kc.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
         $$0.a(kc.F, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   public static void a(cwz $$0, ib $$1, axd $$2, int $$3) {
      for (int $$4 = 0; $$4 < 30 + Math.min($$3, 10) * 5; $$4++) {
         double $$5 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)$$1.u() + 0.5 + $$5;
         double $$8 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$9 = (double)$$1.w() + 0.5 + $$6;
         $$0.a(kc.aW, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      }
   }

   public static void b(cwz $$0, ib $$1, axd $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(kc.aH, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(kc.ac, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dmb $$0) {
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
      void a(cwz var1, dmf var2);

      dmf d();

      void f();
   }
}
