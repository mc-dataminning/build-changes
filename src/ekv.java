import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ekv extends eis {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ekv.b l;
   private final ekv.a m;

   public ekv(emj $$0, iz $$1, ekv.b $$2, ekv.a $$3, ale $$4, emi $$5, dlk $$6, dju $$7, iz $$8) {
      super(eiz.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ekv(emj $$0, ur $$1) {
      super(eiz.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ekv.b.a($$1.l("VerticalPlacement"));
      this.m = (ekv.a)ekv.a.a.parse(new Dynamic(vf.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(eiy $$0, ur $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ekv.a.a.encodeStart(vf.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static eme a(emj $$0, ur $$1, ale $$2) {
      emi $$3 = $$0.a($$2);
      iz $$4 = new iz($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dju.valueOf($$1.l("Mirror")),
         dlk.valueOf($$1.l("Rotation")),
         ekv.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ekv.a)ekv.a.a.parse(new Dynamic(vf.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static eme a(dju $$0, dlk $$1, ekv.b $$2, iz $$3, ekv.a $$4) {
      elk $$5 = $$4.d ? elk.b : elk.d;
      List<elx> $$6 = Lists.newArrayList();
      $$6.add(a(dez.ch, 0.3F, dez.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dez.dV, 0.07F, dez.kJ));
      }

      eme $$7 = new eme().a($$1).a($$0).a($$3).a($$5).a(new emb($$6)).a(new elj($$4.c)).a(new ely(awo.bO)).a(new elr());
      if ($$4.g) {
         $$7.a(eli.b);
      }

      return $$7;
   }

   private static elx a(ekv.b $$0, ekv.a $$1) {
      if ($$0 == ekv.b.c) {
         return a(dez.H, dez.kJ);
      } else {
         return $$1.b ? a(dez.H, dez.dV) : a(dez.H, 0.2F, dez.kJ);
      }
   }

   @Override
   public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, iz $$6) {
      eia $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            iz.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dbx)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iz $$1, dcl $$2, azf $$3, eia $$4) {
   }

   private void a(azf $$0, dbx $$1, iz $$2) {
      dsa $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dez.ff)) {
         je $$4 = a($$0);
         iz $$5 = $$2.a($$4);
         dsa $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dex.a($$3.k($$1, $$2), $$4)) {
               dsr $$7 = dnt.a($$4.g());
               $$1.a($$5, dez.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azf $$0, dbx $$1, iz $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dez.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dez.aH.o().a(djh.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azf $$0, dbx $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iz $$4 = new iz($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dez.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(azf $$0, dbx $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(je.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azf $$0, dbx $$1) {
      boolean $$2 = this.l == ekv.b.a || this.l == ekv.b.c;
      iz $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      iz.a $$11 = iz.c.j();

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

   private boolean a(dbx $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1);
      return !$$2.a(dez.a) && !$$2.a(dez.co) && !$$2.a(awo.bO) && (this.l == ekv.b.f || !$$2.a(dez.H));
   }

   private void d(azf $$0, dbx $$1, iz $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dez.kJ.o(), 3);
      } else {
         $$1.a($$2, dez.dV.o(), 3);
      }
   }

   private static int a(dbx $$0, int $$1, int $$2, ekv.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dxs.a a(ekv.b $$0) {
      return $$0 == ekv.b.c ? dxs.a.c : dxs.a.a;
   }

   private static elx a(dex $$0, float $$1, dex $$2) {
      return new elx(new elz($$0, $$1), elg.b, $$2.o());
   }

   private static elx a(dex $$0, dex $$1) {
      return new elx(new ell($$0), elg.b, $$1.o());
   }

   public static class a {
      public static final Codec<ekv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ekv.a::new)
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

   public static enum b implements azs {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azs.a<ekv.b> g = azs.a(ekv.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ekv.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
