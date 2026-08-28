import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eth extends erd {
   private static final float h = 0.3F;
   private static final float i = 0.07F;
   private static final float j = 0.2F;
   private final eth.b k;
   private final eth.a l;

   public eth(euw $$0, iu $$1, eth.b $$2, eth.a $$3, alg $$4, euv $$5, dst $$6, drc $$7, iu $$8) {
      super(erk.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.k = $$2;
      this.l = $$3;
   }

   public eth(euw $$0, tz $$1) {
      super(erk.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.k = eth.b.a($$1.l("VerticalPlacement"));
      this.l = $$1.<eth.a>a("Properties", eth.a.a).orElseThrow();
   }

   @Override
   protected void a(erj $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.k.a());
      $$1.a("Properties", eth.a.a, this.l);
   }

   private static eur a(euw $$0, tz $$1, alg $$2) {
      euv $$3 = $$0.a($$2);
      iu $$4 = new iu($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         drc.valueOf($$1.l("Mirror")),
         dst.valueOf($$1.l("Rotation")),
         eth.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eth.a)eth.a.a.parse(new Dynamic(un.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static eur a(drc $$0, dst $$1, eth.b $$2, iu $$3, eth.a $$4) {
      etw $$5 = $$4.d ? etw.b : etw.d;
      List<euk> $$6 = Lists.newArrayList();
      $$6.add(a(dmc.cp, 0.3F, dmc.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dmc.ej, 0.07F, dmc.lm));
      }

      eur $$7 = new eur().a($$1).a($$0).a($$3).a($$5).a(new euo($$6)).a(new etv($$4.c)).a(new eul(axc.bR)).a(new eud());
      if ($$4.g) {
         $$7.a(etu.b);
      }

      return $$7;
   }

   private static euk a(eth.b $$0, eth.a $$1) {
      if ($$0 == eth.b.c) {
         return a(dmc.K, dmc.lm);
      } else {
         return $$1.b ? a(dmc.K, dmc.ej) : a(dmc.K, 0.2F, dmc.lm);
      }
   }

   @Override
   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
      eql $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.l.f || this.l.e) {
            iu.a(this.f()).forEach($$2x -> {
               if (this.l.f) {
                  this.a($$3, (diw)$$0, $$2x);
               }

               if (this.l.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iu $$1, djm $$2, azv $$3, eql $$4) {
   }

   private void a(azv $$0, diw $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dmc.fu)) {
         ja $$4 = a($$0);
         iu $$5 = $$2.a($$4);
         dzz $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dma.a($$3.g($$1, $$2), $$4)) {
               eaq $$7 = dvk.a($$4.g());
               $$1.a($$5, dmc.fu.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azv $$0, diw $$1, iu $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dmc.ej) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dmc.aN.m().b(dqp.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azv $$0, diw $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iu $$4 = new iu($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dmc.ej)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azv $$0, diw $$1, iu $$2) {
      iu.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ja.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azv $$0, diw $$1) {
      boolean $$2 = this.k == eth.b.a || this.k == eth.b.c;
      iu $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      iu.a $$11 = iu.c.k();

      for (int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; $$12++) {
         for (int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; $$13++) {
            int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
            int $$15 = Math.max(0, $$14 + $$9);
            if ($$15 < $$7) {
               float $$16 = $$6[$$15];
               if ($$0.j() < (double)$$16) {
                  int $$17 = a($$1, $$12, $$13, this.k);
                  int $$18 = $$2 ? $$17 : Math.min(this.f.i(), $$17);
                  $$11.d($$12, $$18, $$13);
                  if (Math.abs($$18 - this.f.i()) <= 3 && this.a($$1, $$11)) {
                     this.d($$0, $$1, $$11);
                     if (this.l.e) {
                        this.b($$0, $$1, $$11);
                     }

                     this.c($$0, $$1, $$11.e());
                  }
               }
            }
         }
      }
   }

   private boolean a(diw $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      return !$$2.a(dmc.a) && !$$2.a(dmc.cw) && !$$2.a(axc.bR) && (this.k == eth.b.f || !$$2.a(dmc.K));
   }

   private void d(azv $$0, diw $$1, iu $$2) {
      if (!this.l.b && $$0.i() < 0.07F) {
         $$1.a($$2, dmc.lm.m(), 3);
      } else {
         $$1.a($$2, dmc.ej.m(), 3);
      }
   }

   private static int a(diw $$0, int $$1, int $$2, eth.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static efy.a a(eth.b $$0) {
      return $$0 == eth.b.c ? efy.a.c : efy.a.a;
   }

   private static euk a(dma $$0, float $$1, dma $$2) {
      return new euk(new eum($$0, $$1), ets.b, $$2.m());
   }

   private static euk a(dma $$0, dma $$1) {
      return new euk(new etx($$0), ets.b, $$1.m());
   }

   public static class a {
      public static final Codec<eth.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eth.a::new)
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

   public static enum b implements bak {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final bak.a<eth.b> g = bak.a(eth.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eth.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
