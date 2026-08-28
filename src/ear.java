import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class ear {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azz.h(47);
   private static final float h = 0.02F;
   private jg<eas> i;
   private jg<eas> j;
   private final eau k;
   private final int l;
   private final int m;
   private final ear.b n;
   private eaq o;
   private final eaq.a p;
   private boolean q;
   private boolean r;

   public MapCodec<ear> a() {
      return RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eas.c.optionalFieldOf("normal_config", jg.a(eas.a)).forGetter($$0x -> $$0x.i),
                  eas.c.optionalFieldOf("ominous_config", jg.a(eas.a)).forGetter($$0x -> $$0x.j),
                  eau.b.forGetter(ear::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(ear::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(ear::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ear($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public ear(ear.b $$0, eaq $$1, eaq.a $$2) {
      this(jg.a(eas.a), jg.a(eas.a), new eau(), 36000, 14, $$0, $$1, $$2);
   }

   public ear(jg<eas> $$0, jg<eas> $$1, eau $$2, int $$3, int $$4, ear.b $$5, eaq $$6, eaq.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public eas b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public eas c() {
      return this.i.a();
   }

   @VisibleForTesting
   public eas d() {
      return this.j.a();
   }

   public void a(asb $$0, iw $$1) {
      $$0.a($$1, $$0.a_($$1).b(dws.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(asb $$0, iw $$1) {
      $$0.a($$1, $$0.a_($$1).b(dws.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public eau f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public eav i() {
      return this.n.d();
   }

   public void a(dkj $$0, eav $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public eaq k() {
      return this.o;
   }

   public eaq.a l() {
      return this.p;
   }

   public boolean a(asb $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.an() == buz.a ? false : $$0.O().c(dkf.f);
      }
   }

   public Optional<UUID> c(asb $$0, iw $$1) {
      bai $$2 = $$0.G_();
      dld $$3 = this.k.b(this, $$0.G_());
      ua $$4 = $$3.d();
      Optional<bxn<?>> $$5 = bxn.a($$4);
      if ($$5.isEmpty()) {
         return Optional.empty();
      } else {
         fgc $$6 = $$4.<fgc>a("Pos", fgc.a)
            .orElseGet(
               () -> new fgc(
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
            iw $$7 = iw.a((jq)$$6);
            if (!bza.a($$5.get(), $$0, bxm.q, $$7, $$0.G_())) {
               return Optional.empty();
            } else {
               if ($$3.b().isPresent()) {
                  dld.a $$8 = $$3.b().get();
                  if (!$$8.a($$7, $$0)) {
                     return Optional.empty();
                  }
               }

               bxe $$9 = bxn.a($$4, $$0, bxm.q, $$2x -> {
                  $$2x.b($$6.d, $$6.e, $$6.f, $$2.i() * 360.0F, 0.0F);
                  return $$2x;
               });
               if ($$9 == null) {
                  return Optional.empty();
               } else {
                  if ($$9 instanceof byh $$10) {
                     if (!$$10.a((dkm)$$0)) {
                        return Optional.empty();
                     }

                     boolean $$11 = $$3.a().i() == 1 && $$3.a().i("id").isPresent();
                     if ($$11) {
                        $$10.a($$0, $$0.d_($$10.dv()), bxm.q, null);
                     }

                     $$10.gc();
                     $$3.c().ifPresent($$10::a);
                  }

                  if (!$$0.e($$9)) {
                     return Optional.empty();
                  } else {
                     ear.a $$12 = this.r ? ear.a.b : ear.a.a;
                     $$0.c(3011, $$1, $$12.a());
                     $$0.c(3012, $$7, $$12.a());
                     $$0.a($$9, egq.t, $$7);
                     return Optional.of($$9.cG());
                  }
               }
            }
         }
      }
   }

   public void a(asb $$0, iw $$1, alq<fay> $$2) {
      fay $$3 = $$0.p().bc().b($$2);
      faw $$4 = new faw.a($$0).a(fdm.b);
      ObjectArrayList<dak> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            dak $$6 = (dak)var7.next();
            lh.a($$0, $$6, 2, jc.b, fgc.c($$1).a(jc.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dkj $$0, iw $$1, boolean $$2) {
      eav $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.ae());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         bai $$5 = $$0.G_();
         if ($$5.i() <= 0.02F) {
            awx $$6 = $$2 ? awy.mL : awy.mK;
            $$0.a($$1, $$6, awz.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(asb $$0, iw $$1, boolean $$2) {
      this.r = $$2;
      eav $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.ae() + (long)this.b().h();
      }

      eav $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(asb $$0, iw $$1, UUID $$2) {
      bxe $$3 = $$0.b($$2);
      return $$3 == null || !$$3.bJ() || !$$3.dV().aj().equals($$0.aj()) || $$3.dv().j($$1) > (double)g;
   }

   private static boolean a(dkj $$0, fgc $$1, fgc $$2) {
      ffy $$3 = $$0.a(new djq($$2, $$1, djq.a.c, djq.b.a, fgh.a()));
      return $$3.b().equals(iw.a((jq)$$1)) || $$3.d() == fga.a.a;
   }

   public static void a(dkj $$0, iw $$1, bai $$2, md $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lz.ah, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dkj $$0, iw $$1, bai $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lz.bh, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(lz.N, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dkj $$0, iw $$1, bai $$2, int $$3, lx $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dkj $$0, iw $$1, bai $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lz.aM, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(lz.ah, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public void a(bxn<?> $$0, dkj $$1) {
      this.k.a();
      this.i = jg.a(this.i.a().a($$0));
      this.j = jg.a(this.j.a().a($$0));
      this.a($$1, eav.a);
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(eaq $$0) {
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
      a(lz.F),
      b(lz.N);

      public final md c;

      private a(final md $$0) {
         this.c = $$0;
      }

      public static ear.a a(int $$0) {
         ear.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dkj var1, eav var2);

      eav d();

      void f();
   }
}
