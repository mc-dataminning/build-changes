import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class dxp extends dvi {
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
   private final List<dxp.a> i;
   public static final Codec<dxp> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), arf.a(dxp.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, dxp::new)
   );

   public dxp(dvi.c $$0, List<dxp.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public dxp(dvi.c $$0, dxp.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      dxo.a $$1 = new dxo.a();
      dlr $$2 = $$0.f();
      dxp.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (dxp.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (dxp.a $$7 : this.i) {
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
         dxp.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         aew $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new aew(f[$$2.a(f.length)]);
         } else {
            $$9 = new aew(e[$$2.a(e.length)]);
         }

         dzb $$11 = $$0.e().a($$9);
         czh $$12 = ac.a(czh.values(), $$2);
         cxq $$13 = $$2.i() < 0.5F ? cxq.a : cxq.c;
         gw $$14 = new gw($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dhg $$15 = $$0.b();
         cpx $$16 = $$0.i();
         dlg $$17 = $$0.d();
         gw $$18 = $$0.h().l();
         dva $$19 = $$11.a($$18, $$12, $$14, $$13);
         gw $$20 = $$19.f();
         int $$21 = $$15.a($$20.u(), $$20.w(), dxo.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.d(), $$19, $$16, $$17);
         gw $$23 = new gw($$18.u(), $$22, $$18.w());
         return Optional.of(new dvi.b($$23, (Consumer<dwa>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(hp.a($$23.u()), hp.a($$23.v()), hp.a($$23.w()), $$17.b()));
            }

            $$10.a(new dxo($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dlr $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(gw $$0, he<cqt> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(asc $$0, dhg $$1, dxo.b $$2, boolean $$3, int $$4, int $$5, dva $$6, cpx $$7, dlg $$8) {
      int $$9 = $$7.H_() + 15;
      int $$10;
      if ($$2 == dxo.b.f) {
         if ($$3) {
            $$10 = arw.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = arw.b($$0, 27, 29);
         } else {
            $$10 = arw.b($$0, 29, 100);
         }
      } else if ($$2 == dxo.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == dxo.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == dxo.b.b) {
         $$10 = $$4 - $$5 + arw.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<gw> $$19 = ImmutableList.of(new gw($$6.g(), 0, $$6.i()), new gw($$6.j(), 0, $$6.i()), new gw($$6.g(), 0, $$6.l()), new gw($$6.j(), 0, $$6.l()));
      List<cqh> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dks.a $$21 = $$2 == dxo.b.c ? dks.a.c : dks.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (cqh $$24 : $$20) {
            dfj $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(asc $$0, int $$1, int $$2) {
      return $$1 < $$2 ? arw.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dvr<?> e() {
      return dvr.l;
   }

   public static record a(dxo.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<dxp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxo.b.g.fieldOf("placement").forGetter(dxp.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(dxp.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(dxp.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(dxp.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(dxp.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(dxp.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(dxp.a::g),
                  arf.k.fieldOf("weight").forGetter(dxp.a::h)
               )
               .apply($$0, dxp.a::new)
      );

      public dxo.b a() {
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
