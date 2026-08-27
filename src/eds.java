import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class eds extends ebe {
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
   private final List<eds.a> i;
   public static final Codec<eds> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), avp.a(eds.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, eds::new)
   );

   public eds(ebe.c $$0, List<eds.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public eds(ebe.c $$0, eds.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      edr.a $$1 = new edr.a();
      drn $$2 = $$0.f();
      eds.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (eds.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (eds.a $$7 : this.i) {
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
         eds.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         aiy $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new aiy(f[$$2.a(f.length)]);
         } else {
            $$9 = new aiy(e[$$2.a(e.length)]);
         }

         efe $$11 = $$0.e().a($$9);
         dfa $$12 = ac.a(dfa.values(), $$2);
         ddk $$13 = $$2.i() < 0.5F ? ddk.a : ddk.c;
         hz $$14 = new hz($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dnc $$15 = $$0.b();
         cvp $$16 = $$0.i();
         drc $$17 = $$0.d();
         hz $$18 = $$0.h().l();
         eaw $$19 = $$11.a($$18, $$12, $$14, $$13);
         hz $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), edr.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         hz $$23 = new hz($$18.u(), $$22, $$18.w());
         return Optional.of(new ebe.b($$23, (Consumer<ebw>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(iu.a($$23.u()), iu.a($$23.v()), iu.a($$23.w()), $$17.b()));
            }

            $$10.a(new edr($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(drn $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(hz $$0, ij<cwm> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(awo $$0, dnc $$1, edr.b $$2, boolean $$3, int $$4, int $$5, eaw $$6, cvp $$7, drc $$8) {
      int $$9 = $$7.J_() + 15;
      int $$10;
      if ($$2 == edr.b.f) {
         if ($$3) {
            $$10 = awh.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = awh.b($$0, 27, 29);
         } else {
            $$10 = awh.b($$0, 29, 100);
         }
      } else if ($$2 == edr.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == edr.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == edr.b.b) {
         $$10 = $$4 - $$5 + awh.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<hz> $$19 = ImmutableList.of(new hz($$6.h(), 0, $$6.j()), new hz($$6.k(), 0, $$6.j()), new hz($$6.h(), 0, $$6.m()), new hz($$6.k(), 0, $$6.m()));
      List<cvz> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dqo.a $$21 = $$2 == edr.b.c ? dqo.a.c : dqo.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (cvz $$24 : $$20) {
            dlf $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(awo $$0, int $$1, int $$2) {
      return $$1 < $$2 ? awh.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public ebn<?> e() {
      return ebn.l;
   }

   public static record a(edr.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<eds.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  edr.b.g.fieldOf("placement").forGetter(eds.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(eds.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(eds.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(eds.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(eds.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(eds.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(eds.a::g),
                  avp.k.fieldOf("weight").forGetter(eds.a::h)
               )
               .apply($$0, eds.a::new)
      );

      public edr.b a() {
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
