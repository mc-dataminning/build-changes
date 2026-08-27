import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvw extends cuc {
   private static final Map<bsb<? extends bsq>, cvw> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsb<?>> b = lh.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bsb<?> k;

   public cvw(bsb<? extends bsq> $$0, int $$1, int $$2, cuc.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      if (!($$1 instanceof aqt)) {
         return bqa.a;
      } else {
         cuh $$2 = $$0.n();
         ir $$3 = $$0.a();
         iw $$4 = $$0.k();
         dtc $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcs $$6) {
            bsb<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dxv.c, $$3);
            $$2.h(1);
            return bqa.b;
         } else {
            ir $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsb<?> $$10 = this.j($$2);
            if ($$10.a((aqt)$$1, $$2, $$0.o(), $$8, bss.m, true, !Objects.equals($$3, $$8) && $$4 == iw.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dxv.t, $$3);
            }

            return bqa.b;
         }
      }
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      ewq $$4 = a($$0, $$1, dbj.b.b);
      if ($$4.c() != ews.a.b) {
         return bqb.c($$3);
      } else if (!($$0 instanceof aqt)) {
         return bqb.a($$3);
      } else {
         ir $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djw)) {
            return bqb.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsb<?> $$7 = this.j($$3);
            brv $$8 = $$7.a((aqt)$$0, $$3, $$1, $$6, bss.m, false, false);
            if ($$8 == null) {
               return bqb.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avz.c.b(this));
               $$0.a($$1, dxv.t, $$8.ds());
               return bqb.b($$3);
            }
         } else {
            return bqb.d($$3);
         }
      }
   }

   public boolean a(cuh $$0, bsb<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvw a(@Nullable bsb<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvw> d() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsb<?> j(cuh $$0) {
      cxf $$1 = $$0.a(ke.K, cxf.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cop m() {
      return this.k.m();
   }

   public Optional<bsq> a(cly $$0, bsq $$1, bsb<? extends bsq> $$2, aqt $$3, ewu $$4, cuh $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bsq $$6;
         if ($$1 instanceof brp) {
            $$6 = ((brp)$$1).a($$3, (brp)$$1);
         } else {
            $$6 = $$2.a((dca)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.o_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.b($$5.a(ke.f));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
