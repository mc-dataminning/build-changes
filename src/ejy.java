import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ejy extends ehv {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ejy.b l;
   private final ejy.a m;

   public ejy(elm $$0, io $$1, ejy.b $$2, ejy.a $$3, akn $$4, ell $$5, dkn $$6, dix $$7, io $$8) {
      super(eic.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ejy(elm $$0, ud $$1) {
      super(eic.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ejy.b.a($$1.l("VerticalPlacement"));
      this.m = (ejy.a)ejy.a.a.parse(new Dynamic(ur.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eib $$0, ud $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ejy.a.a.encodeStart(ur.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static elh a(elm $$0, ud $$1, akn $$2) {
      ell $$3 = $$0.a($$2);
      io $$4 = new io($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dix.valueOf($$1.l("Mirror")),
         dkn.valueOf($$1.l("Rotation")),
         ejy.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ejy.a)ejy.a.a.parse(new Dynamic(ur.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static elh a(dix $$0, dkn $$1, ejy.b $$2, io $$3, ejy.a $$4) {
      ekn $$5 = $$4.d ? ekn.b : ekn.d;
      List<ela> $$6 = Lists.newArrayList();
      $$6.add(a(dec.ch, 0.3F, dec.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dec.dV, 0.07F, dec.kJ));
      }

      elh $$7 = new elh().a($$1).a($$0).a($$3).a($$5).a(new ele($$6)).a(new ekm($$4.c)).a(new elb(avx.bO)).a(new eku());
      if ($$4.g) {
         $$7.a(ekl.b);
      }

      return $$7;
   }

   private static ela a(ejy.b $$0, ejy.a $$1) {
      if ($$0 == ejy.b.c) {
         return a(dec.H, dec.kJ);
      } else {
         return $$1.b ? a(dec.H, dec.dV) : a(dec.H, 0.2F, dec.kJ);
      }
   }

   @Override
   public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
      ehd $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            io.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dba)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, io $$1, dbo $$2, aym $$3, ehd $$4) {
   }

   private void a(aym $$0, dba $$1, io $$2) {
      drd $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dec.ff)) {
         it $$4 = a($$0);
         io $$5 = $$2.a($$4);
         drd $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dea.a($$3.k($$1, $$2), $$4)) {
               dru $$7 = dmw.a($$4.g());
               $$1.a($$5, dec.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(aym $$0, dba $$1, io $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dec.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dec.aH.n().a(dik.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(aym $$0, dba $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            io $$4 = new io($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dec.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(aym $$0, dba $$1, io $$2) {
      io.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(it.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(aym $$0, dba $$1) {
      boolean $$2 = this.l == ejy.b.a || this.l == ejy.b.c;
      io $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      io.a $$11 = io.c.j();

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

   private boolean a(dba $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      return !$$2.a(dec.a) && !$$2.a(dec.co) && !$$2.a(avx.bO) && (this.l == ejy.b.f || !$$2.a(dec.H));
   }

   private void d(aym $$0, dba $$1, io $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dec.kJ.n(), 3);
      } else {
         $$1.a($$2, dec.dV.n(), 3);
      }
   }

   private static int a(dba $$0, int $$1, int $$2, ejy.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dwv.a a(ejy.b $$0) {
      return $$0 == ejy.b.c ? dwv.a.c : dwv.a.a;
   }

   private static ela a(dea $$0, float $$1, dea $$2) {
      return new ela(new elc($$0, $$1), ekj.b, $$2.n());
   }

   private static ela a(dea $$0, dea $$1) {
      return new ela(new eko($$0), ekj.b, $$1.n());
   }

   public static class a {
      public static final Codec<ejy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ejy.a::new)
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

   public static enum b implements ayz {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ayz.a<ejy.b> g = ayz.a(ejy.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ejy.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
