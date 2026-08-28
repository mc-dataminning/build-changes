import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bzw<E extends bxe> extends byt<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final btm p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bzw.a> h = Lists.newArrayList();
   protected Optional<fei> i = Optional.empty();
   @Nullable
   protected fei j;
   protected int k;
   protected long l;
   private final Function<E, awm> q;
   private final BiPredicate<E, iu> r;

   public bzw(btm $$0, int $$1, int $$2, float $$3, Function<E, awm> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bzw::a);
   }

   public static <E extends bxe> boolean a(E $$0, iu $$1) {
      div $$2 = $$0.dV();
      iu $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(exc.b($$0, $$1)) == 0.0F;
   }

   public bzw(btm $$0, int $$1, int $$2, float $$3, Function<E, awm> $$4, BiPredicate<E, iu> $$5) {
      super(ImmutableMap.of(cge.o, cgf.c, cge.T, cgf.b, cge.U, cgf.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arq $$0, bxe $$1) {
      boolean $$2 = $$1.aJ() && !$$1.bj() && !$$1.bw() && !$$0.a_($$1.dv()).a(dmc.pL);
      if (!$$2) {
         $$1.eb().a(cge.T, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(arq $$0, bxe $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dt()) && this.k > 0 && !$$1.bj() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.eb().c(cge.U).isEmpty()) {
         $$1.eb().a(cge.T, this.p.a($$0.A) / 2);
         $$1.eb().b(cge.o);
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
         .map($$1x -> new bzw.a($$1x.j(), azm.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.w($$1.aV);
            $$1.q(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fh();
            $$1.i(this.j.c($$4 / $$3));
            $$1.eb().a(cge.U, true);
            $$0.a(null, $$1, this.q.apply($$1), awo.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arq $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bzw.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bzw.a $$4 = $$3.get();
            iu $$5 = $$4.a();
            if (this.a($$0, $$1, $$5)) {
               fei $$6 = fei.b($$5);
               fei $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.eb().a(cge.o, new byw($$5));
                  cgm $$8 = $$1.O();
                  ewu $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bzw.a> a(arq $$0) {
      Optional<bzw.a> $$1 = bsn.a($$0.A, this.h, bzw.a::b);
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
   protected fei a(bxe $$0, fei $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(byi.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<fei> $$5 = bzx.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static record a(iu a, int b) {
   }
}
