import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class eqs extends eod {
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
   private final List<eqs.a> i;
   public static final MapCodec<eqs> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), azd.a(eqs.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, eqs::new)
   );

   public eqs(eod.c $$0, List<eqs.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public eqs(eod.c $$0, eqs.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      eqr.a $$1 = new eqr.a();
      eei $$2 = $$0.f();
      eqs.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (eqs.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (eqs.a $$7 : this.i) {
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
         eqs.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         alp $$9;
         if ($$2.i() < 0.05F) {
            $$9 = alp.b(f[$$2.a(f.length)]);
         } else {
            $$9 = alp.b(e[$$2.a(e.length)]);
         }

         esf $$11 = $$0.e().a($$9);
         dqv $$12 = ae.a(dqv.values(), $$2);
         dpc $$13 = $$2.i() < 0.5F ? dpc.a : dpc.c;
         jh $$14 = new jh($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dzk $$15 = $$0.b();
         dhb $$16 = $$0.i();
         edx $$17 = $$0.d();
         jh $$18 = $$0.h().l();
         env $$19 = $$11.a($$18, $$12, $$14, $$13);
         jh $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), eqr.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         jh $$23 = new jh($$18.u(), $$22, $$18.w());
         return Optional.of(new eod.b($$23, (Consumer<eov>)($$11x -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(kb.a($$23.u()), kb.a($$23.v()), kb.a($$23.w()), $$17.b()), $$15.f());
            }

            $$11x.a(new eqr($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(eei $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(jh $$0, jq<dib> $$1, int $$2) {
      return $$1.a().b($$0, $$2);
   }

   private static int a(bac $$0, dzk $$1, eqr.b $$2, boolean $$3, int $$4, int $$5, env $$6, dhb $$7, edx $$8) {
      int $$9 = $$7.L_() + 15;
      int $$10;
      if ($$2 == eqr.b.f) {
         if ($$3) {
            $$10 = azu.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = azu.b($$0, 27, 29);
         } else {
            $$10 = azu.b($$0, 29, 100);
         }
      } else if ($$2 == eqr.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == eqr.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == eqr.b.b) {
         $$10 = $$4 - $$5 + azu.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<jh> $$19 = ImmutableList.of(new jh($$6.h(), 0, $$6.j()), new jh($$6.k(), 0, $$6.j()), new jh($$6.h(), 0, $$6.m()), new jh($$6.k(), 0, $$6.m()));
      List<dhl> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      edj.a $$21 = $$2 == eqr.b.c ? edj.a.c : edj.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dhl $$24 : $$20) {
            dxo $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(bac $$0, int $$1, int $$2) {
      return $$1 < $$2 ? azu.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public eom<?> e() {
      return eom.l;
   }

   public static record a(eqr.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<eqs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eqr.b.g.fieldOf("placement").forGetter(eqs.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(eqs.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(eqs.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(eqs.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(eqs.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(eqs.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(eqs.a::g),
                  azd.o.fieldOf("weight").forGetter(eqs.a::h)
               )
               .apply($$0, eqs.a::new)
      );

      public eqr.b a() {
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
