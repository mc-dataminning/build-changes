import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class env extends elg {
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
   private final List<env.a> i;
   public static final MapCodec<env> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ayo.a(env.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, env::new)
   );

   public env(elg.c $$0, List<env.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public env(elg.c $$0, env.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      enu.a $$1 = new enu.a();
      ebn $$2 = $$0.f();
      env.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (env.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (env.a $$7 : this.i) {
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
         env.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         ale $$9;
         if ($$2.i() < 0.05F) {
            $$9 = ale.b(f[$$2.a(f.length)]);
         } else {
            $$9 = ale.b(e[$$2.a(e.length)]);
         }

         epi $$11 = $$0.e().a($$9);
         doa $$12 = ad.a(doa.values(), $$2);
         dmj $$13 = $$2.i() < 0.5F ? dmj.a : dmj.c;
         jf $$14 = new jf($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dwp $$15 = $$0.b();
         del $$16 = $$0.i();
         ebc $$17 = $$0.d();
         jf $$18 = $$0.h().l();
         eky $$19 = $$11.a($$18, $$12, $$14, $$13);
         jf $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), enu.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         jf $$23 = new jf($$18.u(), $$22, $$18.w());
         return Optional.of(new elg.b($$23, (Consumer<ely>)($$11x -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(jz.a($$23.u()), jz.a($$23.v()), jz.a($$23.w()), $$17.b()), $$15.f());
            }

            $$11x.a(new enu($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(ebn $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(jf $$0, jo<dfk> $$1, int $$2) {
      return $$1.a().b($$0, $$2);
   }

   private static int a(azn $$0, dwp $$1, enu.b $$2, boolean $$3, int $$4, int $$5, eky $$6, del $$7, ebc $$8) {
      int $$9 = $$7.H_() + 15;
      int $$10;
      if ($$2 == enu.b.f) {
         if ($$3) {
            $$10 = azf.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = azf.b($$0, 27, 29);
         } else {
            $$10 = azf.b($$0, 29, 100);
         }
      } else if ($$2 == enu.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == enu.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == enu.b.b) {
         $$10 = $$4 - $$5 + azf.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<jf> $$19 = ImmutableList.of(new jf($$6.h(), 0, $$6.j()), new jf($$6.k(), 0, $$6.j()), new jf($$6.h(), 0, $$6.m()), new jf($$6.k(), 0, $$6.m()));
      List<dev> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      eao.a $$21 = $$2 == enu.b.c ? eao.a.c : eao.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dev $$24 : $$20) {
            dus $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(azn $$0, int $$1, int $$2) {
      return $$1 < $$2 ? azf.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public elp<?> e() {
      return elp.l;
   }

   public static record a(enu.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<env.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  enu.b.g.fieldOf("placement").forGetter(env.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(env.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(env.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(env.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(env.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(env.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(env.a::g),
                  ayo.n.fieldOf("weight").forGetter(env.a::h)
               )
               .apply($$0, env.a::new)
      );

      public enu.b a() {
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
