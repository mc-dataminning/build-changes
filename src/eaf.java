import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class eaf {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azo.h(47);
   private static final float h = 0.02F;
   private jf<eag> i;
   private jf<eag> j;
   private final eai k;
   private final int l;
   private final int m;
   private final eaf.b n;
   private eae o;
   private final eae.a p;
   private boolean q;
   private boolean r;

   public MapCodec<eaf> a() {
      return RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eag.c.optionalFieldOf("normal_config", jf.a(eag.a)).forGetter($$0x -> $$0x.i),
                  eag.c.optionalFieldOf("ominous_config", jf.a(eag.a)).forGetter($$0x -> $$0x.j),
                  eai.b.forGetter(eaf::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(eaf::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(eaf::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new eaf($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public eaf(eaf.b $$0, eae $$1, eae.a $$2) {
      this(jf.a(eag.a), jf.a(eag.a), new eai(), 36000, 14, $$0, $$1, $$2);
   }

   public eaf(jf<eag> $$0, jf<eag> $$1, eai $$2, int $$3, int $$4, eaf.b $$5, eae $$6, eae.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public eag b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public eag c() {
      return this.i.a();
   }

   @VisibleForTesting
   public eag d() {
      return this.j.a();
   }

   public void a(ars $$0, iv $$1) {
      $$0.a($$1, $$0.a_($$1).b(dwg.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(ars $$0, iv $$1) {
      $$0.a($$1, $$0.a_($$1).b(dwg.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public eai f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public eaj i() {
      return this.n.d();
   }

   public void a(djx $$0, eaj $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public eae k() {
      return this.o;
   }

   public eae.a l() {
      return this.p;
   }

   public boolean a(ars $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.an() == buo.a ? false : $$0.O().c(djt.f);
      }
   }

   public Optional<UUID> c(ars $$0, iv $$1) {
      azx $$2 = $$0.G_();
      dkr $$3 = this.k.b(this, $$0.G_());
      tz $$4 = $$3.d();
      Optional<bxc<?>> $$5 = bxc.a($$4);
      if ($$5.isEmpty()) {
         return Optional.empty();
      } else {
         ffq $$6 = $$4.<ffq>a("Pos", ffq.a)
            .orElseGet(
               () -> new ffq(
                     (double)$$1.u() + ($$2.j() - $$2.j()) * (double)this.b().c() + 0.5,
                     (double)($$1.v() + $$2.a(3) - 1),
                     (double)$$1.w() + ($$2.j() - $$2.j()) * (double)this.b().c() + 0.5
                  )
            );
         if (!$$0.b($$5.get().a($$6.d, $$6.e, $$6.f))) {
            return Optional.empty();
         } else if (!a($$0, $$1.b(), $$6)) {
            return Optional.empty();
         } else {
            iv $$7 = iv.a((jp)$$6);
            if (!byp.a($$5.get(), $$0, bxb.q, $$7, $$0.G_())) {
               return Optional.empty();
            } else {
               if ($$3.b().isPresent()) {
                  dkr.a $$8 = $$3.b().get();
                  if (!$$8.a($$7, $$0)) {
                     return Optional.empty();
                  }
               }

               bwt $$9 = bxc.a($$4, $$0, bxb.q, $$2x -> {
                  $$2x.b($$6.d, $$6.e, $$6.f, $$2.i() * 360.0F, 0.0F);
                  return $$2x;
               });
               if ($$9 == null) {
                  return Optional.empty();
               } else {
                  if ($$9 instanceof bxw $$10) {
                     if (!$$10.a((dka)$$0)) {
                        return Optional.empty();
                     }

                     boolean $$11 = $$3.a().i() == 1 && $$3.a().i("id").isPresent();
                     if ($$11) {
                        $$10.a($$0, $$0.d_($$10.dv()), bxb.q, null);
                     }

                     $$10.gc();
                     $$3.c().ifPresent($$10::a);
                  }

                  if (!$$0.e($$9)) {
                     return Optional.empty();
                  } else {
                     eaf.a $$12 = this.r ? eaf.a.b : eaf.a.a;
                     $$0.c(3011, $$1, $$12.a());
                     $$0.c(3012, $$7, $$12.a());
                     $$0.a($$9, ege.t, $$7);
                     return Optional.of($$9.cG());
                  }
               }
            }
         }
      }
   }

   public void a(ars $$0, iv $$1, alh<fam> $$2) {
      fam $$3 = $$0.p().bc().b($$2);
      fak $$4 = new fak.a($$0).a(fda.b);
      ObjectArrayList<czy> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            czy $$6 = (czy)var7.next();
            lg.a($$0, $$6, 2, jb.b, ffq.c($$1).a(jb.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(djx $$0, iv $$1, boolean $$2) {
      eaj $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.ae());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azx $$5 = $$0.G_();
         if ($$5.i() <= 0.02F) {
            awo $$6 = $$2 ? awp.mL : awp.mK;
            $$0.a($$1, $$6, awq.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(ars $$0, iv $$1, boolean $$2) {
      this.r = $$2;
      eaj $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.ae() + (long)this.b().h();
      }

      eaj $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(ars $$0, iv $$1, UUID $$2) {
      bwt $$3 = $$0.b($$2);
      return $$3 == null || !$$3.bJ() || !$$3.dV().aj().equals($$0.aj()) || $$3.dv().j($$1) > (double)g;
   }

   private static boolean a(djx $$0, ffq $$1, ffq $$2) {
      ffm $$3 = $$0.a(new dje($$2, $$1, dje.a.c, dje.b.a, ffv.a()));
      return $$3.b().equals(iv.a((jp)$$1)) || $$3.d() == ffo.a.a;
   }

   public static void a(djx $$0, iv $$1, azx $$2, mc $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(ly.ah, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(djx $$0, iv $$1, azx $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ly.bh, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(ly.N, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(djx $$0, iv $$1, azx $$2, int $$3, lw $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(djx $$0, iv $$1, azx $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ly.aM, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(ly.ah, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public void a(bxc<?> $$0, djx $$1) {
      this.k.a();
      this.i = jf.a(this.i.a().a($$0));
      this.j = jf.a(this.j.a().a($$0));
      this.a($$1, eaj.a);
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(eae $$0) {
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
      a(ly.F),
      b(ly.N);

      public final mc c;

      private a(final mc $$0) {
         this.c = $$0;
      }

      public static eaf.a a(int $$0) {
         eaf.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(djx var1, eaj var2);

      eaj d();

      void f();
   }
}
