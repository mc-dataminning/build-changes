import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class emg extends ekd {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final emg.b l;
   private final emg.a m;

   public emg(enu $$0, ir $$1, emg.b $$2, emg.a $$3, akt $$4, ent $$5, dmd $$6, dke $$7, ir $$8) {
      super(ekk.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public emg(enu $$0, uk $$1) {
      super(ekk.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = emg.b.a($$1.l("VerticalPlacement"));
      this.m = (emg.a)emg.a.a.parse(new Dynamic(uy.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(ekj $$0, uk $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      emg.a.a.encodeStart(uy.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static enp a(enu $$0, uk $$1, akt $$2) {
      ent $$3 = $$0.a($$2);
      ir $$4 = new ir($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dke.valueOf($$1.l("Mirror")),
         dmd.valueOf($$1.l("Rotation")),
         emg.b.a($$1.l("VerticalPlacement")),
         $$4,
         (emg.a)emg.a.a.parse(new Dynamic(uy.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static enp a(dke $$0, dmd $$1, emg.b $$2, ir $$3, emg.a $$4) {
      emv $$5 = $$4.d ? emv.b : emv.d;
      List<eni> $$6 = Lists.newArrayList();
      if (!$$4.h) {
         $$6.add(a(dfe.cS, 0.3F, dfe.a));
         $$6.add(a($$2, $$4));
         if (!$$4.b) {
            $$6.add(a(dfe.eJ, 0.07F, dfe.lH));
         }
      }

      enp $$7 = new enp().a($$1).a($$0).a($$3).a($$5);
      if (!$$6.isEmpty()) {
         $$7.a(new enm($$6));
      }

      $$7.a(new emu($$4.c, $$4.h));
      $$7.a(new enj(awe.bR));
      if ($$4.h) {
         $$7.a(new enc());
      }

      if ($$4.g) {
         $$7.a(emt.b);
      }

      return $$7;
   }

   private static eni a(emg.b $$0, emg.a $$1) {
      if ($$0 == emg.b.c) {
         return a(dfe.am, dfe.lH);
      } else {
         return $$1.b ? a(dfe.am, dfe.eJ) : a(dfe.am, 0.2F, dfe.lH);
      }
   }

   @Override
   public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
      ejl $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ir.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dcb)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ir $$1, dcp $$2, ayt $$3, ejl $$4) {
   }

   private void a(ayt $$0, dcb $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dfe.fX)) {
         iw $$4 = a($$0);
         ir $$5 = $$2.a($$4);
         dtc $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dfc.a($$3.k($$1, $$2), $$4)) {
               dtt $$7 = doo.a($$4.g());
               $$1.a($$5, dfe.fX.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ayt $$0, dcb $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2);
      if ($$0.i() < 0.5F && ($$3.a(dfe.eJ) || $$3.a(dfe.n)) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dfe.bp.n().a(djq.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ayt $$0, dcb $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ir $$4 = new ir($$2, this.f.i(), $$3);
            dtc $$5 = $$1.a_($$4);
            if ($$5.a(dfe.eJ) || $$5.a(dfe.n)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ayt $$0, dcb $$1, ir $$2) {
      ir.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.d(iw.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ayt $$0, dcb $$1) {
      boolean $$2 = this.l == emg.b.a || this.l == emg.b.c;
      ir $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      ir.a $$11 = ir.c.j();

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

   private boolean a(dcb $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      return !$$2.a(dfe.a) && !$$2.a(dfe.cZ) && !$$2.a(awe.bR) && (this.l == emg.b.f || !$$2.a(dfe.am));
   }

   private void d(ayt $$0, dcb $$1, ir $$2) {
      if (this.m.h) {
         $$1.a($$2, dfe.n.n(), 3);
      } else {
         if (!this.m.b && $$0.i() < 0.07F) {
            $$1.a($$2, dfe.lH.n(), 3);
         } else {
            $$1.a($$2, dfe.eJ.n(), 3);
         }
      }
   }

   private static int a(dcb $$0, int $$1, int $$2, emg.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dyu.a a(emg.b $$0) {
      return $$0 == emg.b.c ? dyu.a.c : dyu.a.a;
   }

   private static eni a(dfc $$0, float $$1, dfc $$2) {
      return new eni(new enk($$0, $$1), emr.b, $$2.n());
   }

   private static eni a(dfc $$0, dfc $$1) {
      return new eni(new emw($$0), emr.b, $$1.n());
   }

   public static class a {
      public static final Codec<emg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g),
                  Codec.BOOL.optionalFieldOf("potato", false).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, emg.a::new)
      );
      public boolean b;
      public float c;
      public boolean d;
      public boolean e;
      public boolean f;
      public boolean g;
      public boolean h;

      public a() {
      }

      public a(boolean $$0, float $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.h = $$6;
      }
   }

   public static enum b implements azg {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azg.a<emg.b> g = azg.a(emg.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static emg.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
