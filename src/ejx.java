import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ejx extends ehj {
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
   private final List<ejx.a> i;
   public static final MapCodec<ejx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), axm.a(ejx.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, ejx::new)
   );

   public ejx(ehj.c $$0, List<ejx.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public ejx(ehj.c $$0, ejx.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      ejw.a $$1 = new ejw.a();
      dxs $$2 = $$0.f();
      ejx.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (ejx.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (ejx.a $$7 : this.i) {
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
         ejx.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         akm $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new akm(f[$$2.a(f.length)]);
         } else {
            $$9 = new akm(e[$$2.a(e.length)]);
         }

         elj $$11 = $$0.e().a($$9);
         dkl $$12 = ac.a(dkl.values(), $$2);
         div $$13 = $$2.i() < 0.5F ? div.a : div.c;
         io $$14 = new io($$11.a().u() / 2, 0, $$11.a().w() / 2);
         dsy $$15 = $$0.b();
         daz $$16 = $$0.i();
         dxh $$17 = $$0.d();
         io $$18 = $$0.h().l();
         ehb $$19 = $$11.a($$18, $$12, $$14, $$13);
         io $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), ejw.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         io $$23 = new io($$18.u(), $$22, $$18.w());
         return Optional.of(new ehj.b($$23, (Consumer<eib>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().c().getNoiseBiome(ji.a($$23.u()), ji.a($$23.v()), ji.a($$23.w()), $$17.b()));
            }

            $$10.a(new ejw($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dxs $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(io $$0, ix<dbw> $$1) {
      return $$1.a().b($$0);
   }

   private static int a(ayk $$0, dsy $$1, ejw.b $$2, boolean $$3, int $$4, int $$5, ehb $$6, daz $$7, dxh $$8) {
      int $$9 = $$7.I_() + 15;
      int $$10;
      if ($$2 == ejw.b.f) {
         if ($$3) {
            $$10 = ayd.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = ayd.b($$0, 27, 29);
         } else {
            $$10 = ayd.b($$0, 29, 100);
         }
      } else if ($$2 == ejw.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == ejw.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == ejw.b.b) {
         $$10 = $$4 - $$5 + ayd.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<io> $$19 = ImmutableList.of(new io($$6.h(), 0, $$6.j()), new io($$6.k(), 0, $$6.j()), new io($$6.h(), 0, $$6.m()), new io($$6.k(), 0, $$6.m()));
      List<dbj> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dwt.a $$21 = $$2 == ejw.b.c ? dwt.a.c : dwt.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dbj $$24 : $$20) {
            drb $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(ayk $$0, int $$1, int $$2) {
      return $$1 < $$2 ? ayd.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public ehs<?> e() {
      return ehs.l;
   }

   public static record a(ejw.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<ejx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ejw.b.g.fieldOf("placement").forGetter(ejx.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(ejx.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(ejx.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(ejx.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(ejx.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(ejx.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(ejx.a::g),
                  axm.k.fieldOf("weight").forGetter(ejx.a::h)
               )
               .apply($$0, ejx.a::new)
      );

      public ejw.b a() {
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
