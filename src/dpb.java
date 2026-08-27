import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dpb {
   public static final int a = 40;
   private static final int b = 47;
   private static final int c = axw.h(47);
   private static final float d = 0.02F;
   private final dpc e;
   private final dpd f;
   private final dpb.a g;
   private dpa h;
   private final dpa.a i;
   private boolean j;

   public Codec<dpb> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(dpc.b.forGetter(dpb::b), dpd.b.forGetter(dpb::c)).apply($$0, ($$0x, $$1) -> new dpb($$0x, $$1, this.g, this.h, this.i))
      );
   }

   public dpb(dpb.a $$0, dpa $$1, dpa.a $$2) {
      this(dpc.a, new dpd(), $$0, $$1, $$2);
   }

   public dpb(dpc $$0, dpd $$1, dpb.a $$2, dpa $$3, dpa.a $$4) {
      this.e = $$0;
      this.f = $$1;
      this.f.a($$0);
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
   }

   public dpc b() {
      return this.e;
   }

   public dpd c() {
      return this.f;
   }

   public dpe d() {
      return this.g.d();
   }

   public void a(czu $$0, dpe $$1) {
      this.g.a($$0, $$1);
   }

   public void e() {
      this.g.f();
   }

   public dpa f() {
      return this.h;
   }

   public dpa.a g() {
      return this.i;
   }

   public boolean a(czu $$0) {
      if (this.j) {
         return true;
      } else {
         return $$0.ak() == bon.a ? false : $$0.aa().b(czq.e);
      }
   }

   public Optional<UUID> a(aqe $$0, im $$1) {
      ayd $$2 = $$0.E_();
      dal $$3 = this.f.b(this, $$0.E_());
      ty $$4 = $$3.c();
      ue $$5 = $$4.c("Pos", 6);
      Optional<bqr<?>> $$6 = bqr.a($$4);
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
            etf $$11 = new etf($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               im $$12 = im.a($$11);
               if (!brz.a($$6.get(), $$0, bri.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dal.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bql $$14 = bqr.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof brg $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dn()), bri.q, null);
                        }

                        $$15.fT();
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        $$0.c(3011, $$1, 0);
                        $$0.c(3012, $$12, 0);
                        $$0.a($$14, dur.t, $$12);
                        return Optional.of($$14.cx());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(aqe $$0, im $$1, akf $$2) {
      eoi $$3 = $$0.o().aM().getLootTable($$2);
      eog $$4 = new eog.a($$0).a(eqs.b);
      ObjectArrayList<csd> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            csd $$6 = (csd)var7.next();
            kg.a($$0, $$6, 2, ir.b, etf.c($$1).a(ir.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(czu $$0, im $$1) {
      if (!this.a($$0)) {
         this.f.m = this.f.l;
      } else {
         dpe $$2 = this.d();
         $$2.a($$0, $$1);
         if ($$2.d()) {
            double $$3 = (double)Math.max(0L, this.f.f - $$0.Y());
            this.f.m = this.f.l;
            this.f.l = (this.f.l + $$2.b() / ($$3 + 200.0)) % 360.0;
         }

         if ($$2.e()) {
            ayd $$4 = $$0.E_();
            if ($$4.i() <= 0.02F) {
               $$0.a($$1, auz.lZ, ava.e, $$4.i() * 0.25F + 0.75F, $$4.i() + 0.5F, false);
            }
         }
      }
   }

   public void b(aqe $$0, im $$1) {
      dpe $$2 = this.d();
      if (!this.a($$0)) {
         if ($$2.e()) {
            this.f.a();
            this.a($$0, dpe.a);
         }
      } else {
         if (this.f.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.f.f = $$0.Y() + (long)this.e.g();
         }

         dpe $$3 = $$2.a($$1, this, $$0);
         if ($$3 != $$2) {
            this.a($$0, $$3);
         }
      }
   }

   private static boolean a(aqe $$0, im $$1, UUID $$2) {
      bql $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bB() || !$$3.dN().ae().equals($$0.ae()) || $$3.dn().j($$1) > (double)c;
   }

   private static boolean a(czu $$0, etf $$1, etf $$2) {
      etb $$3 = $$0.a(new czd($$2, $$1, czd.a.c, czd.b.a, etk.a()));
      return $$3.a().equals(im.a($$1)) || $$3.c() == etd.a.a;
   }

   public static void a(czu $$0, im $$1, ayd $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(kw.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
         $$0.a(kw.E, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   public static void a(czu $$0, im $$1, ayd $$2, int $$3) {
      for (int $$4 = 0; $$4 < 30 + Math.min($$3, 10) * 5; $$4++) {
         double $$5 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)$$1.u() + 0.5 + $$5;
         double $$8 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$9 = (double)$$1.w() + 0.5 + $$6;
         $$0.a(kw.aV, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      }
   }

   public static void b(czu $$0, im $$1, ayd $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(kw.aG, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(kw.ab, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dpa $$0) {
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
      void a(czu var1, dpe var2);

      dpe d();

      void f();
   }
}
