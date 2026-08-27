import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bvy<E extends bsz> extends buj<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cdh h;
   private final int i;
   private final Function<E, avh> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bvy.a> l = Optional.empty();

   public bvy(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cdh $$4, int $$5, Function<E, avh> $$6) {
      super(ImmutableMap.of(cbu.n, cbv.c, cbu.V, cbv.b, cbu.h, cbv.a, cbu.W, cbv.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aqn $$0, bsz $$1, long $$2) {
      bts<?> $$3 = $$1.dS();
      $$3.c(cbu.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aqn $$0, E $$1, long $$2) {
      bts<?> $$3 = $$1.dS();
      if (!$$3.a(cbu.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cbu.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aqn $$0, bsz $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bD();
   }

   protected void d(aqn $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dS().a(cbu.m, new cbx(this.l.get().a(), this.g, 0));
         $$1.dS().a(cbu.n, new buu(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dp().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.K().n();
            this.b($$1, this.l.get().c);
         } else {
            io $$4 = $$1.dp();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dS().a(cbu.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), avj.g, 1.0F, $$1.ff());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private eum a(io $$0, io $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ayf.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ayf.j((double)($$1.w() - $$0.w()));
      return eum.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<io> a(bsz $$0, bsq $$1) {
      io $$2 = $$1.dp();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<io> $$3 = Lists.newArrayList();
         io.a $$4 = $$2.j();

         for (it $$5 : it.c.a) {
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

         ccc $$7 = $$0.K();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dp()::j)).filter($$1x -> {
            enk $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bsz $$0, io $$1) {
      return $$0.K().a($$1) && $$0.a(ens.b($$0, $$1)) == 0.0F;
   }

   private void b(bsz $$0, bsq $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bvy.a($$1x, $$1.dp(), $$1));
   }

   public static class a {
      private final io a;
      private final io b;
      final bsq c;

      public a(io $$0, io $$1, bsq $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public io a() {
         return this.a;
      }

      public io b() {
         return this.b;
      }

      public bsq c() {
         return this.c;
      }
   }
}
