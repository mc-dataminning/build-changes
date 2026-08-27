import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dxd extends dvh {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dxd.b l;
   private final dxd.a m;

   public dxd(dyr $$0, gv $$1, dxd.b $$2, dxd.a $$3, aep $$4, dyq $$5, cyw $$6, cxf $$7, gv $$8) {
      super(dvo.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dxd(dyr $$0, qs $$1) {
      super(dvo.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dxd.b.a($$1.l("VerticalPlacement"));
      this.m = (dxd.a)dxd.a.a.parse(new Dynamic(rd.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dvn $$0, qs $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dxd.a.a.encodeStart(rd.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dym a(dyr $$0, qs $$1, aep $$2) {
      dyq $$3 = $$0.a($$2);
      gv $$4 = new gv($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         cxf.valueOf($$1.l("Mirror")),
         cyw.valueOf($$1.l("Rotation")),
         dxd.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dxd.a)dxd.a.a.parse(new Dynamic(rd.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dym a(cxf $$0, cyw $$1, dxd.b $$2, gv $$3, dxd.a $$4) {
      dxs $$5 = $$4.d ? dxs.b : dxs.d;
      List<dyf> $$6 = Lists.newArrayList();
      $$6.add(a(csl.ch, 0.3F, csl.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(csl.dW, 0.07F, csl.kJ));
      }

      dym $$7 = new dym().a($$1).a($$0).a($$3).a($$5).a(new dyj($$6)).a(new dxr($$4.c)).a(new dyg(apj.bH)).a(new dxz());
      if ($$4.g) {
         $$7.a(dxq.b);
      }

      return $$7;
   }

   private static dyf a(dxd.b $$0, dxd.a $$1) {
      if ($$0 == dxd.b.c) {
         return a(csl.H, csl.kJ);
      } else {
         return $$1.b ? a(csl.H, csl.dW) : a(csl.H, 0.2F, csl.kJ);
      }
   }

   @Override
   public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
      dup $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            gv.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cpl)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, gv $$1, cpz $$2, art $$3, dup $$4) {
   }

   private void a(art $$0, cpl $$1, gv $$2) {
      dey $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(csl.ff)) {
         hb $$4 = a($$0);
         gv $$5 = $$2.a($$4);
         dey $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (csk.a($$3.k($$1, $$2), $$4)) {
               dfp $$7 = dbe.a($$4.g());
               $$1.a($$5, csl.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(art $$0, cpl $$1, gv $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(csl.dW) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), csl.aH.n().a(cwr.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(art $$0, cpl $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            gv $$4 = new gv($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(csl.dW)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(art $$0, cpl $$1, gv $$2) {
      gv.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(hb.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(art $$0, cpl $$1) {
      boolean $$2 = this.l == dxd.b.a || this.l == dxd.b.c;
      gv $$3 = this.f.f();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.c() + this.f.e()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      gv.a $$11 = gv.b.j();

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

   private boolean a(cpl $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      return !$$2.a(csl.a) && !$$2.a(csl.co) && !$$2.a(apj.bH) && (this.l == dxd.b.f || !$$2.a(csl.H));
   }

   private void d(art $$0, cpl $$1, gv $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, csl.kJ.n(), 3);
      } else {
         $$1.a($$2, csl.dW.n(), 3);
      }
   }

   private static int a(cpl $$0, int $$1, int $$2, dxd.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dkh.a a(dxd.b $$0) {
      return $$0 == dxd.b.c ? dkh.a.c : dkh.a.a;
   }

   private static dyf a(csk $$0, float $$1, csk $$2) {
      return new dyf(new dyh($$0, $$1), dxo.b, $$2.n());
   }

   private static dyf a(csk $$0, csk $$1) {
      return new dyf(new dxt($$0), dxo.b, $$1.n());
   }

   public static class a {
      public static final Codec<dxd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dxd.a::new)
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

   public static enum b implements asf {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final asf.a<dxd.b> g = asf.a(dxd.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dxd.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
