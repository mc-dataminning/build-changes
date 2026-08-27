import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dxi extends dvm {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dxi.b l;
   private final dxi.a m;

   public dxi(dyw $$0, gw $$1, dxi.b $$2, dxi.a $$3, aez $$4, dyv $$5, czn $$6, cxx $$7, gw $$8) {
      super(dvt.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dxi(dyw $$0, qw $$1) {
      super(dvt.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dxi.b.a($$1.l("VerticalPlacement"));
      this.m = (dxi.a)dxi.a.a.parse(new Dynamic(ri.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dvs $$0, qw $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dxi.a.a.encodeStart(ri.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dyr a(dyw $$0, qw $$1, aez $$2) {
      dyv $$3 = $$0.a($$2);
      gw $$4 = new gw($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         cxx.valueOf($$1.l("Mirror")),
         czn.valueOf($$1.l("Rotation")),
         dxi.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dxi.a)dxi.a.a.parse(new Dynamic(ri.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dyr a(cxx $$0, czn $$1, dxi.b $$2, gw $$3, dxi.a $$4) {
      dxx $$5 = $$4.d ? dxx.b : dxx.d;
      List<dyk> $$6 = Lists.newArrayList();
      $$6.add(a(cte.ch, 0.3F, cte.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cte.dV, 0.07F, cte.kJ));
      }

      dyr $$7 = new dyr().a($$1).a($$0).a($$3).a($$5).a(new dyo($$6)).a(new dxw($$4.c)).a(new dyl(apv.bH)).a(new dye());
      if ($$4.g) {
         $$7.a(dxv.b);
      }

      return $$7;
   }

   private static dyk a(dxi.b $$0, dxi.a $$1) {
      if ($$0 == dxi.b.c) {
         return a(cte.H, cte.kJ);
      } else {
         return $$1.b ? a(cte.H, cte.dV) : a(cte.H, 0.2F, cte.kJ);
      }
   }

   @Override
   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
      duu $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            gw.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cqc)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, gw $$1, cqq $$2, ash $$3, duu $$4) {
   }

   private void a(ash $$0, cqc $$1, gw $$2) {
      dfd $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cte.ff)) {
         ha $$4 = a($$0);
         gw $$5 = $$2.a($$4);
         dfd $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (ctc.a($$3.k($$1, $$2), $$4)) {
               dfu $$7 = dbt.a($$4.g());
               $$1.a($$5, cte.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ash $$0, cqc $$1, gw $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cte.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cte.aH.o().a(cxk.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ash $$0, cqc $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            gw $$4 = new gw($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(cte.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ash $$0, cqc $$1, gw $$2) {
      gw.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ha.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ash $$0, cqc $$1) {
      boolean $$2 = this.l == dxi.b.a || this.l == dxi.b.c;
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

   private boolean a(cqc $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      return !$$2.a(cte.a) && !$$2.a(cte.co) && !$$2.a(apv.bH) && (this.l == dxi.b.f || !$$2.a(cte.H));
   }

   private void d(ash $$0, cqc $$1, gw $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cte.kJ.o(), 3);
      } else {
         $$1.a($$2, cte.dV.o(), 3);
      }
   }

   private static int a(cqc $$0, int $$1, int $$2, dxi.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dkm.a a(dxi.b $$0) {
      return $$0 == dxi.b.c ? dkm.a.c : dkm.a.a;
   }

   private static dyk a(ctc $$0, float $$1, ctc $$2) {
      return new dyk(new dym($$0, $$1), dxt.b, $$2.o());
   }

   private static dyk a(ctc $$0, ctc $$1) {
      return new dyk(new dxy($$0), dxt.b, $$1.o());
   }

   public static class a {
      public static final Codec<dxi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dxi.a::new)
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

   public static enum b implements asu {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final asu.a<dxi.b> g = asu.a(dxi.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dxi.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
