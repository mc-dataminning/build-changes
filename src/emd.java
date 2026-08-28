import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class emd extends ejz {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final emd.b l;
   private final emd.a m;

   public emd(ens $$0, jd $$1, emd.b $$2, emd.a $$3, akr $$4, enr $$5, dmm $$6, dkv $$7, jd $$8) {
      super(ekg.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public emd(ens $$0, ub $$1) {
      super(ekg.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = emd.b.a($$1.l("VerticalPlacement"));
      this.m = (emd.a)emd.a.a.parse(new Dynamic(up.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ekf $$0, ub $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      emd.a.a.encodeStart(up.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static enn a(ens $$0, ub $$1, akr $$2) {
      enr $$3 = $$0.a($$2);
      jd $$4 = new jd($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dkv.valueOf($$1.l("Mirror")),
         dmm.valueOf($$1.l("Rotation")),
         emd.b.a($$1.l("VerticalPlacement")),
         $$4,
         (emd.a)emd.a.a.parse(new Dynamic(up.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static enn a(dkv $$0, dmm $$1, emd.b $$2, jd $$3, emd.a $$4) {
      ems $$5 = $$4.d ? ems.b : ems.d;
      List<eng> $$6 = Lists.newArrayList();
      $$6.add(a(dga.ch, 0.3F, dga.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dga.dV, 0.07F, dga.kJ));
      }

      enn $$7 = new enn().a($$1).a($$0).a($$3).a($$5).a(new enk($$6)).a(new emr($$4.c)).a(new enh(awe.bO)).a(new emz());
      if ($$4.g) {
         $$7.a(emq.b);
      }

      return $$7;
   }

   private static eng a(emd.b $$0, emd.a $$1) {
      if ($$0 == emd.b.c) {
         return a(dga.H, dga.kJ);
      } else {
         return $$1.b ? a(dga.H, dga.dV) : a(dga.H, 0.2F, dga.kJ);
      }
   }

   @Override
   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
      ejh $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jd.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dcx)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jd $$1, ddl $$2, ayw $$3, ejh $$4) {
   }

   private void a(ayw $$0, dcx $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dga.ff)) {
         ji $$4 = a($$0);
         jd $$5 = $$2.a($$4);
         dtc $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dfy.a($$3.k($$1, $$2), $$4)) {
               dtt $$7 = dov.a($$4.g());
               $$1.a($$5, dga.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ayw $$0, dcx $$1, jd $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dga.dV) && $$1.a_($$2.d()).i()) {
         $$1.a($$2.d(), dga.aH.o().a(dki.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ayw $$0, dcx $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jd $$4 = new jd($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dga.dV)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(ayw $$0, dcx $$1, jd $$2) {
      jd.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ji.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ayw $$0, dcx $$1) {
      boolean $$2 = this.l == emd.b.a || this.l == emd.b.c;
      jd $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      jd.a $$11 = jd.c.k();

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

                     this.c($$0, $$1, $$11.e());
                  }
               }
            }
         }
      }
   }

   private boolean a(dcx $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      return !$$2.a(dga.a) && !$$2.a(dga.co) && !$$2.a(awe.bO) && (this.l == emd.b.f || !$$2.a(dga.H));
   }

   private void d(ayw $$0, dcx $$1, jd $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dga.kJ.o(), 3);
      } else {
         $$1.a($$2, dga.dV.o(), 3);
      }
   }

   private static int a(dcx $$0, int $$1, int $$2, emd.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dyy.a a(emd.b $$0) {
      return $$0 == emd.b.c ? dyy.a.c : dyy.a.a;
   }

   private static eng a(dfy $$0, float $$1, dfy $$2) {
      return new eng(new eni($$0, $$1), emo.b, $$2.o());
   }

   private static eng a(dfy $$0, dfy $$1) {
      return new eng(new emt($$0), emo.b, $$1.o());
   }

   public static class a {
      public static final Codec<emd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, emd.a::new)
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

   public static enum b implements azk {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azk.a<emd.b> g = azk.a(emd.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static emd.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
