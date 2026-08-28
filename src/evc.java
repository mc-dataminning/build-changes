import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class evc extends esn {
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
   private final List<evc.a> i;
   public static final MapCodec<evc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), azg.b(evc.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, evc::new)
   );

   public evc(esn.c $$0, List<evc.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public evc(esn.c $$0, evc.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      evb.a $$1 = new evb.a();
      eio $$2 = $$0.f();
      evc.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (evc.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (evc.a $$7 : this.i) {
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
         evc.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         alr $$9;
         if ($$2.i() < 0.05F) {
            $$9 = alr.b(f[$$2.a(f.length)]);
         } else {
            $$9 = alr.b(e[$$2.a(e.length)]);
         }

         ewp $$11 = $$0.e().a($$9);
         dui $$12 = ag.a(dui.values(), $$2);
         dsr $$13 = $$2.i() < 0.5F ? dsr.a : dsr.c;
         iw $$14 = new iw($$11.a().u() / 2, 0, $$11.a().w() / 2);
         edo $$15 = $$0.b();
         dkl $$16 = $$0.i();
         eid $$17 = $$0.d();
         iw $$18 = $$0.h().l();
         esf $$19 = $$11.a($$18, $$12, $$14, $$13);
         iw $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), evb.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         iw $$23 = new iw($$18.u(), $$22, $$18.w());
         return Optional.of(new esn.b($$23, (Consumer<etf>)($$11x -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(jr.a($$23.u()), jr.a($$23.v()), jr.a($$23.w()), $$17.b()), $$15.f());
            }

            $$11x.a(new evb($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(eio $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(iw $$0, jg<dlm> $$1, int $$2) {
      return $$1.a().b($$0, $$2);
   }

   private static int a(bai $$0, edo $$1, evb.b $$2, boolean $$3, int $$4, int $$5, esf $$6, dkl $$7, eid $$8) {
      int $$9 = $$7.K_() + 15;
      int $$10;
      if ($$2 == evb.b.f) {
         if ($$3) {
            $$10 = azz.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = azz.b($$0, 27, 29);
         } else {
            $$10 = azz.b($$0, 29, 100);
         }
      } else if ($$2 == evb.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == evb.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == evb.b.b) {
         $$10 = $$4 - $$5 + azz.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<iw> $$19 = ImmutableList.of(new iw($$6.h(), 0, $$6.j()), new iw($$6.k(), 0, $$6.j()), new iw($$6.h(), 0, $$6.m()), new iw($$6.k(), 0, $$6.m()));
      List<dkv> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      ehp.a $$21 = $$2 == evb.b.c ? ehp.a.c : ehp.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dkv $$24 : $$20) {
            ebq $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(bai $$0, int $$1, int $$2) {
      return $$1 < $$2 ? azz.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public esw<?> e() {
      return esw.l;
   }

   public static record a(evb.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<evc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  evb.b.g.fieldOf("placement").forGetter(evc.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(evc.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(evc.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(evc.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(evc.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(evc.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(evc.a::g),
                  azg.o.fieldOf("weight").forGetter(evc.a::h)
               )
               .apply($$0, evc.a::new)
      );

      public evb.b a() {
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
