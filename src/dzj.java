import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class dzj extends dwv {
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
   private final List<dzj.a> i;
   public static final Codec<dzj> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), asq.a(dzj.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, dzj::new)
   );

   public dzj(dwv.c $$0, List<dzj.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public dzj(dwv.c $$0, dzj.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      dzi.a $$1 = new dzi.a();
      dne $$2 = $$0.f();
      dzj.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (dzj.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (dzj.a $$7 : this.i) {
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
         dzj.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         agg $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new agg(f[$$2.a(f.length)]);
         } else {
            $$9 = new agg(e[$$2.a(e.length)]);
         }

         eav $$11 = $$0.e().a($$9);
         dbf $$12 = ac.a(dbf.values(), $$2);
         czp $$13 = $$2.i() < 0.5F ? czp.a : czp.c;
         ht $$14 = new ht($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dit $$15 = $$0.b();
         cru $$16 = $$0.i();
         dmt $$17 = $$0.d();
         ht $$18 = $$0.h().l();
         dwn $$19 = $$11.a($$18, $$12, $$14, $$13);
         ht $$20 = $$19.f();
         int $$21 = $$15.a($$20.u(), $$20.w(), dzi.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.d(), $$19, $$16, $$17);
         ht $$23 = new ht($$18.u(), $$22, $$18.w());
         return Optional.of(new dwv.b($$23, (Consumer<dxn>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(in.a($$23.u()), in.a($$23.v()), in.a($$23.w()), $$17.b()));
            }

            $$10.a(new dzi($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dne $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(ht $$0, ib<csq> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(ato $$0, dit $$1, dzi.b $$2, boolean $$3, int $$4, int $$5, dwn $$6, cru $$7, dmt $$8) {
      int $$9 = $$7.I_() + 15;
      int $$10;
      if ($$2 == dzi.b.f) {
         if ($$3) {
            $$10 = ati.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = ati.b($$0, 27, 29);
         } else {
            $$10 = ati.b($$0, 29, 100);
         }
      } else if ($$2 == dzi.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == dzi.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == dzi.b.b) {
         $$10 = $$4 - $$5 + ati.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<ht> $$19 = ImmutableList.of(new ht($$6.g(), 0, $$6.i()), new ht($$6.j(), 0, $$6.i()), new ht($$6.g(), 0, $$6.l()), new ht($$6.j(), 0, $$6.l()));
      List<cse> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dmf.a $$21 = $$2 == dzi.b.c ? dmf.a.c : dmf.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (cse $$24 : $$20) {
            dgw $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(ato $$0, int $$1, int $$2) {
      return $$1 < $$2 ? ati.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dxe<?> e() {
      return dxe.l;
   }

   public static record a(dzi.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<dzj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dzi.b.g.fieldOf("placement").forGetter(dzj.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(dzj.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(dzj.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(dzj.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(dzj.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(dzj.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(dzj.a::g),
                  asq.k.fieldOf("weight").forGetter(dzj.a::h)
               )
               .apply($$0, dzj.a::new)
      );

      public dzi.b a() {
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
