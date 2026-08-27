import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ecc extends dzo {
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
   private final List<ecc.a> i;
   public static final Codec<ecc> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), atx.a(ecc.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, ecc::new)
   );

   public ecc(dzo.c $$0, List<ecc.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public ecc(dzo.c $$0, ecc.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      ecb.a $$1 = new ecb.a();
      dpx $$2 = $$0.f();
      ecc.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (ecc.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (ecc.a $$7 : this.i) {
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
         ecc.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         ahh $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new ahh(f[$$2.a(f.length)]);
         } else {
            $$9 = new ahh(e[$$2.a(e.length)]);
         }

         edo $$11 = $$0.e().a($$9);
         ddk $$12 = ac.a(ddk.values(), $$2);
         dbu $$13 = $$2.i() < 0.5F ? dbu.a : dbu.c;
         hx $$14 = new hx($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dlm $$15 = $$0.b();
         ctz $$16 = $$0.i();
         dpm $$17 = $$0.d();
         hx $$18 = $$0.h().l();
         dzg $$19 = $$11.a($$18, $$12, $$14, $$13);
         hx $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), ecb.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         hx $$23 = new hx($$18.u(), $$22, $$18.w());
         return Optional.of(new dzo.b($$23, (Consumer<eag>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(is.a($$23.u()), is.a($$23.v()), is.a($$23.w()), $$17.b()));
            }

            $$10.a(new ecb($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dpx $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(hx $$0, ih<cuw> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(auw $$0, dlm $$1, ecb.b $$2, boolean $$3, int $$4, int $$5, dzg $$6, ctz $$7, dpm $$8) {
      int $$9 = $$7.J_() + 15;
      int $$10;
      if ($$2 == ecb.b.f) {
         if ($$3) {
            $$10 = aup.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = aup.b($$0, 27, 29);
         } else {
            $$10 = aup.b($$0, 29, 100);
         }
      } else if ($$2 == ecb.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == ecb.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == ecb.b.b) {
         $$10 = $$4 - $$5 + aup.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<hx> $$19 = ImmutableList.of(new hx($$6.h(), 0, $$6.j()), new hx($$6.k(), 0, $$6.j()), new hx($$6.h(), 0, $$6.m()), new hx($$6.k(), 0, $$6.m()));
      List<cuj> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      doy.a $$21 = $$2 == ecb.b.c ? doy.a.c : doy.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (cuj $$24 : $$20) {
            djp $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(auw $$0, int $$1, int $$2) {
      return $$1 < $$2 ? aup.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dzx<?> e() {
      return dzx.l;
   }

   public static record a(ecb.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<ecc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ecb.b.g.fieldOf("placement").forGetter(ecc.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(ecc.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(ecc.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(ecc.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(ecc.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(ecc.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(ecc.a::g),
                  atx.k.fieldOf("weight").forGetter(ecc.a::h)
               )
               .apply($$0, ecc.a::new)
      );

      public ecb.b a() {
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
