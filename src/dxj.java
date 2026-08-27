import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dxj extends dvn {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dxj.b l;
   private final dxj.a m;

   public dxj(dyx $$0, gw $$1, dxj.b $$2, dxj.a $$3, aeu $$4, dyw $$5, czc $$6, cxl $$7, gw $$8) {
      super(dvu.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dxj(dyx $$0, qu $$1) {
      super(dvu.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dxj.b.a($$1.l("VerticalPlacement"));
      this.m = (dxj.a)dxj.a.a.parse(new Dynamic(rf.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dvt $$0, qu $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dxj.a.a.encodeStart(rf.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dys a(dyx $$0, qu $$1, aeu $$2) {
      dyw $$3 = $$0.a($$2);
      gw $$4 = new gw($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         cxl.valueOf($$1.l("Mirror")),
         czc.valueOf($$1.l("Rotation")),
         dxj.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dxj.a)dxj.a.a.parse(new Dynamic(rf.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dys a(cxl $$0, czc $$1, dxj.b $$2, gw $$3, dxj.a $$4) {
      dxy $$5 = $$4.d ? dxy.b : dxy.d;
      List<dyl> $$6 = Lists.newArrayList();
      $$6.add(a(csr.ch, 0.3F, csr.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(csr.dW, 0.07F, csr.kJ));
      }

      dys $$7 = new dys().a($$1).a($$0).a($$3).a($$5).a(new dyp($$6)).a(new dxx($$4.c)).a(new dym(apo.bH)).a(new dyf());
      if ($$4.g) {
         $$7.a(dxw.b);
      }

      return $$7;
   }

   private static dyl a(dxj.b $$0, dxj.a $$1) {
      if ($$0 == dxj.b.c) {
         return a(csr.H, csr.kJ);
      } else {
         return $$1.b ? a(csr.H, csr.dW) : a(csr.H, 0.2F, csr.kJ);
      }
   }

   @Override
   public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
      duv $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            gw.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cpr)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, gw $$1, cqf $$2, arx $$3, duv $$4) {
   }

   private void a(arx $$0, cpr $$1, gw $$2) {
      dfe $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(csr.ff)) {
         hc $$4 = a($$0);
         gw $$5 = $$2.a($$4);
         dfe $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (csq.a($$3.k($$1, $$2), $$4)) {
               dfv $$7 = dbk.a($$4.g());
               $$1.a($$5, csr.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(arx $$0, cpr $$1, gw $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(csr.dW) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), csr.aH.n().a(cwx.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(arx $$0, cpr $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            gw $$4 = new gw($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(csr.dW)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(arx $$0, cpr $$1, gw $$2) {
      gw.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(hc.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(arx $$0, cpr $$1) {
      boolean $$2 = this.l == dxj.b.a || this.l == dxj.b.c;
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

   private boolean a(cpr $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      return !$$2.a(csr.a) && !$$2.a(csr.co) && !$$2.a(apo.bH) && (this.l == dxj.b.f || !$$2.a(csr.H));
   }

   private void d(arx $$0, cpr $$1, gw $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, csr.kJ.n(), 3);
      } else {
         $$1.a($$2, csr.dW.n(), 3);
      }
   }

   private static int a(cpr $$0, int $$1, int $$2, dxj.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dkn.a a(dxj.b $$0) {
      return $$0 == dxj.b.c ? dkn.a.c : dkn.a.a;
   }

   private static dyl a(csq $$0, float $$1, csq $$2) {
      return new dyl(new dyn($$0, $$1), dxu.b, $$2.n());
   }

   private static dyl a(csq $$0, csq $$1) {
      return new dyl(new dxz($$0), dxu.b, $$1.n());
   }

   public static class a {
      public static final Codec<dxj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dxj.a::new)
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

   public static enum b implements ask {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ask.a<dxj.b> g = ask.a(dxj.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dxj.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
