import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eow extends ems {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eow.b l;
   private final eow.a m;

   public eow(eql $$0, jh $$1, eow.b $$2, eow.a $$3, alj $$4, eqk $$5, dpd $$6, dnm $$7, jh $$8) {
      super(emz.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eow(eql $$0, ul $$1) {
      super(emz.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eow.b.a($$1.l("VerticalPlacement"));
      this.m = (eow.a)eow.a.a.parse(new Dynamic(uz.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(emy $$0, ul $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eow.a.a.encodeStart(uz.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static eqg a(eql $$0, ul $$1, alj $$2) {
      eqk $$3 = $$0.a($$2);
      jh $$4 = new jh($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dnm.valueOf($$1.l("Mirror")),
         dpd.valueOf($$1.l("Rotation")),
         eow.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eow.a)eow.a.a.parse(new Dynamic(uz.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static eqg a(dnm $$0, dpd $$1, eow.b $$2, jh $$3, eow.a $$4) {
      epl $$5 = $$4.d ? epl.b : epl.d;
      List<epz> $$6 = Lists.newArrayList();
      $$6.add(a(dis.ch, 0.3F, dis.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dis.dV, 0.07F, dis.kJ));
      }

      eqg $$7 = new eqg().a($$1).a($$0).a($$3).a($$5).a(new eqd($$6)).a(new epk($$4.c)).a(new eqa(axc.bP)).a(new eps());
      if ($$4.g) {
         $$7.a(epj.b);
      }

      return $$7;
   }

   private static epz a(eow.b $$0, eow.a $$1) {
      if ($$0 == eow.b.c) {
         return a(dis.H, dis.kJ);
      } else {
         return $$1.b ? a(dis.H, dis.dV) : a(dis.H, 0.2F, dis.kJ);
      }
   }

   @Override
   public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
      ema $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jh.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dfn)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jh $$1, dgd $$2, azu $$3, ema $$4) {
   }

   private void a(azu $$0, dfn $$1, jh $$2) {
      dvv $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dis.ff)) {
         jm $$4 = a($$0);
         jh $$5 = $$2.a($$4);
         dvv $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (diq.a($$3.g($$1, $$2), $$4)) {
               dwm $$7 = drm.a($$4.g());
               $$1.a($$5, dis.ff.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azu $$0, dfn $$1, jh $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dis.dV) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dis.aH.m().b(dmz.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azu $$0, dfn $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jh $$4 = new jh($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dis.dV)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azu $$0, dfn $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jm.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azu $$0, dfn $$1) {
      boolean $$2 = this.l == eow.b.a || this.l == eow.b.c;
      jh $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      jh.a $$11 = jh.c.k();

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

   private boolean a(dfn $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      return !$$2.a(dis.a) && !$$2.a(dis.co) && !$$2.a(axc.bP) && (this.l == eow.b.f || !$$2.a(dis.H));
   }

   private void d(azu $$0, dfn $$1, jh $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dis.kJ.m(), 3);
      } else {
         $$1.a($$2, dis.dV.m(), 3);
      }
   }

   private static int a(dfn $$0, int $$1, int $$2, eow.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ebq.a a(eow.b $$0) {
      return $$0 == eow.b.c ? ebq.a.c : ebq.a.a;
   }

   private static epz a(diq $$0, float $$1, diq $$2) {
      return new epz(new eqb($$0, $$1), eph.b, $$2.m());
   }

   private static epz a(diq $$0, diq $$1) {
      return new epz(new epm($$0), eph.b, $$1.m());
   }

   public static class a {
      public static final Codec<eow.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eow.a::new)
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

   public static enum b implements bai {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final bai.a<eow.b> g = bai.a(eow.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eow.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
