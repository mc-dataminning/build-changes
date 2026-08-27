import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dxe extends dvi {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dxe.b l;
   private final dxe.a m;

   public dxe(dys $$0, gu $$1, dxe.b $$2, dxe.a $$3, aer $$4, dyr $$5, cyx $$6, cxg $$7, gu $$8) {
      super(dvp.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dxe(dys $$0, qr $$1) {
      super(dvp.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dxe.b.a($$1.l("VerticalPlacement"));
      this.m = (dxe.a)dxe.a.a.parse(new Dynamic(rc.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dvo $$0, qr $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dxe.a.a.encodeStart(rc.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dyn a(dys $$0, qr $$1, aer $$2) {
      dyr $$3 = $$0.a($$2);
      gu $$4 = new gu($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         cxg.valueOf($$1.l("Mirror")),
         cyx.valueOf($$1.l("Rotation")),
         dxe.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dxe.a)dxe.a.a.parse(new Dynamic(rc.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dyn a(cxg $$0, cyx $$1, dxe.b $$2, gu $$3, dxe.a $$4) {
      dxt $$5 = $$4.d ? dxt.b : dxt.d;
      List<dyg> $$6 = Lists.newArrayList();
      $$6.add(a(csm.ch, 0.3F, csm.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(csm.dW, 0.07F, csm.kJ));
      }

      dyn $$7 = new dyn().a($$1).a($$0).a($$3).a($$5).a(new dyk($$6)).a(new dxs($$4.c)).a(new dyh(apl.bH)).a(new dya());
      if ($$4.g) {
         $$7.a(dxr.b);
      }

      return $$7;
   }

   private static dyg a(dxe.b $$0, dxe.a $$1) {
      if ($$0 == dxe.b.c) {
         return a(csm.H, csm.kJ);
      } else {
         return $$1.b ? a(csm.H, csm.dW) : a(csm.H, 0.2F, csm.kJ);
      }
   }

   @Override
   public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
      duq $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            gu.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cpm)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, gu $$1, cqa $$2, aru $$3, duq $$4) {
   }

   private void a(aru $$0, cpm $$1, gu $$2) {
      dez $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(csm.ff)) {
         ha $$4 = a($$0);
         gu $$5 = $$2.a($$4);
         dez $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (csl.a($$3.k($$1, $$2), $$4)) {
               dfq $$7 = dbf.a($$4.g());
               $$1.a($$5, csm.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(aru $$0, cpm $$1, gu $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(csm.dW) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), csm.aH.n().a(cws.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(aru $$0, cpm $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            gu $$4 = new gu($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(csm.dW)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(aru $$0, cpm $$1, gu $$2) {
      gu.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ha.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(aru $$0, cpm $$1) {
      boolean $$2 = this.l == dxe.b.a || this.l == dxe.b.c;
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

   private boolean a(cpm $$0, gu $$1) {
      dez $$2 = $$0.a_($$1);
      return !$$2.a(csm.a) && !$$2.a(csm.co) && !$$2.a(apl.bH) && (this.l == dxe.b.f || !$$2.a(csm.H));
   }

   private void d(aru $$0, cpm $$1, gu $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, csm.kJ.n(), 3);
      } else {
         $$1.a($$2, csm.dW.n(), 3);
      }
   }

   private static int a(cpm $$0, int $$1, int $$2, dxe.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dki.a a(dxe.b $$0) {
      return $$0 == dxe.b.c ? dki.a.c : dki.a.a;
   }

   private static dyg a(csl $$0, float $$1, csl $$2) {
      return new dyg(new dyi($$0, $$1), dxp.b, $$2.n());
   }

   private static dyg a(csl $$0, csl $$1) {
      return new dyg(new dxu($$0), dxp.b, $$1.n());
   }

   public static class a {
      public static final Codec<dxe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dxe.a::new)
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

   public static enum b implements ash {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ash.a<dxe.b> g = ash.a(dxe.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dxe.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
