import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dzp {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azm.h(47);
   private static final float h = 0.02F;
   private jf<dzq> i;
   private jf<dzq> j;
   private final dzs k;
   private final int l;
   private final int m;
   private final dzp.b n;
   private dzo o;
   private final dzo.a p;
   private boolean q;
   private boolean r;

   public MapCodec<dzp> a() {
      return RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dzq.c.optionalFieldOf("normal_config", jf.a(dzq.a)).forGetter($$0x -> $$0x.i),
                  dzq.c.optionalFieldOf("ominous_config", jf.a(dzq.a)).forGetter($$0x -> $$0x.j),
                  dzs.b.forGetter(dzp::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dzp::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dzp::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dzp($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dzp(dzp.b $$0, dzo $$1, dzo.a $$2) {
      this(jf.a(dzq.a), jf.a(dzq.a), new dzs(), 36000, 14, $$0, $$1, $$2);
   }

   public dzp(jf<dzq> $$0, jf<dzq> $$1, dzs $$2, int $$3, int $$4, dzp.b $$5, dzo $$6, dzo.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dzq b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public dzq c() {
      return this.i.a();
   }

   @VisibleForTesting
   public dzq d() {
      return this.j.a();
   }

   public void a(arq $$0, iv $$1) {
      $$0.a($$1, $$0.a_($$1).b(dvq.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(arq $$0, iv $$1) {
      $$0.a($$1, $$0.a_($$1).b(dvq.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dzs f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public dzt i() {
      return this.n.d();
   }

   public void a(djh $$0, dzt $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public dzo k() {
      return this.o;
   }

   public dzo.a l() {
      return this.p;
   }

   public boolean a(arq $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.an() == bud.a ? false : $$0.O().c(djd.f);
      }
   }

   public Optional<UUID> c(arq $$0, iv $$1) {
      azv $$2 = $$0.C_();
      dkb $$3 = this.k.b(this, $$0.C_());
      tz $$4 = $$3.d();
      Optional<bwr<?>> $$5 = bwr.a($$4);
      if ($$5.isEmpty()) {
         return Optional.empty();
      } else {
         fex $$6 = $$4.<fex>a("Pos", fex.a)
            .orElseGet(
               () -> new fex(
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
            if (!bye.a($$5.get(), $$0, bwq.q, $$7, $$0.C_())) {
               return Optional.empty();
            } else {
               if ($$3.b().isPresent()) {
                  dkb.a $$8 = $$3.b().get();
                  if (!$$8.a($$7, $$0)) {
                     return Optional.empty();
                  }
               }

               bwi $$9 = bwr.a($$4, $$0, bwq.q, $$2x -> {
                  $$2x.b($$6.d, $$6.e, $$6.f, $$2.i() * 360.0F, 0.0F);
                  return $$2x;
               });
               if ($$9 == null) {
                  return Optional.empty();
               } else {
                  if ($$9 instanceof bxl $$10) {
                     if (!$$10.a((djk)$$0)) {
                        return Optional.empty();
                     }

                     boolean $$11 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                     if ($$11) {
                        $$10.a($$0, $$0.d_($$10.du()), bwq.q, null);
                     }

                     $$10.gb();
                     $$3.c().ifPresent($$10::a);
                  }

                  if (!$$0.e($$9)) {
                     return Optional.empty();
                  } else {
                     dzp.a $$12 = this.r ? dzp.a.b : dzp.a.a;
                     $$0.c(3011, $$1, $$12.a());
                     $$0.c(3012, $$7, $$12.a());
                     $$0.a($$9, efo.t, $$7);
                     return Optional.of($$9.cF());
                  }
               }
            }
         }
      }
   }

   public void a(arq $$0, iv $$1, alf<ezt> $$2) {
      ezt $$3 = $$0.p().bc().b($$2);
      ezr $$4 = new ezr.a($$0).a(fch.b);
      ObjectArrayList<czk> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            czk $$6 = (czk)var7.next();
            lg.a($$0, $$6, 2, jb.b, fex.c($$1).a(jb.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(djh $$0, iv $$1, boolean $$2) {
      dzt $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.ae());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azv $$5 = $$0.C_();
         if ($$5.i() <= 0.02F) {
            awm $$6 = $$2 ? awn.mL : awn.mK;
            $$0.a($$1, $$6, awo.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(arq $$0, iv $$1, boolean $$2) {
      this.r = $$2;
      dzt $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.ae() + (long)this.b().h();
      }

      dzt $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(arq $$0, iv $$1, UUID $$2) {
      bwi $$3 = $$0.b($$2);
      return $$3 == null || !$$3.bI() || !$$3.dU().aj().equals($$0.aj()) || $$3.du().j($$1) > (double)g;
   }

   private static boolean a(djh $$0, fex $$1, fex $$2) {
      fet $$3 = $$0.a(new diq($$2, $$1, diq.a.c, diq.b.a, ffc.a()));
      return $$3.b().equals(iv.a((jp)$$1)) || $$3.d() == fev.a.a;
   }

   public static void a(djh $$0, iv $$1, azv $$2, mc $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(ly.ah, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(djh $$0, iv $$1, azv $$2) {
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

   public static void a(djh $$0, iv $$1, azv $$2, int $$3, lw $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(djh $$0, iv $$1, azv $$2) {
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

   public void a(bwr<?> $$0, djh $$1) {
      this.k.a();
      this.i = jf.a(this.i.a().a($$0));
      this.j = jf.a(this.j.a().a($$0));
      this.a($$1, dzt.a);
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dzo $$0) {
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

      public static dzp.a a(int $$0) {
         dzp.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(djh var1, dzt var2);

      dzt d();

      void f();
   }
}
