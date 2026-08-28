import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class drk {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = aye.h(47);
   private static final float h = 0.02F;
   private final drl i;
   private final drl j;
   private final drm k;
   private final int l;
   private final int m;
   private final drk.b n;
   private drj o;
   private final drj.a p;
   private boolean q;
   private boolean r;

   public Codec<drk> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  drl.b.optionalFieldOf("normal_config", drl.a).forGetter(drk::c),
                  drl.b.optionalFieldOf("ominous_config", drl.a).forGetter(drk::n),
                  drm.b.forGetter(drk::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(drk::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(drk::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new drk($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public drk(drk.b $$0, drj $$1, drj.a $$2) {
      this(drl.a, drl.a, new drm(), 36000, 14, $$0, $$1, $$2);
   }

   public drk(drl $$0, drl $$1, drm $$2, int $$3, int $$4, drk.b $$5, drj $$6, drj.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public drl b() {
      return this.r ? this.j : this.i;
   }

   @VisibleForTesting
   public drl c() {
      return this.i;
   }

   @VisibleForTesting
   public drl d() {
      return this.j;
   }

   private drl n() {
      return !this.j.equals(this.i) ? this.j : drl.a;
   }

   public void a(aqk $$0, ja $$1) {
      $$0.a($$1, $$0.a_($$1).a(dnu.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(aqk $$0, ja $$1) {
      $$0.a($$1, $$0.a_($$1).a(dnu.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public drm f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public drn i() {
      return this.n.d();
   }

   public void a(dcd $$0, drn $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public drj k() {
      return this.o;
   }

   public drj.a l() {
      return this.p;
   }

   public boolean a(dcd $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.al() == bqa.a ? false : $$0.ab().b(dbz.e);
      }
   }

   public Optional<UUID> c(aqk $$0, ja $$1) {
      aym $$2 = $$0.E_();
      dcv $$3 = this.k.b(this, $$0.E_());
      tx $$4 = $$3.d();
      ud $$5 = $$4.c("Pos", 6);
      Optional<bsj<?>> $$6 = bsj.a($$4);
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
            evz $$11 = new evz($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               ja $$12 = ja.a($$11);
               if (!btu.a($$6.get(), $$0, btc.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dcv.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bsd $$14 = bsj.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bta $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dp()), btc.q, null);
                        }

                        $$15.fQ();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        drk.a $$17 = this.r ? drk.a.b : drk.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, dxa.t, $$12);
                        return Optional.of($$14.cz());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(aqk $$0, ja $$1, akj<eqt> $$2) {
      eqt $$3 = $$0.o().be().b($$2);
      eqr $$4 = new eqr.a($$0).a(etj.b);
      ObjectArrayList<cua> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cua $$6 = (cua)var7.next();
            kt.a($$0, $$6, 2, jf.b, evz.c($$1).a(jf.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dcd $$0, ja $$1, boolean $$2) {
      drn $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.Z());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         aym $$5 = $$0.E_();
         if ($$5.i() <= 0.02F) {
            ave $$6 = $$2 ? avf.mj : avf.mi;
            $$0.a($$1, $$6, avg.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(aqk $$0, ja $$1, boolean $$2) {
      this.r = $$2;
      drn $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.Z() + (long)this.b().g();
      }

      drn $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(aqk $$0, ja $$1, UUID $$2) {
      bsd $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bD() || !$$3.dP().af().equals($$0.af()) || $$3.dp().j($$1) > (double)g;
   }

   private static boolean a(dcd $$0, evz $$1, evz $$2) {
      evv $$3 = $$0.a(new dbm($$2, $$1, dbm.a.c, dbm.b.a, ewe.a()));
      return $$3.a().equals(ja.a($$1)) || $$3.c() == evx.a.a;
   }

   public static void a(dcd $$0, ja $$1, aym $$2, ln $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lj.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dcd $$0, ja $$1, aym $$2) {
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

   public static void a(dcd $$0, ja $$1, aym $$2, int $$3, lh $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dcd $$0, ja $$1, aym $$2) {
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
   public void a(drj $$0) {
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

      public static drk.a a(int $$0) {
         drk.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dcd var1, drn var2);

      drn d();

      void f();
   }
}
