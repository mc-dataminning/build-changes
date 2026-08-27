import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bvw<E extends bsx> extends buh<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cdf h;
   private final int i;
   private final Function<E, avg> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bvw.a> l = Optional.empty();

   public bvw(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cdf $$4, int $$5, Function<E, avg> $$6) {
      super(ImmutableMap.of(cbs.n, cbt.c, cbs.V, cbt.b, cbs.h, cbt.a, cbs.W, cbt.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aqm $$0, bsx $$1, long $$2) {
      btq<?> $$3 = $$1.dS();
      $$3.c(cbs.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      btq<?> $$3 = $$1.dS();
      if (!$$3.a(cbs.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cbs.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aqm $$0, bsx $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bD();
   }

   protected void d(aqm $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dS().a(cbs.m, new cbv(this.l.get().a(), this.g, 0));
         $$1.dS().a(cbs.n, new bus(this.l.get().c(), true));
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
                  $$1.dS().a(cbs.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), avi.g, 1.0F, $$1.ff());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private euk a(io $$0, io $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ayd.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ayd.j((double)($$1.w() - $$0.w()));
      return euk.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<io> a(bsx $$0, bso $$1) {
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

         cca $$7 = $$0.K();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dp()::j)).filter($$1x -> {
            eni $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bsx $$0, io $$1) {
      return $$0.K().a($$1) && $$0.a(enq.b($$0, $$1)) == 0.0F;
   }

   private void b(bsx $$0, bso $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bvw.a($$1x, $$1.dp(), $$1));
   }

   public static class a {
      private final io a;
      private final io b;
      final bso c;

      public a(io $$0, io $$1, bso $$2) {
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

      public bso c() {
         return this.c;
      }
   }
}
