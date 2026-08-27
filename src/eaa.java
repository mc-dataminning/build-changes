import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class eaa extends dxm {
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
   private final List<eaa.a> i;
   public static final Codec<eaa> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), asy.a(eaa.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, eaa::new)
   );

   public eaa(dxm.c $$0, List<eaa.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public eaa(dxm.c $$0, eaa.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      dzz.a $$1 = new dzz.a();
      dnv $$2 = $$0.f();
      eaa.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (eaa.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (eaa.a $$7 : this.i) {
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
         eaa.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         agm $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new agm(f[$$2.a(f.length)]);
         } else {
            $$9 = new agm(e[$$2.a(e.length)]);
         }

         ebm $$11 = $$0.e().a($$9);
         dbr $$12 = ac.a(dbr.values(), $$2);
         dab $$13 = $$2.i() < 0.5F ? dab.a : dab.c;
         hx $$14 = new hx($$11.a().u() / 2, 0, $$11.a().w() / 2);
         djk $$15 = $$0.b();
         csh $$16 = $$0.i();
         dnk $$17 = $$0.d();
         hx $$18 = $$0.h().l();
         dxe $$19 = $$11.a($$18, $$12, $$14, $$13);
         hx $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), dzz.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         hx $$23 = new hx($$18.u(), $$22, $$18.w());
         return Optional.of(new dxm.b($$23, (Consumer<dye>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(ir.a($$23.u()), ir.a($$23.v()), ir.a($$23.w()), $$17.b()));
            }

            $$10.a(new dzz($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dnv $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(hx $$0, ig<ctd> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(atw $$0, djk $$1, dzz.b $$2, boolean $$3, int $$4, int $$5, dxe $$6, csh $$7, dnk $$8) {
      int $$9 = $$7.J_() + 15;
      int $$10;
      if ($$2 == dzz.b.f) {
         if ($$3) {
            $$10 = atq.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = atq.b($$0, 27, 29);
         } else {
            $$10 = atq.b($$0, 29, 100);
         }
      } else if ($$2 == dzz.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == dzz.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == dzz.b.b) {
         $$10 = $$4 - $$5 + atq.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<hx> $$19 = ImmutableList.of(new hx($$6.h(), 0, $$6.j()), new hx($$6.k(), 0, $$6.j()), new hx($$6.h(), 0, $$6.m()), new hx($$6.k(), 0, $$6.m()));
      List<csr> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dmw.a $$21 = $$2 == dzz.b.c ? dmw.a.c : dmw.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (csr $$24 : $$20) {
            dhn $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(atw $$0, int $$1, int $$2) {
      return $$1 < $$2 ? atq.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dxv<?> e() {
      return dxv.l;
   }

   public static record a(dzz.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<eaa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dzz.b.g.fieldOf("placement").forGetter(eaa.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(eaa.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(eaa.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(eaa.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(eaa.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(eaa.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(eaa.a::g),
                  asy.k.fieldOf("weight").forGetter(eaa.a::h)
               )
               .apply($$0, eaa.a::new)
      );

      public dzz.b a() {
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
