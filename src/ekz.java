import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ekz extends eiw {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ekz.b l;
   private final ekz.a m;

   public ekz(emn $$0, iz $$1, ekz.b $$2, ekz.a $$3, alf $$4, emm $$5, dlo $$6, djy $$7, iz $$8) {
      super(ejd.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ekz(emn $$0, us $$1) {
      super(ejd.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ekz.b.a($$1.l("VerticalPlacement"));
      this.m = (ekz.a)ekz.a.a.parse(new Dynamic(vg.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ejc $$0, us $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ekz.a.a.encodeStart(vg.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static emi a(emn $$0, us $$1, alf $$2) {
      emm $$3 = $$0.a($$2);
      iz $$4 = new iz($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         djy.valueOf($$1.l("Mirror")),
         dlo.valueOf($$1.l("Rotation")),
         ekz.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ekz.a)ekz.a.a.parse(new Dynamic(vg.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static emi a(djy $$0, dlo $$1, ekz.b $$2, iz $$3, ekz.a $$4) {
      elo $$5 = $$4.d ? elo.b : elo.d;
      List<emb> $$6 = Lists.newArrayList();
      $$6.add(a(dfd.ch, 0.3F, dfd.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dfd.dV, 0.07F, dfd.kJ));
      }

      emi $$7 = new emi().a($$1).a($$0).a($$3).a($$5).a(new emf($$6)).a(new eln($$4.c)).a(new emc(awp.bO)).a(new elv());
      if ($$4.g) {
         $$7.a(elm.b);
      }

      return $$7;
   }

   private static emb a(ekz.b $$0, ekz.a $$1) {
      if ($$0 == ekz.b.c) {
         return a(dfd.H, dfd.kJ);
      } else {
         return $$1.b ? a(dfd.H, dfd.dV) : a(dfd.H, 0.2F, dfd.kJ);
      }
   }

   @Override
   public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
      eie $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            iz.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dcb)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iz $$1, dcp $$2, azh $$3, eie $$4) {
   }

   private void a(azh $$0, dcb $$1, iz $$2) {
      dse $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dfd.ff)) {
         je $$4 = a($$0);
         iz $$5 = $$2.a($$4);
         dse $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dfb.a($$3.k($$1, $$2), $$4)) {
               dsv $$7 = dnx.a($$4.g());
               $$1.a($$5, dfd.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azh $$0, dcb $$1, iz $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dfd.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dfd.aH.o().a(djl.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azh $$0, dcb $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iz $$4 = new iz($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dfd.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(azh $$0, dcb $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(je.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azh $$0, dcb $$1) {
      boolean $$2 = this.l == ekz.b.a || this.l == ekz.b.c;
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

   private boolean a(dcb $$0, iz $$1) {
      dse $$2 = $$0.a_($$1);
      return !$$2.a(dfd.a) && !$$2.a(dfd.co) && !$$2.a(awp.bO) && (this.l == ekz.b.f || !$$2.a(dfd.H));
   }

   private void d(azh $$0, dcb $$1, iz $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dfd.kJ.o(), 3);
      } else {
         $$1.a($$2, dfd.dV.o(), 3);
      }
   }

   private static int a(dcb $$0, int $$1, int $$2, ekz.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dxw.a a(ekz.b $$0) {
      return $$0 == ekz.b.c ? dxw.a.c : dxw.a.a;
   }

   private static emb a(dfb $$0, float $$1, dfb $$2) {
      return new emb(new emd($$0, $$1), elk.b, $$2.o());
   }

   private static emb a(dfb $$0, dfb $$1) {
      return new emb(new elp($$0), elk.b, $$1.o());
   }

   public static class a {
      public static final Codec<ekz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ekz.a::new)
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

      public static final azu.a<ekz.b> g = azu.a(ekz.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ekz.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
