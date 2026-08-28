import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvv extends cuj {
   private static final Map<bsz<? extends btq>, cvv> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsz<?>> b = lp.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bsz<?> k;

   public cvv(bsz<? extends btq> $$0, int $$1, int $$2, cuj.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      if (!($$1 instanceof are)) {
         return bqt.a;
      } else {
         cuo $$2 = $$0.n();
         iz $$3 = $$0.a();
         je $$4 = $$0.k();
         dsb $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcp $$6) {
            bsz<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dwu.c, $$3);
            $$2.h(1);
            return bqt.c;
         } else {
            iz $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsz<?> $$10 = this.j($$2);
            if ($$10.a((are)$$1, $$2, $$0.o(), $$8, bts.m, true, !Objects.equals($$3, $$8) && $$4 == je.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dwu.t, $$3);
            }

            return bqt.c;
         }
      }
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      evm $$4 = a($$0, $$1, dbg.b.b);
      if ($$4.c() != evo.a.b) {
         return bqu.c($$3);
      } else if (!($$0 instanceof are)) {
         return bqu.a($$3);
      } else {
         iz $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djo)) {
            return bqu.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsz<?> $$7 = this.j($$3);
            bst $$8 = $$7.a((are)$$0, $$3, $$1, $$6, bts.m, false, false);
            if ($$8 == null) {
               return bqu.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(awj.c.b(this));
               $$0.a($$1, dwu.t, $$8.dn());
               return bqu.b($$3);
            }
         } else {
            return bqu.d($$3);
         }
      }
   }

   public boolean a(cuo $$0, bsz<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvv a(@Nullable bsz<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvv> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsz<?> j(cuo $$0) {
      cxd $$1 = $$0.a(km.M, cxd.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cpk i() {
      return this.k.i();
   }

   public Optional<btq> a(cmw $$0, btq $$1, bsz<? extends btq> $$2, are $$3, evq $$4, cuo $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         btq $$6;
         if ($$1 instanceof bsn) {
            $$6 = ((bsn)$$1).a($$3, (bsn)$$1);
         } else {
            $$6 = $$2.a((dbx)$$3);
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
               $$6.b($$5.a(km.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
