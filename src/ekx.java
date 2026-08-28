import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ekx extends eij {
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
   private final List<ekx.a> i;
   public static final MapCodec<ekx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ayg.a(ekx.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, ekx::new)
   );

   public ekx(eij.c $$0, List<ekx.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public ekx(eij.c $$0, ekx.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      ekw.a $$1 = new ekw.a();
      dys $$2 = $$0.f();
      ekx.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (ekx.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (ekx.a $$7 : this.i) {
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
         ekx.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         ale $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new ale(f[$$2.a(f.length)]);
         } else {
            $$9 = new ale(e[$$2.a(e.length)]);
         }

         emj $$11 = $$0.e().a($$9);
         dll $$12 = ac.a(dll.values(), $$2);
         djv $$13 = $$2.i() < 0.5F ? djv.a : djv.c;
         iz $$14 = new iz($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dty $$15 = $$0.b();
         dbz $$16 = $$0.i();
         dyh $$17 = $$0.d();
         iz $$18 = $$0.h().l();
         eib $$19 = $$11.a($$18, $$12, $$14, $$13);
         iz $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), ekw.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         iz $$23 = new iz($$18.u(), $$22, $$18.w());
         return Optional.of(new eij.b($$23, (Consumer<ejb>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(jt.a($$23.u()), jt.a($$23.v()), jt.a($$23.w()), $$17.b()));
            }

            $$10.a(new ekw($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dys $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(iz $$0, ji<dcw> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(azg $$0, dty $$1, ekw.b $$2, boolean $$3, int $$4, int $$5, eib $$6, dbz $$7, dyh $$8) {
      int $$9 = $$7.I_() + 15;
      int $$10;
      if ($$2 == ekw.b.f) {
         if ($$3) {
            $$10 = ayy.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = ayy.b($$0, 27, 29);
         } else {
            $$10 = ayy.b($$0, 29, 100);
         }
      } else if ($$2 == ekw.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == ekw.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == ekw.b.b) {
         $$10 = $$4 - $$5 + ayy.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<iz> $$19 = ImmutableList.of(new iz($$6.h(), 0, $$6.j()), new iz($$6.k(), 0, $$6.j()), new iz($$6.h(), 0, $$6.m()), new iz($$6.k(), 0, $$6.m()));
      List<dcj> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dxt.a $$21 = $$2 == ekw.b.c ? dxt.a.c : dxt.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dcj $$24 : $$20) {
            dsb $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(azg $$0, int $$1, int $$2) {
      return $$1 < $$2 ? ayy.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public eis<?> e() {
      return eis.l;
   }

   public static record a(ekw.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<ekx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ekw.b.g.fieldOf("placement").forGetter(ekx.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(ekx.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(ekx.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(ekx.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(ekx.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(ekx.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(ekx.a::g),
                  ayg.m.fieldOf("weight").forGetter(ekx.a::h)
               )
               .apply($$0, ekx.a::new)
      );

      public ekw.b a() {
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
