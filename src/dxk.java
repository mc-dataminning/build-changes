import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class dxk extends dvd {
   private static final String[] e = new String[]{
      "ruined_portal/portal_1",
      "ruined_portal/portal_2",
      "ruined_portal/portal_3",
      "ruined_portal/portal_4",
      "ruined_portal/portal_5",
      "ruined_portal/portal_6",
      "ruined_portal/portal_7",
      "ruined_portal/portal_8",
      "ruined_portal/portal_9",
      "ruined_portal/portal_10"
   };
   private static final String[] f = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};
   private static final float g = 0.05F;
   private static final int h = 15;
   private final List<dxk.a> i;
   public static final Codec<dxk> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), arb.a(dxk.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, dxk::new)
   );

   public dxk(dvd.c $$0, List<dxk.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public dxk(dvd.c $$0, dxk.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      dxj.a $$1 = new dxj.a();
      dlm $$2 = $$0.f();
      dxk.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (dxk.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (dxk.a $$7 : this.i) {
            $$6 -= $$7.h() / $$4;
            if ($$6 < 0.0F) {
               $$3 = $$7;
               break;
            }
         }
      } else {
         $$3 = this.i.get(0);
      }

      if ($$3 == null) {
         throw new IllegalStateException();
      } else {
         dxk.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         aeu $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new aeu(f[$$2.a(f.length)]);
         } else {
            $$9 = new aeu(e[$$2.a(e.length)]);
         }

         dyw $$11 = $$0.e().a($$9);
         czc $$12 = ac.a(czc.values(), $$2);
         cxl $$13 = $$2.i() < 0.5F ? cxl.a : cxl.c;
         gw $$14 = new gw($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dhb $$15 = $$0.b();
         cps $$16 = $$0.i();
         dlb $$17 = $$0.d();
         gw $$18 = $$0.h().l();
         duv $$19 = $$11.a($$18, $$12, $$14, $$13);
         gw $$20 = $$19.f();
         int $$21 = $$15.a($$20.u(), $$20.w(), dxj.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.d(), $$19, $$16, $$17);
         gw $$23 = new gw($$18.u(), $$22, $$18.w());
         return Optional.of(new dvd.b($$23, (Consumer<dvv>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(hs.a($$23.u()), hs.a($$23.v()), hs.a($$23.w()), $$17.b()));
            }

            $$10.a(new dxj($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dlm $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(gw $$0, hg<cqo> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(arx $$0, dhb $$1, dxj.b $$2, boolean $$3, int $$4, int $$5, duv $$6, cps $$7, dlb $$8) {
      int $$9 = $$7.C_() + 15;
      int $$10;
      if ($$2 == dxj.b.f) {
         if ($$3) {
            $$10 = ars.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = ars.b($$0, 27, 29);
         } else {
            $$10 = ars.b($$0, 29, 100);
         }
      } else if ($$2 == dxj.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == dxj.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == dxj.b.b) {
         $$10 = $$4 - $$5 + ars.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<gw> $$19 = ImmutableList.of(new gw($$6.g(), 0, $$6.i()), new gw($$6.j(), 0, $$6.i()), new gw($$6.g(), 0, $$6.l()), new gw($$6.j(), 0, $$6.l()));
      List<cqc> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dkn.a $$21 = $$2 == dxj.b.c ? dkn.a.c : dkn.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (cqc $$24 : $$20) {
            dfe $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(arx $$0, int $$1, int $$2) {
      return $$1 < $$2 ? ars.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dvm<?> e() {
      return dvm.l;
   }

   public static record a(dxj.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<dxk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxj.b.g.fieldOf("placement").forGetter(dxk.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(dxk.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(dxk.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(dxk.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(dxk.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(dxk.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(dxk.a::g),
                  arb.k.fieldOf("weight").forGetter(dxk.a::h)
               )
               .apply($$0, dxk.a::new)
      );

      public dxj.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public boolean f() {
         return this.g;
      }

      public boolean g() {
         return this.h;
      }

      public float h() {
         return this.i;
      }
   }
}
