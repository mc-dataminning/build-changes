import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class enq extends elm {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final enq.b l;
   private final enq.a m;

   public enq(epf $$0, je $$1, enq.b $$2, enq.a $$3, alc $$4, epe $$5, dnx $$6, dmg $$7, je $$8) {
      super(elt.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public enq(epf $$0, uf $$1) {
      super(elt.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = enq.b.a($$1.l("VerticalPlacement"));
      this.m = (enq.a)enq.a.a.parse(new Dynamic(ut.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(els $$0, uf $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      enq.a.a.encodeStart(ut.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static epa a(epf $$0, uf $$1, alc $$2) {
      epe $$3 = $$0.a($$2);
      je $$4 = new je($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dmg.valueOf($$1.l("Mirror")),
         dnx.valueOf($$1.l("Rotation")),
         enq.b.a($$1.l("VerticalPlacement")),
         $$4,
         (enq.a)enq.a.a.parse(new Dynamic(ut.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static epa a(dmg $$0, dnx $$1, enq.b $$2, je $$3, enq.a $$4) {
      eof $$5 = $$4.d ? eof.b : eof.d;
      List<eot> $$6 = Lists.newArrayList();
      $$6.add(a(dhl.ch, 0.3F, dhl.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dhl.dV, 0.07F, dhl.kJ));
      }

      epa $$7 = new epa().a($$1).a($$0).a($$3).a($$5).a(new eox($$6)).a(new eoe($$4.c)).a(new eou(awt.bP)).a(new eom());
      if ($$4.g) {
         $$7.a(eod.b);
      }

      return $$7;
   }

   private static eot a(enq.b $$0, enq.a $$1) {
      if ($$0 == enq.b.c) {
         return a(dhl.H, dhl.kJ);
      } else {
         return $$1.b ? a(dhl.H, dhl.dV) : a(dhl.H, 0.2F, dhl.kJ);
      }
   }

   @Override
   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
      eku $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            je.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (deh)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, je $$1, dew $$2, azl $$3, eku $$4) {
   }

   private void a(azl $$0, deh $$1, je $$2) {
      duo $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dhl.ff)) {
         jj $$4 = a($$0);
         je $$5 = $$2.a($$4);
         duo $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dhj.a($$3.g($$1, $$2), $$4)) {
               dvf $$7 = dqg.a($$4.g());
               $$1.a($$5, dhl.ff.o().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azl $$0, deh $$1, je $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dhl.dV) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dhl.aH.o().b(dlt.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azl $$0, deh $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            je $$4 = new je($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dhl.dV)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azl $$0, deh $$1, je $$2) {
      je.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jj.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azl $$0, deh $$1) {
      boolean $$2 = this.l == enq.b.a || this.l == enq.b.c;
      je $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      je.a $$11 = je.c.k();

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

                     this.c($$0, $$1, $$11.e());
                  }
               }
            }
         }
      }
   }

   private boolean a(deh $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      return !$$2.a(dhl.a) && !$$2.a(dhl.co) && !$$2.a(awt.bP) && (this.l == enq.b.f || !$$2.a(dhl.H));
   }

   private void d(azl $$0, deh $$1, je $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dhl.kJ.o(), 3);
      } else {
         $$1.a($$2, dhl.dV.o(), 3);
      }
   }

   private static int a(deh $$0, int $$1, int $$2, enq.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static eak.a a(enq.b $$0) {
      return $$0 == enq.b.c ? eak.a.c : eak.a.a;
   }

   private static eot a(dhj $$0, float $$1, dhj $$2) {
      return new eot(new eov($$0, $$1), eob.b, $$2.o());
   }

   private static eot a(dhj $$0, dhj $$1) {
      return new eot(new eog($$0), eob.b, $$1.o());
   }

   public static class a {
      public static final Codec<enq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, enq.a::new)
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

   public static enum b implements azz {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azz.a<enq.b> g = azz.a(enq.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static enq.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
