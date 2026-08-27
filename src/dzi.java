import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dzi extends dxf {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dzi.b l;
   private final dzi.a m;

   public dzi(eaw $$0, ht $$1, dzi.b $$2, dzi.a $$3, agg $$4, eav $$5, dbf $$6, czp $$7, ht $$8) {
      super(dxm.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dzi(eaw $$0, rz $$1) {
      super(dxm.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dzi.b.a($$1.l("VerticalPlacement"));
      this.m = (dzi.a)dzi.a.a.parse(new Dynamic(sn.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dxl $$0, rz $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dzi.a.a.encodeStart(sn.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ear a(eaw $$0, rz $$1, agg $$2) {
      eav $$3 = $$0.a($$2);
      ht $$4 = new ht($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         czp.valueOf($$1.l("Mirror")),
         dbf.valueOf($$1.l("Rotation")),
         dzi.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dzi.a)dzi.a.a.parse(new Dynamic(sn.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static ear a(czp $$0, dbf $$1, dzi.b $$2, ht $$3, dzi.a $$4) {
      dzx $$5 = $$4.d ? dzx.b : dzx.d;
      List<eak> $$6 = Lists.newArrayList();
      $$6.add(a(cuv.ch, 0.3F, cuv.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cuv.dV, 0.07F, cuv.kJ));
      }

      ear $$7 = new ear().a($$1).a($$0).a($$3).a($$5).a(new eao($$6)).a(new dzw($$4.c)).a(new eal(arc.bH)).a(new eae());
      if ($$4.g) {
         $$7.a(dzv.b);
      }

      return $$7;
   }

   private static eak a(dzi.b $$0, dzi.a $$1) {
      if ($$0 == dzi.b.c) {
         return a(cuv.H, cuv.kJ);
      } else {
         return $$1.b ? a(cuv.H, cuv.dV) : a(cuv.H, 0.2F, cuv.kJ);
      }
   }

   @Override
   public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
      dwn $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ht.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (crt)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ht $$1, csh $$2, ato $$3, dwn $$4) {
   }

   private void a(ato $$0, crt $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cuv.ff)) {
         hx $$4 = a($$0);
         ht $$5 = $$2.a($$4);
         dgw $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cut.a($$3.k($$1, $$2), $$4)) {
               dhn $$7 = ddl.a($$4.g());
               $$1.a($$5, cuv.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ato $$0, crt $$1, ht $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cuv.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cuv.aH.o().a(czc.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ato $$0, crt $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            ht $$4 = new ht($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(cuv.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ato $$0, crt $$1, ht $$2) {
      ht.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(hx.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ato $$0, crt $$1) {
      boolean $$2 = this.l == dzi.b.a || this.l == dzi.b.c;
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

   private boolean a(crt $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      return !$$2.a(cuv.a) && !$$2.a(cuv.co) && !$$2.a(arc.bH) && (this.l == dzi.b.f || !$$2.a(cuv.H));
   }

   private void d(ato $$0, crt $$1, ht $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cuv.kJ.o(), 3);
      } else {
         $$1.a($$2, cuv.dV.o(), 3);
      }
   }

   private static int a(crt $$0, int $$1, int $$2, dzi.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dmf.a a(dzi.b $$0) {
      return $$0 == dzi.b.c ? dmf.a.c : dmf.a.a;
   }

   private static eak a(cut $$0, float $$1, cut $$2) {
      return new eak(new eam($$0, $$1), dzt.b, $$2.o());
   }

   private static eak a(cut $$0, cut $$1) {
      return new eak(new dzy($$0), dzt.b, $$1.o());
   }

   public static class a {
      public static final Codec<dzi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dzi.a::new)
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

   public static enum b implements aub {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final aub.a<dzi.b> g = aub.a(dzi.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dzi.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
