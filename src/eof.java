import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eof extends emb {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eof.b l;
   private final eof.a m;

   public eof(epu $$0, jg $$1, eof.b $$2, eof.a $$3, alh $$4, ept $$5, dol $$6, dmu $$7, jg $$8) {
      super(emi.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eof(epu $$0, uj $$1) {
      super(emi.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eof.b.a($$1.l("VerticalPlacement"));
      this.m = (eof.a)eof.a.a.parse(new Dynamic(ux.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(emh $$0, uj $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eof.a.a.encodeStart(ux.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static epp a(epu $$0, uj $$1, alh $$2) {
      ept $$3 = $$0.a($$2);
      jg $$4 = new jg($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dmu.valueOf($$1.l("Mirror")),
         dol.valueOf($$1.l("Rotation")),
         eof.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eof.a)eof.a.a.parse(new Dynamic(ux.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static epp a(dmu $$0, dol $$1, eof.b $$2, jg $$3, eof.a $$4) {
      eou $$5 = $$4.d ? eou.b : eou.d;
      List<epi> $$6 = Lists.newArrayList();
      $$6.add(a(dia.ch, 0.3F, dia.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dia.dV, 0.07F, dia.kJ));
      }

      epp $$7 = new epp().a($$1).a($$0).a($$3).a($$5).a(new epm($$6)).a(new eot($$4.c)).a(new epj(awz.bP)).a(new epb());
      if ($$4.g) {
         $$7.a(eos.b);
      }

      return $$7;
   }

   private static epi a(eof.b $$0, eof.a $$1) {
      if ($$0 == eof.b.c) {
         return a(dia.H, dia.kJ);
      } else {
         return $$1.b ? a(dia.H, dia.dV) : a(dia.H, 0.2F, dia.kJ);
      }
   }

   @Override
   public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
      elj $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jg.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dew)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jg $$1, dfl $$2, azr $$3, elj $$4) {
   }

   private void a(azr $$0, dew $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dia.ff)) {
         jl $$4 = a($$0);
         jg $$5 = $$2.a($$4);
         dvd $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dhy.a($$3.g($$1, $$2), $$4)) {
               dvu $$7 = dqu.a($$4.g());
               $$1.a($$5, dia.ff.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azr $$0, dew $$1, jg $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dia.dV) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dia.aH.m().b(dmh.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azr $$0, dew $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jg $$4 = new jg($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dia.dV)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azr $$0, dew $$1, jg $$2) {
      jg.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jl.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azr $$0, dew $$1) {
      boolean $$2 = this.l == eof.b.a || this.l == eof.b.c;
      jg $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      jg.a $$11 = jg.c.k();

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

   private boolean a(dew $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      return !$$2.a(dia.a) && !$$2.a(dia.co) && !$$2.a(awz.bP) && (this.l == eof.b.f || !$$2.a(dia.H));
   }

   private void d(azr $$0, dew $$1, jg $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dia.kJ.m(), 3);
      } else {
         $$1.a($$2, dia.dV.m(), 3);
      }
   }

   private static int a(dew $$0, int $$1, int $$2, eof.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static eaz.a a(eof.b $$0) {
      return $$0 == eof.b.c ? eaz.a.c : eaz.a.a;
   }

   private static epi a(dhy $$0, float $$1, dhy $$2) {
      return new epi(new epk($$0, $$1), eoq.b, $$2.m());
   }

   private static epi a(dhy $$0, dhy $$1) {
      return new epi(new eov($$0), eoq.b, $$1.m());
   }

   public static class a {
      public static final Codec<eof.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eof.a::new)
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

   public static enum b implements baf {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final baf.a<eof.b> g = baf.a(eof.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eof.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
