import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bzt<E extends bxb> extends byq<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final btj p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bzt.a> h = Lists.newArrayList();
   protected Optional<fdw> i = Optional.empty();
   @Nullable
   protected fdw j;
   protected int k;
   protected long l;
   private final Function<E, awk> q;
   private final BiPredicate<E, iu> r;

   public bzt(btj $$0, int $$1, int $$2, float $$3, Function<E, awk> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bzt::a);
   }

   public static <E extends bxb> boolean a(E $$0, iu $$1) {
      dip $$2 = $$0.dV();
      iu $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(ewr.b($$0, $$1)) == 0.0F;
   }

   public bzt(btj $$0, int $$1, int $$2, float $$3, Function<E, awk> $$4, BiPredicate<E, iu> $$5) {
      super(ImmutableMap.of(cgb.o, cgc.c, cgb.T, cgc.b, cgb.U, cgc.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aro $$0, bxb $$1) {
      boolean $$2 = $$1.aJ() && !$$1.bj() && !$$1.bw() && !$$0.a_($$1.dv()).a(dlw.pK);
      if (!$$2) {
         $$1.eb().a(cgb.T, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(aro $$0, bxb $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dt()) && this.k > 0 && !$$1.bj() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.eb().c(cgb.U).isEmpty()) {
         $$1.eb().a(cgb.T, this.p.a($$0.A) / 2);
         $$1.eb().b(cgb.o);
      }

      return $$3;
   }

   protected void a(aro $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dt());
      iu $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = iu.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bzt.a($$1x.j(), azk.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aro $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.w($$1.aV);
            $$1.q(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fh();
            $$1.i(this.j.c($$4 / $$3));
            $$1.eb().a(cgb.U, true);
            $$0.a(null, $$1, this.q.apply($$1), awm.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aro $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bzt.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bzt.a $$4 = $$3.get();
            iu $$5 = $$4.a();
            if (this.a($$0, $$1, $$5)) {
               fdw $$6 = fdw.b($$5);
               fdw $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.eb().a(cgb.o, new byt($$5));
                  cgj $$8 = $$1.O();
                  ewj $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bzt.a> a(aro $$0) {
      Optional<bzt.a> $$1 = bsk.a($$0.A, this.h, bzt.a::b);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aro $$0, E $$1, iu $$2) {
      iu $$3 = $$1.dv();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected fdw a(bxb $$0, fdw $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(byf.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<fdw> $$5 = bzu.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static record a(iu a, int b) {
   }
}
