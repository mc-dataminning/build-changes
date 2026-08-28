import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eop extends eml {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eop.b l;
   private final eop.a m;

   public eop(eqe $$0, jh $$1, eop.b $$2, eop.a $$3, all $$4, eqd $$5, dow $$6, dnf $$7, jh $$8) {
      super(ems.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eop(eqe $$0, un $$1) {
      super(ems.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eop.b.a($$1.l("VerticalPlacement"));
      this.m = (eop.a)eop.a.a.parse(new Dynamic(vb.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(emr $$0, un $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eop.a.a.encodeStart(vb.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static epz a(eqe $$0, un $$1, all $$2) {
      eqd $$3 = $$0.a($$2);
      jh $$4 = new jh($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dnf.valueOf($$1.l("Mirror")),
         dow.valueOf($$1.l("Rotation")),
         eop.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eop.a)eop.a.a.parse(new Dynamic(vb.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static epz a(dnf $$0, dow $$1, eop.b $$2, jh $$3, eop.a $$4) {
      epe $$5 = $$4.d ? epe.b : epe.d;
      List<eps> $$6 = Lists.newArrayList();
      $$6.add(a(dil.ch, 0.3F, dil.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dil.dV, 0.07F, dil.kJ));
      }

      epz $$7 = new epz().a($$1).a($$0).a($$3).a($$5).a(new epw($$6)).a(new epd($$4.c)).a(new ept(axd.bP)).a(new epl());
      if ($$4.g) {
         $$7.a(epc.b);
      }

      return $$7;
   }

   private static eps a(eop.b $$0, eop.a $$1) {
      if ($$0 == eop.b.c) {
         return a(dil.H, dil.kJ);
      } else {
         return $$1.b ? a(dil.H, dil.dV) : a(dil.H, 0.2F, dil.kJ);
      }
   }

   @Override
   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
      elt $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jh.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dfg)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jh $$1, dfw $$2, azv $$3, elt $$4) {
   }

   private void a(azv $$0, dfg $$1, jh $$2) {
      dvo $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dil.ff)) {
         jm $$4 = a($$0);
         jh $$5 = $$2.a($$4);
         dvo $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dij.a($$3.g($$1, $$2), $$4)) {
               dwf $$7 = drf.a($$4.g());
               $$1.a($$5, dil.ff.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azv $$0, dfg $$1, jh $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dil.dV) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dil.aH.m().b(dms.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azv $$0, dfg $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jh $$4 = new jh($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dil.dV)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azv $$0, dfg $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jm.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azv $$0, dfg $$1) {
      boolean $$2 = this.l == eop.b.a || this.l == eop.b.c;
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

   private boolean a(dfg $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      return !$$2.a(dil.a) && !$$2.a(dil.co) && !$$2.a(axd.bP) && (this.l == eop.b.f || !$$2.a(dil.H));
   }

   private void d(azv $$0, dfg $$1, jh $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dil.kJ.m(), 3);
      } else {
         $$1.a($$2, dil.dV.m(), 3);
      }
   }

   private static int a(dfg $$0, int $$1, int $$2, eop.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static ebj.a a(eop.b $$0) {
      return $$0 == eop.b.c ? ebj.a.c : ebj.a.a;
   }

   private static eps a(dij $$0, float $$1, dij $$2) {
      return new eps(new epu($$0, $$1), epa.b, $$2.m());
   }

   private static eps a(dij $$0, dij $$1) {
      return new eps(new epf($$0), epa.b, $$1.m());
   }

   public static class a {
      public static final Codec<eop.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eop.a::new)
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

   public static enum b implements baj {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final baj.a<eop.b> g = baj.a(eop.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eop.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
