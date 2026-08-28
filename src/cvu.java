import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvu extends cui {
   private static final Map<bsy<? extends btp>, cvu> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsy<?>> b = lp.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bsy<?> k;

   public cvu(bsy<? extends btp> $$0, int $$1, int $$2, cui.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      if (!($$1 instanceof are)) {
         return bqs.a;
      } else {
         cun $$2 = $$0.n();
         iz $$3 = $$0.a();
         je $$4 = $$0.k();
         dsa $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dco $$6) {
            bsy<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dwt.c, $$3);
            $$2.h(1);
            return bqs.c;
         } else {
            iz $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsy<?> $$10 = this.j($$2);
            if ($$10.a((are)$$1, $$2, $$0.o(), $$8, btr.m, true, !Objects.equals($$3, $$8) && $$4 == je.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dwt.t, $$3);
            }

            return bqs.c;
         }
      }
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      evl $$4 = a($$0, $$1, dbf.b.b);
      if ($$4.c() != evn.a.b) {
         return bqt.c($$3);
      } else if (!($$0 instanceof are)) {
         return bqt.a($$3);
      } else {
         iz $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djn)) {
            return bqt.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsy<?> $$7 = this.j($$3);
            bss $$8 = $$7.a((are)$$0, $$3, $$1, $$6, btr.m, false, false);
            if ($$8 == null) {
               return bqt.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(awj.c.b(this));
               $$0.a($$1, dwt.t, $$8.dn());
               return bqt.b($$3);
            }
         } else {
            return bqt.d($$3);
         }
      }
   }

   public boolean a(cun $$0, bsy<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvu a(@Nullable bsy<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvu> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsy<?> j(cun $$0) {
      cxc $$1 = $$0.a(km.L, cxc.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cpj i() {
      return this.k.i();
   }

   public Optional<btp> a(cmv $$0, btp $$1, bsy<? extends btp> $$2, are $$3, evp $$4, cun $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         btp $$6;
         if ($$1 instanceof bsm) {
            $$6 = ((bsm)$$1).a($$3, (bsm)$$1);
         } else {
            $$6 = $$2.a((dbw)$$3);
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
               $$6.b($$5.a(km.f));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
