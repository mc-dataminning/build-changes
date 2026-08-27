import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class csn extends cre {
   private static final Map<bqb<? extends bqq>, csn> a = Maps.newIdentityHashMap();
   private static final MapCodec<bqb<?>> b = kr.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bqb<?> k;

   public csn(bqb<? extends bqq> $$0, int $$1, int $$2, cre.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      if (!($$1 instanceof aps)) {
         return boa.a;
      } else {
         crj $$2 = $$0.n();
         ib $$3 = $$0.a();
         ih $$4 = $$0.k();
         doz $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof czp $$6) {
            bqb<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dts.c, $$3);
            $$2.g(1);
            return boa.b;
         } else {
            ib $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bqb<?> $$10 = this.j($$2);
            if ($$10.a((aps)$$1, $$2, $$0.o(), $$8, bqs.m, true, !Objects.equals($$3, $$8) && $$4 == ih.b) != null) {
               $$2.g(1);
               $$1.a($$0.o(), dts.t, $$3);
            }

            return boa.b;
         }
      }
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      erw $$4 = a($$0, $$1, cyg.b.b);
      if ($$4.c() != ery.a.b) {
         return bob.c($$3);
      } else if (!($$0 instanceof aps)) {
         return bob.a($$3);
      } else {
         ib $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dgn)) {
            return bob.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bqb<?> $$7 = this.j($$3);
            bpv $$8 = $$7.a((aps)$$0, $$3, $$1, $$6, bqs.m, false, false);
            if ($$8 == null) {
               return bob.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(auw.c.b(this));
               $$0.a($$1, dts.t, $$8.dk());
               return bob.b($$3);
            }
         } else {
            return bob.d($$3);
         }
      }
   }

   public boolean a(crj $$0, bqb<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static csn a(@Nullable bqb<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<csn> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bqb<?> j(crj $$0) {
      ctt $$1 = $$0.a(jp.D, ctt.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cmg m() {
      return this.k.m();
   }

   public Optional<bqq> a(cjt $$0, bqq $$1, bqb<? extends bqq> $$2, aps $$3, esa $$4, crj $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bqq $$6;
         if ($$1 instanceof bpp) {
            $$6 = ((bpp)$$1).a($$3, (bpp)$$1);
         } else {
            $$6 = $$2.a((cyx)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.p_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.b($$5.a(jp.d));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
