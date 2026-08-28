import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dre {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = ayy.h(47);
   private static final float h = 0.02F;
   private final drf i;
   private final drf j;
   private final drg k;
   private final int l;
   private final int m;
   private final dre.b n;
   private drd o;
   private final drd.a p;
   private boolean q;
   private boolean r;

   public Codec<dre> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  drf.b.optionalFieldOf("normal_config", drf.a).forGetter(dre::c),
                  drf.b.optionalFieldOf("ominous_config", drf.a).forGetter(dre::n),
                  drg.b.forGetter(dre::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dre::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dre::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dre($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dre(dre.b $$0, drd $$1, drd.a $$2) {
      this(drf.a, drf.a, new drg(), 36000, 14, $$0, $$1, $$2);
   }

   public dre(drf $$0, drf $$1, drg $$2, int $$3, int $$4, dre.b $$5, drd $$6, drd.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public drf b() {
      return this.r ? this.j : this.i;
   }

   @VisibleForTesting
   public drf c() {
      return this.i;
   }

   @VisibleForTesting
   public drf d() {
      return this.j;
   }

   private drf n() {
      return !this.j.equals(this.i) ? this.j : drf.a;
   }

   public void a(are $$0, iz $$1) {
      $$0.a($$1, $$0.a_($$1).a(dnn.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(are $$0, iz $$1) {
      $$0.a($$1, $$0.a_($$1).a(dnn.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public drg f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public drh i() {
      return this.n.d();
   }

   public void a(dbx $$0, drh $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public drd k() {
      return this.o;
   }

   public drd.a l() {
      return this.p;
   }

   public boolean a(dbx $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.al() == bqq.a ? false : $$0.ab().b(dbt.e);
      }
   }

   public Optional<UUID> c(are $$0, iz $$1) {
      azg $$2 = $$0.E_();
      dco $$3 = this.k.b(this, $$0.E_());
      ur $$4 = $$3.d();
      ux $$5 = $$4.c("Pos", 6);
      Optional<bsz<?>> $$6 = bsz.a($$4);
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
            evq $$11 = new evq($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               iz $$12 = iz.a($$11);
               if (!buk.a($$6.get(), $$0, bts.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dco.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bst $$14 = bsz.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof btq $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dp()), bts.q, null);
                        }

                        $$15.fU();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        dre.a $$17 = this.r ? dre.a.b : dre.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, dwu.t, $$12);
                        return Optional.of($$14.cz());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(are $$0, iz $$1, ald<eqm> $$2) {
      eqm $$3 = $$0.o().be().b($$2);
      eqk $$4 = new eqk.a($$0).a(etc.b);
      ObjectArrayList<cuo> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cuo $$6 = (cuo)var7.next();
            ks.a($$0, $$6, 2, je.b, evq.c($$1).a(je.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dbx $$0, iz $$1, boolean $$2) {
      if (!this.a($$0)) {
         this.k.l = this.k.k;
      } else {
         drh $$3 = this.i();
         $$3.a($$0, $$1, $$2);
         if ($$3.d()) {
            double $$4 = (double)Math.max(0L, this.k.f - $$0.Z());
            this.k.l = this.k.k;
            this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
         }

         if ($$3.e()) {
            azg $$5 = $$0.E_();
            if ($$5.i() <= 0.02F) {
               avy $$6 = $$2 ? avz.mj : avz.mi;
               $$0.a($$1, $$6, awa.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
            }
         }
      }
   }

   public void a(are $$0, iz $$1, boolean $$2) {
      this.r = $$2;
      drh $$3 = this.i();
      if (!this.a($$0)) {
         if ($$3.e()) {
            this.k.a();
            this.a($$0, drh.a);
         }
      } else {
         if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.k.f = $$0.Z() + (long)this.b().g();
         }

         drh $$4 = $$3.a($$1, this, $$0);
         if ($$4 != $$3) {
            this.a($$0, $$4);
         }
      }
   }

   private static boolean a(are $$0, iz $$1, UUID $$2) {
      bst $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bD() || !$$3.dP().af().equals($$0.af()) || $$3.dp().j($$1) > (double)g;
   }

   private static boolean a(dbx $$0, evq $$1, evq $$2) {
      evm $$3 = $$0.a(new dbg($$2, $$1, dbg.a.c, dbg.b.a, evv.a()));
      return $$3.a().equals(iz.a($$1)) || $$3.c() == evo.a.a;
   }

   public static void a(dbx $$0, iz $$1, azg $$2, lm $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(li.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dbx $$0, iz $$1, azg $$2) {
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

   public static void a(dbx $$0, iz $$1, azg $$2, int $$3, lg $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dbx $$0, iz $$1, azg $$2) {
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
   public void a(drd $$0) {
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

      public static dre.a a(int $$0) {
         dre.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dbx var1, drh var2);

      drh d();

      void f();
   }
}
