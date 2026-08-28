import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eqx extends eot {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eqx.b l;
   private final eqx.a m;

   public eqx(esm $$0, ji $$1, eqx.b $$2, eqx.a $$3, aku $$4, esl $$5, dqw $$6, dpf $$7, ji $$8) {
      super(epa.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eqx(esm $$0, tq $$1) {
      super(epa.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eqx.b.a($$1.l("VerticalPlacement"));
      this.m = (eqx.a)eqx.a.a.parse(new Dynamic(ue.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eoz $$0, tq $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eqx.a.a.encodeStart(ue.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static esh a(esm $$0, tq $$1, aku $$2) {
      esl $$3 = $$0.a($$2);
      ji $$4 = new ji($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dpf.valueOf($$1.l("Mirror")),
         dqw.valueOf($$1.l("Rotation")),
         eqx.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eqx.a)eqx.a.a.parse(new Dynamic(ue.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static esh a(dpf $$0, dqw $$1, eqx.b $$2, ji $$3, eqx.a $$4) {
      erm $$5 = $$4.d ? erm.b : erm.d;
      List<esa> $$6 = Lists.newArrayList();
      $$6.add(a(dkg.co, 0.3F, dkg.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dkg.ei, 0.07F, dkg.ll));
      }

      esh $$7 = new esh().a($$1).a($$0).a($$3).a($$5).a(new ese($$6)).a(new erl($$4.c)).a(new esb(awp.bR)).a(new ert());
      if ($$4.g) {
         $$7.a(erk.b);
      }

      return $$7;
   }

   private static esa a(eqx.b $$0, eqx.a $$1) {
      if ($$0 == eqx.b.c) {
         return a(dkg.K, dkg.ll);
      } else {
         return $$1.b ? a(dkg.K, dkg.ei) : a(dkg.K, 0.2F, dkg.ll);
      }
   }

   @Override
   public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
      eob $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ji.a(this.f()).forEach($$2x -> {
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
   protected void a(String $$0, ji $$1, dhq $$2, azh $$3, eob $$4) {
   }

   private void a(azh $$0, dha $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dkg.ft)) {
         jn $$4 = a($$0);
         ji $$5 = $$2.a($$4);
         dxq $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dke.a($$3.g($$1, $$2), $$4)) {
               dyh $$7 = dtg.a($$4.g());
               $$1.a($$5, dkg.ft.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azh $$0, dha $$1, ji $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dkg.ei) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dkg.aN.m().b(dos.d, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azh $$0, dha $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ji $$4 = new ji($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dkg.ei)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azh $$0, dha $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jn.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azh $$0, dha $$1) {
      boolean $$2 = this.l == eqx.b.a || this.l == eqx.b.c;
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

   private boolean a(dha $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      return !$$2.a(dkg.a) && !$$2.a(dkg.cv) && !$$2.a(awp.bR) && (this.l == eqx.b.f || !$$2.a(dkg.K));
   }

   private void d(azh $$0, dha $$1, ji $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dkg.ll.m(), 3);
      } else {
         $$1.a($$2, dkg.ei.m(), 3);
      }
   }

   private static int a(dha $$0, int $$1, int $$2, eqx.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static edo.a a(eqx.b $$0) {
      return $$0 == eqx.b.c ? edo.a.c : edo.a.a;
   }

   private static esa a(dke $$0, float $$1, dke $$2) {
      return new esa(new esc($$0, $$1), eri.b, $$2.m());
   }

   private static esa a(dke $$0, dke $$1) {
      return new esa(new ern($$0), eri.b, $$1.m());
   }

   public static class a {
      public static final Codec<eqx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eqx.a::new)
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

      public static final azv.a<eqx.b> g = azv.a(eqx.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eqx.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
