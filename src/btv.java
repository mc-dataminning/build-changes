import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class btv<E extends bqw> extends bsg<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cbe h;
   private final int i;
   private final Function<E, aul> j;
   private Optional<Long> k = Optional.empty();
   private Optional<btv.a> l = Optional.empty();

   public btv(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cbe $$4, int $$5, Function<E, aul> $$6) {
      super(ImmutableMap.of(bzr.n, bzs.c, bzr.V, bzs.b, bzr.h, bzs.a, bzr.W, bzs.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aps $$0, bqw $$1, long $$2) {
      brp<?> $$3 = $$1.dP();
      $$3.c(bzr.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aps $$0, E $$1, long $$2) {
      brp<?> $$3 = $$1.dP();
      if (!$$3.a(bzr.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(bzr.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aps $$0, bqw $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bA();
   }

   protected void d(aps $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dP().a(bzr.m, new bzu(this.l.get().a(), this.g, 0));
         $$1.dP().a(bzr.n, new bsr(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dm().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.K().n();
            this.b($$1, this.l.get().c);
         } else {
            ib $$4 = $$1.dm();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dP().a(bzr.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), aun.g, 1.0F, $$1.fc());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private esa a(ib $$0, ib $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)axk.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)axk.j((double)($$1.w() - $$0.w()));
      return esa.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<ib> a(bqw $$0, bqo $$1) {
      ib $$2 = $$1.dm();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<ib> $$3 = Lists.newArrayList();
         ib.a $$4 = $$2.j();

         for (ih $$5 : ih.c.a) {
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

         bzz $$7 = $$0.K();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dm()::j)).filter($$1x -> {
            elg $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bqw $$0, ib $$1) {
      return $$0.K().a($$1) && $$0.a(elo.b($$0, $$1)) == 0.0F;
   }

   private void b(bqw $$0, bqo $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new btv.a($$1x, $$1.dm(), $$1));
   }

   public static class a {
      private final ib a;
      private final ib b;
      final bqo c;

      public a(ib $$0, ib $$1, bqo $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ib a() {
         return this.a;
      }

      public ib b() {
         return this.b;
      }

      public bqo c() {
         return this.c;
      }
   }
}
