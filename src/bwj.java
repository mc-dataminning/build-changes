import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bwj<E extends btk> extends buu<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cds h;
   private final int i;
   private final Function<E, avg> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bwj.a> l = Optional.empty();

   public bwj(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cds $$4, int $$5, Function<E, avg> $$6) {
      super(ImmutableMap.of(ccf.n, ccg.c, ccf.V, ccg.b, ccf.h, ccg.a, ccf.W, ccg.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aqm $$0, btk $$1, long $$2) {
      bud<?> $$3 = $$1.dU();
      $$3.c(ccf.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      bud<?> $$3 = $$1.dU();
      if (!$$3.a(ccf.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(ccf.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aqm $$0, btk $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bE();
   }

   protected void d(aqm $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dU().a(ccf.m, new cci(this.l.get().a(), this.g, 0));
         $$1.dU().a(ccf.n, new bvf(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dq().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.K().n();
            this.b($$1, this.l.get().c);
         } else {
            ja $$4 = $$1.dq();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dU().a(ccf.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), avi.g, 1.0F, $$1.fc());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private ewf a(ja $$0, ja $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ayg.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ayg.j((double)($$1.w() - $$0.w()));
      return ewf.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<ja> a(btk $$0, btb $$1) {
      ja $$2 = $$1.dq();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<ja> $$3 = Lists.newArrayList();
         ja.a $$4 = $$2.j();

         for (jf $$5 : jf.c.a) {
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

         ccn $$7 = $$0.K();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dq()::j)).filter($$1x -> {
            eov $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(btk $$0, ja $$1) {
      return $$0.K().a($$1) && $$0.a(epd.b($$0, $$1)) == 0.0F;
   }

   private void b(btk $$0, btb $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bwj.a($$1x, $$1.dq(), $$1));
   }

   public static class a {
      private final ja a;
      private final ja b;
      final btb c;

      public a(ja $$0, ja $$1, btb $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ja a() {
         return this.a;
      }

      public ja b() {
         return this.b;
      }

      public btb c() {
         return this.c;
      }
   }
}
