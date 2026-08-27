import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dxo extends dvs {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dxo.b l;
   private final dxo.a m;

   public dxo(dzc $$0, gw $$1, dxo.b $$2, dxo.a $$3, aex $$4, dzb $$5, czh $$6, cxq $$7, gw $$8) {
      super(dvz.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dxo(dzc $$0, qy $$1) {
      super(dvz.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dxo.b.a($$1.l("VerticalPlacement"));
      this.m = (dxo.a)dxo.a.a.parse(new Dynamic(rj.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dvy $$0, qy $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dxo.a.a.encodeStart(rj.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dyx a(dzc $$0, qy $$1, aex $$2) {
      dzb $$3 = $$0.a($$2);
      gw $$4 = new gw($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         cxq.valueOf($$1.l("Mirror")),
         czh.valueOf($$1.l("Rotation")),
         dxo.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dxo.a)dxo.a.a.parse(new Dynamic(rj.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dyx a(cxq $$0, czh $$1, dxo.b $$2, gw $$3, dxo.a $$4) {
      dyd $$5 = $$4.d ? dyd.b : dyd.d;
      List<dyq> $$6 = Lists.newArrayList();
      $$6.add(a(csw.ch, 0.3F, csw.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(csw.dW, 0.07F, csw.kJ));
      }

      dyx $$7 = new dyx().a($$1).a($$0).a($$3).a($$5).a(new dyu($$6)).a(new dyc($$4.c)).a(new dyr(apt.bH)).a(new dyk());
      if ($$4.g) {
         $$7.a(dyb.b);
      }

      return $$7;
   }

   private static dyq a(dxo.b $$0, dxo.a $$1) {
      if ($$0 == dxo.b.c) {
         return a(csw.H, csw.kJ);
      } else {
         return $$1.b ? a(csw.H, csw.dW) : a(csw.H, 0.2F, csw.kJ);
      }
   }

   @Override
   public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, gw $$6) {
      dva $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            gw.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cpw)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, gw $$1, cqk $$2, asc $$3, dva $$4) {
   }

   private void a(asc $$0, cpw $$1, gw $$2) {
      dfj $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(csw.ff)) {
         hc $$4 = a($$0);
         gw $$5 = $$2.a($$4);
         dfj $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (csv.a($$3.k($$1, $$2), $$4)) {
               dga $$7 = dbp.a($$4.g());
               $$1.a($$5, csw.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(asc $$0, cpw $$1, gw $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(csw.dW) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), csw.aH.n().a(cxc.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(asc $$0, cpw $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            gw $$4 = new gw($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(csw.dW)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(asc $$0, cpw $$1, gw $$2) {
      gw.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(hc.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(asc $$0, cpw $$1) {
      boolean $$2 = this.l == dxo.b.a || this.l == dxo.b.c;
      gw $$3 = this.f.f();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.c() + this.f.e()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      gw.a $$11 = gw.b.j();

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

   private boolean a(cpw $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      return !$$2.a(csw.a) && !$$2.a(csw.co) && !$$2.a(apt.bH) && (this.l == dxo.b.f || !$$2.a(csw.H));
   }

   private void d(asc $$0, cpw $$1, gw $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, csw.kJ.n(), 3);
      } else {
         $$1.a($$2, csw.dW.n(), 3);
      }
   }

   private static int a(cpw $$0, int $$1, int $$2, dxo.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dks.a a(dxo.b $$0) {
      return $$0 == dxo.b.c ? dks.a.c : dks.a.a;
   }

   private static dyq a(csv $$0, float $$1, csv $$2) {
      return new dyq(new dys($$0, $$1), dxz.b, $$2.n());
   }

   private static dyq a(csv $$0, csv $$1) {
      return new dyq(new dye($$0), dxz.b, $$1.n());
   }

   public static class a {
      public static final Codec<dxo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dxo.a::new)
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

   public static enum b implements asp {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final asp.a<dxo.b> g = asp.a(dxo.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dxo.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
