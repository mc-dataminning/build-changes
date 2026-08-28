import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class drn {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = ayg.h(47);
   private static final float h = 0.02F;
   private final dro i;
   private final dro j;
   private final drp k;
   private final int l;
   private final int m;
   private final drn.b n;
   private drm o;
   private final drm.a p;
   private boolean q;
   private boolean r;

   public Codec<drn> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dro.b.optionalFieldOf("normal_config", dro.a).forGetter(drn::c),
                  dro.b.optionalFieldOf("ominous_config", dro.a).forGetter(drn::n),
                  drp.b.forGetter(drn::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(drn::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(drn::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new drn($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public drn(drn.b $$0, drm $$1, drm.a $$2) {
      this(dro.a, dro.a, new drp(), 36000, 14, $$0, $$1, $$2);
   }

   public drn(dro $$0, dro $$1, drp $$2, int $$3, int $$4, drn.b $$5, drm $$6, drm.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dro b() {
      return this.r ? this.j : this.i;
   }

   @VisibleForTesting
   public dro c() {
      return this.i;
   }

   @VisibleForTesting
   public dro d() {
      return this.j;
   }

   private dro n() {
      return !this.j.equals(this.i) ? this.j : dro.a;
   }

   public void a(aqm $$0, ja $$1) {
      $$0.a($$1, $$0.a_($$1).a(dnw.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(aqm $$0, ja $$1) {
      $$0.a($$1, $$0.a_($$1).a(dnw.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public drp f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public drq i() {
      return this.n.d();
   }

   public void a(dcf $$0, drq $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public drm k() {
      return this.o;
   }

   public drm.a l() {
      return this.p;
   }

   public boolean a(dcf $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.al() == bqd.a ? false : $$0.ab().b(dcb.e);
      }
   }

   public Optional<UUID> c(aqm $$0, ja $$1) {
      ayo $$2 = $$0.E_();
      dcx $$3 = this.k.b(this, $$0.E_());
      tx $$4 = $$3.d();
      ud $$5 = $$4.c("Pos", 6);
      Optional<bsm<?>> $$6 = bsm.a($$4);
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
            ewf $$11 = new ewf($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               ja $$12 = ja.a($$11);
               if (!btx.a($$6.get(), $$0, btf.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dcx.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bsg $$14 = bsm.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof btd $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dq()), btf.q, null);
                        }

                        $$15.fR();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        drn.a $$17 = this.r ? drn.a.b : drn.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, dxg.t, $$12);
                        return Optional.of($$14.cA());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(aqm $$0, ja $$1, akj<eqz> $$2) {
      eqz $$3 = $$0.o().bf().b($$2);
      eqx $$4 = new eqx.a($$0).a(etp.b);
      ObjectArrayList<cuc> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cuc $$6 = (cuc)var7.next();
            kt.a($$0, $$6, 2, jf.b, ewf.c($$1).a(jf.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dcf $$0, ja $$1, boolean $$2) {
      drq $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.Z());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         ayo $$5 = $$0.E_();
         if ($$5.i() <= 0.02F) {
            avg $$6 = $$2 ? avh.mj : avh.mi;
            $$0.a($$1, $$6, avi.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(aqm $$0, ja $$1, boolean $$2) {
      this.r = $$2;
      drq $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.Z() + (long)this.b().g();
      }

      drq $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(aqm $$0, ja $$1, UUID $$2) {
      bsg $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bE() || !$$3.dQ().af().equals($$0.af()) || $$3.dq().j($$1) > (double)g;
   }

   private static boolean a(dcf $$0, ewf $$1, ewf $$2) {
      ewb $$3 = $$0.a(new dbo($$2, $$1, dbo.a.c, dbo.b.a, ewk.a()));
      return $$3.a().equals(ja.a($$1)) || $$3.c() == ewd.a.a;
   }

   public static void a(dcf $$0, ja $$1, ayo $$2, ln $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lj.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dcf $$0, ja $$1, ayo $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lj.be, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(lj.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dcf $$0, ja $$1, ayo $$2, int $$3, lh $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dcf $$0, ja $$1, ayo $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lj.aJ, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(lj.ae, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(drm $$0) {
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
      a(lj.F),
      b(lj.L);

      public final ln c;

      private a(final ln $$0) {
         this.c = $$0;
      }

      public static drn.a a(int $$0) {
         drn.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dcf var1, drq var2);

      drq d();

      void f();
   }
}
