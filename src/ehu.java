import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ehu extends efr {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ehu.b l;
   private final ehu.a m;

   public ehu(eji $$0, ib $$1, ehu.b $$2, ehu.a $$3, ajt $$4, ejh $$5, dik $$6, dgu $$7, ib $$8) {
      super(efy.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ehu(eji $$0, tm $$1) {
      super(efy.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ehu.b.a($$1.l("VerticalPlacement"));
      this.m = (ehu.a)ehu.a.a.parse(new Dynamic(ua.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(efx $$0, tm $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ehu.a.a.encodeStart(ua.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ejd a(eji $$0, tm $$1, ajt $$2) {
      ejh $$3 = $$0.a($$2);
      ib $$4 = new ib($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dgu.valueOf($$1.l("Mirror")),
         dik.valueOf($$1.l("Rotation")),
         ehu.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ehu.a)ehu.a.a.parse(new Dynamic(ua.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static ejd a(dgu $$0, dik $$1, ehu.b $$2, ib $$3, ehu.a $$4) {
      eij $$5 = $$4.d ? eij.b : eij.d;
      List<eiw> $$6 = Lists.newArrayList();
      $$6.add(a(dca.ch, 0.3F, dca.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dca.dV, 0.07F, dca.kJ));
      }

      ejd $$7 = new ejd().a($$1).a($$0).a($$3).a($$5).a(new eja($$6)).a(new eii($$4.c)).a(new eix(avc.bI)).a(new eiq());
      if ($$4.g) {
         $$7.a(eih.b);
      }

      return $$7;
   }

   private static eiw a(ehu.b $$0, ehu.a $$1) {
      if ($$0 == ehu.b.c) {
         return a(dca.H, dca.kJ);
      } else {
         return $$1.b ? a(dca.H, dca.dV) : a(dca.H, 0.2F, dca.kJ);
      }
   }

   @Override
   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, ib $$6) {
      eez $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ib.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cyy)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ib $$1, czm $$2, axr $$3, eez $$4) {
   }

   private void a(axr $$0, cyy $$1, ib $$2) {
      doz $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dca.ff)) {
         ih $$4 = a($$0);
         ib $$5 = $$2.a($$4);
         doz $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dby.a($$3.k($$1, $$2), $$4)) {
               dpq $$7 = dkt.a($$4.g());
               $$1.a($$5, dca.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(axr $$0, cyy $$1, ib $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dca.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dca.aH.n().a(dgh.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(axr $$0, cyy $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ib $$4 = new ib($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dca.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(axr $$0, cyy $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ih.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(axr $$0, cyy $$1) {
      boolean $$2 = this.l == ehu.b.a || this.l == ehu.b.c;
      ib $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      ib.a $$11 = ib.c.j();

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

                     this.c($$0, $$1, $$11.d());
                  }
               }
            }
         }
      }
   }

   private boolean a(cyy $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      return !$$2.a(dca.a) && !$$2.a(dca.co) && !$$2.a(avc.bI) && (this.l == ehu.b.f || !$$2.a(dca.H));
   }

   private void d(axr $$0, cyy $$1, ib $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dca.kJ.n(), 3);
      } else {
         $$1.a($$2, dca.dV.n(), 3);
      }
   }

   private static int a(cyy $$0, int $$1, int $$2, ehu.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dur.a a(ehu.b $$0) {
      return $$0 == ehu.b.c ? dur.a.c : dur.a.a;
   }

   private static eiw a(dby $$0, float $$1, dby $$2) {
      return new eiw(new eiy($$0, $$1), eif.b, $$2.n());
   }

   private static eiw a(dby $$0, dby $$1) {
      return new eiw(new eik($$0), eif.b, $$1.n());
   }

   public static class a {
      public static final Codec<ehu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ehu.a::new)
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

   public static enum b implements aye {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final aye.a<ehu.b> g = aye.a(ehu.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ehu.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
