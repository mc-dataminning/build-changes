import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class efr extends edo {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final efr.b l;
   private final efr.a m;

   public efr(ehf $$0, ib $$1, efr.b $$2, efr.a $$3, ajh $$4, ehe $$5, dgo $$6, dey $$7, ib $$8) {
      super(edv.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public efr(ehf $$0, ta $$1) {
      super(edv.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = efr.b.a($$1.l("VerticalPlacement"));
      this.m = (efr.a)efr.a.a.parse(new Dynamic(to.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(edu $$0, ta $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      efr.a.a.encodeStart(to.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static eha a(ehf $$0, ta $$1, ajh $$2) {
      ehe $$3 = $$0.a($$2);
      ib $$4 = new ib($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dey.valueOf($$1.l("Mirror")),
         dgo.valueOf($$1.l("Rotation")),
         efr.b.a($$1.l("VerticalPlacement")),
         $$4,
         (efr.a)efr.a.a.parse(new Dynamic(to.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static eha a(dey $$0, dgo $$1, efr.b $$2, ib $$3, efr.a $$4) {
      egg $$5 = $$4.d ? egg.b : egg.d;
      List<egt> $$6 = Lists.newArrayList();
      $$6.add(a(dae.ch, 0.3F, dae.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dae.dV, 0.07F, dae.kJ));
      }

      eha $$7 = new eha().a($$1).a($$0).a($$3).a($$5).a(new egx($$6)).a(new egf($$4.c)).a(new egu(aun.bI)).a(new egn());
      if ($$4.g) {
         $$7.a(ege.b);
      }

      return $$7;
   }

   private static egt a(efr.b $$0, efr.a $$1) {
      if ($$0 == efr.b.c) {
         return a(dae.H, dae.kJ);
      } else {
         return $$1.b ? a(dae.H, dae.dV) : a(dae.H, 0.2F, dae.kJ);
      }
   }

   @Override
   public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, ib $$6) {
      ecw $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ib.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cxc)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ib $$1, cxq $$2, axd $$3, ecw $$4) {
   }

   private void a(axd $$0, cxc $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dae.ff)) {
         ih $$4 = a($$0);
         ib $$5 = $$2.a($$4);
         dnb $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dac.a($$3.k($$1, $$2), $$4)) {
               dns $$7 = dix.a($$4.g());
               $$1.a($$5, dae.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(axd $$0, cxc $$1, ib $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dae.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dae.aH.o().a(del.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(axd $$0, cxc $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ib $$4 = new ib($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dae.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(axd $$0, cxc $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ih.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(axd $$0, cxc $$1) {
      boolean $$2 = this.l == efr.b.a || this.l == efr.b.c;
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

   private boolean a(cxc $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      return !$$2.a(dae.a) && !$$2.a(dae.co) && !$$2.a(aun.bI) && (this.l == efr.b.f || !$$2.a(dae.H));
   }

   private void d(axd $$0, cxc $$1, ib $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dae.kJ.o(), 3);
      } else {
         $$1.a($$2, dae.dV.o(), 3);
      }
   }

   private static int a(cxc $$0, int $$1, int $$2, efr.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dso.a a(efr.b $$0) {
      return $$0 == efr.b.c ? dso.a.c : dso.a.a;
   }

   private static egt a(dac $$0, float $$1, dac $$2) {
      return new egt(new egv($$0, $$1), egc.b, $$2.o());
   }

   private static egt a(dac $$0, dac $$1) {
      return new egt(new egh($$0), egc.b, $$1.o());
   }

   public static class a {
      public static final Codec<efr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, efr.a::new)
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

   public static enum b implements axq {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final axq.a<efr.b> g = axq.a(efr.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static efr.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
