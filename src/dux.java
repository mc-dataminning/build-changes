import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dux {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azm.h(47);
   private static final float h = 0.02F;
   private final jq<duy> i;
   private final jq<duy> j;
   private final dva k;
   private final int l;
   private final int m;
   private final dux.b n;
   private duw o;
   private final duw.a p;
   private boolean q;
   private boolean r;

   public Codec<dux> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  duy.c.optionalFieldOf("normal_config", jq.a(duy.a)).forGetter($$0x -> $$0x.i),
                  duy.c.optionalFieldOf("ominous_config", jq.a(duy.a)).forGetter($$0x -> $$0x.j),
                  dva.b.forGetter(dux::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dux::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dux::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dux($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dux(dux.b $$0, duw $$1, duw.a $$2) {
      this(jq.a(duy.a), jq.a(duy.a), new dva(), 36000, 14, $$0, $$1, $$2);
   }

   public dux(jq<duy> $$0, jq<duy> $$1, dva $$2, int $$3, int $$4, dux.b $$5, duw $$6, duw.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public duy b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public duy c() {
      return this.i.a();
   }

   @VisibleForTesting
   public duy d() {
      return this.j.a();
   }

   public void a(arp $$0, jh $$1) {
      $$0.a($$1, $$0.a_($$1).b(drf.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(arp $$0, jh $$1) {
      $$0.a($$1, $$0.a_($$1).b(drf.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dva f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public dvb i() {
      return this.n.d();
   }

   public void a(dfm $$0, dvb $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public duw k() {
      return this.o;
   }

   public duw.a l() {
      return this.p;
   }

   public boolean a(arp $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.ak() == bsh.a ? false : $$0.N().b(dfi.e);
      }
   }

   public Optional<UUID> c(arp $$0, jh $$1) {
      azu $$2 = $$0.G_();
      dgg $$3 = this.k.b(this, $$0.G_());
      ul $$4 = $$3.d();
      ur $$5 = $$4.c("Pos", 6);
      Optional<bus<?>> $$6 = bus.a($$4);
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
            ezy $$11 = new ezy($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               jh $$12 = jh.a((ka)$$11);
               if (!bwd.a($$6.get(), $$0, bur.q, $$12, $$0.G_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dgg.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bul $$14 = bus.a($$4, $$0, bur.q, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bvj $$15) {
                        if (!$$15.a((dfp)$$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dv()), bur.q, null);
                        }

                        $$15.ai();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        dux.a $$17 = this.r ? dux.a.b : dux.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, ear.t, $$12);
                        return Optional.of($$14.cG());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(arp $$0, jh $$1, ali<eus> $$2) {
      eus $$3 = $$0.p().bc().b($$2);
      euq $$4 = new euq.a($$0).a(exi.b);
      ObjectArrayList<cwm> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cwm $$6 = (cwm)var7.next();
            la.a($$0, $$6, 2, jm.b, ezy.c($$1).a(jm.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dfm $$0, jh $$1, boolean $$2) {
      dvb $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.ab());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azu $$5 = $$0.G_();
         if ($$5.i() <= 0.02F) {
            awm $$6 = $$2 ? awn.mi : awn.mh;
            $$0.a($$1, $$6, awo.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(arp $$0, jh $$1, boolean $$2) {
      this.r = $$2;
      dvb $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.ab() + (long)this.b().h();
      }

      dvb $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(arp $$0, jh $$1, UUID $$2) {
      bul $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bL() || !$$3.dV().ag().equals($$0.ag()) || $$3.dv().j($$1) > (double)g;
   }

   private static boolean a(dfm $$0, ezy $$1, ezy $$2) {
      ezu $$3 = $$0.a(new deu($$2, $$1, deu.a.c, deu.b.a, fad.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == ezw.a.a;
   }

   public static void a(dfm $$0, jh $$1, azu $$2, lw $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(ls.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dfm $$0, jh $$1, azu $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ls.be, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(ls.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dfm $$0, jh $$1, azu $$2, int $$3, lq $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dfm $$0, jh $$1, azu $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ls.aJ, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(ls.ae, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(duw $$0) {
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
      a(ls.F),
      b(ls.L);

      public final lw c;

      private a(final lw $$0) {
         this.c = $$0;
      }

      public static dux.a a(int $$0) {
         dux.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dfm var1, dvb var2);

      dvb d();

      void f();
   }
}
