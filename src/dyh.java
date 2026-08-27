import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class dyh extends dwa {
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
   private final List<dyh.a> i;
   public static final Codec<dyh> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), asg.a(dyh.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, dyh::new)
   );

   public dyh(dwa.c $$0, List<dyh.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public dyh(dwa.c $$0, dyh.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      dyg.a $$1 = new dyg.a();
      dmj $$2 = $$0.f();
      dyh.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (dyh.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (dyh.a $$7 : this.i) {
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
         dyh.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         afw $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new afw(f[$$2.a(f.length)]);
         } else {
            $$9 = new afw(e[$$2.a(e.length)]);
         }

         dzt $$11 = $$0.e().a($$9);
         dal $$12 = ac.a(dal.values(), $$2);
         cyv $$13 = $$2.i() < 0.5F ? cyv.a : cyv.c;
         ht $$14 = new ht($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dhy $$15 = $$0.b();
         crb $$16 = $$0.i();
         dly $$17 = $$0.d();
         ht $$18 = $$0.h().l();
         dvs $$19 = $$11.a($$18, $$12, $$14, $$13);
         ht $$20 = $$19.f();
         int $$21 = $$15.a($$20.u(), $$20.w(), dyg.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.d(), $$19, $$16, $$17);
         ht $$23 = new ht($$18.u(), $$22, $$18.w());
         return Optional.of(new dwa.b($$23, (Consumer<dws>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(in.a($$23.u()), in.a($$23.v()), in.a($$23.w()), $$17.b()));
            }

            $$10.a(new dyg($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dmj $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(ht $$0, ib<crx> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(ate $$0, dhy $$1, dyg.b $$2, boolean $$3, int $$4, int $$5, dvs $$6, crb $$7, dly $$8) {
      int $$9 = $$7.I_() + 15;
      int $$10;
      if ($$2 == dyg.b.f) {
         if ($$3) {
            $$10 = asy.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = asy.b($$0, 27, 29);
         } else {
            $$10 = asy.b($$0, 29, 100);
         }
      } else if ($$2 == dyg.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == dyg.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == dyg.b.b) {
         $$10 = $$4 - $$5 + asy.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<ht> $$19 = ImmutableList.of(new ht($$6.g(), 0, $$6.i()), new ht($$6.j(), 0, $$6.i()), new ht($$6.g(), 0, $$6.l()), new ht($$6.j(), 0, $$6.l()));
      List<crl> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dlk.a $$21 = $$2 == dyg.b.c ? dlk.a.c : dlk.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (crl $$24 : $$20) {
            dgb $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(ate $$0, int $$1, int $$2) {
      return $$1 < $$2 ? asy.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dwj<?> e() {
      return dwj.l;
   }

   public static record a(dyg.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<dyh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dyg.b.g.fieldOf("placement").forGetter(dyh.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(dyh.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(dyh.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(dyh.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(dyh.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(dyh.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(dyh.a::g),
                  asg.k.fieldOf("weight").forGetter(dyh.a::h)
               )
               .apply($$0, dyh.a::new)
      );

      public dyg.b a() {
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
