import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class byu<E extends bwa> extends bxr<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bsj p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<byu.a> h = Lists.newArrayList();
   protected Optional<fbx> i = Optional.empty();
   @Nullable
   protected fbx j;
   protected int k;
   protected long l;
   private final Function<E, avz> q;
   private final BiPredicate<E, ji> r;

   public byu(bsj $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4) {
      this($$0, $$1, $$2, $$3, $$4, byu::a);
   }

   public static <E extends bwa> boolean a(E $$0, ji $$1) {
      dgz $$2 = $$0.dU();
      ji $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(eus.b($$0, $$1)) == 0.0F;
   }

   public byu(bsj $$0, int $$1, int $$2, float $$3, Function<E, avz> $$4, BiPredicate<E, ji> $$5) {
      super(ImmutableMap.of(cfc.n, cfd.c, cfc.S, cfd.b, cfc.T, cfd.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(ard $$0, bwa $$1) {
      boolean $$2 = $$1.aJ() && !$$1.bj() && !$$1.bv() && !$$0.a_($$1.du()).a(dkg.pI);
      if (!$$2) {
         $$1.ea().a(cfc.S, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(ard $$0, bwa $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.ds()) && this.k > 0 && !$$1.bj() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.ea().c(cfc.T).isEmpty()) {
         $$1.ea().a(cfc.S, this.p.a($$0.A) / 2);
         $$1.ea().b(cfc.n);
      }

      return $$3;
   }

   protected void a(ard $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.ds());
      ji $$3 = $$1.du();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = ji.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new byu.a($$1x.j(), ayz.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.w($$1.aV);
            $$1.q(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + (double)$$1.fk();
            $$1.i(this.j.c($$4 / $$3));
            $$1.ea().a(cfc.T, true);
            $$0.a(null, $$1, this.q.apply($$1), awb.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ard $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<byu.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            byu.a $$4 = $$3.get();
            ji $$5 = $$4.a();
            if (this.a($$0, $$1, $$5)) {
               fbx $$6 = fbx.b($$5);
               fbx $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.ea().a(cfc.n, new bxu($$5));
                  cfk $$8 = $$1.O();
                  euk $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<byu.a> a(ard $$0) {
      Optional<byu.a> $$1 = brk.a($$0.A, this.h, byu.a::b);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(ard $$0, E $$1, ji $$2) {
      ji $$3 = $$1.du();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected fbx a(bwa $$0, fbx $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.h(bxg.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<fbx> $$5 = byv.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static record a(ji a, int b) {
   }
}
