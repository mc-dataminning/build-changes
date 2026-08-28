import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bye<E extends bvk> extends bxb<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final brw p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bye.a> h = Lists.newArrayList();
   protected Optional<fbb> i = Optional.empty();
   @Nullable
   protected fbb j;
   protected int k;
   protected long l;
   private final Function<E, avz> q;
   private final BiPredicate<E, ji> r;

   public bye(brw $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bye::a);
   }

   public static <E extends bvk> boolean a(E $$0, ji $$1) {
      dgj $$2 = $$0.dV();
      ji $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(etw.b($$0, $$1)) == 0.0F;
   }

   public bye(brw $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4, BiPredicate<E, ji> $$5) {
      super(ImmutableMap.of(cem.n, cen.c, cem.S, cen.b, cem.T, cen.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(ard $$0, bvk $$1) {
      boolean $$2 = $$1.aJ() && !$$1.bj() && !$$1.bx() && !$$0.a_($$1.dv()).a(djp.pI);
      if (!$$2) {
         $$1.eb().a(cem.S, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(ard $$0, bvk $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dt()) && this.k > 0 && !$$1.bm() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.eb().c(cem.T).isEmpty()) {
         $$1.eb().a(cem.S, this.p.a($$0.A) / 2);
         $$1.eb().b(cem.n);
      }

      return $$3;
   }

   protected void a(ard $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dt());
      ji $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = ji.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bye.a($$1x.j(), ayz.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.v($$1.aX);
            $$1.r(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fk();
            $$1.i(this.j.c($$4 / $$3));
            $$1.eb().a(cem.T, true);
            $$0.a(null, $$1, this.q.apply($$1), awb.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ard $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bye.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bye.a $$4 = $$3.get();
            ji $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               fbb $$6 = fbb.b($$5);
               fbb $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.eb().a(cem.n, new bxe($$5));
                  ceu $$8 = $$1.P();
                  eto $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bye.a> a(ard $$0) {
      Optional<bye.a> $$1 = bqw.a($$0.A, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(ard $$0, E $$1, ji $$2) {
      ji $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected fbb a(bvk $$0, fbb $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(bwq.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<fbb> $$5 = byf.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bqv.a {
      private final ji a;

      public a(ji $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public ji b() {
         return this.a;
      }
   }
}
