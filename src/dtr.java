import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dtr {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azd.h(47);
   private static final float h = 0.02F;
   private final dts i;
   private final dts j;
   private final dtt k;
   private final int l;
   private final int m;
   private final dtr.b n;
   private dtq o;
   private final dtq.a p;
   private boolean q;
   private boolean r;

   public Codec<dtr> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dts.b.optionalFieldOf("normal_config", dts.a).forGetter(dtr::c),
                  dts.b.optionalFieldOf("ominous_config", dts.a).forGetter(dtr::n),
                  dtt.b.forGetter(dtr::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dtr::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dtr::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dtr($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dtr(dtr.b $$0, dtq $$1, dtq.a $$2) {
      this(dts.a, dts.a, new dtt(), 36000, 14, $$0, $$1, $$2);
   }

   public dtr(dts $$0, dts $$1, dtt $$2, int $$3, int $$4, dtr.b $$5, dtq $$6, dtq.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dts b() {
      return this.r ? this.j : this.i;
   }

   @VisibleForTesting
   public dts c() {
      return this.i;
   }

   @VisibleForTesting
   public dts d() {
      return this.j;
   }

   private dts n() {
      return !this.j.equals(this.i) ? this.j : dts.a;
   }

   public void a(arh $$0, je $$1) {
      $$0.a($$1, $$0.a_($$1).b(dpz.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(arh $$0, je $$1) {
      $$0.a($$1, $$0.a_($$1).b(dpz.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dtt f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public dtu i() {
      return this.n.d();
   }

   public void a(deg $$0, dtu $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public dtq k() {
      return this.o;
   }

   public dtq.a l() {
      return this.p;
   }

   public boolean a(deg $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.am() == brm.a ? false : $$0.ac().b(dec.e);
      }
   }

   public Optional<UUID> c(arh $$0, je $$1) {
      azl $$2 = $$0.C_();
      dez $$3 = this.k.b(this, $$0.C_());
      uf $$4 = $$3.d();
      ul $$5 = $$4.c("Pos", 6);
      Optional<btv<?>> $$6 = btv.a($$4);
      if ($$6.isEmpty()) {
         return Optional.empty();
      } else {
         int $$7 = $$5.size();
         double $$8 = $$7 >= 1 ? $$5.h(0) : (double)$$1.u() + ($$2.j() - $$2.j()) * (double)this.b().b() + 0.5;
         double $$9 = $$7 >= 2 ? $$5.h(1) : (double)($$1.v() + $$2.a(3) - 1);
         double $$10 = $$7 >= 3 ? $$5.h(2) : (double)$$1.w() + ($$2.j() - $$2.j()) * (double)this.b().b() + 0.5;
         if (!$$0.b($$6.get().a($$8, $$9, $$10))) {
            return Optional.empty();
         } else {
            eys $$11 = new eys($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               je $$12 = je.a((jx)$$11);
               if (!bvf.a($$6.get(), $$0, btu.q, $$12, $$0.C_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dez.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bto $$14 = btv.a($$4, $$0, btu.q, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bum $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.ds()), btu.q, null);
                        }

                        $$15.fW();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        dtr.a $$17 = this.r ? dtr.a.b : dtr.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, dzl.t, $$12);
                        return Optional.of($$14.cD());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(arh $$0, je $$1, alb<etm> $$2) {
      etm $$3 = $$0.o().bd().b($$2);
      etk $$4 = new etk.a($$0).a(ewc.b);
      ObjectArrayList<cvp> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cvp $$6 = (cvp)var7.next();
            kx.a($$0, $$6, 2, jj.b, eys.c($$1).a(jj.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(deg $$0, je $$1, boolean $$2) {
      dtu $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.aa());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azl $$5 = $$0.C_();
         if ($$5.i() <= 0.02F) {
            awd $$6 = $$2 ? awe.mk : awe.mj;
            $$0.a($$1, $$6, awf.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(arh $$0, je $$1, boolean $$2) {
      this.r = $$2;
      dtu $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.aa() + (long)this.b().g();
      }

      dtu $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(arh $$0, je $$1, UUID $$2) {
      bto $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bI() || !$$3.dS().ag().equals($$0.ag()) || $$3.ds().j($$1) > (double)g;
   }

   private static boolean a(deg $$0, eys $$1, eys $$2) {
      eyo $$3 = $$0.a(new ddo($$2, $$1, ddo.a.c, ddo.b.a, eyx.a()));
      return $$3.b().equals(je.a((jx)$$1)) || $$3.d() == eyq.a.a;
   }

   public static void a(deg $$0, je $$1, azl $$2, lr $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(ln.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(deg $$0, je $$1, azl $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ln.be, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(ln.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(deg $$0, je $$1, azl $$2, int $$3, ll $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(deg $$0, je $$1, azl $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ln.aJ, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(ln.ae, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dtq $$0) {
      this.o = $$0;
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void m() {
      this.q = true;
   }

   public static enum a {
      a(ln.F),
      b(ln.L);

      public final lr c;

      private a(final lr $$0) {
         this.c = $$0;
      }

      public static dtr.a a(int $$0) {
         dtr.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(deg var1, dtu var2);

      dtu d();

      void f();
   }
}
