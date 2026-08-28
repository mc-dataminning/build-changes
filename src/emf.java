import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class emf extends ekb {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final emf.b l;
   private final emf.a m;

   public emf(enu $$0, jd $$1, emf.b $$2, emf.a $$3, akr $$4, ent $$5, dmm $$6, dkv $$7, jd $$8) {
      super(eki.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public emf(enu $$0, ub $$1) {
      super(eki.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = emf.b.a($$1.l("VerticalPlacement"));
      this.m = (emf.a)emf.a.a.parse(new Dynamic(up.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ekh $$0, ub $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      emf.a.a.encodeStart(up.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static enp a(enu $$0, ub $$1, akr $$2) {
      ent $$3 = $$0.a($$2);
      jd $$4 = new jd($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dkv.valueOf($$1.l("Mirror")),
         dmm.valueOf($$1.l("Rotation")),
         emf.b.a($$1.l("VerticalPlacement")),
         $$4,
         (emf.a)emf.a.a.parse(new Dynamic(up.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static enp a(dkv $$0, dmm $$1, emf.b $$2, jd $$3, emf.a $$4) {
      emu $$5 = $$4.d ? emu.b : emu.d;
      List<eni> $$6 = Lists.newArrayList();
      $$6.add(a(dga.ch, 0.3F, dga.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dga.dV, 0.07F, dga.kJ));
      }

      enp $$7 = new enp().a($$1).a($$0).a($$3).a($$5).a(new enm($$6)).a(new emt($$4.c)).a(new enj(awe.bP)).a(new enb());
      if ($$4.g) {
         $$7.a(ems.b);
      }

      return $$7;
   }

   private static eni a(emf.b $$0, emf.a $$1) {
      if ($$0 == emf.b.c) {
         return a(dga.H, dga.kJ);
      } else {
         return $$1.b ? a(dga.H, dga.dV) : a(dga.H, 0.2F, dga.kJ);
      }
   }

   @Override
   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
      ejj $$7 = this.b.b(this.c, this.d);
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
   protected void a(String $$0, jd $$1, ddl $$2, ayw $$3, ejj $$4) {
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
      boolean $$2 = this.l == emf.b.a || this.l == emf.b.c;
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
      return !$$2.a(dga.a) && !$$2.a(dga.co) && !$$2.a(awe.bP) && (this.l == emf.b.f || !$$2.a(dga.H));
   }

   private void d(ayw $$0, dcx $$1, jd $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dga.kJ.o(), 3);
      } else {
         $$1.a($$2, dga.dV.o(), 3);
      }
   }

   private static int a(dcx $$0, int $$1, int $$2, emf.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dyy.a a(emf.b $$0) {
      return $$0 == emf.b.c ? dyy.a.c : dyy.a.a;
   }

   private static eni a(dfy $$0, float $$1, dfy $$2) {
      return new eni(new enk($$0, $$1), emq.b, $$2.o());
   }

   private static eni a(dfy $$0, dfy $$1) {
      return new eni(new emv($$0), emq.b, $$1.o());
   }

   public static class a {
      public static final Codec<emf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, emf.a::new)
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

      public static final azk.a<emf.b> g = azk.a(emf.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static emf.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
