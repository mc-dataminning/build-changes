import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eqa extends enw {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eqa.b l;
   private final eqa.a m;

   public eqa(erp $$0, ji $$1, eqa.b $$2, eqa.a $$3, akv $$4, ero $$5, dqe $$6, dol $$7, ji $$8) {
      super(eod.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eqa(erp $$0, tq $$1) {
      super(eod.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eqa.b.a($$1.l("VerticalPlacement"));
      this.m = (eqa.a)eqa.a.a.parse(new Dynamic(ue.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eoc $$0, tq $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eqa.a.a.encodeStart(ue.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static erk a(erp $$0, tq $$1, akv $$2) {
      ero $$3 = $$0.a($$2);
      ji $$4 = new ji($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dol.valueOf($$1.l("Mirror")),
         dqe.valueOf($$1.l("Rotation")),
         eqa.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eqa.a)eqa.a.a.parse(new Dynamic(ue.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static erk a(dol $$0, dqe $$1, eqa.b $$2, ji $$3, eqa.a $$4) {
      eqp $$5 = $$4.d ? eqp.b : eqp.d;
      List<erd> $$6 = Lists.newArrayList();
      $$6.add(a(djo.co, 0.3F, djo.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(djo.ei, 0.07F, djo.ll));
      }

      erk $$7 = new erk().a($$1).a($$0).a($$3).a($$5).a(new erh($$6)).a(new eqo($$4.c)).a(new ere(awp.bQ)).a(new eqw());
      if ($$4.g) {
         $$7.a(eqn.b);
      }

      return $$7;
   }

   private static erd a(eqa.b $$0, eqa.a $$1) {
      if ($$0 == eqa.b.c) {
         return a(djo.K, djo.ll);
      } else {
         return $$1.b ? a(djo.K, djo.ei) : a(djo.K, 0.2F, djo.ll);
      }
   }

   @Override
   public void a(dhg $$0, dhe $$1, dyt $$2, azh $$3, ene $$4, dfo $$5, ji $$6) {
      ene $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ji.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dgj)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ji $$1, dgz $$2, azh $$3, ene $$4) {
   }

   private void a(azh $$0, dgj $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(djo.ft)) {
         jn $$4 = a($$0);
         ji $$5 = $$2.a($$4);
         dwx $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (djm.a($$3.g($$1, $$2), $$4)) {
               dxo $$7 = dsn.a($$4.g());
               $$1.a($$5, djo.ft.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azh $$0, dgj $$1, ji $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(djo.ei) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), djo.aN.m().b(dny.d, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azh $$0, dgj $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ji $$4 = new ji($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(djo.ei)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azh $$0, dgj $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jn.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azh $$0, dgj $$1) {
      boolean $$2 = this.l == eqa.b.a || this.l == eqa.b.c;
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

   private boolean a(dgj $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      return !$$2.a(djo.a) && !$$2.a(djo.cv) && !$$2.a(awp.bQ) && (this.l == eqa.b.f || !$$2.a(djo.K));
   }

   private void d(azh $$0, dgj $$1, ji $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, djo.ll.m(), 3);
      } else {
         $$1.a($$2, djo.ei.m(), 3);
      }
   }

   private static int a(dgj $$0, int $$1, int $$2, eqa.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ecs.a a(eqa.b $$0) {
      return $$0 == eqa.b.c ? ecs.a.c : ecs.a.a;
   }

   private static erd a(djm $$0, float $$1, djm $$2) {
      return new erd(new erf($$0, $$1), eql.b, $$2.m());
   }

   private static erd a(djm $$0, djm $$1) {
      return new erd(new eqq($$0), eql.b, $$1.m());
   }

   public static class a {
      public static final Codec<eqa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eqa.a::new)
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

      public static final azv.a<eqa.b> g = azv.a(eqa.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eqa.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
