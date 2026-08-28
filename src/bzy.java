import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bzy<E extends bxg> extends byv<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bto p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bzy.a> h = Lists.newArrayList();
   protected Optional<feq> i = Optional.empty();
   @Nullable
   protected feq j;
   protected int k;
   protected long l;
   private final Function<E, awm> q;
   private final BiPredicate<E, iu> r;

   public bzy(bto $$0, int $$1, int $$2, float $$3, Function<E, awm> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bzy::a);
   }

   public static <E extends bxg> boolean a(E $$0, iu $$1) {
      dja $$2 = $$0.dV();
      iu $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(exk.b($$0, $$1)) == 0.0F;
   }

   public bzy(bto $$0, int $$1, int $$2, float $$3, Function<E, awm> $$4, BiPredicate<E, iu> $$5) {
      super(ImmutableMap.of(cgg.o, cgh.c, cgg.T, cgh.b, cgg.U, cgh.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arq $$0, bxg $$1) {
      boolean $$2 = $$1.aJ() && !$$1.bj() && !$$1.bw() && !$$0.a_($$1.dv()).a(dmh.pO);
      if (!$$2) {
         $$1.ec().a(cgg.T, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(arq $$0, bxg $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dt()) && this.k > 0 && !$$1.bj() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.ec().c(cgg.U).isEmpty()) {
         $$1.ec().a(cgg.T, this.p.a($$0.A) / 2);
         $$1.ec().b(cgg.o);
      }

      return $$3;
   }

   protected void a(arq $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dt());
      iu $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = iu.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bzy.a($$1x.j(), azm.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.w($$1.aV);
            $$1.q(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fi();
            $$1.i(this.j.c($$4 / $$3));
            $$1.ec().a(cgg.U, true);
            $$0.a(null, $$1, this.q.apply($$1), awo.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arq $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bzy.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bzy.a $$4 = $$3.get();
            iu $$5 = $$4.a();
            if (this.a($$0, $$1, $$5)) {
               feq $$6 = feq.b($$5);
               feq $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.ec().a(cgg.o, new byy($$5));
                  cgo $$8 = $$1.O();
                  exc $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bzy.a> a(arq $$0) {
      Optional<bzy.a> $$1 = bsp.a($$0.A, this.h, bzy.a::b);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(arq $$0, E $$1, iu $$2) {
      iu $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected feq a(bxg $$0, feq $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(byk.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<feq> $$5 = bzz.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static record a(iu a, int b) {
   }
}
