import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eid extends ega {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eid.b l;
   private final eid.a m;

   public eid(ejr $$0, id $$1, eid.b $$2, eid.a $$3, ajv $$4, ejq $$5, dit $$6, dhd $$7, id $$8) {
      super(egh.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eid(ejr $$0, to $$1) {
      super(egh.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eid.b.a($$1.l("VerticalPlacement"));
      this.m = (eid.a)eid.a.a.parse(new Dynamic(uc.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(egg $$0, to $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eid.a.a.encodeStart(uc.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ejm a(ejr $$0, to $$1, ajv $$2) {
      ejq $$3 = $$0.a($$2);
      id $$4 = new id($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dhd.valueOf($$1.l("Mirror")),
         dit.valueOf($$1.l("Rotation")),
         eid.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eid.a)eid.a.a.parse(new Dynamic(uc.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static ejm a(dhd $$0, dit $$1, eid.b $$2, id $$3, eid.a $$4) {
      eis $$5 = $$4.d ? eis.b : eis.d;
      List<ejf> $$6 = Lists.newArrayList();
      $$6.add(a(dcj.ch, 0.3F, dcj.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dcj.dV, 0.07F, dcj.kJ));
      }

      ejm $$7 = new ejm().a($$1).a($$0).a($$3).a($$5).a(new ejj($$6)).a(new eir($$4.c)).a(new ejg(ave.bI)).a(new eiz());
      if ($$4.g) {
         $$7.a(eiq.b);
      }

      return $$7;
   }

   private static ejf a(eid.b $$0, eid.a $$1) {
      if ($$0 == eid.b.c) {
         return a(dcj.H, dcj.kJ);
      } else {
         return $$1.b ? a(dcj.H, dcj.dV) : a(dcj.H, 0.2F, dcj.kJ);
      }
   }

   @Override
   public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
      efi $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            id.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (czh)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, id $$1, czv $$2, axt $$3, efi $$4) {
   }

   private void a(axt $$0, czh $$1, id $$2) {
      dpi $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dcj.ff)) {
         ij $$4 = a($$0);
         id $$5 = $$2.a($$4);
         dpi $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dch.a($$3.k($$1, $$2), $$4)) {
               dpz $$7 = dlc.a($$4.g());
               $$1.a($$5, dcj.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(axt $$0, czh $$1, id $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dcj.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dcj.aH.n().a(dgq.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(axt $$0, czh $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            id $$4 = new id($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dcj.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(axt $$0, czh $$1, id $$2) {
      id.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ij.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(axt $$0, czh $$1) {
      boolean $$2 = this.l == eid.b.a || this.l == eid.b.c;
      id $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      id.a $$11 = id.c.j();

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

   private boolean a(czh $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      return !$$2.a(dcj.a) && !$$2.a(dcj.co) && !$$2.a(ave.bI) && (this.l == eid.b.f || !$$2.a(dcj.H));
   }

   private void d(axt $$0, czh $$1, id $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dcj.kJ.n(), 3);
      } else {
         $$1.a($$2, dcj.dV.n(), 3);
      }
   }

   private static int a(czh $$0, int $$1, int $$2, eid.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dva.a a(eid.b $$0) {
      return $$0 == eid.b.c ? dva.a.c : dva.a.a;
   }

   private static ejf a(dch $$0, float $$1, dch $$2) {
      return new ejf(new ejh($$0, $$1), eio.b, $$2.n());
   }

   private static ejf a(dch $$0, dch $$1) {
      return new ejf(new eit($$0), eio.b, $$1.n());
   }

   public static class a {
      public static final Codec<eid.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eid.a::new)
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

   public static enum b implements ayg {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ayg.a<eid.b> g = ayg.a(eid.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eid.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
