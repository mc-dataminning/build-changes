import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvw extends cuk {
   private static final Map<bta<? extends btr>, cvw> a = Maps.newIdentityHashMap();
   private static final MapCodec<bta<?>> b = lp.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bta<?> k;

   public cvw(bta<? extends btr> $$0, int $$1, int $$2, cuk.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      if (!($$1 instanceof arf)) {
         return bqu.a;
      } else {
         cup $$2 = $$0.n();
         iz $$3 = $$0.a();
         je $$4 = $$0.k();
         dsc $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcq $$6) {
            bta<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dwv.c, $$3);
            $$2.h(1);
            return bqu.c;
         } else {
            iz $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bta<?> $$10 = this.j($$2);
            if ($$10.a((arf)$$1, $$2, $$0.o(), $$8, btt.m, true, !Objects.equals($$3, $$8) && $$4 == je.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dwv.t, $$3);
            }

            return bqu.c;
         }
      }
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      evn $$4 = a($$0, $$1, dbh.b.b);
      if ($$4.c() != evp.a.b) {
         return bqv.c($$3);
      } else if (!($$0 instanceof arf)) {
         return bqv.a($$3);
      } else {
         iz $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djp)) {
            return bqv.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bta<?> $$7 = this.j($$3);
            bsu $$8 = $$7.a((arf)$$0, $$3, $$1, $$6, btt.m, false, false);
            if ($$8 == null) {
               return bqv.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$0.a($$1, dwv.t, $$8.dn());
               return bqv.b($$3);
            }
         } else {
            return bqv.d($$3);
         }
      }
   }

   public boolean a(cup $$0, bta<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvw a(@Nullable bta<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvw> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bta<?> j(cup $$0) {
      cxe $$1 = $$0.a(km.M, cxe.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cpl i() {
      return this.k.i();
   }

   public Optional<btr> a(cmx $$0, btr $$1, bta<? extends btr> $$2, arf $$3, evr $$4, cup $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         btr $$6;
         if ($$1 instanceof bso) {
            $$6 = ((bso)$$1).a($$3, (bso)$$1);
         } else {
            $$6 = $$2.a((dby)$$3);
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
