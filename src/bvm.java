import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bvm<E extends bss> extends buj<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bph p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bvm.a> h = Lists.newArrayList();
   protected Optional<eum> i = Optional.empty();
   @Nullable
   protected eum j;
   protected int k;
   protected long l;
   private final Function<E, avh> q;
   private final BiPredicate<E, io> r;

   public bvm(bph $$0, int $$1, int $$2, float $$3, Function<E, avh> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bvm::a);
   }

   public static <E extends bss> boolean a(E $$0, io $$1) {
      daz $$2 = $$0.dP();
      io $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(ens.b($$0, $$1)) == 0.0F;
   }

   public bvm(bph $$0, int $$1, int $$2, float $$3, Function<E, avh> $$4, BiPredicate<E, io> $$5) {
      super(ImmutableMap.of(cbu.n, cbv.c, cbu.S, cbv.b, cbu.T, cbv.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aqn $$0, bss $$1) {
      boolean $$2 = $$1.aE() && !$$1.be() && !$$1.bs() && !$$0.a_($$1.dp()).a(dec.pg);
      if (!$$2) {
         $$1.dS().a(cbu.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(aqn $$0, bss $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dn()) && this.k > 0 && !$$1.bh() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dS().c(cbu.T).isEmpty()) {
         $$1.dS().a(cbu.S, this.p.a($$0.z) / 2);
         $$1.dS().b(cbu.n);
      }

      return $$3;
   }

   protected void a(aqn $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dn());
      io $$3 = $$1.dp();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = io.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bvm.a($$1x.i(), ayf.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aqn $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aY);
            $$1.q(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fi();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dS().a(cbu.T, true);
            $$0.a(null, $$1, this.q.apply($$1), avj.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aqn $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bvm.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bvm.a $$4 = $$3.get();
            io $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               eum $$6 = eum.b($$5);
               eum $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dS().a(cbu.n, new bum($$5));
                  ccc $$8 = $$1.K();
                  enk $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bvm.a> a(aqn $$0) {
      Optional<bvm.a> $$1 = boj.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aqn $$0, E $$1, io $$2) {
      io $$3 = $$1.dp();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected eum a(bss $$0, eum $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(bty.m) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<eum> $$5 = bvn.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends boi.a {
      private final io a;

      public a(io $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public io b() {
         return this.a;
      }
   }
}
