import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ekt extends eif {
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
   private final List<ekt.a> i;
   public static final MapCodec<ekt> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ayc.a(ekt.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, ekt::new)
   );

   public ekt(eif.c $$0, List<ekt.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public ekt(eif.c $$0, ekt.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      eks.a $$1 = new eks.a();
      dyo $$2 = $$0.f();
      ekt.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (ekt.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (ekt.a $$7 : this.i) {
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
         ekt.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         alb $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new alb(f[$$2.a(f.length)]);
         } else {
            $$9 = new alb(e[$$2.a(e.length)]);
         }

         emf $$11 = $$0.e().a($$9);
         dlh $$12 = ac.a(dlh.values(), $$2);
         djr $$13 = $$2.i() < 0.5F ? djr.a : djr.c;
         iz $$14 = new iz($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dtu $$15 = $$0.b();
         dbv $$16 = $$0.i();
         dyd $$17 = $$0.d();
         iz $$18 = $$0.h().l();
         ehx $$19 = $$11.a($$18, $$12, $$14, $$13);
         iz $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), eks.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         iz $$23 = new iz($$18.u(), $$22, $$18.w());
         return Optional.of(new eif.b($$23, (Consumer<eix>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(jt.a($$23.u()), jt.a($$23.v()), jt.a($$23.w()), $$17.b()));
            }

            $$10.a(new eks($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dyo $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(iz $$0, ji<dcs> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(azc $$0, dtu $$1, eks.b $$2, boolean $$3, int $$4, int $$5, ehx $$6, dbv $$7, dyd $$8) {
      int $$9 = $$7.I_() + 15;
      int $$10;
      if ($$2 == eks.b.f) {
         if ($$3) {
            $$10 = ayu.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = ayu.b($$0, 27, 29);
         } else {
            $$10 = ayu.b($$0, 29, 100);
         }
      } else if ($$2 == eks.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == eks.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == eks.b.b) {
         $$10 = $$4 - $$5 + ayu.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<iz> $$19 = ImmutableList.of(new iz($$6.h(), 0, $$6.j()), new iz($$6.k(), 0, $$6.j()), new iz($$6.h(), 0, $$6.m()), new iz($$6.k(), 0, $$6.m()));
      List<dcf> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dxp.a $$21 = $$2 == eks.b.c ? dxp.a.c : dxp.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dcf $$24 : $$20) {
            drx $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(azc $$0, int $$1, int $$2) {
      return $$1 < $$2 ? ayu.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public eio<?> e() {
      return eio.l;
   }

   public static record a(eks.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<ekt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eks.b.g.fieldOf("placement").forGetter(ekt.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(ekt.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(ekt.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(ekt.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(ekt.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(ekt.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(ekt.a::g),
                  ayc.m.fieldOf("weight").forGetter(ekt.a::h)
               )
               .apply($$0, ekt.a::new)
      );

      public eks.b a() {
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
