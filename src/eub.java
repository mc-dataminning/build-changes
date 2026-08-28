import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eub extends erx {
   private static final float h = 0.3F;
   private static final float i = 0.07F;
   private static final float j = 0.2F;
   private final eub.b k;
   private final eub.a l;

   public eub(evq $$0, iv $$1, eub.b $$2, eub.a $$3, alg $$4, evp $$5, dtl $$6, dru $$7, iv $$8) {
      super(ese.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.k = $$2;
      this.l = $$3;
   }

   public eub(evq $$0, tz $$1) {
      super(ese.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.k = $$1.<eub.b>a("VerticalPlacement", eub.b.g).orElseThrow();
      this.l = $$1.<eub.a>a("Properties", eub.a.a).orElseThrow();
   }

   @Override
   protected void a(esd $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", dtl.h, this.c.d());
      $$1.a("Mirror", dru.e, this.c.c());
      $$1.a("VerticalPlacement", eub.b.g, this.k);
      $$1.a("Properties", eub.a.a, this.l);
   }

   private static evl a(evq $$0, tz $$1, alg $$2) {
      evp $$3 = $$0.a($$2);
      iv $$4 = new iv($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         $$1.<dru>a("Mirror", dru.e).orElseThrow(),
         $$1.<dtl>a("Rotation", dtl.h).orElseThrow(),
         $$1.<eub.b>a("VerticalPlacement", eub.b.g).orElseThrow(),
         $$4,
         (eub.a)eub.a.a.parse(new Dynamic(un.a, $$1.a("Properties"))).getPartialOrThrow()
      );
   }

   private static evl a(dru $$0, dtl $$1, eub.b $$2, iv $$3, eub.a $$4) {
      euq $$5 = $$4.d ? euq.b : euq.d;
      List<eve> $$6 = Lists.newArrayList();
      $$6.add(a(dmt.cr, 0.3F, dmt.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dmt.em, 0.07F, dmt.lp));
      }

      evl $$7 = new evl().a($$1).a($$0).a($$3).a($$5).a(new evi($$6)).a(new eup($$4.c)).a(new evf(axc.bS)).a(new eux());
      if ($$4.g) {
         $$7.a(euo.b);
      }

      return $$7;
   }

   private static eve a(eub.b $$0, eub.a $$1) {
      if ($$0 == eub.b.c) {
         return a(dmt.K, dmt.lp);
      } else {
         return $$1.b ? a(dmt.K, dmt.em) : a(dmt.K, 0.2F, dmt.lp);
      }
   }

   @Override
   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
      erf $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.l.f || this.l.e) {
            iv.a(this.f()).forEach($$2x -> {
               if (this.l.f) {
                  this.a($$3, (djn)$$0, $$2x);
               }

               if (this.l.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iv $$1, dkd $$2, azv $$3, erf $$4) {
   }

   private void a(azv $$0, djn $$1, iv $$2) {
      eat $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dmt.fx)) {
         jb $$4 = a($$0);
         iv $$5 = $$2.a($$4);
         eat $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dmr.a($$3.g($$1, $$2), $$4)) {
               ebk $$7 = dwe.a($$4.g());
               $$1.a($$5, dmt.fx.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azv $$0, djn $$1, iv $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dmt.em) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dmt.aN.m().b(drh.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azv $$0, djn $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iv $$4 = new iv($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dmt.em)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azv $$0, djn $$1, iv $$2) {
      iv.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jb.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azv $$0, djn $$1) {
      boolean $$2 = this.k == eub.b.a || this.k == eub.b.c;
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

   private boolean a(djn $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      return !$$2.a(dmt.a) && !$$2.a(dmt.cy) && !$$2.a(axc.bS) && (this.k == eub.b.f || !$$2.a(dmt.K));
   }

   private void d(azv $$0, djn $$1, iv $$2) {
      if (!this.l.b && $$0.i() < 0.07F) {
         $$1.a($$2, dmt.lp.m(), 3);
      } else {
         $$1.a($$2, dmt.em.m(), 3);
      }
   }

   private static int a(djn $$0, int $$1, int $$2, eub.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static egs.a a(eub.b $$0) {
      return $$0 == eub.b.c ? egs.a.c : egs.a.a;
   }

   private static eve a(dmr $$0, float $$1, dmr $$2) {
      return new eve(new evg($$0, $$1), eum.b, $$2.m());
   }

   private static eve a(dmr $$0, dmr $$1) {
      return new eve(new eur($$0), eum.b, $$1.m());
   }

   public static class a {
      public static final Codec<eub.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eub.a::new)
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

   public static enum b implements bak {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final Codec<eub.b> g = bak.a(eub.b::values);
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
