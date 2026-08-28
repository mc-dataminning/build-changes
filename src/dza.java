import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dza {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azm.h(47);
   private static final float h = 0.02F;
   private je<dzb> i;
   private je<dzb> j;
   private final dzd k;
   private final int l;
   private final int m;
   private final dza.b n;
   private dyz o;
   private final dyz.a p;
   private boolean q;
   private boolean r;

   public MapCodec<dza> a() {
      return RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dzb.c.optionalFieldOf("normal_config", je.a(dzb.a)).forGetter($$0x -> $$0x.i),
                  dzb.c.optionalFieldOf("ominous_config", je.a(dzb.a)).forGetter($$0x -> $$0x.j),
                  dzd.b.forGetter(dza::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dza::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dza::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dza($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dza(dza.b $$0, dyz $$1, dyz.a $$2) {
      this(je.a(dzb.a), je.a(dzb.a), new dzd(), 36000, 14, $$0, $$1, $$2);
   }

   public dza(je<dzb> $$0, je<dzb> $$1, dzd $$2, int $$3, int $$4, dza.b $$5, dyz $$6, dyz.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dzb b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public dzb c() {
      return this.i.a();
   }

   @VisibleForTesting
   public dzb d() {
      return this.j.a();
   }

   public void a(arq $$0, iu $$1) {
      $$0.a($$1, $$0.a_($$1).b(dvb.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(arq $$0, iu $$1) {
      $$0.a($$1, $$0.a_($$1).b(dvb.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dzd f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public dze i() {
      return this.n.d();
   }

   public void a(div $$0, dze $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public dyz k() {
      return this.o;
   }

   public dyz.a l() {
      return this.p;
   }

   public boolean a(arq $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.an() == bty.a ? false : $$0.O().c(dir.e);
      }
   }

   public Optional<UUID> c(arq $$0, iu $$1) {
      azv $$2 = $$0.C_();
      djp $$3 = this.k.b(this, $$0.C_());
      tz $$4 = $$3.d();
      uf $$5 = $$4.c("Pos", 6);
      Optional<bwm<?>> $$6 = bwm.a($$4);
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
            fei $$11 = new fei($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               iu $$12 = iu.a((jo)$$11);
               if (!bxx.a($$6.get(), $$0, bwl.q, $$12, $$0.C_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     djp.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bwd $$14 = bwm.a($$4, $$0, bwl.q, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bxe $$15) {
                        if (!$$15.a((diy)$$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dv()), bwl.q, null);
                        }

                        $$15.fY();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        dza.a $$17 = this.r ? dza.a.b : dza.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, eez.t, $$12);
                        return Optional.of($$14.cG());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(arq $$0, iu $$1, alf<eze> $$2) {
      eze $$3 = $$0.p().bc().b($$2);
      ezc $$4 = new ezc.a($$0).a(fbs.b);
      ObjectArrayList<cyy> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cyy $$6 = (cyy)var7.next();
            lf.a($$0, $$6, 2, ja.b, fei.c($$1).a(ja.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(div $$0, iu $$1, boolean $$2) {
      dze $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.ae());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azv $$5 = $$0.C_();
         if ($$5.i() <= 0.02F) {
            awm $$6 = $$2 ? awn.mI : awn.mH;
            $$0.a($$1, $$6, awo.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(arq $$0, iu $$1, boolean $$2) {
      this.r = $$2;
      dze $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.ae() + (long)this.b().h();
      }

      dze $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(arq $$0, iu $$1, UUID $$2) {
      bwd $$3 = $$0.b($$2);
      return $$3 == null || !$$3.bK() || !$$3.dV().aj().equals($$0.aj()) || $$3.dv().j($$1) > (double)g;
   }

   private static boolean a(div $$0, fei $$1, fei $$2) {
      fee $$3 = $$0.a(new die($$2, $$1, die.a.c, die.b.a, fen.a()));
      return $$3.b().equals(iu.a((jo)$$1)) || $$3.d() == feg.a.a;
   }

   public static void a(div $$0, iu $$1, azv $$2, mb $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lx.ah, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(div $$0, iu $$1, azv $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lx.bh, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(lx.N, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(div $$0, iu $$1, azv $$2, int $$3, lv $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(div $$0, iu $$1, azv $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lx.aM, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(lx.ah, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public void a(bwm<?> $$0, div $$1) {
      this.k.a();
      this.i = je.a(this.i.a().a($$0));
      this.j = je.a(this.j.a().a($$0));
      this.a($$1, dze.a);
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dyz $$0) {
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
      a(lx.F),
      b(lx.N);

      public final mb c;

      private a(final mb $$0) {
         this.c = $$0;
      }

      public static dza.a a(int $$0) {
         dza.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(div var1, dze var2);

      dze d();

      void f();
   }
}
