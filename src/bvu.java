import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bvu<E extends bta> extends bur<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bpo p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bvu.a> h = Lists.newArrayList();
   protected Optional<evz> i = Optional.empty();
   @Nullable
   protected evz j;
   protected int k;
   protected long l;
   private final Function<E, ave> q;
   private final BiPredicate<E, ja> r;

   public bvu(bpo $$0, int $$1, int $$2, float $$3, Function<E, ave> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bvu::a);
   }

   public static <E extends bta> boolean a(E $$0, ja $$1) {
      dcd $$2 = $$0.dP();
      ja $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(eox.b($$0, $$1)) == 0.0F;
   }

   public bvu(bpo $$0, int $$1, int $$2, float $$3, Function<E, ave> $$4, BiPredicate<E, ja> $$5) {
      super(ImmutableMap.of(ccc.n, ccd.c, ccc.S, ccd.b, ccc.T, ccd.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aqk $$0, bta $$1) {
      boolean $$2 = $$1.aE() && !$$1.be() && !$$1.bs() && !$$0.a_($$1.dp()).a(dfh.pg);
      if (!$$2) {
         $$1.dT().a(ccc.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(aqk $$0, bta $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dn()) && this.k > 0 && !$$1.bh() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dT().c(ccc.T).isEmpty()) {
         $$1.dT().a(ccc.S, this.p.a($$0.z) / 2);
         $$1.dT().b(ccc.n);
      }

      return $$3;
   }

   protected void a(aqk $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dn());
      ja $$3 = $$1.dp();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = ja.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bvu.a($$1x.i(), aye.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aqk $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.s($$1.aY);
            $$1.q(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fe();
            $$1.h(this.j.a($$4 / $$3));
            $$1.dT().a(ccc.T, true);
            $$0.a(null, $$1, this.q.apply($$1), avg.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aqk $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bvu.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bvu.a $$4 = $$3.get();
            ja $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               evz $$6 = evz.b($$5);
               evz $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dT().a(ccc.n, new buu($$5));
                  cck $$8 = $$1.K();
                  eop $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bvu.a> a(aqk $$0) {
      Optional<bvu.a> $$1 = boq.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aqk $$0, E $$1, ja $$2) {
      ja $$3 = $$1.dp();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected evz a(bta $$0, evz $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(bug.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<evz> $$5 = bvv.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bop.a {
      private final ja a;

      public a(ja $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public ja b() {
         return this.a;
      }
   }
}
