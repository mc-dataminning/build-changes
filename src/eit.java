import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eit extends egq {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eit.b l;
   private final eit.a m;

   public eit(ekh $$0, im $$1, eit.b $$2, eit.a $$3, akf $$4, ekg $$5, dji $$6, dhs $$7, im $$8) {
      super(egx.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eit(ekh $$0, ty $$1) {
      super(egx.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eit.b.a($$1.l("VerticalPlacement"));
      this.m = (eit.a)eit.a.a.parse(new Dynamic(um.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(egw $$0, ty $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eit.a.a.encodeStart(um.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ekc a(ekh $$0, ty $$1, akf $$2) {
      ekg $$3 = $$0.a($$2);
      im $$4 = new im($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dhs.valueOf($$1.l("Mirror")),
         dji.valueOf($$1.l("Rotation")),
         eit.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eit.a)eit.a.a.parse(new Dynamic(um.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static ekc a(dhs $$0, dji $$1, eit.b $$2, im $$3, eit.a $$4) {
      eji $$5 = $$4.d ? eji.b : eji.d;
      List<ejv> $$6 = Lists.newArrayList();
      $$6.add(a(dcx.ch, 0.3F, dcx.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dcx.dV, 0.07F, dcx.kJ));
      }

      ekc $$7 = new ekc().a($$1).a($$0).a($$3).a($$5).a(new ejz($$6)).a(new ejh($$4.c)).a(new ejw(avo.bI)).a(new ejp());
      if ($$4.g) {
         $$7.a(ejg.b);
      }

      return $$7;
   }

   private static ejv a(eit.b $$0, eit.a $$1) {
      if ($$0 == eit.b.c) {
         return a(dcx.H, dcx.kJ);
      } else {
         return $$1.b ? a(dcx.H, dcx.dV) : a(dcx.H, 0.2F, dcx.kJ);
      }
   }

   @Override
   public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
      efy $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            im.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (czv)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, im $$1, daj $$2, ayd $$3, efy $$4) {
   }

   private void a(ayd $$0, czv $$1, im $$2) {
      dpy $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dcx.ff)) {
         ir $$4 = a($$0);
         im $$5 = $$2.a($$4);
         dpy $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dcv.a($$3.k($$1, $$2), $$4)) {
               dqp $$7 = dlr.a($$4.g());
               $$1.a($$5, dcx.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ayd $$0, czv $$1, im $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dcx.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dcx.aH.n().a(dhf.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ayd $$0, czv $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            im $$4 = new im($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dcx.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ayd $$0, czv $$1, im $$2) {
      im.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ir.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ayd $$0, czv $$1) {
      boolean $$2 = this.l == eit.b.a || this.l == eit.b.c;
      im $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      im.a $$11 = im.c.j();

      for (int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; $$12++) {
         for (int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; $$13++) {
            int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
            int $$15 = Math.max(0, $$14 + $$9);
            if ($$15 < $$7) {
               float $$16 = $$6[$$15];
               if ($$0.j() < (double)$$16) {
                  int $$17 = a($$1, $$12, $$13, this.l);
                  int $$18 = $$2 ? $$17 : Math.min(this.f.i(), $$17);
                  $$11.d($$12, $$18, $$13);
                  if (Math.abs($$18 - this.f.i()) <= 3 && this.a($$1, $$11)) {
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

   private boolean a(czv $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      return !$$2.a(dcx.a) && !$$2.a(dcx.co) && !$$2.a(avo.bI) && (this.l == eit.b.f || !$$2.a(dcx.H));
   }

   private void d(ayd $$0, czv $$1, im $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dcx.kJ.n(), 3);
      } else {
         $$1.a($$2, dcx.dV.n(), 3);
      }
   }

   private static int a(czv $$0, int $$1, int $$2, eit.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dvq.a a(eit.b $$0) {
      return $$0 == eit.b.c ? dvq.a.c : dvq.a.a;
   }

   private static ejv a(dcv $$0, float $$1, dcv $$2) {
      return new ejv(new ejx($$0, $$1), eje.b, $$2.n());
   }

   private static ejv a(dcv $$0, dcv $$1) {
      return new ejv(new ejj($$0), eje.b, $$1.n());
   }

   public static class a {
      public static final Codec<eit.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eit.a::new)
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

   public static enum b implements ayq {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ayq.a<eit.b> g = ayq.a(eit.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eit.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
