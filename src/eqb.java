import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eqb extends enx {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eqb.b l;
   private final eqb.a m;

   public eqb(erq $$0, ji $$1, eqb.b $$2, eqb.a $$3, akv $$4, erp $$5, dqf $$6, dom $$7, ji $$8) {
      super(eoe.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eqb(erq $$0, tq $$1) {
      super(eoe.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eqb.b.a($$1.l("VerticalPlacement"));
      this.m = (eqb.a)eqb.a.a.parse(new Dynamic(ue.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eod $$0, tq $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eqb.a.a.encodeStart(ue.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static erl a(erq $$0, tq $$1, akv $$2) {
      erp $$3 = $$0.a($$2);
      ji $$4 = new ji($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dom.valueOf($$1.l("Mirror")),
         dqf.valueOf($$1.l("Rotation")),
         eqb.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eqb.a)eqb.a.a.parse(new Dynamic(ue.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static erl a(dom $$0, dqf $$1, eqb.b $$2, ji $$3, eqb.a $$4) {
      eqq $$5 = $$4.d ? eqq.b : eqq.d;
      List<ere> $$6 = Lists.newArrayList();
      $$6.add(a(djp.co, 0.3F, djp.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(djp.ei, 0.07F, djp.ll));
      }

      erl $$7 = new erl().a($$1).a($$0).a($$3).a($$5).a(new eri($$6)).a(new eqp($$4.c)).a(new erf(awp.bQ)).a(new eqx());
      if ($$4.g) {
         $$7.a(eqo.b);
      }

      return $$7;
   }

   private static ere a(eqb.b $$0, eqb.a $$1) {
      if ($$0 == eqb.b.c) {
         return a(djp.K, djp.ll);
      } else {
         return $$1.b ? a(djp.K, djp.ei) : a(djp.K, 0.2F, djp.ll);
      }
   }

   @Override
   public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5, ji $$6) {
      enf $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ji.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dgk)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ji $$1, dha $$2, azh $$3, enf $$4) {
   }

   private void a(azh $$0, dgk $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(djp.ft)) {
         jn $$4 = a($$0);
         ji $$5 = $$2.a($$4);
         dwy $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (djn.a($$3.g($$1, $$2), $$4)) {
               dxp $$7 = dso.a($$4.g());
               $$1.a($$5, djp.ft.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azh $$0, dgk $$1, ji $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(djp.ei) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), djp.aN.m().b(dnz.d, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azh $$0, dgk $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ji $$4 = new ji($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(djp.ei)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azh $$0, dgk $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jn.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azh $$0, dgk $$1) {
      boolean $$2 = this.l == eqb.b.a || this.l == eqb.b.c;
      ji $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      ji.a $$11 = ji.c.k();

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

   private boolean a(dgk $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      return !$$2.a(djp.a) && !$$2.a(djp.cv) && !$$2.a(awp.bQ) && (this.l == eqb.b.f || !$$2.a(djp.K));
   }

   private void d(azh $$0, dgk $$1, ji $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, djp.ll.m(), 3);
      } else {
         $$1.a($$2, djp.ei.m(), 3);
      }
   }

   private static int a(dgk $$0, int $$1, int $$2, eqb.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ect.a a(eqb.b $$0) {
      return $$0 == eqb.b.c ? ect.a.c : ect.a.a;
   }

   private static ere a(djn $$0, float $$1, djn $$2) {
      return new ere(new erg($$0, $$1), eqm.b, $$2.m());
   }

   private static ere a(djn $$0, djn $$1) {
      return new ere(new eqr($$0), eqm.b, $$1.m());
   }

   public static class a {
      public static final Codec<eqb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eqb.a::new)
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

   public static enum b implements azv {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azv.a<eqb.b> g = azv.a(eqb.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eqb.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
