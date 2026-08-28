import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dft extends der implements dmg {
   public static final MapCodec<dft> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dft::new)
   );
   protected static final ews b = dff.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dsy c = dsx.r;
   public static final dsy d = dsx.y;
   public static final dsy e = dsx.C;
   public static final dtb f = dsx.R;
   private static final ews g = dff.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dft(boolean $$0, int $$1, dsg.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, jf.c));
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$2.c_($$3) instanceof dpt $$8) {
         cua $$9 = $$4.b($$5);
         Optional<cyi<cxt>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fL() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(avp.av);
               return bqf.a;
            }

            return bqf.b;
         }
      }

      return bqf.d;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if ($$0.c(c) && $$3 instanceof bsy) {
         $$3.a($$1.aj().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dpt) {
            bpz.a($$1, $$2, ((dpt)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dce $$1 = $$0.q();
      ja $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eoc.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return $$1 == jf.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dsh $$0) {
      return $$0.a(dfh.ij);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avf.dI, avg.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lj.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bsd $$0, dce $$1, ja $$2, dsh $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dcd)$$1, $$2, $$3.c(d), true);
         }
      }

      dpn $$5 = $$1.c_($$2);
      if ($$5 instanceof dpt) {
         ((dpt)$$5).d();
      }

      $$1.a($$0, dxa.c, $$2);
   }

   @Override
   public boolean a(dce $$0, ja $$1, dsh $$2, eob $$3) {
      if (!$$2.c(dsx.C) && $$3.a() == eoc.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avf.kf, avg.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.a(e, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      ja $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dsx.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dcd $$0, ja $$1, boolean $$2, boolean $$3) {
      aym $$4 = $$0.E_();
      ln $$5 = $$2 ? lj.au : lj.at;
      $$0.b(
         $$5,
         true,
         (double)$$1.u() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         (double)$$1.v() + $$4.j() + $$4.j(),
         (double)$$1.w() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if ($$3) {
         $$0.a(
            lj.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dcd $$0, ja $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ja $$3 = $$1.c($$2);
         dsh $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ewp.c(g, $$4.b($$0, $$1, ewe.a()), ewd.i);
         if ($$5) {
            dsh $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dsh $$0) {
      return $$0.b(c) && $$0.a(avu.aV) && $$0.c(c);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(e) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dpp.G, dpt::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dpp.G, dpt::a) : a($$2, dpp.G, dpt::b);
      }
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   public static boolean h(dsh $$0) {
      return $$0.a(avu.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
