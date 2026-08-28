import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eol extends emh {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eol.b l;
   private final eol.a m;

   public eol(eqa $$0, jh $$1, eol.b $$2, eol.a $$3, ali $$4, epz $$5, dor $$6, dna $$7, jh $$8) {
      super(emo.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eol(eqa $$0, uk $$1) {
      super(emo.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eol.b.a($$1.l("VerticalPlacement"));
      this.m = (eol.a)eol.a.a.parse(new Dynamic(uy.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(emn $$0, uk $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eol.a.a.encodeStart(uy.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static epv a(eqa $$0, uk $$1, ali $$2) {
      epz $$3 = $$0.a($$2);
      jh $$4 = new jh($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dna.valueOf($$1.l("Mirror")),
         dor.valueOf($$1.l("Rotation")),
         eol.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eol.a)eol.a.a.parse(new Dynamic(uy.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static epv a(dna $$0, dor $$1, eol.b $$2, jh $$3, eol.a $$4) {
      epa $$5 = $$4.d ? epa.b : epa.d;
      List<epo> $$6 = Lists.newArrayList();
      $$6.add(a(dig.ch, 0.3F, dig.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dig.dV, 0.07F, dig.kJ));
      }

      epv $$7 = new epv().a($$1).a($$0).a($$3).a($$5).a(new eps($$6)).a(new eoz($$4.c)).a(new epp(axa.bP)).a(new eph());
      if ($$4.g) {
         $$7.a(eoy.b);
      }

      return $$7;
   }

   private static epo a(eol.b $$0, eol.a $$1) {
      if ($$0 == eol.b.c) {
         return a(dig.H, dig.kJ);
      } else {
         return $$1.b ? a(dig.H, dig.dV) : a(dig.H, 0.2F, dig.kJ);
      }
   }

   @Override
   public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
      elp $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jh.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dfc)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jh $$1, dfr $$2, azs $$3, elp $$4) {
   }

   private void a(azs $$0, dfc $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dig.ff)) {
         jm $$4 = a($$0);
         jh $$5 = $$2.a($$4);
         dvj $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (die.a($$3.g($$1, $$2), $$4)) {
               dwa $$7 = dra.a($$4.g());
               $$1.a($$5, dig.ff.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azs $$0, dfc $$1, jh $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dig.dV) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dig.aH.m().b(dmn.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azs $$0, dfc $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jh $$4 = new jh($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dig.dV)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azs $$0, dfc $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jm.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azs $$0, dfc $$1) {
      boolean $$2 = this.l == eol.b.a || this.l == eol.b.c;
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

   private boolean a(dfc $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      return !$$2.a(dig.a) && !$$2.a(dig.co) && !$$2.a(axa.bP) && (this.l == eol.b.f || !$$2.a(dig.H));
   }

   private void d(azs $$0, dfc $$1, jh $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dig.kJ.m(), 3);
      } else {
         $$1.a($$2, dig.dV.m(), 3);
      }
   }

   private static int a(dfc $$0, int $$1, int $$2, eol.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ebf.a a(eol.b $$0) {
      return $$0 == eol.b.c ? ebf.a.c : ebf.a.a;
   }

   private static epo a(die $$0, float $$1, die $$2) {
      return new epo(new epq($$0, $$1), eow.b, $$2.m());
   }

   private static epo a(die $$0, die $$1) {
      return new epo(new epb($$0), eow.b, $$1.m());
   }

   public static class a {
      public static final Codec<eol.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eol.a::new)
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

   public static enum b implements bag {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final bag.a<eol.b> g = bag.a(eol.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eol.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
