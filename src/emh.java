import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class emh extends ejt {
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
   private static final String[] g = new String[]{
      "ruined_portatol/portal_1",
      "ruined_portatol/portal_2",
      "ruined_portatol/portal_3",
      "ruined_portatol/portal_4",
      "ruined_portatol/portal_5",
      "ruined_portatol/portal_6",
      "ruined_portatol/portal_7",
      "ruined_portatol/portal_8",
      "ruined_portatol/portal_9",
      "ruined_portatol/portal_10"
   };
   private static final String[] h = new String[]{"ruined_portatol/giant_portal_1", "ruined_portatol/giant_portal_2", "ruined_portatol/giant_portal_3"};
   private static final float i = 0.05F;
   private static final int j = 15;
   private final List<emh.a> k;
   public static final Codec<emh> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), axu.a(emh.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.k)).apply($$0, emh::new)
   );

   public emh(ejt.d $$0, List<emh.a> $$1) {
      super($$0);
      this.k = $$1;
   }

   public emh(ejt.d $$0, emh.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      emg.a $$1 = new emg.a();
      dzt $$2 = $$0.f();
      emh.a $$3 = null;
      if (this.k.size() > 1) {
         float $$4 = 0.0F;

         for (emh.a $$5 : this.k) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (emh.a $$7 : this.k) {
            $$6 -= $$7.h() / $$4;
            if ($$6 < 0.0F) {
               $$3 = $$7;
               break;
            }
         }
      } else {
         $$3 = this.k.get(0);
      }

      if ($$3 == null) {
         throw new IllegalStateException();
      } else {
         emh.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         $$1.h = $$8.j;
         String[] $$9 = $$8.j ? h : f;
         String[] $$10 = $$8.j ? g : e;
         akt $$11;
         if ($$2.i() < 0.05F) {
            $$11 = new akt($$9[$$2.a($$9.length)]);
         } else {
            $$11 = new akt($$10[$$2.a($$10.length)]);
         }

         ent $$13 = $$0.e().a($$11);
         dmd $$14 = ad.a(dmd.values(), $$2);
         dke $$15 = $$2.i() < 0.5F ? dke.a : dke.c;
         ir $$16 = new ir($$13.a().u() / 2, 0, $$13.a().w() / 2);
         duz $$17 = $$0.b();
         dcc $$18 = $$0.i();
         dzi $$19 = $$0.d();
         ir $$20 = $$0.h().l();
         ejl $$21 = $$13.a($$20, $$14, $$16, $$15);
         ir $$22 = $$21.g();
         int $$23 = $$17.a($$22.u(), $$22.w(), emg.a($$8.a()), $$18, $$19) - 1;
         int $$24 = a(
            $$2,
            $$17,
            $$8.a(),
            $$1.d,
            $$23,
            $$21.e(),
            $$21,
            $$18,
            $$19,
            $$0.b().c().getNoiseBiome(jl.a($$20.u()), jl.a($$20.v()), jl.a($$20.w()), $$19.b()).a(awd.n)
         );
         ir $$25 = new ir($$20.u(), $$24, $$20.w());
         return Optional.of(new ejt.c($$25, (Consumer<ekl>)($$10x -> {
            if ($$8.f()) {
               $$1.b = a($$25, $$0.b().c().getNoiseBiome(jl.a($$25.u()), jl.a($$25.v()), jl.a($$25.w()), $$19.b()));
            }

            $$10x.a(new emg($$0.e(), $$25, $$8.a(), $$1, $$11, $$13, $$14, $$15, $$16));
         })));
      }
   }

   private static boolean a(dzt $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(ir $$0, ja<dcz> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(ayt $$0, duz $$1, emg.b $$2, boolean $$3, int $$4, int $$5, ejl $$6, dcc $$7, dzi $$8, boolean $$9) {
      int $$10 = $$7.J_() + ($$9 ? 40 : 15);
      if ($$9 && $$4 < $$10) {
         $$4 = $$10;
      }

      int $$11;
      if ($$2 == emg.b.f) {
         if ($$3) {
            $$11 = aym.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$11 = aym.b($$0, 27, 29);
         } else {
            $$11 = aym.b($$0, 29, 100);
         }
      } else if ($$2 == emg.b.d) {
         int $$14 = $$4 - $$5;
         $$11 = a($$0, 70, $$14);
      } else if ($$2 == emg.b.e) {
         int $$16 = $$4 - $$5;
         $$11 = a($$0, $$10, $$16);
      } else if ($$2 == emg.b.b) {
         $$11 = $$4 - $$5 + aym.b($$0, 2, 8);
      } else {
         $$11 = $$4;
      }

      List<ir> $$20 = ImmutableList.of(new ir($$6.h(), 0, $$6.j()), new ir($$6.k(), 0, $$6.j()), new ir($$6.h(), 0, $$6.m()), new ir($$6.k(), 0, $$6.m()));
      List<dcm> $$21 = $$20.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dyu.a $$22 = $$2 == emg.b.c ? dyu.a.c : dyu.a.a;

      int $$23;
      for ($$23 = $$11; $$23 > $$10; $$23--) {
         int $$24 = 0;

         for (dcm $$25 : $$21) {
            dtc $$26 = $$25.a($$23);
            if ($$22.e().test($$26)) {
               if (++$$24 == 3) {
                  return $$23;
               }
            }
         }
      }

      return $$23;
   }

   private static int a(ayt $$0, int $$1, int $$2) {
      return $$1 < $$2 ? aym.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public ekc<?> f() {
      return ekc.l;
   }

   public static record a(emg.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i, boolean j) {
      public static final Codec<emh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  emg.b.g.fieldOf("placement").forGetter(emh.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(emh.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(emh.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(emh.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(emh.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(emh.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(emh.a::g),
                  axu.k.fieldOf("weight").forGetter(emh.a::h),
                  Codec.BOOL.fieldOf("potaot").forGetter(emh.a::i)
               )
               .apply($$0, emh.a::new)
      );

      public emg.b a() {
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

      public boolean i() {
         return this.j;
      }
   }
}
