import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class drh {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = ayz.h(47);
   private static final float h = 0.02F;
   private final dri i;
   private final dri j;
   private final drj k;
   private final int l;
   private final int m;
   private final drh.b n;
   private drg o;
   private final drg.a p;
   private boolean q;
   private boolean r;

   public Codec<drh> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dri.b.optionalFieldOf("normal_config", dri.a).forGetter(drh::c),
                  dri.b.optionalFieldOf("ominous_config", dri.a).forGetter(drh::n),
                  drj.b.forGetter(drh::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(drh::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(drh::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new drh($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public drh(drh.b $$0, drg $$1, drg.a $$2) {
      this(dri.a, dri.a, new drj(), 36000, 14, $$0, $$1, $$2);
   }

   public drh(dri $$0, dri $$1, drj $$2, int $$3, int $$4, drh.b $$5, drg $$6, drg.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dri b() {
      return this.r ? this.j : this.i;
   }

   @VisibleForTesting
   public dri c() {
      return this.i;
   }

   @VisibleForTesting
   public dri d() {
      return this.j;
   }

   private dri n() {
      return !this.j.equals(this.i) ? this.j : dri.a;
   }

   public void a(arf $$0, iz $$1) {
      $$0.a($$1, $$0.a_($$1).a(dnq.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(arf $$0, iz $$1) {
      $$0.a($$1, $$0.a_($$1).a(dnq.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public drj f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public drk i() {
      return this.n.d();
   }

   public void a(dca $$0, drk $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public drg k() {
      return this.o;
   }

   public drg.a l() {
      return this.p;
   }

   public boolean a(dca $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.al() == bqt.a ? false : $$0.ab().b(dbw.e);
      }
   }

   public Optional<UUID> c(arf $$0, iz $$1) {
      azh $$2 = $$0.E_();
      dcr $$3 = this.k.b(this, $$0.E_());
      us $$4 = $$3.d();
      uy $$5 = $$4.c("Pos", 6);
      Optional<btc<?>> $$6 = btc.a($$4);
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
            evt $$11 = new evt($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               iz $$12 = iz.a($$11);
               if (!bun.a($$6.get(), $$0, btv.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dcr.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bsw $$14 = btc.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof btt $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dp()), btv.q, null);
                        }

                        $$15.fU();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        drh.a $$17 = this.r ? drh.a.b : drh.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, dwx.t, $$12);
                        return Optional.of($$14.cz());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(arf $$0, iz $$1, ale<eqp> $$2) {
      eqp $$3 = $$0.o().be().b($$2);
      eqn $$4 = new eqn.a($$0).a(etf.b);
      ObjectArrayList<cur> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cur $$6 = (cur)var7.next();
            ks.a($$0, $$6, 2, je.b, evt.c($$1).a(je.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dca $$0, iz $$1, boolean $$2) {
      if (!this.a($$0)) {
         this.k.l = this.k.k;
      } else {
         drk $$3 = this.i();
         $$3.a($$0, $$1, $$2);
         if ($$3.d()) {
            double $$4 = (double)Math.max(0L, this.k.f - $$0.Z());
            this.k.l = this.k.k;
            this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
         }

         if ($$3.e()) {
            azh $$5 = $$0.E_();
            if ($$5.i() <= 0.02F) {
               avz $$6 = $$2 ? awa.mj : awa.mi;
               $$0.a($$1, $$6, awb.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
            }
         }
      }
   }

   public void a(arf $$0, iz $$1, boolean $$2) {
      this.r = $$2;
      drk $$3 = this.i();
      if (!this.a($$0)) {
         if ($$3.e()) {
            this.k.a();
            this.a($$0, drk.a);
         }
      } else {
         if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.k.f = $$0.Z() + (long)this.b().g();
         }

         drk $$4 = $$3.a($$1, this, $$0);
         if ($$4 != $$3) {
            this.a($$0, $$4);
         }
      }
   }

   private static boolean a(arf $$0, iz $$1, UUID $$2) {
      bsw $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bD() || !$$3.dP().af().equals($$0.af()) || $$3.dp().j($$1) > (double)g;
   }

   private static boolean a(dca $$0, evt $$1, evt $$2) {
      evp $$3 = $$0.a(new dbj($$2, $$1, dbj.a.c, dbj.b.a, evy.a()));
      return $$3.a().equals(iz.a($$1)) || $$3.c() == evr.a.a;
   }

   public static void a(dca $$0, iz $$1, azh $$2, lm $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(li.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dca $$0, iz $$1, azh $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(li.be, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(li.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dca $$0, iz $$1, azh $$2, int $$3, lg $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dca $$0, iz $$1, azh $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(li.aJ, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(li.ae, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(drg $$0) {
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
      a(li.F),
      b(li.L);

      public final lm c;

      private a(final lm $$0) {
         this.c = $$0;
      }

      public static drh.a a(int $$0) {
         drh.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dca var1, drk var2);

      drk d();

      void f();
   }
}
