import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class dxg extends duz {
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
   private final List<dxg.a> i;
   public static final Codec<dxg> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), aqy.a(dxg.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, dxg::new)
   );

   public dxg(duz.c $$0, List<dxg.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public dxg(duz.c $$0, dxg.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      dxf.a $$1 = new dxf.a();
      dli $$2 = $$0.f();
      dxg.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (dxg.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (dxg.a $$7 : this.i) {
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
         dxg.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         aer $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new aer(f[$$2.a(f.length)]);
         } else {
            $$9 = new aer(e[$$2.a(e.length)]);
         }

         dys $$11 = $$0.e().a($$9);
         cyy $$12 = ac.a(cyy.values(), $$2);
         cxh $$13 = $$2.i() < 0.5F ? cxh.a : cxh.c;
         gu $$14 = new gu($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dgx $$15 = $$0.b();
         cpo $$16 = $$0.i();
         dkx $$17 = $$0.d();
         gu $$18 = $$0.h().l();
         dur $$19 = $$11.a($$18, $$12, $$14, $$13);
         gu $$20 = $$19.f();
         int $$21 = $$15.a($$20.u(), $$20.w(), dxf.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.d(), $$19, $$16, $$17);
         gu $$23 = new gu($$18.u(), $$22, $$18.w());
         return Optional.of(new duz.b($$23, (Consumer<dvr>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(hq.a($$23.u()), hq.a($$23.v()), hq.a($$23.w()), $$17.b()));
            }

            $$10.a(new dxf($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dli $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(gu $$0, he<cqk> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(aru $$0, dgx $$1, dxf.b $$2, boolean $$3, int $$4, int $$5, dur $$6, cpo $$7, dkx $$8) {
      int $$9 = $$7.C_() + 15;
      int $$10;
      if ($$2 == dxf.b.f) {
         if ($$3) {
            $$10 = arp.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = arp.b($$0, 27, 29);
         } else {
            $$10 = arp.b($$0, 29, 100);
         }
      } else if ($$2 == dxf.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == dxf.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == dxf.b.b) {
         $$10 = $$4 - $$5 + arp.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<gu> $$19 = ImmutableList.of(new gu($$6.g(), 0, $$6.i()), new gu($$6.j(), 0, $$6.i()), new gu($$6.g(), 0, $$6.l()), new gu($$6.j(), 0, $$6.l()));
      List<cpy> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dkj.a $$21 = $$2 == dxf.b.c ? dkj.a.c : dkj.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (cpy $$24 : $$20) {
            dfa $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(aru $$0, int $$1, int $$2) {
      return $$1 < $$2 ? arp.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dvi<?> e() {
      return dvi.l;
   }

   public static record a(dxf.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<dxg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxf.b.g.fieldOf("placement").forGetter(dxg.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(dxg.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(dxg.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(dxg.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(dxg.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(dxg.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(dxg.a::g),
                  aqy.k.fieldOf("weight").forGetter(dxg.a::h)
               )
               .apply($$0, dxg.a::new)
      );

      public dxf.b a() {
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
