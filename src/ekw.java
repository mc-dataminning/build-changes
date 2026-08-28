import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ekw extends eit {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ekw.b l;
   private final ekw.a m;

   public ekw(emk $$0, iz $$1, ekw.b $$2, ekw.a $$3, ale $$4, emj $$5, dll $$6, djv $$7, iz $$8) {
      super(eja.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ekw(emk $$0, ur $$1) {
      super(eja.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ekw.b.a($$1.l("VerticalPlacement"));
      this.m = (ekw.a)ekw.a.a.parse(new Dynamic(vf.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eiz $$0, ur $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ekw.a.a.encodeStart(vf.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static emf a(emk $$0, ur $$1, ale $$2) {
      emj $$3 = $$0.a($$2);
      iz $$4 = new iz($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         djv.valueOf($$1.l("Mirror")),
         dll.valueOf($$1.l("Rotation")),
         ekw.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ekw.a)ekw.a.a.parse(new Dynamic(vf.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static emf a(djv $$0, dll $$1, ekw.b $$2, iz $$3, ekw.a $$4) {
      ell $$5 = $$4.d ? ell.b : ell.d;
      List<ely> $$6 = Lists.newArrayList();
      $$6.add(a(dfa.ch, 0.3F, dfa.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dfa.dV, 0.07F, dfa.kJ));
      }

      emf $$7 = new emf().a($$1).a($$0).a($$3).a($$5).a(new emc($$6)).a(new elk($$4.c)).a(new elz(awo.bO)).a(new els());
      if ($$4.g) {
         $$7.a(elj.b);
      }

      return $$7;
   }

   private static ely a(ekw.b $$0, ekw.a $$1) {
      if ($$0 == ekw.b.c) {
         return a(dfa.H, dfa.kJ);
      } else {
         return $$1.b ? a(dfa.H, dfa.dV) : a(dfa.H, 0.2F, dfa.kJ);
      }
   }

   @Override
   public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, iz $$6) {
      eib $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            iz.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dby)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iz $$1, dcm $$2, azg $$3, eib $$4) {
   }

   private void a(azg $$0, dby $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dfa.ff)) {
         je $$4 = a($$0);
         iz $$5 = $$2.a($$4);
         dsb $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dey.a($$3.k($$1, $$2), $$4)) {
               dss $$7 = dnu.a($$4.g());
               $$1.a($$5, dfa.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azg $$0, dby $$1, iz $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dfa.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dfa.aH.o().a(dji.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azg $$0, dby $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iz $$4 = new iz($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dfa.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(azg $$0, dby $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(je.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azg $$0, dby $$1) {
      boolean $$2 = this.l == ekw.b.a || this.l == ekw.b.c;
      iz $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      iz.a $$11 = iz.c.j();

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

   private boolean a(dby $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      return !$$2.a(dfa.a) && !$$2.a(dfa.co) && !$$2.a(awo.bO) && (this.l == ekw.b.f || !$$2.a(dfa.H));
   }

   private void d(azg $$0, dby $$1, iz $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dfa.kJ.o(), 3);
      } else {
         $$1.a($$2, dfa.dV.o(), 3);
      }
   }

   private static int a(dby $$0, int $$1, int $$2, ekw.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dxt.a a(ekw.b $$0) {
      return $$0 == ekw.b.c ? dxt.a.c : dxt.a.a;
   }

   private static ely a(dey $$0, float $$1, dey $$2) {
      return new ely(new ema($$0, $$1), elh.b, $$2.o());
   }

   private static ely a(dey $$0, dey $$1) {
      return new ely(new elm($$0), elh.b, $$1.o());
   }

   public static class a {
      public static final Codec<ekw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ekw.a::new)
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

   public static enum b implements azt {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azt.a<ekw.b> g = azt.a(ekw.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ekw.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
