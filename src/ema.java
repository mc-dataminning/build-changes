import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ema extends ejw {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ema.b l;
   private final ema.a m;

   public ema(eno $$0, jd $$1, ema.b $$2, ema.a $$3, akq $$4, enn $$5, dmk $$6, dkt $$7, jd $$8) {
      super(ekd.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ema(eno $$0, ua $$1) {
      super(ekd.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ema.b.a($$1.l("VerticalPlacement"));
      this.m = (ema.a)ema.a.a.parse(new Dynamic(uo.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ekc $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ema.a.a.encodeStart(uo.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static enj a(eno $$0, ua $$1, akq $$2) {
      enn $$3 = $$0.a($$2);
      jd $$4 = new jd($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dkt.valueOf($$1.l("Mirror")),
         dmk.valueOf($$1.l("Rotation")),
         ema.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ema.a)ema.a.a.parse(new Dynamic(uo.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static enj a(dkt $$0, dmk $$1, ema.b $$2, jd $$3, ema.a $$4) {
      emp $$5 = $$4.d ? emp.b : emp.d;
      List<enc> $$6 = Lists.newArrayList();
      $$6.add(a(dfy.ch, 0.3F, dfy.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dfy.dV, 0.07F, dfy.kJ));
      }

      enj $$7 = new enj().a($$1).a($$0).a($$3).a($$5).a(new eng($$6)).a(new emo($$4.c)).a(new end(awd.bO)).a(new emw());
      if ($$4.g) {
         $$7.a(emn.b);
      }

      return $$7;
   }

   private static enc a(ema.b $$0, ema.a $$1) {
      if ($$0 == ema.b.c) {
         return a(dfy.H, dfy.kJ);
      } else {
         return $$1.b ? a(dfy.H, dfy.dV) : a(dfy.H, 0.2F, dfy.kJ);
      }
   }

   @Override
   public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
      eje $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jd.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dcv)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jd $$1, ddj $$2, ayv $$3, eje $$4) {
   }

   private void a(ayv $$0, dcv $$1, jd $$2) {
      dta $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dfy.ff)) {
         ji $$4 = a($$0);
         jd $$5 = $$2.a($$4);
         dta $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dfw.a($$3.k($$1, $$2), $$4)) {
               dtr $$7 = dot.a($$4.g());
               $$1.a($$5, dfy.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ayv $$0, dcv $$1, jd $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dfy.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dfy.aH.o().a(dkg.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ayv $$0, dcv $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jd $$4 = new jd($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dfy.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ayv $$0, dcv $$1, jd $$2) {
      jd.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ji.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ayv $$0, dcv $$1) {
      boolean $$2 = this.l == ema.b.a || this.l == ema.b.c;
      jd $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      jd.a $$11 = jd.c.j();

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

   private boolean a(dcv $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      return !$$2.a(dfy.a) && !$$2.a(dfy.co) && !$$2.a(awd.bO) && (this.l == ema.b.f || !$$2.a(dfy.H));
   }

   private void d(ayv $$0, dcv $$1, jd $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dfy.kJ.o(), 3);
      } else {
         $$1.a($$2, dfy.dV.o(), 3);
      }
   }

   private static int a(dcv $$0, int $$1, int $$2, ema.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dyv.a a(ema.b $$0) {
      return $$0 == ema.b.c ? dyv.a.c : dyv.a.a;
   }

   private static enc a(dfw $$0, float $$1, dfw $$2) {
      return new enc(new ene($$0, $$1), eml.b, $$2.o());
   }

   private static enc a(dfw $$0, dfw $$1) {
      return new enc(new emq($$0), eml.b, $$1.o());
   }

   public static class a {
      public static final Codec<ema.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ema.a::new)
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

   public static enum b implements azj {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azj.a<ema.b> g = azj.a(ema.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ema.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
