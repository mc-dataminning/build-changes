import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bxr<E extends bux> extends bwo<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final brj p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bxr.a> h = Lists.newArrayList();
   protected Optional<ezh> i = Optional.empty();
   @Nullable
   protected ezh j;
   protected int k;
   protected long l;
   private final Function<E, awj> q;
   private final BiPredicate<E, jg> r;

   public bxr(brj $$0, int $$1, int $$2, float $$3, Function<E, awj> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bxr::a);
   }

   public static <E extends bux> boolean a(E $$0, jg $$1) {
      dev $$2 = $$0.dX();
      jg $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(esa.b($$0, $$1)) == 0.0F;
   }

   public bxr(brj $$0, int $$1, int $$2, float $$3, Function<E, awj> $$4, BiPredicate<E, jg> $$5) {
      super(ImmutableMap.of(cdz.n, cea.c, cdz.S, cea.b, cdz.T, cea.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arm $$0, bux $$1) {
      boolean $$2 = $$1.aJ() && !$$1.bk() && !$$1.by() && !$$0.a_($$1.dx()).a(dia.pg);
      if (!$$2) {
         $$1.ed().a(cdz.S, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(arm $$0, bux $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dv()) && this.k > 0 && !$$1.bn() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.ed().c(cdz.T).isEmpty()) {
         $$1.ed().a(cdz.S, this.p.a($$0.A) / 2);
         $$1.ed().b(cdz.n);
      }

      return $$3;
   }

   protected void a(arm $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dv());
      jg $$3 = $$1.dx();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = jg.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bxr.a($$1x.j(), azj.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(arm $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.v($$1.aU);
            $$1.r(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fm();
            $$1.h(this.j.c($$4 / $$3));
            $$1.ed().a(cdz.T, true);
            $$0.a(null, $$1, this.q.apply($$1), awl.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arm $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bxr.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bxr.a $$4 = $$3.get();
            jg $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               ezh $$6 = ezh.b($$5);
               ezh $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.ed().a(cdz.n, new bwr($$5));
                  ceh $$8 = $$1.P();
                  ers $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bxr.a> a(arm $$0) {
      Optional<bxr.a> $$1 = bqj.a($$0.A, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(arm $$0, E $$1, jg $$2) {
      jg $$3 = $$1.dx();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected ezh a(bux $$0, ezh $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(bwd.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<ezh> $$5 = bxs.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bqi.a {
      private final jg a;

      public a(jg $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public jg b() {
         return this.a;
      }
   }
}
