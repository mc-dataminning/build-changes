import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bya<E extends bvg> extends bwx<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final brs p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bya.a> h = Lists.newArrayList();
   protected Optional<ezr> i = Optional.empty();
   @Nullable
   protected ezr j;
   protected int k;
   protected long l;
   private final Function<E, awn> q;
   private final BiPredicate<E, jh> r;

   public bya(brs $$0, int $$1, int $$2, float $$3, Function<E, awn> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bya::a);
   }

   public static <E extends bvg> boolean a(E $$0, jh $$1) {
      dff $$2 = $$0.dY();
      jh $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(esk.b($$0, $$1)) == 0.0F;
   }

   public bya(brs $$0, int $$1, int $$2, float $$3, Function<E, awn> $$4, BiPredicate<E, jh> $$5) {
      super(ImmutableMap.of(cei.n, cej.c, cei.S, cej.b, cei.T, cej.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arq $$0, bvg $$1) {
      boolean $$2 = $$1.aL() && !$$1.bl() && !$$1.bz() && !$$0.a_($$1.dy()).a(dil.pg);
      if (!$$2) {
         $$1.ee().a(cei.S, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(arq $$0, bvg $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dw()) && this.k > 0 && !$$1.bo() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.ee().c(cei.T).isEmpty()) {
         $$1.ee().a(cei.S, this.p.a($$0.A) / 2);
         $$1.ee().b(cei.n);
      }

      return $$3;
   }

   protected void a(arq $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dw());
      jh $$3 = $$1.dy();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = jh.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bya.a($$1x.j(), azn.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.v($$1.aX);
            $$1.r(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fn();
            $$1.h(this.j.c($$4 / $$3));
            $$1.ee().a(cei.T, true);
            $$0.a(null, $$1, this.q.apply($$1), awp.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arq $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bya.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bya.a $$4 = $$3.get();
            jh $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               ezr $$6 = ezr.b($$5);
               ezr $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.ee().a(cei.n, new bxa($$5));
                  ceq $$8 = $$1.P();
                  esc $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bya.a> a(arq $$0) {
      Optional<bya.a> $$1 = bqs.a($$0.A, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(arq $$0, E $$1, jh $$2) {
      jh $$3 = $$1.dy();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected ezr a(bvg $$0, ezr $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(bwm.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<ezr> $$5 = byb.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bqr.a {
      private final jh a;

      public a(jh $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public jh b() {
         return this.a;
      }
   }
}
