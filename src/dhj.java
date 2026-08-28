import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhj extends dgh implements dnx {
   public static final MapCodec<dhj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dhj::new)
   );
   protected static final eyx b = dgv.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dur c = duq.r;
   public static final dur d = duq.y;
   public static final dur e = duq.C;
   public static final duu f = duq.R;
   private static final eyx g = dgv.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(boolean $$0, int $$1, dtz.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.E.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jj.c));
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$2.c_($$3) instanceof drk $$8) {
         cvl $$9 = $$4.b($$5);
         Optional<czv<czf>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(awn.av);
               return brk.b;
            }

            return brk.c;
         }
      }

      return brk.f;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if ($$0.c(c) && $$3 instanceof buf) {
         $$3.a($$1.ak().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dre $$5 = $$1.c_($$2);
         if ($$5 instanceof drk) {
            brg.a($$1, $$2, ((drk)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      ddt $$1 = $$0.q();
      je $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eqc.c;
      return this.o().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$1 == jj.a ? $$0.b(d, Boolean.valueOf(this.o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean o(dua $$0) {
      return $$0.a(dgx.ij);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awd.dJ, awe.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ln.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable btj $$0, ddt $$1, je $$2, dua $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dds)$$1, $$2, $$3.c(d), true);
         }
      }

      dre $$5 = $$1.c_($$2);
      if ($$5 instanceof drk) {
         ((drk)$$5).d();
      }

      $$1.a($$0, dyx.c, $$2);
   }

   @Override
   public boolean a(ddt $$0, je $$1, dua $$2, eqb $$3) {
      if (!$$2.c(duq.C) && $$3.a() == eqc.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, awd.kg, awe.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.b(e, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      je $$4 = $$2.a();
      if (!$$0.B && $$3.bV() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(duq.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dds $$0, je $$1, boolean $$2, boolean $$3) {
      azk $$4 = $$0.C_();
      lr $$5 = $$2 ? ln.au : ln.at;
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
            ln.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dds $$0, je $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         je $$3 = $$1.c($$2);
         dua $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = eyu.c(g, $$4.b($$0, $$1, eyj.a()), eyi.i);
         if ($$5) {
            dua $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dua $$0) {
      return $$0.b(c) && $$0.a(aws.aW) && $$0.c(c);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(e) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new drk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, drg.G, drk::c) : null;
      } else {
         return $$1.c(c) ? a($$2, drg.G, drk::a) : a($$2, drg.G, drk::b);
      }
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   public static boolean i(dua $$0) {
      return $$0.a(aws.aW, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
