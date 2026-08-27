import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bmg<E extends bjk> extends bks<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final btn h;
   private final int i;
   private final Function<E, aoy> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bmg.a> l = Optional.empty();

   public bmg(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, btn $$4, int $$5, Function<E, aoy> $$6) {
      super(ImmutableMap.of(bsc.n, bsd.c, bsc.U, bsd.b, bsc.h, bsd.a, bsc.V, bsd.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(akn $$0, bjk $$1, long $$2) {
      bkb<?> $$3 = $$1.dM();
      $$3.c(bsc.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(akn $$0, E $$1, long $$2) {
      bkb<?> $$3 = $$1.dM();
      if (!$$3.a(bsc.V)) {
         $$0.a($$1, (byte)59);
         $$3.a(bsc.U, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(akn $$0, bjk $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bv();
   }

   protected void d(akn $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dM().a(bsc.m, new bsf(this.l.get().a(), this.g, 0));
         $$1.dM().a(bsc.n, new bld(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dk().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.H().n();
            this.b($$1, this.l.get().c);
         } else {
            gw $$4 = $$1.dk();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dM().a(bsc.V, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), apa.g, 1.0F, $$1.eV());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private ehi a(gw $$0, gw $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ars.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ars.j((double)($$1.w() - $$0.w()));
      return ehi.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<gw> a(bjk $$0, bjb $$1) {
      gw $$2 = $$1.dk();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<gw> $$3 = Lists.newArrayList();
         gw.a $$4 = $$2.j();

         for (hc $$5 : hc.c.a) {
            $$4.g($$2);

            for (int $$6 = 0; $$6 < this.f; $$6++) {
               if (!this.a($$0, $$4.c($$5))) {
                  $$4.c($$5.g());
                  break;
               }
            }

            if ($$4.k($$2) >= this.e) {
               $$3.add($$4.i());
            }
         }

         bsk $$7 = $$0.H();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dk()::j)).filter($$1x -> {
            eaw $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bjk $$0, gw $$1) {
      return $$0.H().a($$1) && $$0.a(ebb.a($$0.dK(), $$1.j())) == 0.0F;
   }

   private void b(bjk $$0, bjb $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bmg.a($$1x, $$1.dk(), $$1));
   }

   public static class a {
      private final gw a;
      private final gw b;
      final bjb c;

      public a(gw $$0, gw $$1, bjb $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public gw a() {
         return this.a;
      }

      public gw b() {
         return this.b;
      }

      public bjb c() {
         return this.c;
      }
   }
}
