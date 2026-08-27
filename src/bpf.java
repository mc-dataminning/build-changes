import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bpf<E extends bmn> extends boc<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bjm p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bpf.a> h = Lists.newArrayList();
   protected Optional<elt> i = Optional.empty();
   @Nullable
   protected elt j;
   protected int k;
   protected long l;
   private final Function<E, arr> q;
   private final BiPredicate<E, hx> r;

   public bpf(bjm $$0, int $$1, int $$2, float $$3, Function<E, arr> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bpf::a);
   }

   public static <E extends bmn> boolean a(E $$0, hx $$1) {
      ctp $$2 = $$0.dM();
      hx $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(efl.a($$2, $$1.j())) == 0.0F;
   }

   public bpf(bjm $$0, int $$1, int $$2, float $$3, Function<E, arr> $$4, BiPredicate<E, hx> $$5) {
      super(ImmutableMap.of(bvn.n, bvo.c, bvn.R, bvo.b, bvn.S, bvo.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(and $$0, bmn $$1) {
      boolean $$2 = $$1.aC() && !$$1.aZ() && !$$1.bn() && !$$0.a_($$1.dm()).a(cws.pg);
      if (!$$2) {
         $$1.dO().a(bvn.R, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(and $$0, bmn $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dk()) && this.k > 0 && !$$1.bc() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dO().c(bvn.S).isEmpty()) {
         $$1.dO().a(bvn.R, this.p.a($$0.z) / 2);
         $$1.dO().b(bvn.n);
      }

      return $$3;
   }

   protected void a(and $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dk());
      hx $$3 = $$1.dm();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = hx.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bpf.a($$1x.i(), auo.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(and $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aU);
            $$1.p(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fa();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dO().a(bvn.S, true);
            $$0.a(null, $$1, this.q.apply($$1), art.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(and $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bpf.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bpf.a $$4 = $$3.get();
            hx $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               elt $$6 = elt.b($$5);
               elt $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dO().a(bvn.n, new bof($$5));
                  bvv $$8 = $$1.N();
                  efg $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bpf.a> a(and $$0) {
      Optional<bpf.a> $$1 = bio.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(and $$0, E $$1, hx $$2) {
      hx $$3 = $$1.dm();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected elt a(bmn $$0, elt $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);

      for (int $$3 : $$2) {
         Optional<elt> $$4 = bpg.a($$0, $$1, this.g, $$3, true);
         if ($$4.isPresent()) {
            return $$4.get();
         }
      }

      return null;
   }

   public static class a extends bin.a {
      private final hx a;

      public a(hx $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public hx b() {
         return this.a;
      }
   }
}
