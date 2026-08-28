import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evb extends esx {
   private static final float h = 0.3F;
   private static final float i = 0.07F;
   private static final float j = 0.2F;
   private final evb.b k;
   private final evb.a l;

   public evb(ewq $$0, iw $$1, evb.b $$2, evb.a $$3, alr $$4, ewp $$5, dui $$6, dsr $$7, iw $$8) {
      super(ete.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.k = $$2;
      this.l = $$3;
   }

   public evb(ewq $$0, ua $$1) {
      super(ete.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.k = $$1.<evb.b>a("VerticalPlacement", evb.b.g).orElseThrow();
      this.l = $$1.<evb.a>a("Properties", evb.a.a).orElseThrow();
   }

   @Override
   protected void a(etd $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", dui.h, this.c.d());
      $$1.a("Mirror", dsr.e, this.c.c());
      $$1.a("VerticalPlacement", evb.b.g, this.k);
      $$1.a("Properties", evb.a.a, this.l);
   }

   private static ewl a(ewq $$0, ua $$1, alr $$2) {
      ewp $$3 = $$0.a($$2);
      iw $$4 = new iw($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         $$1.<dsr>a("Mirror", dsr.e).orElseThrow(),
         $$1.<dui>a("Rotation", dui.h).orElseThrow(),
         $$1.<evb.b>a("VerticalPlacement", evb.b.g).orElseThrow(),
         $$4,
         (evb.a)evb.a.a.parse(new Dynamic(uo.a, $$1.a("Properties"))).getPartialOrThrow()
      );
   }

   private static ewl a(dsr $$0, dui $$1, evb.b $$2, iw $$3, evb.a $$4) {
      evq $$5 = $$4.d ? evq.b : evq.d;
      List<ewe> $$6 = Lists.newArrayList();
      $$6.add(a(dnq.cr, 0.3F, dnq.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dnq.em, 0.07F, dnq.lp));
      }

      ewl $$7 = new ewl().a($$1).a($$0).a($$3).a($$5).a(new ewi($$6)).a(new evp($$4.c)).a(new ewf(axn.bS)).a(new evx());
      if ($$4.g) {
         $$7.a(evo.b);
      }

      return $$7;
   }

   private static ewe a(evb.b $$0, evb.a $$1) {
      if ($$0 == evb.b.c) {
         return a(dnq.K, dnq.lp);
      } else {
         return $$1.b ? a(dnq.K, dnq.em) : a(dnq.K, 0.2F, dnq.lp);
      }
   }

   @Override
   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
      esf $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.l.f || this.l.e) {
            iw.a(this.f()).forEach($$2x -> {
               if (this.l.f) {
                  this.a($$3, (dkk)$$0, $$2x);
               }

               if (this.l.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iw $$1, dla $$2, bai $$3, esf $$4) {
   }

   private void a(bai $$0, dkk $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dnq.fx)) {
         jc $$4 = a($$0);
         iw $$5 = $$2.a($$4);
         ebq $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dno.a($$3.g($$1, $$2), $$4)) {
               ech $$7 = dxb.a($$4.g());
               $$1.a($$5, dnq.fx.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(bai $$0, dkk $$1, iw $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dnq.em) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dnq.aN.m().b(dse.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(bai $$0, dkk $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iw $$4 = new iw($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dnq.em)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(bai $$0, dkk $$1, iw $$2) {
      iw.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jc.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(bai $$0, dkk $$1) {
      boolean $$2 = this.k == evb.b.a || this.k == evb.b.c;
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

   private boolean a(dkk $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      return !$$2.a(dnq.a) && !$$2.a(dnq.cy) && !$$2.a(axn.bS) && (this.k == evb.b.f || !$$2.a(dnq.K));
   }

   private void d(bai $$0, dkk $$1, iw $$2) {
      if (!this.l.b && $$0.i() < 0.07F) {
         $$1.a($$2, dnq.lp.m(), 3);
      } else {
         $$1.a($$2, dnq.em.m(), 3);
      }
   }

   private static int a(dkk $$0, int $$1, int $$2, evb.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ehp.a a(evb.b $$0) {
      return $$0 == evb.b.c ? ehp.a.c : ehp.a.a;
   }

   private static ewe a(dno $$0, float $$1, dno $$2) {
      return new ewe(new ewg($$0, $$1), evm.b, $$2.m());
   }

   private static ewe a(dno $$0, dno $$1) {
      return new ewe(new evr($$0), evm.b, $$1.m());
   }

   public static class a {
      public static final Codec<evb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, evb.a::new)
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

   public static enum b implements bax {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final Codec<evb.b> g = bax.a(evb.b::values);
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
