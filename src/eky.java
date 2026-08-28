import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class eky extends eik {
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
   private final List<eky.a> i;
   public static final MapCodec<eky> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ayh.a(eky.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, eky::new)
   );

   public eky(eik.c $$0, List<eky.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public eky(eik.c $$0, eky.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      ekx.a $$1 = new ekx.a();
      dyt $$2 = $$0.f();
      eky.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (eky.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (eky.a $$7 : this.i) {
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
         eky.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         alf $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new alf(f[$$2.a(f.length)]);
         } else {
            $$9 = new alf(e[$$2.a(e.length)]);
         }

         emk $$11 = $$0.e().a($$9);
         dlm $$12 = ac.a(dlm.values(), $$2);
         djw $$13 = $$2.i() < 0.5F ? djw.a : djw.c;
         iz $$14 = new iz($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dtz $$15 = $$0.b();
         dca $$16 = $$0.i();
         dyi $$17 = $$0.d();
         iz $$18 = $$0.h().l();
         eic $$19 = $$11.a($$18, $$12, $$14, $$13);
         iz $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), ekx.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         iz $$23 = new iz($$18.u(), $$22, $$18.w());
         return Optional.of(new eik.b($$23, (Consumer<ejc>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(jt.a($$23.u()), jt.a($$23.v()), jt.a($$23.w()), $$17.b()));
            }

            $$10.a(new ekx($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dyt $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(iz $$0, ji<dcx> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(azh $$0, dtz $$1, ekx.b $$2, boolean $$3, int $$4, int $$5, eic $$6, dca $$7, dyi $$8) {
      int $$9 = $$7.I_() + 15;
      int $$10;
      if ($$2 == ekx.b.f) {
         if ($$3) {
            $$10 = ayz.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = ayz.b($$0, 27, 29);
         } else {
            $$10 = ayz.b($$0, 29, 100);
         }
      } else if ($$2 == ekx.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == ekx.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == ekx.b.b) {
         $$10 = $$4 - $$5 + ayz.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<iz> $$19 = ImmutableList.of(new iz($$6.h(), 0, $$6.j()), new iz($$6.k(), 0, $$6.j()), new iz($$6.h(), 0, $$6.m()), new iz($$6.k(), 0, $$6.m()));
      List<dck> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dxu.a $$21 = $$2 == ekx.b.c ? dxu.a.c : dxu.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dck $$24 : $$20) {
            dsc $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(azh $$0, int $$1, int $$2) {
      return $$1 < $$2 ? ayz.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public eit<?> e() {
      return eit.l;
   }

   public static record a(ekx.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<eky.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ekx.b.g.fieldOf("placement").forGetter(eky.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(eky.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(eky.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(eky.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(eky.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(eky.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(eky.a::g),
                  ayh.m.fieldOf("weight").forGetter(eky.a::h)
               )
               .apply($$0, eky.a::new)
      );

      public ekx.b a() {
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
