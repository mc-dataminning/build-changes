import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eky extends eiv {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eky.b l;
   private final eky.a m;

   public eky(emm $$0, iz $$1, eky.b $$2, eky.a $$3, alf $$4, eml $$5, dln $$6, djx $$7, iz $$8) {
      super(ejc.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eky(emm $$0, us $$1) {
      super(ejc.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eky.b.a($$1.l("VerticalPlacement"));
      this.m = (eky.a)eky.a.a.parse(new Dynamic(vg.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ejb $$0, us $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eky.a.a.encodeStart(vg.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static emh a(emm $$0, us $$1, alf $$2) {
      eml $$3 = $$0.a($$2);
      iz $$4 = new iz($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         djx.valueOf($$1.l("Mirror")),
         dln.valueOf($$1.l("Rotation")),
         eky.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eky.a)eky.a.a.parse(new Dynamic(vg.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static emh a(djx $$0, dln $$1, eky.b $$2, iz $$3, eky.a $$4) {
      eln $$5 = $$4.d ? eln.b : eln.d;
      List<ema> $$6 = Lists.newArrayList();
      $$6.add(a(dfc.ch, 0.3F, dfc.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dfc.dV, 0.07F, dfc.kJ));
      }

      emh $$7 = new emh().a($$1).a($$0).a($$3).a($$5).a(new eme($$6)).a(new elm($$4.c)).a(new emb(awp.bO)).a(new elu());
      if ($$4.g) {
         $$7.a(ell.b);
      }

      return $$7;
   }

   private static ema a(eky.b $$0, eky.a $$1) {
      if ($$0 == eky.b.c) {
         return a(dfc.H, dfc.kJ);
      } else {
         return $$1.b ? a(dfc.H, dfc.dV) : a(dfc.H, 0.2F, dfc.kJ);
      }
   }

   @Override
   public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
      eid $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            iz.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dca)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iz $$1, dco $$2, azh $$3, eid $$4) {
   }

   private void a(azh $$0, dca $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dfc.ff)) {
         je $$4 = a($$0);
         iz $$5 = $$2.a($$4);
         dsd $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dfa.a($$3.k($$1, $$2), $$4)) {
               dsu $$7 = dnw.a($$4.g());
               $$1.a($$5, dfc.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azh $$0, dca $$1, iz $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dfc.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dfc.aH.o().a(djk.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azh $$0, dca $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iz $$4 = new iz($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dfc.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(azh $$0, dca $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(je.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azh $$0, dca $$1) {
      boolean $$2 = this.l == eky.b.a || this.l == eky.b.c;
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

   private boolean a(dca $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      return !$$2.a(dfc.a) && !$$2.a(dfc.co) && !$$2.a(awp.bO) && (this.l == eky.b.f || !$$2.a(dfc.H));
   }

   private void d(azh $$0, dca $$1, iz $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dfc.kJ.o(), 3);
      } else {
         $$1.a($$2, dfc.dV.o(), 3);
      }
   }

   private static int a(dca $$0, int $$1, int $$2, eky.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dxv.a a(eky.b $$0) {
      return $$0 == eky.b.c ? dxv.a.c : dxv.a.a;
   }

   private static ema a(dfa $$0, float $$1, dfa $$2) {
      return new ema(new emc($$0, $$1), elj.b, $$2.o());
   }

   private static ema a(dfa $$0, dfa $$1) {
      return new ema(new elo($$0), elj.b, $$1.o());
   }

   public static class a {
      public static final Codec<eky.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eky.a::new)
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

   public static enum b implements azu {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final azu.a<eky.b> g = azu.a(eky.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eky.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
