import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ebt extends dzf {
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
   private final List<ebt.a> i;
   public static final Codec<ebt> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), atv.a(ebt.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, ebt::new)
   );

   public ebt(dzf.c $$0, List<ebt.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public ebt(dzf.c $$0, ebt.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      ebs.a $$1 = new ebs.a();
      dpo $$2 = $$0.f();
      ebt.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (ebt.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (ebt.a $$7 : this.i) {
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
         ebt.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         ahg $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new ahg(f[$$2.a(f.length)]);
         } else {
            $$9 = new ahg(e[$$2.a(e.length)]);
         }

         edf $$11 = $$0.e().a($$9);
         ddb $$12 = ac.a(ddb.values(), $$2);
         dbl $$13 = $$2.i() < 0.5F ? dbl.a : dbl.c;
         hx $$14 = new hx($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dld $$15 = $$0.b();
         ctq $$16 = $$0.i();
         dpd $$17 = $$0.d();
         hx $$18 = $$0.h().l();
         dyx $$19 = $$11.a($$18, $$12, $$14, $$13);
         hx $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), ebs.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         hx $$23 = new hx($$18.u(), $$22, $$18.w());
         return Optional.of(new dzf.b($$23, (Consumer<dzx>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(is.a($$23.u()), is.a($$23.v()), is.a($$23.w()), $$17.b()));
            }

            $$10.a(new ebs($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dpo $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(hx $$0, ih<cun> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(auu $$0, dld $$1, ebs.b $$2, boolean $$3, int $$4, int $$5, dyx $$6, ctq $$7, dpd $$8) {
      int $$9 = $$7.J_() + 15;
      int $$10;
      if ($$2 == ebs.b.f) {
         if ($$3) {
            $$10 = aun.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = aun.b($$0, 27, 29);
         } else {
            $$10 = aun.b($$0, 29, 100);
         }
      } else if ($$2 == ebs.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == ebs.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == ebs.b.b) {
         $$10 = $$4 - $$5 + aun.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<hx> $$19 = ImmutableList.of(new hx($$6.h(), 0, $$6.j()), new hx($$6.k(), 0, $$6.j()), new hx($$6.h(), 0, $$6.m()), new hx($$6.k(), 0, $$6.m()));
      List<cua> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dop.a $$21 = $$2 == ebs.b.c ? dop.a.c : dop.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (cua $$24 : $$20) {
            djg $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(auu $$0, int $$1, int $$2) {
      return $$1 < $$2 ? aun.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dzo<?> e() {
      return dzo.l;
   }

   public static record a(ebs.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<ebt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ebs.b.g.fieldOf("placement").forGetter(ebt.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(ebt.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(ebt.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(ebt.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(ebt.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(ebt.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(ebt.a::g),
                  atv.k.fieldOf("weight").forGetter(ebt.a::h)
               )
               .apply($$0, ebt.a::new)
      );

      public ebs.b a() {
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
