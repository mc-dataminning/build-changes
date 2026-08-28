import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class esw extends eqs {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final esw.b l;
   private final esw.a m;

   public esw(eul $$0, iu $$1, esw.b $$2, esw.a $$3, ale $$4, euk $$5, dsm $$6, dqv $$7, iu $$8) {
      super(eqz.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public esw(eul $$0, tx $$1) {
      super(eqz.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = esw.b.a($$1.l("VerticalPlacement"));
      this.m = (esw.a)esw.a.a.parse(new Dynamic(ul.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eqy $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      esw.a.a.encodeStart(ul.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static eug a(eul $$0, tx $$1, ale $$2) {
      euk $$3 = $$0.a($$2);
      iu $$4 = new iu($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dqv.valueOf($$1.l("Mirror")),
         dsm.valueOf($$1.l("Rotation")),
         esw.b.a($$1.l("VerticalPlacement")),
         $$4,
         (esw.a)esw.a.a.parse(new Dynamic(ul.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static eug a(dqv $$0, dsm $$1, esw.b $$2, iu $$3, esw.a $$4) {
      etl $$5 = $$4.d ? etl.b : etl.d;
      List<etz> $$6 = Lists.newArrayList();
      $$6.add(a(dlw.co, 0.3F, dlw.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dlw.ei, 0.07F, dlw.ll));
      }

      eug $$7 = new eug().a($$1).a($$0).a($$3).a($$5).a(new eud($$6)).a(new etk($$4.c)).a(new eua(axa.bR)).a(new ets());
      if ($$4.g) {
         $$7.a(etj.b);
      }

      return $$7;
   }

   private static etz a(esw.b $$0, esw.a $$1) {
      if ($$0 == esw.b.c) {
         return a(dlw.K, dlw.ll);
      } else {
         return $$1.b ? a(dlw.K, dlw.ei) : a(dlw.K, 0.2F, dlw.ll);
      }
   }

   @Override
   public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, iu $$6) {
      eqa $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            iu.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (diq)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iu $$1, djg $$2, azt $$3, eqa $$4) {
   }

   private void a(azt $$0, diq $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dlw.ft)) {
         ja $$4 = a($$0);
         iu $$5 = $$2.a($$4);
         dzo $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dlu.a($$3.g($$1, $$2), $$4)) {
               eaf $$7 = dva.a($$4.g());
               $$1.a($$5, dlw.ft.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azt $$0, diq $$1, iu $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dlw.ei) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dlw.aN.m().b(dqi.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azt $$0, diq $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iu $$4 = new iu($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dlw.ei)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azt $$0, diq $$1, iu $$2) {
      iu.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ja.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azt $$0, diq $$1) {
      boolean $$2 = this.l == esw.b.a || this.l == esw.b.c;
      iu $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      iu.a $$11 = iu.c.k();

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

   private boolean a(diq $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      return !$$2.a(dlw.a) && !$$2.a(dlw.cv) && !$$2.a(axa.bR) && (this.l == esw.b.f || !$$2.a(dlw.K));
   }

   private void d(azt $$0, diq $$1, iu $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dlw.ll.m(), 3);
      } else {
         $$1.a($$2, dlw.ei.m(), 3);
      }
   }

   private static int a(diq $$0, int $$1, int $$2, esw.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static efn.a a(esw.b $$0) {
      return $$0 == esw.b.c ? efn.a.c : efn.a.a;
   }

   private static etz a(dlu $$0, float $$1, dlu $$2) {
      return new etz(new eub($$0, $$1), eth.b, $$2.m());
   }

   private static etz a(dlu $$0, dlu $$1) {
      return new etz(new etm($$0), eth.b, $$1.m());
   }

   public static class a {
      public static final Codec<esw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, esw.a::new)
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

      public static final bai.a<esw.b> g = bai.a(esw.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static esw.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
