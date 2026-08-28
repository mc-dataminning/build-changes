import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class euq extends esb {
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
   private final List<euq.a> i;
   public static final MapCodec<euq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ayw.b(euq.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, euq::new)
   );

   public euq(esb.c $$0, List<euq.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public euq(esb.c $$0, euq.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      eup.a $$1 = new eup.a();
      eic $$2 = $$0.f();
      euq.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (euq.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (euq.a $$7 : this.i) {
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
         euq.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         ali $$9;
         if ($$2.i() < 0.05F) {
            $$9 = ali.b(f[$$2.a(f.length)]);
         } else {
            $$9 = ali.b(e[$$2.a(e.length)]);
         }

         ewd $$11 = $$0.e().a($$9);
         dtw $$12 = ag.a(dtw.values(), $$2);
         dsf $$13 = $$2.i() < 0.5F ? dsf.a : dsf.c;
         iv $$14 = new iv($$11.a().u() / 2, 0, $$11.a().w() / 2);
         edc $$15 = $$0.b();
         djz $$16 = $$0.i();
         ehr $$17 = $$0.d();
         iv $$18 = $$0.h().l();
         ert $$19 = $$11.a($$18, $$12, $$14, $$13);
         iv $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), eup.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         iv $$23 = new iv($$18.u(), $$22, $$18.w());
         return Optional.of(new esb.b($$23, (Consumer<est>)($$11x -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(jq.a($$23.u()), jq.a($$23.v()), jq.a($$23.w()), $$17.b()), $$15.f());
            }

            $$11x.a(new eup($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(eic $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(iv $$0, jf<dla> $$1, int $$2) {
      return $$1.a().b($$0, $$2);
   }

   private static int a(azx $$0, edc $$1, eup.b $$2, boolean $$3, int $$4, int $$5, ert $$6, djz $$7, ehr $$8) {
      int $$9 = $$7.K_() + 15;
      int $$10;
      if ($$2 == eup.b.f) {
         if ($$3) {
            $$10 = azo.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = azo.b($$0, 27, 29);
         } else {
            $$10 = azo.b($$0, 29, 100);
         }
      } else if ($$2 == eup.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == eup.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == eup.b.b) {
         $$10 = $$4 - $$5 + azo.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<iv> $$19 = ImmutableList.of(new iv($$6.h(), 0, $$6.j()), new iv($$6.k(), 0, $$6.j()), new iv($$6.h(), 0, $$6.m()), new iv($$6.k(), 0, $$6.m()));
      List<dkj> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      ehd.a $$21 = $$2 == eup.b.c ? ehd.a.c : ehd.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dkj $$24 : $$20) {
            ebe $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(azx $$0, int $$1, int $$2) {
      return $$1 < $$2 ? azo.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public esk<?> e() {
      return esk.l;
   }

   public static record a(eup.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<euq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eup.b.g.fieldOf("placement").forGetter(euq.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(euq.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(euq.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(euq.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(euq.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(euq.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(euq.a::g),
                  ayw.o.fieldOf("weight").forGetter(euq.a::h)
               )
               .apply($$0, euq.a::new)
      );

      public eup.b a() {
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
