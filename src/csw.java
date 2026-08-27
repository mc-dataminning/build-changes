import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class csw extends crn {
   private static final Map<bqg<? extends bqv>, csw> a = Maps.newIdentityHashMap();
   private static final MapCodec<bqg<?>> b = kt.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bqg<?> k;

   public csw(bqg<? extends bqv> $$0, int $$1, int $$2, crn.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      if (!($$1 instanceof apu)) {
         return bof.a;
      } else {
         crs $$2 = $$0.n();
         id $$3 = $$0.a();
         ij $$4 = $$0.k();
         dpi $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof czy $$6) {
            bqg<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dub.c, $$3);
            $$2.g(1);
            return bof.b;
         } else {
            id $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bqg<?> $$10 = this.j($$2);
            if ($$10.a((apu)$$1, $$2, $$0.o(), $$8, bqx.m, true, !Objects.equals($$3, $$8) && $$4 == ij.b) != null) {
               $$2.g(1);
               $$1.a($$0.o(), dub.t, $$3);
            }

            return bof.b;
         }
      }
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      esf $$4 = a($$0, $$1, cyp.b.b);
      if ($$4.c() != esh.a.b) {
         return bog.c($$3);
      } else if (!($$0 instanceof apu)) {
         return bog.a($$3);
      } else {
         id $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dgw)) {
            return bog.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bqg<?> $$7 = this.j($$3);
            bqa $$8 = $$7.a((apu)$$0, $$3, $$1, $$6, bqx.m, false, false);
            if ($$8 == null) {
               return bog.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(auz.c.b(this));
               $$0.a($$1, dub.t, $$8.dk());
               return bog.b($$3);
            }
         } else {
            return bog.d($$3);
         }
      }
   }

   public boolean a(crs $$0, bqg<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static csw a(@Nullable bqg<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<csw> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bqg<?> j(crs $$0) {
      cuc $$1 = $$0.a(jr.D, cuc.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cmn m() {
      return this.k.m();
   }

   public Optional<bqv> a(cka $$0, bqv $$1, bqg<? extends bqv> $$2, apu $$3, esj $$4, crs $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bqv $$6;
         if ($$1 instanceof bpu) {
            $$6 = ((bpu)$$1).a($$3, (bpu)$$1);
         } else {
            $$6 = $$2.a((czg)$$3);
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
               $$6.b($$5.a(jr.d));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
