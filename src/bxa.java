import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bxa<E extends buh> extends bvx<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bqv p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bxa.a> h = Lists.newArrayList();
   protected Optional<eye> i = Optional.empty();
   @Nullable
   protected eye j;
   protected int k;
   protected long l;
   private final Function<E, awc> q;
   private final BiPredicate<E, je> r;

   public bxa(bqv $$0, int $$1, int $$2, float $$3, Function<E, awc> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bxa::a);
   }

   public static <E extends buh> boolean a(E $$0, je $$1) {
      dds $$2 = $$0.dS();
      je $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(eqx.b($$0, $$1)) == 0.0F;
   }

   public bxa(bqv $$0, int $$1, int $$2, float $$3, Function<E, awc> $$4, BiPredicate<E, je> $$5) {
      super(ImmutableMap.of(cdi.n, cdj.c, cdi.S, cdj.b, cdi.T, cdj.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arg $$0, buh $$1) {
      boolean $$2 = $$1.aH() && !$$1.bi() && !$$1.bw() && !$$0.a_($$1.ds()).a(dgx.pg);
      if (!$$2) {
         $$1.dX().a(cdi.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(arg $$0, buh $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dq()) && this.k > 0 && !$$1.bl() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dX().c(cdi.T).isEmpty()) {
         $$1.dX().a(cdi.S, this.p.a($$0.z) / 2);
         $$1.dX().b(cdi.n);
      }

      return $$3;
   }

   protected void a(arg $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dq());
      je $$3 = $$1.ds();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = je.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bxa.a($$1x.j(), azc.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(arg $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.v($$1.aU);
            $$1.r(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fh();
            $$1.h(this.j.c($$4 / $$3));
            $$1.dX().a(cdi.T, true);
            $$0.a(null, $$1, this.q.apply($$1), awe.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arg $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bxa.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bxa.a $$4 = $$3.get();
            je $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               eye $$6 = eye.b($$5);
               eye $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dX().a(cdi.n, new bwa($$5));
                  cdq $$8 = $$1.P();
                  eqp $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bxa.a> a(arg $$0) {
      Optional<bxa.a> $$1 = bpx.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(arg $$0, E $$1, je $$2) {
      je $$3 = $$1.ds();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected eye a(buh $$0, eye $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(bvm.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<eye> $$5 = bxb.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bpw.a {
      private final je a;

      public a(je $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public je b() {
         return this.a;
      }
   }
}
