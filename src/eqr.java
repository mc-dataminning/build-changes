import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eqr extends eon {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eqr.b l;
   private final eqr.a m;

   public eqr(esg $$0, jh $$1, eqr.b $$2, eqr.a $$3, alp $$4, esf $$5, dqv $$6, dpc $$7, jh $$8) {
      super(eou.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eqr(esg $$0, um $$1) {
      super(eou.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eqr.b.a($$1.l("VerticalPlacement"));
      this.m = (eqr.a)eqr.a.a.parse(new Dynamic(va.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eot $$0, um $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eqr.a.a.encodeStart(va.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static esb a(esg $$0, um $$1, alp $$2) {
      esf $$3 = $$0.a($$2);
      jh $$4 = new jh($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dpc.valueOf($$1.l("Mirror")),
         dqv.valueOf($$1.l("Rotation")),
         eqr.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eqr.a)eqr.a.a.parse(new Dynamic(va.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static esb a(dpc $$0, dqv $$1, eqr.b $$2, jh $$3, eqr.a $$4) {
      erg $$5 = $$4.d ? erg.b : erg.d;
      List<eru> $$6 = Lists.newArrayList();
      $$6.add(a(dkf.co, 0.3F, dkf.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dkf.ei, 0.07F, dkf.ll));
      }

      esb $$7 = new esb().a($$1).a($$0).a($$3).a($$5).a(new ery($$6)).a(new erf($$4.c)).a(new erv(axk.bQ)).a(new ern());
      if ($$4.g) {
         $$7.a(ere.b);
      }

      return $$7;
   }

   private static eru a(eqr.b $$0, eqr.a $$1) {
      if ($$0 == eqr.b.c) {
         return a(dkf.K, dkf.ll);
      } else {
         return $$1.b ? a(dkf.K, dkf.ei) : a(dkf.K, 0.2F, dkf.ll);
      }
   }

   @Override
   public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
      env $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jh.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dha)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jh $$1, dhq $$2, bac $$3, env $$4) {
   }

   private void a(bac $$0, dha $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dkf.ft)) {
         jm $$4 = a($$0);
         jh $$5 = $$2.a($$4);
         dxo $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dkd.a($$3.g($$1, $$2), $$4)) {
               dyf $$7 = dte.a($$4.g());
               $$1.a($$5, dkf.ft.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(bac $$0, dha $$1, jh $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dkf.ei) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dkf.aN.m().b(dop.d, Boolean.valueOf(true)), 3);
      }
   }

   private void a(bac $$0, dha $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jh $$4 = new jh($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dkf.ei)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(bac $$0, dha $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jm.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(bac $$0, dha $$1) {
      boolean $$2 = this.l == eqr.b.a || this.l == eqr.b.c;
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

   private boolean a(dha $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      return !$$2.a(dkf.a) && !$$2.a(dkf.cv) && !$$2.a(axk.bQ) && (this.l == eqr.b.f || !$$2.a(dkf.K));
   }

   private void d(bac $$0, dha $$1, jh $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dkf.ll.m(), 3);
      } else {
         $$1.a($$2, dkf.ei.m(), 3);
      }
   }

   private static int a(dha $$0, int $$1, int $$2, eqr.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static edj.a a(eqr.b $$0) {
      return $$0 == eqr.b.c ? edj.a.c : edj.a.a;
   }

   private static eru a(dkd $$0, float $$1, dkd $$2) {
      return new eru(new erw($$0, $$1), erc.b, $$2.m());
   }

   private static eru a(dkd $$0, dkd $$1) {
      return new eru(new erh($$0), erc.b, $$1.m());
   }

   public static class a {
      public static final Codec<eqr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eqr.a::new)
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

   public static enum b implements baq {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final baq.a<eqr.b> g = baq.a(eqr.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eqr.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
