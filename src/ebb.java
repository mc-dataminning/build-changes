import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ebb extends dyy {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ebb.b l;
   private final ebb.a m;

   public ebb(ecp $$0, hv $$1, ebb.b $$2, ebb.a $$3, agt $$4, eco $$5, dcl $$6, dav $$7, hv $$8) {
      super(dzf.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ebb(ecp $$0, sj $$1) {
      super(dzf.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ebb.b.a($$1.l("VerticalPlacement"));
      this.m = (ebb.a)ebb.a.a.parse(new Dynamic(sx.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dze $$0, sj $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ebb.a.a.encodeStart(sx.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static eck a(ecp $$0, sj $$1, agt $$2) {
      eco $$3 = $$0.a($$2);
      hv $$4 = new hv($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dav.valueOf($$1.l("Mirror")),
         dcl.valueOf($$1.l("Rotation")),
         ebb.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ebb.a)ebb.a.a.parse(new Dynamic(sx.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static eck a(dav $$0, dcl $$1, ebb.b $$2, hv $$3, ebb.a $$4) {
      ebq $$5 = $$4.d ? ebq.b : ebq.d;
      List<ecd> $$6 = Lists.newArrayList();
      $$6.add(a(cwb.ch, 0.3F, cwb.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cwb.dV, 0.07F, cwb.kJ));
      }

      eck $$7 = new eck().a($$1).a($$0).a($$3).a($$5).a(new ech($$6)).a(new ebp($$4.c)).a(new ece(arr.bH)).a(new ebx());
      if ($$4.g) {
         $$7.a(ebo.b);
      }

      return $$7;
   }

   private static ecd a(ebb.b $$0, ebb.a $$1) {
      if ($$0 == ebb.b.c) {
         return a(cwb.H, cwb.kJ);
      } else {
         return $$1.b ? a(cwb.H, cwb.dV) : a(cwb.H, 0.2F, cwb.kJ);
      }
   }

   @Override
   public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
      dyg $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            hv.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (csz)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, hv $$1, ctn $$2, auf $$3, dyg $$4) {
   }

   private void a(auf $$0, csz $$1, hv $$2) {
      dip $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cwb.ff)) {
         ia $$4 = a($$0);
         hv $$5 = $$2.a($$4);
         dip $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cvz.a($$3.k($$1, $$2), $$4)) {
               djg $$7 = det.a($$4.g());
               $$1.a($$5, cwb.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(auf $$0, csz $$1, hv $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cwb.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cwb.aH.o().a(dai.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(auf $$0, csz $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            hv $$4 = new hv($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(cwb.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(auf $$0, csz $$1, hv $$2) {
      hv.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ia.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(auf $$0, csz $$1) {
      boolean $$2 = this.l == ebb.b.a || this.l == ebb.b.c;
      hv $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      hv.a $$11 = hv.b.j();

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

   private boolean a(csz $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      return !$$2.a(cwb.a) && !$$2.a(cwb.co) && !$$2.a(arr.bH) && (this.l == ebb.b.f || !$$2.a(cwb.H));
   }

   private void d(auf $$0, csz $$1, hv $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cwb.kJ.o(), 3);
      } else {
         $$1.a($$2, cwb.dV.o(), 3);
      }
   }

   private static int a(csz $$0, int $$1, int $$2, ebb.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dny.a a(ebb.b $$0) {
      return $$0 == ebb.b.c ? dny.a.c : dny.a.a;
   }

   private static ecd a(cvz $$0, float $$1, cvz $$2) {
      return new ecd(new ecf($$0, $$1), ebm.b, $$2.o());
   }

   private static ecd a(cvz $$0, cvz $$1) {
      return new ecd(new ebr($$0), ebm.b, $$1.o());
   }

   public static class a {
      public static final Codec<ebb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ebb.a::new)
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

   public static enum b implements aut {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final aut.a<ebb.b> g = aut.a(ebb.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ebb.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
