import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eur extends esn {
   private static final float h = 0.3F;
   private static final float i = 0.07F;
   private static final float j = 0.2F;
   private final eur.b k;
   private final eur.a l;

   public eur(ewg $$0, iw $$1, eur.b $$2, eur.a $$3, alk $$4, ewf $$5, dty $$6, dsh $$7, iw $$8) {
      super(esu.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.k = $$2;
      this.l = $$3;
   }

   public eur(ewg $$0, ua $$1) {
      super(esu.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.k = $$1.<eur.b>a("VerticalPlacement", eur.b.g).orElseThrow();
      this.l = $$1.<eur.a>a("Properties", eur.a.a).orElseThrow();
   }

   @Override
   protected void a(est $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", dty.h, this.c.d());
      $$1.a("Mirror", dsh.e, this.c.c());
      $$1.a("VerticalPlacement", eur.b.g, this.k);
      $$1.a("Properties", eur.a.a, this.l);
   }

   private static ewb a(ewg $$0, ua $$1, alk $$2) {
      ewf $$3 = $$0.a($$2);
      iw $$4 = new iw($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         $$1.<dsh>a("Mirror", dsh.e).orElseThrow(),
         $$1.<dty>a("Rotation", dty.h).orElseThrow(),
         $$1.<eur.b>a("VerticalPlacement", eur.b.g).orElseThrow(),
         $$4,
         (eur.a)eur.a.a.parse(new Dynamic(uo.a, $$1.a("Properties"))).getPartialOrThrow()
      );
   }

   private static ewb a(dsh $$0, dty $$1, eur.b $$2, iw $$3, eur.a $$4) {
      evg $$5 = $$4.d ? evg.b : evg.d;
      List<evu> $$6 = Lists.newArrayList();
      $$6.add(a(dng.cr, 0.3F, dng.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dng.em, 0.07F, dng.lp));
      }

      ewb $$7 = new ewb().a($$1).a($$0).a($$3).a($$5).a(new evy($$6)).a(new evf($$4.c)).a(new evv(axg.bS)).a(new evn());
      if ($$4.g) {
         $$7.a(eve.b);
      }

      return $$7;
   }

   private static evu a(eur.b $$0, eur.a $$1) {
      if ($$0 == eur.b.c) {
         return a(dng.K, dng.lp);
      } else {
         return $$1.b ? a(dng.K, dng.em) : a(dng.K, 0.2F, dng.lp);
      }
   }

   @Override
   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
      erv $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.l.f || this.l.e) {
            iw.a(this.f()).forEach($$2x -> {
               if (this.l.f) {
                  this.a($$3, (dka)$$0, $$2x);
               }

               if (this.l.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iw $$1, dkq $$2, azz $$3, erv $$4) {
   }

   private void a(azz $$0, dka $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dng.fx)) {
         jc $$4 = a($$0);
         iw $$5 = $$2.a($$4);
         ebg $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dne.a($$3.g($$1, $$2), $$4)) {
               ebx $$7 = dwr.a($$4.g());
               $$1.a($$5, dng.fx.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azz $$0, dka $$1, iw $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dng.em) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dng.aN.m().b(dru.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azz $$0, dka $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iw $$4 = new iw($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dng.em)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azz $$0, dka $$1, iw $$2) {
      iw.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jc.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azz $$0, dka $$1) {
      boolean $$2 = this.k == eur.b.a || this.k == eur.b.c;
      iw $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      iw.a $$11 = iw.c.k();

      for (int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; $$12++) {
         for (int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; $$13++) {
            int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
            int $$15 = Math.max(0, $$14 + $$9);
            if ($$15 < $$7) {
               float $$16 = $$6[$$15];
               if ($$0.j() < (double)$$16) {
                  int $$17 = a($$1, $$12, $$13, this.k);
                  int $$18 = $$2 ? $$17 : Math.min(this.f.i(), $$17);
                  $$11.d($$12, $$18, $$13);
                  if (Math.abs($$18 - this.f.i()) <= 3 && this.a($$1, $$11)) {
                     this.d($$0, $$1, $$11);
                     if (this.l.e) {
                        this.b($$0, $$1, $$11);
                     }

                     this.c($$0, $$1, $$11.e());
                  }
               }
            }
         }
      }
   }

   private boolean a(dka $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      return !$$2.a(dng.a) && !$$2.a(dng.cy) && !$$2.a(axg.bS) && (this.k == eur.b.f || !$$2.a(dng.K));
   }

   private void d(azz $$0, dka $$1, iw $$2) {
      if (!this.l.b && $$0.i() < 0.07F) {
         $$1.a($$2, dng.lp.m(), 3);
      } else {
         $$1.a($$2, dng.em.m(), 3);
      }
   }

   private static int a(dka $$0, int $$1, int $$2, eur.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ehf.a a(eur.b $$0) {
      return $$0 == eur.b.c ? ehf.a.c : ehf.a.a;
   }

   private static evu a(dne $$0, float $$1, dne $$2) {
      return new evu(new evw($$0, $$1), evc.b, $$2.m());
   }

   private static evu a(dne $$0, dne $$1) {
      return new evu(new evh($$0), evc.b, $$1.m());
   }

   public static class a {
      public static final Codec<eur.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eur.a::new)
      );
      public boolean b;
      public float c;
      public boolean d;
      public boolean e;
      public boolean f;
      public boolean g;

      public a() {
      }

      public a(boolean $$0, float $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }
   }

   public static enum b implements bao {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final Codec<eur.b> g = bao.a(eur.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
