import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dug extends dsk {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dug.b l;
   private final dug.a m;

   public dug(dvu $$0, gu $$1, dug.b $$2, dug.a $$3, acq $$4, dvt $$5, cvz $$6, cui $$7, gu $$8) {
      super(dsr.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dug(dvu $$0, qr $$1) {
      super(dsr.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dug.b.a($$1.l("VerticalPlacement"));
      this.m = (dug.a)dug.a.a.parse(new Dynamic(rc.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dsq $$0, qr $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dug.a.a.encodeStart(rc.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dvp a(dvu $$0, qr $$1, acq $$2) {
      dvt $$3 = $$0.a($$2);
      gu $$4 = new gu($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         cui.valueOf($$1.l("Mirror")),
         cvz.valueOf($$1.l("Rotation")),
         dug.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dug.a)dug.a.a.parse(new Dynamic(rc.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dvp a(cui $$0, cvz $$1, dug.b $$2, gu $$3, dug.a $$4) {
      duv $$5 = $$4.d ? duv.b : duv.d;
      List<dvi> $$6 = Lists.newArrayList();
      $$6.add(a(cpo.ch, 0.3F, cpo.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cpo.dW, 0.07F, cpo.kJ));
      }

      dvp $$7 = new dvp().a($$1).a($$0).a($$3).a($$5).a(new dvm($$6)).a(new duu($$4.c)).a(new dvj(amw.bF)).a(new dvc());
      if ($$4.g) {
         $$7.a(dut.b);
      }

      return $$7;
   }

   private static dvi a(dug.b $$0, dug.a $$1) {
      if ($$0 == dug.b.c) {
         return a(cpo.H, cpo.kJ);
      } else {
         return $$1.b ? a(cpo.H, cpo.dW) : a(cpo.H, 0.2F, cpo.kJ);
      }
   }

   @Override
   public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
      drs $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            gu.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cmn)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, gu $$1, cnb $$2, apf $$3, drs $$4) {
   }

   private void a(apf $$0, cmn $$1, gu $$2) {
      dcb $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cpo.ff)) {
         ha $$4 = a($$0);
         gu $$5 = $$2.a($$4);
         dcb $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cpn.a($$3.k($$1, $$2), $$4)) {
               dcs $$7 = cyh.a($$4.g());
               $$1.a($$5, cpo.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(apf $$0, cmn $$1, gu $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cpo.dW) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cpo.aH.n().a(ctu.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(apf $$0, cmn $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            gu $$4 = new gu($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(cpo.dW)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(apf $$0, cmn $$1, gu $$2) {
      gu.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ha.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(apf $$0, cmn $$1) {
      boolean $$2 = this.l == dug.b.a || this.l == dug.b.c;
      gu $$3 = this.f.f();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.c() + this.f.e()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      gu.a $$11 = gu.b.j();

      for (int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; $$12++) {
         for (int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; $$13++) {
            int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
            int $$15 = Math.max(0, $$14 + $$9);
            if ($$15 < $$7) {
               float $$16 = $$6[$$15];
               if ($$0.j() < (double)$$16) {
                  int $$17 = a($$1, $$12, $$13, this.l);
                  int $$18 = $$2 ? $$17 : Math.min(this.f.h(), $$17);
                  $$11.d($$12, $$18, $$13);
                  if (Math.abs($$18 - this.f.h()) <= 3 && this.a($$1, $$11)) {
                     this.d($$0, $$1, $$11);
                     if (this.m.e) {
                        this.b($$0, $$1, $$11);
                     }

                     this.c($$0, $$1, $$11.d());
                  }
               }
            }
         }
      }
   }

   private boolean a(cmn $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      return !$$2.a(cpo.a) && !$$2.a(cpo.co) && !$$2.a(amw.bF) && (this.l == dug.b.f || !$$2.a(cpo.H));
   }

   private void d(apf $$0, cmn $$1, gu $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cpo.kJ.n(), 3);
      } else {
         $$1.a($$2, cpo.dW.n(), 3);
      }
   }

   private static int a(cmn $$0, int $$1, int $$2, dug.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dhk.a a(dug.b $$0) {
      return $$0 == dug.b.c ? dhk.a.c : dhk.a.a;
   }

   private static dvi a(cpn $$0, float $$1, cpn $$2) {
      return new dvi(new dvk($$0, $$1), dur.b, $$2.n());
   }

   private static dvi a(cpn $$0, cpn $$1) {
      return new dvi(new duw($$0), dur.b, $$1.n());
   }

   public static class a {
      public static final Codec<dug.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dug.a::new)
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

   public static enum b implements apr {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final apr.a<dug.b> g = apr.a(dug.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dug.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
