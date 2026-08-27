import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ebm extends dzj {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ebm.b l;
   private final ebm.a m;

   public ebm(eda $$0, hx $$1, ebm.b $$2, ebm.a $$3, ahd $$4, ecz $$5, dcv $$6, dbf $$7, hx $$8) {
      super(dzq.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ebm(eda $$0, sl $$1) {
      super(dzq.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ebm.b.a($$1.l("VerticalPlacement"));
      this.m = (ebm.a)ebm.a.a.parse(new Dynamic(sz.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dzp $$0, sl $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ebm.a.a.encodeStart(sz.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ecv a(eda $$0, sl $$1, ahd $$2) {
      ecz $$3 = $$0.a($$2);
      hx $$4 = new hx($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dbf.valueOf($$1.l("Mirror")),
         dcv.valueOf($$1.l("Rotation")),
         ebm.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ebm.a)ebm.a.a.parse(new Dynamic(sz.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static ecv a(dbf $$0, dcv $$1, ebm.b $$2, hx $$3, ebm.a $$4) {
      ecb $$5 = $$4.d ? ecb.b : ecb.d;
      List<eco> $$6 = Lists.newArrayList();
      $$6.add(a(cwl.ch, 0.3F, cwl.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cwl.dV, 0.07F, cwl.kJ));
      }

      ecv $$7 = new ecv().a($$1).a($$0).a($$3).a($$5).a(new ecs($$6)).a(new eca($$4.c)).a(new ecp(asb.bH)).a(new eci());
      if ($$4.g) {
         $$7.a(ebz.b);
      }

      return $$7;
   }

   private static eco a(ebm.b $$0, ebm.a $$1) {
      if ($$0 == ebm.b.c) {
         return a(cwl.H, cwl.kJ);
      } else {
         return $$1.b ? a(cwl.H, cwl.dV) : a(cwl.H, 0.2F, cwl.kJ);
      }
   }

   @Override
   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
      dyr $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            hx.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (ctj)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, hx $$1, ctx $$2, aup $$3, dyr $$4) {
   }

   private void a(aup $$0, ctj $$1, hx $$2) {
      dja $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cwl.ff)) {
         ic $$4 = a($$0);
         hx $$5 = $$2.a($$4);
         dja $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cwj.a($$3.k($$1, $$2), $$4)) {
               djr $$7 = dfd.a($$4.g());
               $$1.a($$5, cwl.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(aup $$0, ctj $$1, hx $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cwl.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cwl.aH.o().a(das.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(aup $$0, ctj $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            hx $$4 = new hx($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(cwl.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(aup $$0, ctj $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ic.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(aup $$0, ctj $$1) {
      boolean $$2 = this.l == ebm.b.a || this.l == ebm.b.c;
      hx $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      hx.a $$11 = hx.b.j();

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

   private boolean a(ctj $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      return !$$2.a(cwl.a) && !$$2.a(cwl.co) && !$$2.a(asb.bH) && (this.l == ebm.b.f || !$$2.a(cwl.H));
   }

   private void d(aup $$0, ctj $$1, hx $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cwl.kJ.o(), 3);
      } else {
         $$1.a($$2, cwl.dV.o(), 3);
      }
   }

   private static int a(ctj $$0, int $$1, int $$2, ebm.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static doj.a a(ebm.b $$0) {
      return $$0 == ebm.b.c ? doj.a.c : doj.a.a;
   }

   private static eco a(cwj $$0, float $$1, cwj $$2) {
      return new eco(new ecq($$0, $$1), ebx.b, $$2.o());
   }

   private static eco a(cwj $$0, cwj $$1) {
      return new eco(new ecc($$0), ebx.b, $$1.o());
   }

   public static class a {
      public static final Codec<ebm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ebm.a::new)
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

   public static enum b implements ave {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ave.a<ebm.b> g = ave.a(ebm.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ebm.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
