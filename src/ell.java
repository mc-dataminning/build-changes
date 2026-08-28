import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ell extends ejh {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ell.b l;
   private final ell.a m;

   public ell(emz $$0, ja $$1, ell.b $$2, ell.a $$3, akk $$4, emy $$5, dlv $$6, dkf $$7, ja $$8) {
      super(ejo.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ell(emz $$0, tx $$1) {
      super(ejo.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ell.b.a($$1.l("VerticalPlacement"));
      this.m = (ell.a)ell.a.a.parse(new Dynamic(ul.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ejn $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ell.a.a.encodeStart(ul.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static emu a(emz $$0, tx $$1, akk $$2) {
      emy $$3 = $$0.a($$2);
      ja $$4 = new ja($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dkf.valueOf($$1.l("Mirror")),
         dlv.valueOf($$1.l("Rotation")),
         ell.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ell.a)ell.a.a.parse(new Dynamic(ul.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static emu a(dkf $$0, dlv $$1, ell.b $$2, ja $$3, ell.a $$4) {
      ema $$5 = $$4.d ? ema.b : ema.d;
      List<emn> $$6 = Lists.newArrayList();
      $$6.add(a(dfk.ch, 0.3F, dfk.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dfk.dV, 0.07F, dfk.kJ));
      }

      emu $$7 = new emu().a($$1).a($$0).a($$3).a($$5).a(new emr($$6)).a(new elz($$4.c)).a(new emo(avw.bO)).a(new emh());
      if ($$4.g) {
         $$7.a(ely.b);
      }

      return $$7;
   }

   private static emn a(ell.b $$0, ell.a $$1) {
      if ($$0 == ell.b.c) {
         return a(dfk.H, dfk.kJ);
      } else {
         return $$1.b ? a(dfk.H, dfk.dV) : a(dfk.H, 0.2F, dfk.kJ);
      }
   }

   @Override
   public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
      eip $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ja.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dch)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ja $$1, dcv $$2, ayo $$3, eip $$4) {
   }

   private void a(ayo $$0, dch $$1, ja $$2) {
      dsl $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dfk.ff)) {
         jf $$4 = a($$0);
         ja $$5 = $$2.a($$4);
         dsl $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dfi.a($$3.k($$1, $$2), $$4)) {
               dtc $$7 = doe.a($$4.g());
               $$1.a($$5, dfk.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ayo $$0, dch $$1, ja $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dfk.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dfk.aH.o().a(djs.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ayo $$0, dch $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ja $$4 = new ja($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dfk.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ayo $$0, dch $$1, ja $$2) {
      ja.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jf.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ayo $$0, dch $$1) {
      boolean $$2 = this.l == ell.b.a || this.l == ell.b.c;
      ja $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      ja.a $$11 = ja.c.j();

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

   private boolean a(dch $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      return !$$2.a(dfk.a) && !$$2.a(dfk.co) && !$$2.a(avw.bO) && (this.l == ell.b.f || !$$2.a(dfk.H));
   }

   private void d(ayo $$0, dch $$1, ja $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dfk.kJ.o(), 3);
      } else {
         $$1.a($$2, dfk.dV.o(), 3);
      }
   }

   private static int a(dch $$0, int $$1, int $$2, ell.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dyg.a a(ell.b $$0) {
      return $$0 == ell.b.c ? dyg.a.c : dyg.a.a;
   }

   private static emn a(dfi $$0, float $$1, dfi $$2) {
      return new emn(new emp($$0, $$1), elw.b, $$2.o());
   }

   private static emn a(dfi $$0, dfi $$1) {
      return new emn(new emb($$0), elw.b, $$1.o());
   }

   public static class a {
      public static final Codec<ell.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ell.a::new)
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

   public static enum b implements azc {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azc.a<ell.b> g = azc.a(ell.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ell.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
