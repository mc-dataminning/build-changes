import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class epy extends enu {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final epy.b l;
   private final epy.a m;

   public epy(ern $$0, ji $$1, epy.b $$2, epy.a $$3, aku $$4, erm $$5, dqc $$6, doj $$7, ji $$8) {
      super(eob.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public epy(ern $$0, tq $$1) {
      super(eob.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = epy.b.a($$1.l("VerticalPlacement"));
      this.m = (epy.a)epy.a.a.parse(new Dynamic(ue.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eoa $$0, tq $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      epy.a.a.encodeStart(ue.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static eri a(ern $$0, tq $$1, aku $$2) {
      erm $$3 = $$0.a($$2);
      ji $$4 = new ji($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         doj.valueOf($$1.l("Mirror")),
         dqc.valueOf($$1.l("Rotation")),
         epy.b.a($$1.l("VerticalPlacement")),
         $$4,
         (epy.a)epy.a.a.parse(new Dynamic(ue.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static eri a(doj $$0, dqc $$1, epy.b $$2, ji $$3, epy.a $$4) {
      eqn $$5 = $$4.d ? eqn.b : eqn.d;
      List<erb> $$6 = Lists.newArrayList();
      $$6.add(a(djm.co, 0.3F, djm.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(djm.ei, 0.07F, djm.ll));
      }

      eri $$7 = new eri().a($$1).a($$0).a($$3).a($$5).a(new erf($$6)).a(new eqm($$4.c)).a(new erc(awo.bQ)).a(new equ());
      if ($$4.g) {
         $$7.a(eql.b);
      }

      return $$7;
   }

   private static erb a(epy.b $$0, epy.a $$1) {
      if ($$0 == epy.b.c) {
         return a(djm.K, djm.ll);
      } else {
         return $$1.b ? a(djm.K, djm.ei) : a(djm.K, 0.2F, djm.ll);
      }
   }

   @Override
   public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, ji $$6) {
      enc $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ji.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dgh)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ji $$1, dgx $$2, azg $$3, enc $$4) {
   }

   private void a(azg $$0, dgh $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(djm.ft)) {
         jn $$4 = a($$0);
         ji $$5 = $$2.a($$4);
         dwv $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (djk.a($$3.g($$1, $$2), $$4)) {
               dxm $$7 = dsl.a($$4.g());
               $$1.a($$5, djm.ft.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azg $$0, dgh $$1, ji $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(djm.ei) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), djm.aN.m().b(dnw.d, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azg $$0, dgh $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ji $$4 = new ji($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(djm.ei)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azg $$0, dgh $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jn.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azg $$0, dgh $$1) {
      boolean $$2 = this.l == epy.b.a || this.l == epy.b.c;
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

   private boolean a(dgh $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      return !$$2.a(djm.a) && !$$2.a(djm.cv) && !$$2.a(awo.bQ) && (this.l == epy.b.f || !$$2.a(djm.K));
   }

   private void d(azg $$0, dgh $$1, ji $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, djm.ll.m(), 3);
      } else {
         $$1.a($$2, djm.ei.m(), 3);
      }
   }

   private static int a(dgh $$0, int $$1, int $$2, epy.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ecq.a a(epy.b $$0) {
      return $$0 == epy.b.c ? ecq.a.c : ecq.a.a;
   }

   private static erb a(djk $$0, float $$1, djk $$2) {
      return new erb(new erd($$0, $$1), eqj.b, $$2.m());
   }

   private static erb a(djk $$0, djk $$1) {
      return new erb(new eqo($$0), eqj.b, $$1.m());
   }

   public static class a {
      public static final Codec<epy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, epy.a::new)
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

   public static enum b implements azu {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azu.a<epy.b> g = azu.a(epy.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static epy.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
