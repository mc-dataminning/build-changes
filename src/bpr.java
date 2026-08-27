import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bpr<E extends bmu> extends boc<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final bwz h;
   private final int i;
   private final Function<E, arr> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bpr.a> l = Optional.empty();

   public bpr(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, bwz $$4, int $$5, Function<E, arr> $$6) {
      super(ImmutableMap.of(bvn.n, bvo.c, bvn.U, bvo.b, bvn.h, bvo.a, bvn.V, bvo.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(and $$0, bmu $$1, long $$2) {
      bnl<?> $$3 = $$1.dO();
      $$3.c(bvn.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(and $$0, E $$1, long $$2) {
      bnl<?> $$3 = $$1.dO();
      if (!$$3.a(bvn.V)) {
         $$0.a($$1, (byte)59);
         $$3.a(bvn.U, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(and $$0, bmu $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bx();
   }

   protected void d(and $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dO().a(bvn.m, new bvq(this.l.get().a(), this.g, 0));
         $$1.dO().a(bvn.n, new bon(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dm().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.N().n();
            this.b($$1, this.l.get().c);
         } else {
            hx $$4 = $$1.dm();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dO().a(bvn.V, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), art.g, 1.0F, $$1.eX());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private elt a(hx $$0, hx $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)auo.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)auo.j((double)($$1.w() - $$0.w()));
      return elt.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<hx> a(bmu $$0, bml $$1) {
      hx $$2 = $$1.dm();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<hx> $$3 = Lists.newArrayList();
         hx.a $$4 = $$2.j();

         for (ic $$5 : ic.c.a) {
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

         bvv $$7 = $$0.N();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dm()::j)).filter($$1x -> {
            efg $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bmu $$0, hx $$1) {
      return $$0.N().a($$1) && $$0.a(efl.a($$0.dM(), $$1.j())) == 0.0F;
   }

   private void b(bmu $$0, bml $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bpr.a($$1x, $$1.dm(), $$1));
   }

   public static class a {
      private final hx a;
      private final hx b;
      final bml c;

      public a(hx $$0, hx $$1, bml $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public hx a() {
         return this.a;
      }

      public hx b() {
         return this.b;
      }

      public bml c() {
         return this.c;
      }
   }
}
