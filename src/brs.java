import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class brs<E extends boz> extends bqp<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final blw p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<brs.a> h = Lists.newArrayList();
   protected Optional<eov> i = Optional.empty();
   @Nullable
   protected eov j;
   protected int k;
   protected long l;
   private final Function<E, ato> q;
   private final BiPredicate<E, ib> r;

   public brs(blw $$0, int $$1, int $$2, float $$3, Function<E, ato> $$4) {
      this($$0, $$1, $$2, $$3, $$4, brs::a);
   }

   public static <E extends boz> boolean a(E $$0, ib $$1) {
      cwe $$2 = $$0.dJ();
      ib $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(eil.a($$2, $$1.j())) == 0.0F;
   }

   public brs(blw $$0, int $$1, int $$2, float $$3, Function<E, ato> $$4, BiPredicate<E, ib> $$5) {
      super(ImmutableMap.of(bya.n, byb.c, bya.S, byb.b, bya.T, byb.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(apa $$0, boz $$1) {
      boolean $$2 = $$1.aC() && !$$1.aZ() && !$$1.bn() && !$$0.a_($$1.dj()).a(czh.pg);
      if (!$$2) {
         $$1.dM().a(bya.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(apa $$0, boz $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dh()) && this.k > 0 && !$$1.bc() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dM().c(bya.T).isEmpty()) {
         $$1.dM().a(bya.S, this.p.a($$0.z) / 2);
         $$1.dM().b(bya.n);
      }

      return $$3;
   }

   protected void a(apa $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dh());
      ib $$3 = $$1.dj();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = ib.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new brs.a($$1x.i(), awm.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(apa $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aV);
            $$1.p(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fc();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dM().a(bya.T, true);
            $$0.a(null, $$1, this.q.apply($$1), atq.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(apa $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<brs.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            brs.a $$4 = $$3.get();
            ib $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               eov $$6 = eov.b($$5);
               eov $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dM().a(bya.n, new bqs($$5));
                  byi $$8 = $$1.N();
                  eig $$9 = $$8.a($$5, 0, 8);
                  if ($$9 == null || !$$9.j()) {
                     this.j = $$7;
                     this.l = $$2;
                     return;
                  }
               }
            }
         }
      }
   }

   protected Optional<brs.a> a(apa $$0) {
      Optional<brs.a> $$1 = bky.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(apa $$0, E $$1, ib $$2) {
      ib $$3 = $$1.dj();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected eov a(boz $$0, eov $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);

      for (int $$3 : $$2) {
         Optional<eov> $$4 = brt.a($$0, $$1, this.g, $$3, true);
         if ($$4.isPresent()) {
            return $$4.get();
         }
      }

      return null;
   }

   public static class a extends bkx.a {
      private final ib a;

      public a(ib $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public ib b() {
         return this.a;
      }
   }
}
