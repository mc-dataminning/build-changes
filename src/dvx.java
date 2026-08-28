import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dvx {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = ayy.h(47);
   private static final float h = 0.02F;
   private jr<dvy> i;
   private jr<dvy> j;
   private final dwa k;
   private final int l;
   private final int m;
   private final dvx.b n;
   private dvw o;
   private final dvw.a p;
   private boolean q;
   private boolean r;

   public Codec<dvx> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dvy.c.optionalFieldOf("normal_config", jr.a(dvy.a)).forGetter($$0x -> $$0x.i),
                  dvy.c.optionalFieldOf("ominous_config", jr.a(dvy.a)).forGetter($$0x -> $$0x.j),
                  dwa.b.forGetter(dvx::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dvx::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dvx::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dvx($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dvx(dvx.b $$0, dvw $$1, dvw.a $$2) {
      this(jr.a(dvy.a), jr.a(dvy.a), new dwa(), 36000, 14, $$0, $$1, $$2);
   }

   public dvx(jr<dvy> $$0, jr<dvy> $$1, dwa $$2, int $$3, int $$4, dvx.b $$5, dvw $$6, dvw.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dvy b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public dvy c() {
      return this.i.a();
   }

   @VisibleForTesting
   public dvy d() {
      return this.j.a();
   }

   public void a(arc $$0, ji $$1) {
      $$0.a($$1, $$0.a_($$1).b(dse.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(arc $$0, ji $$1) {
      $$0.a($$1, $$0.a_($$1).b(dse.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dwa f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public dwb i() {
      return this.n.d();
   }

   public void a(dgg $$0, dwb $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public dvw k() {
      return this.o;
   }

   public dvw.a l() {
      return this.p;
   }

   public boolean a(arc $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.am() == bsf.a ? false : $$0.O().b(dgc.e);
      }
   }

   public Optional<UUID> c(arc $$0, ji $$1) {
      azg $$2 = $$0.H_();
      dha $$3 = this.k.b(this, $$0.H_());
      tq $$4 = $$3.d();
      tw $$5 = $$4.c("Pos", 6);
      Optional<buq<?>> $$6 = buq.a($$4);
      if ($$6.isEmpty()) {
         return Optional.empty();
      } else {
         int $$7 = $$5.size();
         double $$8 = $$7 >= 1 ? $$5.h(0) : (double)$$1.u() + ($$2.j() - $$2.j()) * (double)this.b().c() + 0.5;
         double $$9 = $$7 >= 2 ? $$5.h(1) : (double)($$1.v() + $$2.a(3) - 1);
         double $$10 = $$7 >= 3 ? $$5.h(2) : (double)$$1.w() + ($$2.j() - $$2.j()) * (double)this.b().c() + 0.5;
         if (!$$0.b($$6.get().a($$8, $$9, $$10))) {
            return Optional.empty();
         } else {
            fay $$11 = new fay($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               ji $$12 = ji.a((kb)$$11);
               if (!bwb.a($$6.get(), $$0, bup.q, $$12, $$0.H_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dha.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  buj $$14 = buq.a($$4, $$0, bup.q, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bvh $$15) {
                        if (!$$15.a((dgj)$$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dw()), bup.q, null);
                        }

                        $$15.aj();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        dvx.a $$17 = this.r ? dvx.a.b : dvx.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, ebr.t, $$12);
                        return Optional.of($$14.cG());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(arc $$0, ji $$1, akt<evu> $$2) {
      evu $$3 = $$0.p().bc().b($$2);
      evs $$4 = new evs.a($$0).a(eyi.b);
      ObjectArrayList<cwn> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cwn $$6 = (cwn)var7.next();
            lb.a($$0, $$6, 2, jn.b, fay.c($$1).a(jn.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dgg $$0, ji $$1, boolean $$2) {
      dwb $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.ad());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azg $$5 = $$0.H_();
         if ($$5.i() <= 0.02F) {
            avy $$6 = $$2 ? avz.mH : avz.mG;
            $$0.a($$1, $$6, awa.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(arc $$0, ji $$1, boolean $$2) {
      this.r = $$2;
      dwb $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.ad() + (long)this.b().h();
      }

      dwb $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(arc $$0, ji $$1, UUID $$2) {
      buj $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bL() || !$$3.dW().ai().equals($$0.ai()) || $$3.dw().j($$1) > (double)g;
   }

   private static boolean a(dgg $$0, fay $$1, fay $$2) {
      fau $$3 = $$0.a(new dfo($$2, $$1, dfo.a.c, dfo.b.a, fbd.a()));
      return $$3.b().equals(ji.a((kb)$$1)) || $$3.d() == faw.a.a;
   }

   public static void a(dgg $$0, ji $$1, azg $$2, lx $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lt.ag, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dgg $$0, ji $$1, azg $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lt.bg, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(lt.M, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dgg $$0, ji $$1, azg $$2, int $$3, lr $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dgg $$0, ji $$1, azg $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lt.aL, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(lt.ag, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public void a(buq<?> $$0, dgg $$1) {
      this.k.a();
      this.i = jr.a(this.i.a().a($$0));
      this.j = jr.a(this.j.a().a($$0));
      this.a($$1, dwb.a);
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dvw $$0) {
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
      a(lt.F),
      b(lt.M);

      public final lx c;

      private a(final lx $$0) {
         this.c = $$0;
      }

      public static dvx.a a(int $$0) {
         dvx.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dgg var1, dwb var2);

      dwb d();

      void f();
   }
}
