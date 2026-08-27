import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ebs extends dzp {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ebs.b l;
   private final ebs.a m;

   public ebs(edg $$0, hx $$1, ebs.b $$2, ebs.a $$3, ahg $$4, edf $$5, ddb $$6, dbl $$7, hx $$8) {
      super(dzw.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ebs(edg $$0, sn $$1) {
      super(dzw.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ebs.b.a($$1.l("VerticalPlacement"));
      this.m = (ebs.a)ebs.a.a.parse(new Dynamic(tb.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dzv $$0, sn $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ebs.a.a.encodeStart(tb.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static edb a(edg $$0, sn $$1, ahg $$2) {
      edf $$3 = $$0.a($$2);
      hx $$4 = new hx($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dbl.valueOf($$1.l("Mirror")),
         ddb.valueOf($$1.l("Rotation")),
         ebs.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ebs.a)ebs.a.a.parse(new Dynamic(tb.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static edb a(dbl $$0, ddb $$1, ebs.b $$2, hx $$3, ebs.a $$4) {
      ech $$5 = $$4.d ? ech.b : ech.d;
      List<ecu> $$6 = Lists.newArrayList();
      $$6.add(a(cwr.ch, 0.3F, cwr.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cwr.dV, 0.07F, cwr.kJ));
      }

      edb $$7 = new edb().a($$1).a($$0).a($$3).a($$5).a(new ecy($$6)).a(new ecg($$4.c)).a(new ecv(asg.bH)).a(new eco());
      if ($$4.g) {
         $$7.a(ecf.b);
      }

      return $$7;
   }

   private static ecu a(ebs.b $$0, ebs.a $$1) {
      if ($$0 == ebs.b.c) {
         return a(cwr.H, cwr.kJ);
      } else {
         return $$1.b ? a(cwr.H, cwr.dV) : a(cwr.H, 0.2F, cwr.kJ);
      }
   }

   @Override
   public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, hx $$6) {
      dyx $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            hx.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (ctp)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, hx $$1, cud $$2, auu $$3, dyx $$4) {
   }

   private void a(auu $$0, ctp $$1, hx $$2) {
      djg $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cwr.ff)) {
         ic $$4 = a($$0);
         hx $$5 = $$2.a($$4);
         djg $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cwp.a($$3.k($$1, $$2), $$4)) {
               djx $$7 = dfj.a($$4.g());
               $$1.a($$5, cwr.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(auu $$0, ctp $$1, hx $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cwr.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cwr.aH.o().a(day.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(auu $$0, ctp $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            hx $$4 = new hx($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(cwr.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(auu $$0, ctp $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ic.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(auu $$0, ctp $$1) {
      boolean $$2 = this.l == ebs.b.a || this.l == ebs.b.c;
      hx $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      hx.a $$11 = hx.b.j();

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

   private boolean a(ctp $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      return !$$2.a(cwr.a) && !$$2.a(cwr.co) && !$$2.a(asg.bH) && (this.l == ebs.b.f || !$$2.a(cwr.H));
   }

   private void d(auu $$0, ctp $$1, hx $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cwr.kJ.o(), 3);
      } else {
         $$1.a($$2, cwr.dV.o(), 3);
      }
   }

   private static int a(ctp $$0, int $$1, int $$2, ebs.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dop.a a(ebs.b $$0) {
      return $$0 == ebs.b.c ? dop.a.c : dop.a.a;
   }

   private static ecu a(cwp $$0, float $$1, cwp $$2) {
      return new ecu(new ecw($$0, $$1), ecd.b, $$2.o());
   }

   private static ecu a(cwp $$0, cwp $$1) {
      return new ecu(new eci($$0), ecd.b, $$1.o());
   }

   public static class a {
      public static final Codec<ebs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ebs.a::new)
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

   public static enum b implements avj {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final avj.a<ebs.b> g = avj.a(ebs.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ebs.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
