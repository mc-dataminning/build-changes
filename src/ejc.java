import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ejc extends egz {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ejc.b l;
   private final ejc.a m;

   public ejc(ekq $$0, in $$1, ejc.b $$2, ejc.a $$3, akh $$4, ekp $$5, djr $$6, dib $$7, in $$8) {
      super(ehg.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ejc(ekq $$0, ua $$1) {
      super(ehg.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ejc.b.a($$1.l("VerticalPlacement"));
      this.m = (ejc.a)ejc.a.a.parse(new Dynamic(uo.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(ehf $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ejc.a.a.encodeStart(uo.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ekl a(ekq $$0, ua $$1, akh $$2) {
      ekp $$3 = $$0.a($$2);
      in $$4 = new in($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dib.valueOf($$1.l("Mirror")),
         djr.valueOf($$1.l("Rotation")),
         ejc.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ejc.a)ejc.a.a.parse(new Dynamic(uo.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static ekl a(dib $$0, djr $$1, ejc.b $$2, in $$3, ejc.a $$4) {
      ejr $$5 = $$4.d ? ejr.b : ejr.d;
      List<eke> $$6 = Lists.newArrayList();
      $$6.add(a(ddg.ch, 0.3F, ddg.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(ddg.dV, 0.07F, ddg.kJ));
      }

      ekl $$7 = new ekl().a($$1).a($$0).a($$3).a($$5).a(new eki($$6)).a(new ejq($$4.c)).a(new ekf(avr.bO)).a(new ejy());
      if ($$4.g) {
         $$7.a(ejp.b);
      }

      return $$7;
   }

   private static eke a(ejc.b $$0, ejc.a $$1) {
      if ($$0 == ejc.b.c) {
         return a(ddg.H, ddg.kJ);
      } else {
         return $$1.b ? a(ddg.H, ddg.dV) : a(ddg.H, 0.2F, ddg.kJ);
      }
   }

   @Override
   public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
      egh $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            in.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dae)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, in $$1, das $$2, ayg $$3, egh $$4) {
   }

   private void a(ayg $$0, dae $$1, in $$2) {
      dqh $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(ddg.ff)) {
         is $$4 = a($$0);
         in $$5 = $$2.a($$4);
         dqh $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dde.a($$3.k($$1, $$2), $$4)) {
               dqy $$7 = dma.a($$4.g());
               $$1.a($$5, ddg.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ayg $$0, dae $$1, in $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(ddg.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), ddg.aH.n().a(dho.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ayg $$0, dae $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            in $$4 = new in($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(ddg.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ayg $$0, dae $$1, in $$2) {
      in.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(is.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ayg $$0, dae $$1) {
      boolean $$2 = this.l == ejc.b.a || this.l == ejc.b.c;
      in $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      in.a $$11 = in.c.j();

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

   private boolean a(dae $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      return !$$2.a(ddg.a) && !$$2.a(ddg.co) && !$$2.a(avr.bO) && (this.l == ejc.b.f || !$$2.a(ddg.H));
   }

   private void d(ayg $$0, dae $$1, in $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, ddg.kJ.n(), 3);
      } else {
         $$1.a($$2, ddg.dV.n(), 3);
      }
   }

   private static int a(dae $$0, int $$1, int $$2, ejc.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dvz.a a(ejc.b $$0) {
      return $$0 == ejc.b.c ? dvz.a.c : dvz.a.a;
   }

   private static eke a(dde $$0, float $$1, dde $$2) {
      return new eke(new ekg($$0, $$1), ejn.b, $$2.n());
   }

   private static eke a(dde $$0, dde $$1) {
      return new eke(new ejs($$0), ejn.b, $$1.n());
   }

   public static class a {
      public static final Codec<ejc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ejc.a::new)
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

   public static enum b implements ayt {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ayt.a<ejc.b> g = ayt.a(ejc.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ejc.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
