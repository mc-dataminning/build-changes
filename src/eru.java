import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eru extends epq {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eru.b l;
   private final eru.a m;

   public eru(etj $$0, jj $$1, eru.b $$2, eru.a $$3, ald $$4, eti $$5, drm $$6, dpv $$7, jj $$8) {
      super(epx.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eru(etj $$0, tw $$1) {
      super(epx.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eru.b.a($$1.l("VerticalPlacement"));
      this.m = (eru.a)eru.a.a.parse(new Dynamic(uk.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(epw $$0, tw $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eru.a.a.encodeStart(uk.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ete a(etj $$0, tw $$1, ald $$2) {
      eti $$3 = $$0.a($$2);
      jj $$4 = new jj($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dpv.valueOf($$1.l("Mirror")),
         drm.valueOf($$1.l("Rotation")),
         eru.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eru.a)eru.a.a.parse(new Dynamic(uk.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static ete a(dpv $$0, drm $$1, eru.b $$2, jj $$3, eru.a $$4) {
      esj $$5 = $$4.d ? esj.b : esj.d;
      List<esx> $$6 = Lists.newArrayList();
      $$6.add(a(dkw.co, 0.3F, dkw.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dkw.ei, 0.07F, dkw.ll));
      }

      ete $$7 = new ete().a($$1).a($$0).a($$3).a($$5).a(new etb($$6)).a(new esi($$4.c)).a(new esy(awz.bR)).a(new esq());
      if ($$4.g) {
         $$7.a(esh.b);
      }

      return $$7;
   }

   private static esx a(eru.b $$0, eru.a $$1) {
      if ($$0 == eru.b.c) {
         return a(dkw.K, dkw.ll);
      } else {
         return $$1.b ? a(dkw.K, dkw.ei) : a(dkw.K, 0.2F, dkw.ll);
      }
   }

   @Override
   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
      eoy $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            jj.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dhq)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jj $$1, dig $$2, azs $$3, eoy $$4) {
   }

   private void a(azs $$0, dhq $$1, jj $$2) {
      dym $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dkw.ft)) {
         jo $$4 = a($$0);
         jj $$5 = $$2.a($$4);
         dym $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dku.a($$3.g($$1, $$2), $$4)) {
               dzd $$7 = dty.a($$4.g());
               $$1.a($$5, dkw.ft.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azs $$0, dhq $$1, jj $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dkw.ei) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dkw.aN.m().b(dpi.d, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azs $$0, dhq $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jj $$4 = new jj($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dkw.ei)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azs $$0, dhq $$1, jj $$2) {
      jj.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jo.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azs $$0, dhq $$1) {
      boolean $$2 = this.l == eru.b.a || this.l == eru.b.c;
      jj $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      jj.a $$11 = jj.c.k();

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

   private boolean a(dhq $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      return !$$2.a(dkw.a) && !$$2.a(dkw.cv) && !$$2.a(awz.bR) && (this.l == eru.b.f || !$$2.a(dkw.K));
   }

   private void d(azs $$0, dhq $$1, jj $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dkw.ll.m(), 3);
      } else {
         $$1.a($$2, dkw.ei.m(), 3);
      }
   }

   private static int a(dhq $$0, int $$1, int $$2, eru.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static eel.a a(eru.b $$0) {
      return $$0 == eru.b.c ? eel.a.c : eel.a.a;
   }

   private static esx a(dku $$0, float $$1, dku $$2) {
      return new esx(new esz($$0, $$1), esf.b, $$2.m());
   }

   private static esx a(dku $$0, dku $$1) {
      return new esx(new esk($$0), esf.b, $$1.m());
   }

   public static class a {
      public static final Codec<eru.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eru.a::new)
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

   public static enum b implements bag {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final bag.a<eru.b> g = bag.a(eru.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eru.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
