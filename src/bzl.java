import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bzl<E extends bwt> extends byi<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final btb p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bzl.a> h = Lists.newArrayList();
   protected Optional<fcu> i = Optional.empty();
   @Nullable
   protected fcu j;
   protected int k;
   protected long l;
   private final Function<E, awj> q;
   private final BiPredicate<E, jj> r;

   public bzl(btb $$0, int $$1, int $$2, float $$3, Function<E, awj> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bzl::a);
   }

   public static <E extends bwt> boolean a(E $$0, jj $$1) {
      dhp $$2 = $$0.dV();
      jj $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(evp.b($$0, $$1)) == 0.0F;
   }

   public bzl(btb $$0, int $$1, int $$2, float $$3, Function<E, awj> $$4, BiPredicate<E, jj> $$5) {
      super(ImmutableMap.of(cft.o, cfu.c, cft.T, cfu.b, cft.U, cfu.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(arn $$0, bwt $$1) {
      boolean $$2 = $$1.aJ() && !$$1.bj() && !$$1.bw() && !$$0.a_($$1.dv()).a(dkw.pK);
      if (!$$2) {
         $$1.eb().a(cft.T, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(arn $$0, bwt $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dt()) && this.k > 0 && !$$1.bj() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.eb().c(cft.U).isEmpty()) {
         $$1.eb().a(cft.T, this.p.a($$0.A) / 2);
         $$1.eb().b(cft.o);
      }

      return $$3;
   }

   protected void a(arn $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dt());
      jj $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = jj.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bzl.a($$1x.j(), azk.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(arn $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.w($$1.aU);
            $$1.q(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fh();
            $$1.i(this.j.c($$4 / $$3));
            $$1.eb().a(cft.U, true);
            $$0.a(null, $$1, this.q.apply($$1), awl.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(arn $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bzl.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bzl.a $$4 = $$3.get();
            jj $$5 = $$4.a();
            if (this.a($$0, $$1, $$5)) {
               fcu $$6 = fcu.b($$5);
               fcu $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.eb().a(cft.o, new byl($$5));
                  cgb $$8 = $$1.O();
                  evh $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bzl.a> a(arn $$0) {
      Optional<bzl.a> $$1 = bsc.a($$0.A, this.h, bzl.a::b);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(arn $$0, E $$1, jj $$2) {
      jj $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected fcu a(bwt $$0, fcu $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(bxx.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<fcu> $$5 = bzm.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static record a(jj a, int b) {
   }
}
