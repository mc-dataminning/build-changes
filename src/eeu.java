import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class eeu extends ecg {
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
   private final List<eeu.a> i;
   public static final Codec<eeu> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), avu.a(eeu.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, eeu::new)
   );

   public eeu(ecg.c $$0, List<eeu.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public eeu(ecg.c $$0, eeu.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      eet.a $$1 = new eet.a();
      dsp $$2 = $$0.f();
      eeu.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (eeu.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (eeu.a $$7 : this.i) {
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
         eeu.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         ajc $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new ajc(f[$$2.a(f.length)]);
         } else {
            $$9 = new ajc(e[$$2.a(e.length)]);
         }

         egg $$11 = $$0.e().a($$9);
         dfr $$12 = ac.a(dfr.values(), $$2);
         deb $$13 = $$2.i() < 0.5F ? deb.a : deb.c;
         ib $$14 = new ib($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dob $$15 = $$0.b();
         cwg $$16 = $$0.i();
         dse $$17 = $$0.d();
         ib $$18 = $$0.h().l();
         eby $$19 = $$11.a($$18, $$12, $$14, $$13);
         ib $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), eet.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         ib $$23 = new ib($$18.u(), $$22, $$18.w());
         return Optional.of(new ecg.b($$23, (Consumer<ecy>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(iw.a($$23.u()), iw.a($$23.v()), iw.a($$23.w()), $$17.b()));
            }

            $$10.a(new eet($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dsp $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(ib $$0, il<cxd> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(awt $$0, dob $$1, eet.b $$2, boolean $$3, int $$4, int $$5, eby $$6, cwg $$7, dse $$8) {
      int $$9 = $$7.J_() + 15;
      int $$10;
      if ($$2 == eet.b.f) {
         if ($$3) {
            $$10 = awm.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = awm.b($$0, 27, 29);
         } else {
            $$10 = awm.b($$0, 29, 100);
         }
      } else if ($$2 == eet.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == eet.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == eet.b.b) {
         $$10 = $$4 - $$5 + awm.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<ib> $$19 = ImmutableList.of(new ib($$6.h(), 0, $$6.j()), new ib($$6.k(), 0, $$6.j()), new ib($$6.h(), 0, $$6.m()), new ib($$6.k(), 0, $$6.m()));
      List<cwq> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      drq.a $$21 = $$2 == eet.b.c ? drq.a.c : drq.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (cwq $$24 : $$20) {
            dme $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(awt $$0, int $$1, int $$2) {
      return $$1 < $$2 ? awm.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public ecp<?> e() {
      return ecp.l;
   }

   public static record a(eet.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<eeu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eet.b.g.fieldOf("placement").forGetter(eeu.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(eeu.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(eeu.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(eeu.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(eeu.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(eeu.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(eeu.a::g),
                  avu.k.fieldOf("weight").forGetter(eeu.a::h)
               )
               .apply($$0, eeu.a::new)
      );

      public eet.b a() {
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
