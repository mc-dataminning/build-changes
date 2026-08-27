import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dds extends dcq implements dkf {
   public static final MapCodec<dds> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dds::new)
   );
   protected static final eui b = dde.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dqy c = dqx.r;
   public static final dqy d = dqx.y;
   public static final dqy e = dqx.C;
   public static final drb f = dqx.R;
   private static final eui g = dde.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   public dds(boolean $$0, int $$1, dqg.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, is.c));
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$2.c_($$3) instanceof dns $$8) {
         csz $$9 = $$4.b($$5);
         Optional<cxf<cwr>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fN() ? $$9.r() : $$9, $$10.get().b().d())) {
               $$4.a(avm.av);
               return bpo.a;
            }

            return bpo.b;
         }
      }

      return bpo.d;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if ($$0.c(c) && $$3 instanceof bsa && !cyh.j((bsa)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof dns) {
            bpi.a($$1, $$2, ((dns)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dae $$1 = $$0.q();
      in $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == emb.c;
      return this.n().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$1 == is.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dqh $$0) {
      return $$0.a(ddg.ij);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avc.dI, avd.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(kx.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable brh $$0, dae $$1, in $$2, dqh $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dad)$$1, $$2, $$3.c(d), true);
         }
      }

      dnm $$5 = $$1.c_($$2);
      if ($$5 instanceof dns) {
         ((dns)$$5).d();
      }

      $$1.a($$0, dva.c, $$2);
   }

   @Override
   public boolean a(dae $$0, in $$1, dqh $$2, ema $$3) {
      if (!$$2.c(dqx.C) && $$3.a() == emb.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avc.ka, avd.e, 1.0F, 1.0F);
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
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      in $$4 = $$2.a();
      if (!$$0.B && $$3.bO() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dqx.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dad $$0, in $$1, boolean $$2, boolean $$3) {
      ayg $$4 = $$0.E_();
      la $$5 = $$2 ? kx.ar : kx.aq;
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
            kx.ab,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dad $$0, in $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         in $$3 = $$1.c($$2);
         dqh $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = euf.c(g, $$4.b($$0, $$1, etu.a()), ett.i);
         if ($$5) {
            dqh $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dqh $$0) {
      return $$0.b(c) && $$0.a(avr.aV) && $$0.c(c);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(e) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dns($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dno.G, dns::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dno.G, dns::a) : a($$2, dno.G, dns::b);
      }
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   public static boolean h(dqh $$0) {
      return $$0.a(avr.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
