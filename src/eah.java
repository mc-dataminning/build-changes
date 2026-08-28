import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class eah {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azq.h(47);
   private static final float h = 0.02F;
   private jg<eai> i;
   private jg<eai> j;
   private final eak k;
   private final int l;
   private final int m;
   private final eah.b n;
   private eag o;
   private final eag.a p;
   private boolean q;
   private boolean r;

   public MapCodec<eah> a() {
      return RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eai.c.optionalFieldOf("normal_config", jg.a(eai.a)).forGetter($$0x -> $$0x.i),
                  eai.c.optionalFieldOf("ominous_config", jg.a(eai.a)).forGetter($$0x -> $$0x.j),
                  eak.b.forGetter(eah::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(eah::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(eah::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new eah($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public eah(eah.b $$0, eag $$1, eag.a $$2) {
      this(jg.a(eai.a), jg.a(eai.a), new eak(), 36000, 14, $$0, $$1, $$2);
   }

   public eah(jg<eai> $$0, jg<eai> $$1, eak $$2, int $$3, int $$4, eah.b $$5, eag $$6, eag.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public eai b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public eai c() {
      return this.i.a();
   }

   @VisibleForTesting
   public eai d() {
      return this.j.a();
   }

   public void a(aru $$0, iw $$1) {
      $$0.a($$1, $$0.a_($$1).b(dwi.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(aru $$0, iw $$1) {
      $$0.a($$1, $$0.a_($$1).b(dwi.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public eak f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public eal i() {
      return this.n.d();
   }

   public void a(djz $$0, eal $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public eag k() {
      return this.o;
   }

   public eag.a l() {
      return this.p;
   }

   public boolean a(aru $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.an() == buq.a ? false : $$0.O().c(djv.f);
      }
   }

   public Optional<UUID> c(aru $$0, iw $$1) {
      azz $$2 = $$0.G_();
      dkt $$3 = this.k.b(this, $$0.G_());
      ua $$4 = $$3.d();
      Optional<bxe<?>> $$5 = bxe.a($$4);
      if ($$5.isEmpty()) {
         return Optional.empty();
      } else {
         ffs $$6 = $$4.<ffs>a("Pos", ffs.a)
            .orElseGet(
               () -> new ffs(
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
            if (!byr.a($$5.get(), $$0, bxd.q, $$7, $$0.G_())) {
               return Optional.empty();
            } else {
               if ($$3.b().isPresent()) {
                  dkt.a $$8 = $$3.b().get();
                  if (!$$8.a($$7, $$0)) {
                     return Optional.empty();
                  }
               }

               bwv $$9 = bxe.a($$4, $$0, bxd.q, $$2x -> {
                  $$2x.b($$6.d, $$6.e, $$6.f, $$2.i() * 360.0F, 0.0F);
                  return $$2x;
               });
               if ($$9 == null) {
                  return Optional.empty();
               } else {
                  if ($$9 instanceof bxy $$10) {
                     if (!$$10.a((dkc)$$0)) {
                        return Optional.empty();
                     }

                     boolean $$11 = $$3.a().i() == 1 && $$3.a().i("id").isPresent();
                     if ($$11) {
                        $$10.a($$0, $$0.d_($$10.dv()), bxd.q, null);
                     }

                     $$10.gc();
                     $$3.c().ifPresent($$10::a);
                  }

                  if (!$$0.e($$9)) {
                     return Optional.empty();
                  } else {
                     eah.a $$12 = this.r ? eah.a.b : eah.a.a;
                     $$0.c(3011, $$1, $$12.a());
                     $$0.c(3012, $$7, $$12.a());
                     $$0.a($$9, egg.t, $$7);
                     return Optional.of($$9.cG());
                  }
               }
            }
         }
      }
   }

   public void a(aru $$0, iw $$1, alj<fao> $$2) {
      fao $$3 = $$0.p().bc().b($$2);
      fam $$4 = new fam.a($$0).a(fdc.b);
      ObjectArrayList<daa> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            daa $$6 = (daa)var7.next();
            lh.a($$0, $$6, 2, jc.b, ffs.c($$1).a(jc.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(djz $$0, iw $$1, boolean $$2) {
      eal $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.ae());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azz $$5 = $$0.G_();
         if ($$5.i() <= 0.02F) {
            awq $$6 = $$2 ? awr.mL : awr.mK;
            $$0.a($$1, $$6, aws.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(aru $$0, iw $$1, boolean $$2) {
      this.r = $$2;
      eal $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.ae() + (long)this.b().h();
      }

      eal $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(aru $$0, iw $$1, UUID $$2) {
      bwv $$3 = $$0.b($$2);
      return $$3 == null || !$$3.bJ() || !$$3.dV().aj().equals($$0.aj()) || $$3.dv().j($$1) > (double)g;
   }

   private static boolean a(djz $$0, ffs $$1, ffs $$2) {
      ffo $$3 = $$0.a(new djg($$2, $$1, djg.a.c, djg.b.a, ffx.a()));
      return $$3.b().equals(iw.a((jq)$$1)) || $$3.d() == ffq.a.a;
   }

   public static void a(djz $$0, iw $$1, azz $$2, md $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lz.ah, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(djz $$0, iw $$1, azz $$2) {
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

   public static void a(djz $$0, iw $$1, azz $$2, int $$3, lx $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(djz $$0, iw $$1, azz $$2) {
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

   public void a(bxe<?> $$0, djz $$1) {
      this.k.a();
      this.i = jg.a(this.i.a().a($$0));
      this.j = jg.a(this.j.a().a($$0));
      this.a($$1, eal.a);
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(eag $$0) {
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

      public static eah.a a(int $$0) {
         eah.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(djz var1, eal var2);

      eal d();

      void f();
   }
}
