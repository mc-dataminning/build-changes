import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class enu extends elq {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final enu.b l;
   private final enu.a m;

   public enu(epj $$0, jf $$1, enu.b $$2, enu.a $$3, ale $$4, epi $$5, doa $$6, dmj $$7, jf $$8) {
      super(elx.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public enu(epj $$0, ug $$1) {
      super(elx.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = enu.b.a($$1.l("VerticalPlacement"));
      this.m = (enu.a)enu.a.a.parse(new Dynamic(uu.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(elw $$0, ug $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      enu.a.a.encodeStart(uu.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static epe a(epj $$0, ug $$1, ale $$2) {
      epi $$3 = $$0.a($$2);
      jf $$4 = new jf($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dmj.valueOf($$1.l("Mirror")),
         doa.valueOf($$1.l("Rotation")),
         enu.b.a($$1.l("VerticalPlacement")),
         $$4,
         (enu.a)enu.a.a.parse(new Dynamic(uu.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static epe a(dmj $$0, doa $$1, enu.b $$2, jf $$3, enu.a $$4) {
      eoj $$5 = $$4.d ? eoj.b : eoj.d;
      List<eox> $$6 = Lists.newArrayList();
      $$6.add(a(dho.ch, 0.3F, dho.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dho.dV, 0.07F, dho.kJ));
      }

      epe $$7 = new epe().a($$1).a($$0).a($$3).a($$5).a(new epb($$6)).a(new eoi($$4.c)).a(new eoy(awv.bP)).a(new eoq());
      if ($$4.g) {
         $$7.a(eoh.b);
      }

      return $$7;
   }

   private static eox a(enu.b $$0, enu.a $$1) {
      if ($$0 == enu.b.c) {
         return a(dho.H, dho.kJ);
      } else {
         return $$1.b ? a(dho.H, dho.dV) : a(dho.H, 0.2F, dho.kJ);
      }
   }

   @Override
   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
      eky $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jf.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dek)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jf $$1, dez $$2, azn $$3, eky $$4) {
   }

   private void a(azn $$0, dek $$1, jf $$2) {
      dus $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dho.ff)) {
         jk $$4 = a($$0);
         jf $$5 = $$2.a($$4);
         dus $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dhm.a($$3.g($$1, $$2), $$4)) {
               dvj $$7 = dqj.a($$4.g());
               $$1.a($$5, dho.ff.n().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azn $$0, dek $$1, jf $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dho.dV) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dho.aH.n().b(dlw.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azn $$0, dek $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jf $$4 = new jf($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dho.dV)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azn $$0, dek $$1, jf $$2) {
      jf.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jk.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azn $$0, dek $$1) {
      boolean $$2 = this.l == enu.b.a || this.l == enu.b.c;
      jf $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      jf.a $$11 = jf.c.k();

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

   private boolean a(dek $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      return !$$2.a(dho.a) && !$$2.a(dho.co) && !$$2.a(awv.bP) && (this.l == enu.b.f || !$$2.a(dho.H));
   }

   private void d(azn $$0, dek $$1, jf $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dho.kJ.n(), 3);
      } else {
         $$1.a($$2, dho.dV.n(), 3);
      }
   }

   private static int a(dek $$0, int $$1, int $$2, enu.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static eao.a a(enu.b $$0) {
      return $$0 == enu.b.c ? eao.a.c : eao.a.a;
   }

   private static eox a(dhm $$0, float $$1, dhm $$2) {
      return new eox(new eoz($$0, $$1), eof.b, $$2.n());
   }

   private static eox a(dhm $$0, dhm $$1) {
      return new eox(new eok($$0), eof.b, $$1.n());
   }

   public static class a {
      public static final Codec<enu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, enu.a::new)
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

   public static enum b implements bab {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final bab.a<enu.b> g = bab.a(enu.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static enu.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
