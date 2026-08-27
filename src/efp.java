import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class efp extends edm {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final efp.b l;
   private final efp.a m;

   public efp(ehd $$0, ib $$1, efp.b $$2, efp.a $$3, ajh $$4, ehc $$5, dgm $$6, dew $$7, ib $$8) {
      super(edt.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public efp(ehd $$0, ta $$1) {
      super(edt.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = efp.b.a($$1.l("VerticalPlacement"));
      this.m = (efp.a)efp.a.a.parse(new Dynamic(to.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(eds $$0, ta $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      efp.a.a.encodeStart(to.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static egy a(ehd $$0, ta $$1, ajh $$2) {
      ehc $$3 = $$0.a($$2);
      ib $$4 = new ib($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dew.valueOf($$1.l("Mirror")),
         dgm.valueOf($$1.l("Rotation")),
         efp.b.a($$1.l("VerticalPlacement")),
         $$4,
         (efp.a)efp.a.a.parse(new Dynamic(to.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static egy a(dew $$0, dgm $$1, efp.b $$2, ib $$3, efp.a $$4) {
      ege $$5 = $$4.d ? ege.b : ege.d;
      List<egr> $$6 = Lists.newArrayList();
      $$6.add(a(dac.ch, 0.3F, dac.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dac.dV, 0.07F, dac.kJ));
      }

      egy $$7 = new egy().a($$1).a($$0).a($$3).a($$5).a(new egv($$6)).a(new egd($$4.c)).a(new egs(aun.bI)).a(new egl());
      if ($$4.g) {
         $$7.a(egc.b);
      }

      return $$7;
   }

   private static egr a(efp.b $$0, efp.a $$1) {
      if ($$0 == efp.b.c) {
         return a(dac.H, dac.kJ);
      } else {
         return $$1.b ? a(dac.H, dac.dV) : a(dac.H, 0.2F, dac.kJ);
      }
   }

   @Override
   public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
      ecu $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ib.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cxa)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ib $$1, cxo $$2, axd $$3, ecu $$4) {
   }

   private void a(axd $$0, cxa $$1, ib $$2) {
      dmz $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dac.ff)) {
         ih $$4 = a($$0);
         ib $$5 = $$2.a($$4);
         dmz $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (daa.a($$3.k($$1, $$2), $$4)) {
               dnq $$7 = div.a($$4.g());
               $$1.a($$5, dac.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(axd $$0, cxa $$1, ib $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dac.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dac.aH.o().a(dej.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(axd $$0, cxa $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ib $$4 = new ib($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dac.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(axd $$0, cxa $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ih.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(axd $$0, cxa $$1) {
      boolean $$2 = this.l == efp.b.a || this.l == efp.b.c;
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

   private boolean a(cxa $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      return !$$2.a(dac.a) && !$$2.a(dac.co) && !$$2.a(aun.bI) && (this.l == efp.b.f || !$$2.a(dac.H));
   }

   private void d(axd $$0, cxa $$1, ib $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dac.kJ.o(), 3);
      } else {
         $$1.a($$2, dac.dV.o(), 3);
      }
   }

   private static int a(cxa $$0, int $$1, int $$2, efp.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dsm.a a(efp.b $$0) {
      return $$0 == efp.b.c ? dsm.a.c : dsm.a.a;
   }

   private static egr a(daa $$0, float $$1, daa $$2) {
      return new egr(new egt($$0, $$1), ega.b, $$2.o());
   }

   private static egr a(daa $$0, daa $$1) {
      return new egr(new egf($$0), ega.b, $$1.o());
   }

   public static class a {
      public static final Codec<efp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, efp.a::new)
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

      public static final axq.a<efp.b> g = axq.a(efp.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static efp.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
