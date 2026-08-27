import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dzu extends dxr {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dzu.b l;
   private final dzu.a m;

   public dzu(ebi $$0, ht $$1, dzu.b $$2, dzu.a $$3, agi $$4, ebh $$5, dbm $$6, czw $$7, ht $$8) {
      super(dxy.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dzu(ebi $$0, rz $$1) {
      super(dxy.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dzu.b.a($$1.l("VerticalPlacement"));
      this.m = (dzu.a)dzu.a.a.parse(new Dynamic(sn.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dxx $$0, rz $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dzu.a.a.encodeStart(sn.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static ebd a(ebi $$0, rz $$1, agi $$2) {
      ebh $$3 = $$0.a($$2);
      ht $$4 = new ht($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         czw.valueOf($$1.l("Mirror")),
         dbm.valueOf($$1.l("Rotation")),
         dzu.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dzu.a)dzu.a.a.parse(new Dynamic(sn.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static ebd a(czw $$0, dbm $$1, dzu.b $$2, ht $$3, dzu.a $$4) {
      eaj $$5 = $$4.d ? eaj.b : eaj.d;
      List<eaw> $$6 = Lists.newArrayList();
      $$6.add(a(cvc.ch, 0.3F, cvc.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cvc.dV, 0.07F, cvc.kJ));
      }

      ebd $$7 = new ebd().a($$1).a($$0).a($$3).a($$5).a(new eba($$6)).a(new eai($$4.c)).a(new eax(arg.bH)).a(new eaq());
      if ($$4.g) {
         $$7.a(eah.b);
      }

      return $$7;
   }

   private static eaw a(dzu.b $$0, dzu.a $$1) {
      if ($$0 == dzu.b.c) {
         return a(cvc.H, cvc.kJ);
      } else {
         return $$1.b ? a(cvc.H, cvc.dV) : a(cvc.H, 0.2F, cvc.kJ);
      }
   }

   @Override
   public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, ht $$6) {
      dwz $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ht.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (csb)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ht $$1, csp $$2, ats $$3, dwz $$4) {
   }

   private void a(ats $$0, csb $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cvc.ff)) {
         hx $$4 = a($$0);
         ht $$5 = $$2.a($$4);
         dhi $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cva.a($$3.k($$1, $$2), $$4)) {
               dhz $$7 = ddt.a($$4.g());
               $$1.a($$5, cvc.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ats $$0, csb $$1, ht $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cvc.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cvc.aH.o().a(czj.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ats $$0, csb $$1) {
      for (int $$2 = this.f.g() + 1; $$2 < this.f.j(); $$2++) {
         for (int $$3 = this.f.i() + 1; $$3 < this.f.l(); $$3++) {
            ht $$4 = new ht($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(cvc.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ats $$0, csb $$1, ht $$2) {
      ht.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(hx.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ats $$0, csb $$1) {
      boolean $$2 = this.l == dzu.b.a || this.l == dzu.b.c;
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

   private boolean a(csb $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      return !$$2.a(cvc.a) && !$$2.a(cvc.co) && !$$2.a(arg.bH) && (this.l == dzu.b.f || !$$2.a(cvc.H));
   }

   private void d(ats $$0, csb $$1, ht $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cvc.kJ.o(), 3);
      } else {
         $$1.a($$2, cvc.dV.o(), 3);
      }
   }

   private static int a(csb $$0, int $$1, int $$2, dzu.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dmr.a a(dzu.b $$0) {
      return $$0 == dzu.b.c ? dmr.a.c : dmr.a.a;
   }

   private static eaw a(cva $$0, float $$1, cva $$2) {
      return new eaw(new eay($$0, $$1), eaf.b, $$2.o());
   }

   private static eaw a(cva $$0, cva $$1) {
      return new eaw(new eak($$0), eaf.b, $$1.o());
   }

   public static class a {
      public static final Codec<dzu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dzu.a::new)
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

   public static enum b implements aug {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final aug.a<dzu.b> g = aug.a(dzu.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dzu.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
