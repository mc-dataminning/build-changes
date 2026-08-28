import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eup extends esl {
   private static final float h = 0.3F;
   private static final float i = 0.07F;
   private static final float j = 0.2F;
   private final eup.b k;
   private final eup.a l;

   public eup(ewe $$0, iv $$1, eup.b $$2, eup.a $$3, ali $$4, ewd $$5, dtw $$6, dsf $$7, iv $$8) {
      super(ess.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.k = $$2;
      this.l = $$3;
   }

   public eup(ewe $$0, tz $$1) {
      super(ess.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.k = $$1.<eup.b>a("VerticalPlacement", eup.b.g).orElseThrow();
      this.l = $$1.<eup.a>a("Properties", eup.a.a).orElseThrow();
   }

   @Override
   protected void a(esr $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", dtw.h, this.c.d());
      $$1.a("Mirror", dsf.e, this.c.c());
      $$1.a("VerticalPlacement", eup.b.g, this.k);
      $$1.a("Properties", eup.a.a, this.l);
   }

   private static evz a(ewe $$0, tz $$1, ali $$2) {
      ewd $$3 = $$0.a($$2);
      iv $$4 = new iv($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         $$1.<dsf>a("Mirror", dsf.e).orElseThrow(),
         $$1.<dtw>a("Rotation", dtw.h).orElseThrow(),
         $$1.<eup.b>a("VerticalPlacement", eup.b.g).orElseThrow(),
         $$4,
         (eup.a)eup.a.a.parse(new Dynamic(un.a, $$1.a("Properties"))).getPartialOrThrow()
      );
   }

   private static evz a(dsf $$0, dtw $$1, eup.b $$2, iv $$3, eup.a $$4) {
      eve $$5 = $$4.d ? eve.b : eve.d;
      List<evs> $$6 = Lists.newArrayList();
      $$6.add(a(dne.cr, 0.3F, dne.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dne.em, 0.07F, dne.lp));
      }

      evz $$7 = new evz().a($$1).a($$0).a($$3).a($$5).a(new evw($$6)).a(new evd($$4.c)).a(new evt(axe.bS)).a(new evl());
      if ($$4.g) {
         $$7.a(evc.b);
      }

      return $$7;
   }

   private static evs a(eup.b $$0, eup.a $$1) {
      if ($$0 == eup.b.c) {
         return a(dne.K, dne.lp);
      } else {
         return $$1.b ? a(dne.K, dne.em) : a(dne.K, 0.2F, dne.lp);
      }
   }

   @Override
   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
      ert $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.l.f || this.l.e) {
            iv.a(this.f()).forEach($$2x -> {
               if (this.l.f) {
                  this.a($$3, (djy)$$0, $$2x);
               }

               if (this.l.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iv $$1, dko $$2, azx $$3, ert $$4) {
   }

   private void a(azx $$0, djy $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dne.fx)) {
         jb $$4 = a($$0);
         iv $$5 = $$2.a($$4);
         ebe $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dnc.a($$3.g($$1, $$2), $$4)) {
               ebv $$7 = dwp.a($$4.g());
               $$1.a($$5, dne.fx.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azx $$0, djy $$1, iv $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dne.em) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dne.aN.m().b(drs.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azx $$0, djy $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iv $$4 = new iv($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dne.em)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azx $$0, djy $$1, iv $$2) {
      iv.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jb.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azx $$0, djy $$1) {
      boolean $$2 = this.k == eup.b.a || this.k == eup.b.c;
      iv $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      iv.a $$11 = iv.c.k();

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

   private boolean a(djy $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      return !$$2.a(dne.a) && !$$2.a(dne.cy) && !$$2.a(axe.bS) && (this.k == eup.b.f || !$$2.a(dne.K));
   }

   private void d(azx $$0, djy $$1, iv $$2) {
      if (!this.l.b && $$0.i() < 0.07F) {
         $$1.a($$2, dne.lp.m(), 3);
      } else {
         $$1.a($$2, dne.em.m(), 3);
      }
   }

   private static int a(djy $$0, int $$1, int $$2, eup.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ehd.a a(eup.b $$0) {
      return $$0 == eup.b.c ? ehd.a.c : ehd.a.a;
   }

   private static evs a(dnc $$0, float $$1, dnc $$2) {
      return new evs(new evu($$0, $$1), eva.b, $$2.m());
   }

   private static evs a(dnc $$0, dnc $$1) {
      return new evs(new evf($$0), eva.b, $$1.m());
   }

   public static class a {
      public static final Codec<eup.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eup.a::new)
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

   public static enum b implements bam {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final Codec<eup.b> g = bam.a(eup.b::values);
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
