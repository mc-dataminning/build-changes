import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class elj extends ejg {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final elj.b l;
   private final elj.a m;

   public elj(emx $$0, ja $$1, elj.b $$2, elj.a $$3, akk $$4, emw $$5, dlu $$6, dke $$7, ja $$8) {
      super(ejn.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public elj(emx $$0, tx $$1) {
      super(ejn.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = elj.b.a($$1.l("VerticalPlacement"));
      this.m = (elj.a)elj.a.a.parse(new Dynamic(ul.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ejm $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      elj.a.a.encodeStart(ul.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ems a(emx $$0, tx $$1, akk $$2) {
      emw $$3 = $$0.a($$2);
      ja $$4 = new ja($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dke.valueOf($$1.l("Mirror")),
         dlu.valueOf($$1.l("Rotation")),
         elj.b.a($$1.l("VerticalPlacement")),
         $$4,
         (elj.a)elj.a.a.parse(new Dynamic(ul.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static ems a(dke $$0, dlu $$1, elj.b $$2, ja $$3, elj.a $$4) {
      ely $$5 = $$4.d ? ely.b : ely.d;
      List<eml> $$6 = Lists.newArrayList();
      $$6.add(a(dfj.ch, 0.3F, dfj.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dfj.dV, 0.07F, dfj.kJ));
      }

      ems $$7 = new ems().a($$1).a($$0).a($$3).a($$5).a(new emp($$6)).a(new elx($$4.c)).a(new emm(avw.bO)).a(new emf());
      if ($$4.g) {
         $$7.a(elw.b);
      }

      return $$7;
   }

   private static eml a(elj.b $$0, elj.a $$1) {
      if ($$0 == elj.b.c) {
         return a(dfj.H, dfj.kJ);
      } else {
         return $$1.b ? a(dfj.H, dfj.dV) : a(dfj.H, 0.2F, dfj.kJ);
      }
   }

   @Override
   public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ja $$6) {
      eio $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ja.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dcg)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ja $$1, dcu $$2, ayo $$3, eio $$4) {
   }

   private void a(ayo $$0, dcg $$1, ja $$2) {
      dsk $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dfj.ff)) {
         jf $$4 = a($$0);
         ja $$5 = $$2.a($$4);
         dsk $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dfh.a($$3.k($$1, $$2), $$4)) {
               dtb $$7 = dod.a($$4.g());
               $$1.a($$5, dfj.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ayo $$0, dcg $$1, ja $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dfj.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dfj.aH.o().a(djr.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ayo $$0, dcg $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ja $$4 = new ja($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dfj.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ayo $$0, dcg $$1, ja $$2) {
      ja.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jf.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ayo $$0, dcg $$1) {
      boolean $$2 = this.l == elj.b.a || this.l == elj.b.c;
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

   private boolean a(dcg $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      return !$$2.a(dfj.a) && !$$2.a(dfj.co) && !$$2.a(avw.bO) && (this.l == elj.b.f || !$$2.a(dfj.H));
   }

   private void d(ayo $$0, dcg $$1, ja $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dfj.kJ.o(), 3);
      } else {
         $$1.a($$2, dfj.dV.o(), 3);
      }
   }

   private static int a(dcg $$0, int $$1, int $$2, elj.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dyf.a a(elj.b $$0) {
      return $$0 == elj.b.c ? dyf.a.c : dyf.a.a;
   }

   private static eml a(dfh $$0, float $$1, dfh $$2) {
      return new eml(new emn($$0, $$1), elu.b, $$2.o());
   }

   private static eml a(dfh $$0, dfh $$1) {
      return new eml(new elz($$0), elu.b, $$1.o());
   }

   public static class a {
      public static final Codec<elj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, elj.a::new)
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

      public static final azc.a<elj.b> g = azc.a(elj.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static elj.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
