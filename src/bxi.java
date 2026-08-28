import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bxi<E extends bup> extends bwf<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final brd p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bxi.a> h = Lists.newArrayList();
   protected Optional<eyw> i = Optional.empty();
   @Nullable
   protected eyw j;
   protected int k;
   protected long l;
   private final Function<E, awf> q;
   private final BiPredicate<E, jf> r;

   public bxi(brd $$0, int $$1, int $$2, float $$3, Function<E, awf> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bxi::a);
   }

   public static <E extends bup> boolean a(E $$0, jf $$1) {
      dej $$2 = $$0.dS();
      jf $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(erp.b($$0, $$1)) == 0.0F;
   }

   public bxi(brd $$0, int $$1, int $$2, float $$3, Function<E, awf> $$4, BiPredicate<E, jf> $$5) {
      super(ImmutableMap.of(cdq.n, cdr.c, cdq.S, cdr.b, cdq.T, cdr.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arj $$0, bup $$1) {
      boolean $$2 = $$1.aH() && !$$1.bi() && !$$1.bw() && !$$0.a_($$1.ds()).a(dho.pg);
      if (!$$2) {
         $$1.dY().a(cdq.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(arj $$0, bup $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dq()) && this.k > 0 && !$$1.bl() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dY().c(cdq.T).isEmpty()) {
         $$1.dY().a(cdq.S, this.p.a($$0.z) / 2);
         $$1.dY().b(cdq.n);
      }

      return $$3;
   }

   protected void a(arj $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dq());
      jf $$3 = $$1.ds();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = jf.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bxi.a($$1x.j(), azf.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(arj $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.v($$1.aT);
            $$1.r(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fh();
            $$1.h(this.j.c($$4 / $$3));
            $$1.dY().a(cdq.T, true);
            $$0.a(null, $$1, this.q.apply($$1), awh.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arj $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bxi.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bxi.a $$4 = $$3.get();
            jf $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               eyw $$6 = eyw.b($$5);
               eyw $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dY().a(cdq.n, new bwi($$5));
                  cdy $$8 = $$1.P();
                  erh $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bxi.a> a(arj $$0) {
      Optional<bxi.a> $$1 = bqf.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(arj $$0, E $$1, jf $$2) {
      jf $$3 = $$1.ds();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected eyw a(bup $$0, eyw $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(bvu.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<eyw> $$5 = bxj.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bqe.a {
      private final jf a;

      public a(jf $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public jf b() {
         return this.a;
      }
   }
}
