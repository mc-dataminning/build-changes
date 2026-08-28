import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class enr extends elc {
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
   private final List<enr.a> i;
   public static final MapCodec<enr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), aym.a(enr.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, enr::new)
   );

   public enr(elc.c $$0, List<enr.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public enr(elc.c $$0, enr.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      enq.a $$1 = new enq.a();
      ebj $$2 = $$0.f();
      enr.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (enr.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (enr.a $$7 : this.i) {
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
         enr.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         alc $$9;
         if ($$2.i() < 0.05F) {
            $$9 = alc.b(f[$$2.a(f.length)]);
         } else {
            $$9 = alc.b(e[$$2.a(e.length)]);
         }

         epe $$11 = $$0.e().a($$9);
         dnx $$12 = ad.a(dnx.values(), $$2);
         dmg $$13 = $$2.i() < 0.5F ? dmg.a : dmg.c;
         je $$14 = new je($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dwl $$15 = $$0.b();
         dei $$16 = $$0.i();
         eay $$17 = $$0.d();
         je $$18 = $$0.h().l();
         eku $$19 = $$11.a($$18, $$12, $$14, $$13);
         je $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), enq.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         je $$23 = new je($$18.u(), $$22, $$18.w());
         return Optional.of(new elc.b($$23, (Consumer<elu>)($$11x -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(jy.a($$23.u()), jy.a($$23.v()), jy.a($$23.w()), $$17.b()), $$15.f());
            }

            $$11x.a(new enq($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(ebj $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(je $$0, jn<dfh> $$1, int $$2) {
      return $$1.a().b($$0, $$2);
   }

   private static int a(azl $$0, dwl $$1, enq.b $$2, boolean $$3, int $$4, int $$5, eku $$6, dei $$7, eay $$8) {
      int $$9 = $$7.G_() + 15;
      int $$10;
      if ($$2 == enq.b.f) {
         if ($$3) {
            $$10 = azd.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = azd.b($$0, 27, 29);
         } else {
            $$10 = azd.b($$0, 29, 100);
         }
      } else if ($$2 == enq.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == enq.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == enq.b.b) {
         $$10 = $$4 - $$5 + azd.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<je> $$19 = ImmutableList.of(new je($$6.h(), 0, $$6.j()), new je($$6.k(), 0, $$6.j()), new je($$6.h(), 0, $$6.m()), new je($$6.k(), 0, $$6.m()));
      List<des> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      eak.a $$21 = $$2 == enq.b.c ? eak.a.c : eak.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (des $$24 : $$20) {
            duo $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(azl $$0, int $$1, int $$2) {
      return $$1 < $$2 ? azd.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public ell<?> e() {
      return ell.l;
   }

   public static record a(enq.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<enr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  enq.b.g.fieldOf("placement").forGetter(enr.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(enr.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(enr.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(enr.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(enr.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(enr.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(enr.a::g),
                  aym.n.fieldOf("weight").forGetter(enr.a::h)
               )
               .apply($$0, enr.a::new)
      );

      public enq.b a() {
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
