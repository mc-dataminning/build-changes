import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dxq extends dvu {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dxq.b l;
   private final dxq.a m;

   public dxq(dze $$0, gw $$1, dxq.b $$2, dxq.a $$3, aey $$4, dzd $$5, czj $$6, cxs $$7, gw $$8) {
      super(dwb.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dxq(dze $$0, qy $$1) {
      super(dwb.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dxq.b.a($$1.l("VerticalPlacement"));
      this.m = (dxq.a)dxq.a.a.parse(new Dynamic(rk.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dwa $$0, qy $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dxq.a.a.encodeStart(rk.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dyz a(dze $$0, qy $$1, aey $$2) {
      dzd $$3 = $$0.a($$2);
      gw $$4 = new gw($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         cxs.valueOf($$1.l("Mirror")),
         czj.valueOf($$1.l("Rotation")),
         dxq.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dxq.a)dxq.a.a.parse(new Dynamic(rk.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dyz a(cxs $$0, czj $$1, dxq.b $$2, gw $$3, dxq.a $$4) {
      dyf $$5 = $$4.d ? dyf.b : dyf.d;
      List<dys> $$6 = Lists.newArrayList();
      $$6.add(a(csy.ch, 0.3F, csy.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(csy.dW, 0.07F, csy.kJ));
      }

      dyz $$7 = new dyz().a($$1).a($$0).a($$3).a($$5).a(new dyw($$6)).a(new dye($$4.c)).a(new dyt(apu.bH)).a(new dym());
      if ($$4.g) {
         $$7.a(dyd.b);
      }

      return $$7;
   }

   private static dys a(dxq.b $$0, dxq.a $$1) {
      if ($$0 == dxq.b.c) {
         return a(csy.H, csy.kJ);
      } else {
         return $$1.b ? a(csy.H, csy.dW) : a(csy.H, 0.2F, csy.kJ);
      }
   }

   @Override
   public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
      dvc $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            gw.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cpy)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, gw $$1, cqm $$2, ase $$3, dvc $$4) {
   }

   private void a(ase $$0, cpy $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(csy.ff)) {
         hc $$4 = a($$0);
         gw $$5 = $$2.a($$4);
         dfl $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (csx.a($$3.k($$1, $$2), $$4)) {
               dgc $$7 = dbr.a($$4.g());
               $$1.a($$5, csy.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ase $$0, cpy $$1, gw $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(csy.dW) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), csy.aH.n().a(cxe.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ase $$0, cpy $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            gw $$4 = new gw($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(csy.dW)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ase $$0, cpy $$1, gw $$2) {
      gw.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(hc.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ase $$0, cpy $$1) {
      boolean $$2 = this.l == dxq.b.a || this.l == dxq.b.c;
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

   private boolean a(cpy $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      return !$$2.a(csy.a) && !$$2.a(csy.co) && !$$2.a(apu.bH) && (this.l == dxq.b.f || !$$2.a(csy.H));
   }

   private void d(ase $$0, cpy $$1, gw $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, csy.kJ.n(), 3);
      } else {
         $$1.a($$2, csy.dW.n(), 3);
      }
   }

   private static int a(cpy $$0, int $$1, int $$2, dxq.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dku.a a(dxq.b $$0) {
      return $$0 == dxq.b.c ? dku.a.c : dku.a.a;
   }

   private static dys a(csx $$0, float $$1, csx $$2) {
      return new dys(new dyu($$0, $$1), dyb.b, $$2.n());
   }

   private static dys a(csx $$0, csx $$1) {
      return new dys(new dyg($$0), dyb.b, $$1.n());
   }

   public static class a {
      public static final Codec<dxq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dxq.a::new)
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

   public static enum b implements asr {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final asr.a<dxq.b> g = asr.a(dxq.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dxq.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
