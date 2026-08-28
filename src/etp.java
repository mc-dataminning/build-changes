import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etp extends erl {
   private static final float h = 0.3F;
   private static final float i = 0.07F;
   private static final float j = 0.2F;
   private final etp.b k;
   private final etp.a l;

   public etp(eve $$0, iu $$1, etp.b $$2, etp.a $$3, alg $$4, evd $$5, dsz $$6, dri $$7, iu $$8) {
      super(ers.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.k = $$2;
      this.l = $$3;
   }

   public etp(eve $$0, tz $$1) {
      super(ers.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.k = etp.b.a($$1.l("VerticalPlacement"));
      this.l = $$1.<etp.a>a("Properties", etp.a.a).orElseThrow();
   }

   @Override
   protected void a(err $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.k.a());
      $$1.a("Properties", etp.a.a, this.l);
   }

   private static euz a(eve $$0, tz $$1, alg $$2) {
      evd $$3 = $$0.a($$2);
      iu $$4 = new iu($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dri.valueOf($$1.l("Mirror")),
         dsz.valueOf($$1.l("Rotation")),
         etp.b.a($$1.l("VerticalPlacement")),
         $$4,
         (etp.a)etp.a.a.parse(new Dynamic(un.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static euz a(dri $$0, dsz $$1, etp.b $$2, iu $$3, etp.a $$4) {
      eue $$5 = $$4.d ? eue.b : eue.d;
      List<eus> $$6 = Lists.newArrayList();
      $$6.add(a(dmh.cr, 0.3F, dmh.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dmh.em, 0.07F, dmh.lp));
      }

      euz $$7 = new euz().a($$1).a($$0).a($$3).a($$5).a(new euw($$6)).a(new eud($$4.c)).a(new eut(axc.bS)).a(new eul());
      if ($$4.g) {
         $$7.a(euc.b);
      }

      return $$7;
   }

   private static eus a(etp.b $$0, etp.a $$1) {
      if ($$0 == etp.b.c) {
         return a(dmh.K, dmh.lp);
      } else {
         return $$1.b ? a(dmh.K, dmh.em) : a(dmh.K, 0.2F, dmh.lp);
      }
   }

   @Override
   public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, iu $$6) {
      eqt $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.l.f || this.l.e) {
            iu.a(this.f()).forEach($$2x -> {
               if (this.l.f) {
                  this.a($$3, (djb)$$0, $$2x);
               }

               if (this.l.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, iu $$1, djr $$2, azv $$3, eqt $$4) {
   }

   private void a(azv $$0, djb $$1, iu $$2) {
      eah $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dmh.fx)) {
         ja $$4 = a($$0);
         iu $$5 = $$2.a($$4);
         eah $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dmf.a($$3.g($$1, $$2), $$4)) {
               eay $$7 = dvs.a($$4.g());
               $$1.a($$5, dmh.fx.m().b($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(azv $$0, djb $$1, iu $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dmh.em) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dmh.aN.m().b(dqv.c, Boolean.valueOf(true)), 3);
      }
   }

   private void a(azv $$0, djb $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            iu $$4 = new iu($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dmh.em)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(azv $$0, djb $$1, iu $$2) {
      iu.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ja.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(azv $$0, djb $$1) {
      boolean $$2 = this.k == etp.b.a || this.k == etp.b.c;
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

   private boolean a(djb $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      return !$$2.a(dmh.a) && !$$2.a(dmh.cy) && !$$2.a(axc.bS) && (this.k == etp.b.f || !$$2.a(dmh.K));
   }

   private void d(azv $$0, djb $$1, iu $$2) {
      if (!this.l.b && $$0.i() < 0.07F) {
         $$1.a($$2, dmh.lp.m(), 3);
      } else {
         $$1.a($$2, dmh.em.m(), 3);
      }
   }

   private static int a(djb $$0, int $$1, int $$2, etp.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static egg.a a(etp.b $$0) {
      return $$0 == etp.b.c ? egg.a.c : egg.a.a;
   }

   private static eus a(dmf $$0, float $$1, dmf $$2) {
      return new eus(new euu($$0, $$1), eua.b, $$2.m());
   }

   private static eus a(dmf $$0, dmf $$1) {
      return new eus(new euf($$0), eua.b, $$1.m());
   }

   public static class a {
      public static final Codec<etp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, etp.a::new)
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

      public static final bak.a<etp.b> g = bak.a(etp.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static etp.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
