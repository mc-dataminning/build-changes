import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class btj<E extends bqq> extends bsg<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bnl p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<btj.a> h = Lists.newArrayList();
   protected Optional<esa> i = Optional.empty();
   @Nullable
   protected esa j;
   protected int k;
   protected long l;
   private final Function<E, aul> q;
   private final BiPredicate<E, ib> r;

   public btj(bnl $$0, int $$1, int $$2, float $$3, Function<E, aul> $$4) {
      this($$0, $$1, $$2, $$3, $$4, btj::a);
   }

   public static <E extends bqq> boolean a(E $$0, ib $$1) {
      cyx $$2 = $$0.dM();
      ib $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(elo.b($$0, $$1)) == 0.0F;
   }

   public btj(bnl $$0, int $$1, int $$2, float $$3, Function<E, aul> $$4, BiPredicate<E, ib> $$5) {
      super(ImmutableMap.of(bzr.n, bzs.c, bzr.S, bzs.b, bzr.T, bzs.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aps $$0, bqq $$1) {
      boolean $$2 = $$1.aC() && !$$1.bc() && !$$1.bq() && !$$0.a_($$1.dm()).a(dca.pg);
      if (!$$2) {
         $$1.dP().a(bzr.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(aps $$0, bqq $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dk()) && this.k > 0 && !$$1.bf() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dP().c(bzr.T).isEmpty()) {
         $$1.dP().a(bzr.S, this.p.a($$0.z) / 2);
         $$1.dP().b(bzr.n);
      }

      return $$3;
   }

   protected void a(aps $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dk());
      ib $$3 = $$1.dm();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = ib.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new btj.a($$1x.i(), axk.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aps $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aX);
            $$1.p(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.ff();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dP().a(bzr.T, true);
            $$0.a(null, $$1, this.q.apply($$1), aun.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aps $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<btj.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            btj.a $$4 = $$3.get();
            ib $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               esa $$6 = esa.b($$5);
               esa $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dP().a(bzr.n, new bsj($$5));
                  bzz $$8 = $$1.K();
                  elg $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<btj.a> a(aps $$0) {
      Optional<btj.a> $$1 = bmn.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aps $$0, E $$1, ib $$2) {
      ib $$3 = $$1.dm();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected esa a(bqq $$0, esa $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(brv.m) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<esa> $$5 = btk.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bmm.a {
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
