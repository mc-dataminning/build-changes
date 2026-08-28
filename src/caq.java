import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class caq<E extends bxy> extends bzn<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bue p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<caq.a> h = Lists.newArrayList();
   protected Optional<ffs> i = Optional.empty();
   @Nullable
   protected ffs j;
   protected int k;
   protected long l;
   private final Function<E, awq> q;
   private final BiPredicate<E, iw> r;

   public caq(bue $$0, int $$1, int $$2, float $$3, Function<E, awq> $$4) {
      this($$0, $$1, $$2, $$3, $$4, caq::a);
   }

   public static <E extends bxy> boolean a(E $$0, iw $$1) {
      djz $$2 = $$0.dV();
      iw $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(eym.b($$0, $$1)) == 0.0F;
   }

   public caq(bue $$0, int $$1, int $$2, float $$3, Function<E, awq> $$4, BiPredicate<E, iw> $$5) {
      super(ImmutableMap.of(cgy.o, cgz.c, cgy.T, cgz.b, cgy.U, cgz.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aru $$0, bxy $$1) {
      boolean $$2 = $$1.aH() && !$$1.bi() && !$$1.bv() && !$$0.a_($$1.dv()).a(dng.pO);
      if (!$$2) {
         $$1.ec().a(cgy.T, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(aru $$0, bxy $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dt()) && this.k > 0 && !$$1.bi() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.ec().c(cgy.U).isEmpty()) {
         $$1.ec().a(cgy.T, this.p.a($$0.A) / 2);
         $$1.ec().b(cgy.o);
      }

      return $$3;
   }

   protected void a(aru $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dt());
      iw $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = iw.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new caq.a($$1x.j(), azq.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aru $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.w($$1.aV);
            $$1.q(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fi();
            $$1.i(this.j.c($$4 / $$3));
            $$1.ec().a(cgy.U, true);
            $$0.a(null, $$1, this.q.apply($$1), aws.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aru $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<caq.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            caq.a $$4 = $$3.get();
            iw $$5 = $$4.a();
            if (this.a($$0, $$1, $$5)) {
               ffs $$6 = ffs.b($$5);
               ffs $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.ec().a(cgy.o, new bzq($$5));
                  chg $$8 = $$1.O();
                  eye $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<caq.a> a(aru $$0) {
      Optional<caq.a> $$1 = bte.a($$0.A, this.h, caq.a::b);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aru $$0, E $$1, iw $$2) {
      iw $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected ffs a(bxy $$0, ffs $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(bzc.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<ffs> $$5 = car.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static record a(iw a, int b) {
   }
}
