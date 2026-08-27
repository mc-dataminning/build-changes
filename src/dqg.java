import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dqg {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = ayf.h(47);
   private static final float h = 0.02F;
   private final dqh i;
   private final dqh j;
   private final dqi k;
   private final int l;
   private final int m;
   private final dqg.b n;
   private dqf o;
   private final dqf.a p;
   private boolean q;
   private boolean r;

   public Codec<dqg> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dqh.b.optionalFieldOf("normal_config", dqh.a).forGetter(dqg::c),
                  dqh.b.optionalFieldOf("ominous_config", dqh.a).forGetter(dqg::n),
                  dqi.b.forGetter(dqg::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dqg::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dqg::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dqg($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dqg(dqg.b $$0, dqf $$1, dqf.a $$2) {
      this(dqh.a, dqh.a, new dqi(), 36000, 14, $$0, $$1, $$2);
   }

   public dqg(dqh $$0, dqh $$1, dqi $$2, int $$3, int $$4, dqg.b $$5, dqf $$6, dqf.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dqh b() {
      return this.r ? this.j : this.i;
   }

   @VisibleForTesting
   public dqh c() {
      return this.i;
   }

   @VisibleForTesting
   public dqh d() {
      return this.j;
   }

   private dqh n() {
      return !this.j.equals(this.i) ? this.j : dqh.a;
   }

   public void a(aqn $$0, io $$1) {
      $$0.a($$1, $$0.a_($$1).a(dmp.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(aqn $$0, io $$1) {
      $$0.a($$1, $$0.a_($$1).a(dmp.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dqi f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public dqj i() {
      return this.n.d();
   }

   public void a(daz $$0, dqj $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public dqf k() {
      return this.o;
   }

   public dqf.a l() {
      return this.p;
   }

   public boolean a(daz $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.ak() == bpt.a ? false : $$0.aa().b(dav.e);
      }
   }

   public Optional<UUID> c(aqn $$0, io $$1) {
      aym $$2 = $$0.E_();
      dbq $$3 = this.k.b(this, $$0.E_());
      ud $$4 = $$3.d();
      uj $$5 = $$4.c("Pos", 6);
      Optional<bsc<?>> $$6 = bsc.a($$4);
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
            eum $$11 = new eum($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               io $$12 = io.a($$11);
               if (!btm.a($$6.get(), $$0, bsu.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dbq.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  brw $$14 = bsc.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bss $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dp()), bsu.q, null);
                        }

                        $$15.fT();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        dqg.a $$17 = this.r ? dqg.a.b : dqg.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, dvw.t, $$12);
                        return Optional.of($$14.cz());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(aqn $$0, io $$1, akm<epm> $$2) {
      epm $$3 = $$0.o().be().b($$2);
      epk $$4 = new epk.a($$0).a(ery.b);
      ObjectArrayList<ctq> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            ctq $$6 = (ctq)var7.next();
            kh.a($$0, $$6, 2, it.b, eum.c($$1).a(it.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(daz $$0, io $$1, boolean $$2) {
      if (!this.a($$0)) {
         this.k.l = this.k.k;
      } else {
         dqj $$3 = this.i();
         $$3.a($$0, $$1, $$2);
         if ($$3.d()) {
            double $$4 = (double)Math.max(0L, this.k.f - $$0.Y());
            this.k.l = this.k.k;
            this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
         }

         if ($$3.e()) {
            aym $$5 = $$0.E_();
            if ($$5.i() <= 0.02F) {
               avh $$6 = $$2 ? avi.mj : avi.mi;
               $$0.a($$1, $$6, avj.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
            }
         }
      }
   }

   public void a(aqn $$0, io $$1, boolean $$2) {
      this.r = $$2;
      dqj $$3 = this.i();
      if (!this.a($$0)) {
         if ($$3.e()) {
            this.k.a();
            this.a($$0, dqj.a);
         }
      } else {
         if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.k.f = $$0.Y() + (long)this.b().g();
         }

         dqj $$4 = $$3.a($$1, this, $$0);
         if ($$4 != $$3) {
            this.a($$0, $$4);
         }
      }
   }

   private static boolean a(aqn $$0, io $$1, UUID $$2) {
      brw $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bD() || !$$3.dP().ae().equals($$0.ae()) || $$3.dp().j($$1) > (double)g;
   }

   private static boolean a(daz $$0, eum $$1, eum $$2) {
      eui $$3 = $$0.a(new dai($$2, $$1, dai.a.c, dai.b.a, eur.a()));
      return $$3.a().equals(io.a($$1)) || $$3.c() == euk.a.a;
   }

   public static void a(daz $$0, io $$1, aym $$2, lb $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(ky.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(daz $$0, io $$1, aym $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ky.be, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(ky.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(daz $$0, io $$1, aym $$2, int $$3, kw $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(daz $$0, io $$1, aym $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ky.aJ, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(ky.ae, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dqf $$0) {
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
      a(ky.F),
      b(ky.L);

      public final lb c;

      private a(lb $$0) {
         this.c = $$0;
      }

      public static dqg.a a(int $$0) {
         dqg.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(daz var1, dqj var2);

      dqj d();

      void f();
   }
}
