import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dyg extends dwk {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dyg.b l;
   private final dyg.a m;

   public dyg(dzu $$0, ht $$1, dyg.b $$2, dyg.a $$3, afw $$4, dzt $$5, dal $$6, cyv $$7, ht $$8) {
      super(dwr.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dyg(dzu $$0, rt $$1) {
      super(dwr.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dyg.b.a($$1.l("VerticalPlacement"));
      this.m = (dyg.a)dyg.a.a.parse(new Dynamic(sf.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dwq $$0, rt $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dyg.a.a.encodeStart(sf.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dzp a(dzu $$0, rt $$1, afw $$2) {
      dzt $$3 = $$0.a($$2);
      ht $$4 = new ht($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         cyv.valueOf($$1.l("Mirror")),
         dal.valueOf($$1.l("Rotation")),
         dyg.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dyg.a)dyg.a.a.parse(new Dynamic(sf.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dzp a(cyv $$0, dal $$1, dyg.b $$2, ht $$3, dyg.a $$4) {
      dyv $$5 = $$4.d ? dyv.b : dyv.d;
      List<dzi> $$6 = Lists.newArrayList();
      $$6.add(a(cuc.ch, 0.3F, cuc.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cuc.dV, 0.07F, cuc.kJ));
      }

      dzp $$7 = new dzp().a($$1).a($$0).a($$3).a($$5).a(new dzm($$6)).a(new dyu($$4.c)).a(new dzj(aqs.bH)).a(new dzc());
      if ($$4.g) {
         $$7.a(dyt.b);
      }

      return $$7;
   }

   private static dzi a(dyg.b $$0, dyg.a $$1) {
      if ($$0 == dyg.b.c) {
         return a(cuc.H, cuc.kJ);
      } else {
         return $$1.b ? a(cuc.H, cuc.dV) : a(cuc.H, 0.2F, cuc.kJ);
      }
   }

   @Override
   public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
      dvs $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ht.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cra)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ht $$1, cro $$2, ate $$3, dvs $$4) {
   }

   private void a(ate $$0, cra $$1, ht $$2) {
      dgb $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cuc.ff)) {
         hx $$4 = a($$0);
         ht $$5 = $$2.a($$4);
         dgb $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cua.a($$3.k($$1, $$2), $$4)) {
               dgs $$7 = dcr.a($$4.g());
               $$1.a($$5, cuc.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ate $$0, cra $$1, ht $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cuc.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cuc.aH.o().a(cyi.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ate $$0, cra $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            ht $$4 = new ht($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(cuc.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ate $$0, cra $$1, ht $$2) {
      ht.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(hx.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ate $$0, cra $$1) {
      boolean $$2 = this.l == dyg.b.a || this.l == dyg.b.c;
      ht $$3 = this.f.f();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.c() + this.f.e()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      ht.a $$11 = ht.b.j();

      for (int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; $$12++) {
         for (int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; $$13++) {
            int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
            int $$15 = Math.max(0, $$14 + $$9);
            if ($$15 < $$7) {
               float $$16 = $$6[$$15];
               if ($$0.j() < (double)$$16) {
                  int $$17 = a($$1, $$12, $$13, this.l);
                  int $$18 = $$2 ? $$17 : Math.min(this.f.h(), $$17);
                  $$11.d($$12, $$18, $$13);
                  if (Math.abs($$18 - this.f.h()) <= 3 && this.a($$1, $$11)) {
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

   private boolean a(cra $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      return !$$2.a(cuc.a) && !$$2.a(cuc.co) && !$$2.a(aqs.bH) && (this.l == dyg.b.f || !$$2.a(cuc.H));
   }

   private void d(ate $$0, cra $$1, ht $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cuc.kJ.o(), 3);
      } else {
         $$1.a($$2, cuc.dV.o(), 3);
      }
   }

   private static int a(cra $$0, int $$1, int $$2, dyg.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dlk.a a(dyg.b $$0) {
      return $$0 == dyg.b.c ? dlk.a.c : dlk.a.a;
   }

   private static dzi a(cua $$0, float $$1, cua $$2) {
      return new dzi(new dzk($$0, $$1), dyr.b, $$2.o());
   }

   private static dzi a(cua $$0, cua $$1) {
      return new dzi(new dyw($$0), dyr.b, $$1.o());
   }

   public static class a {
      public static final Codec<dyg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dyg.a::new)
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

   public static enum b implements atr {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final atr.a<dyg.b> g = atr.a(dyg.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dyg.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
