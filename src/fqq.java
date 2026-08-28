import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector2i;

public interface fqq extends fqr {
   List<? extends fqr> aH_();

   default Optional<fqr> d(double $$0, double $$1) {
      for (fqr $$2 : this.aH_()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      Optional<fqr> $$3 = this.d($$0, $$1);
      if ($$3.isEmpty()) {
         return false;
      } else {
         fqr $$4 = $$3.get();
         if ($$4.a($$0, $$1, $$2)) {
            this.a($$4);
            if ($$2 == 0) {
               this.b_(true);
            }
         }

         return true;
      }
   }

   @Override
   default boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0 && this.aK_()) {
         this.b_(false);
         if (this.aL_() != null) {
            return this.aL_().b($$0, $$1, $$2);
         }
      }

      return this.d($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aL_() != null && this.aK_() && $$2 == 0 ? this.aL_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aK_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.d($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aL_() != null && this.aL_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aL_() != null && this.aL_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aL_() != null && this.aL_().a($$0, $$1);
   }

   @Nullable
   fqr aL_();

   void a(@Nullable fqr var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aM_() {
      return this.aL_() != null;
   }

   @Nullable
   @Override
   default foc aN_() {
      fqr $$0 = this.aL_();
      return $$0 != null ? foc.a(this, $$0.aN_()) : null;
   }

   @Nullable
   @Override
   default foc a(fsx $$0) {
      fqr $$1 = this.aL_();
      if ($$1 != null) {
         foc $$2 = $$1.a($$0);
         if ($$2 != null) {
            return foc.a(this, $$2);
         }
      }

      if ($$0 instanceof fsx.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fsx.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private foc a(fsx.c $$0) {
      boolean $$1 = $$0.b();
      fqr $$2 = this.aL_();
      List<? extends fqr> $$3 = new ArrayList<>(this.aH_());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.K()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends fqr> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fqr> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fqr $$11 = $$10.get();
         foc $$12 = $$11.a($$0);
         if ($$12 != null) {
            return foc.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private foc a(fsx.a $$0) {
      fqr $$1 = this.aL_();
      if ($$1 == null) {
         fsz $$2 = $$0.b();
         ftb $$3 = this.b($$2.b());
         return foc.a(this, this.a($$3, $$2, null, $$0));
      } else {
         ftb $$4 = $$1.J();
         return foc.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private foc a(ftb $$0, fsz $$1, @Nullable fqr $$2, fsx $$3) {
      fsy $$4 = $$1.a();
      fsy $$5 = $$4.a();
      fsz $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fqr> $$8 = new ArrayList<>();

      for (fqr $$9 : this.aH_()) {
         if ($$9 != $$2) {
            ftb $$10 = $$9.J();
            if ($$10.a($$0, $$5)) {
               int $$11 = $$10.b($$1.b());
               if ($$1.a($$11, $$7)) {
                  $$8.add($$9);
               } else if ($$11 == $$7 && $$1.a($$10.b($$1), $$0.b($$1))) {
                  $$8.add($$9);
               }
            }
         }
      }

      Comparator<fqr> $$12 = Comparator.comparing($$1x -> $$1x.J().b($$1.b()), $$1.d());
      Comparator<fqr> $$13 = Comparator.comparing($$1x -> $$1x.J().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fqr $$14 : $$8) {
         foc $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private foc b(ftb $$0, fsz $$1, @Nullable fqr $$2, fsx $$3) {
      fsy $$4 = $$1.a();
      fsy $$5 = $$4.a();
      List<Pair<fqr, Long>> $$6 = new ArrayList<>();
      fta $$7 = fta.a($$4, $$0.b($$1), $$0.b($$5));

      for (fqr $$8 : this.aH_()) {
         if ($$8 != $$2) {
            ftb $$9 = $$8.J();
            fta $$10 = fta.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fqr, Long> $$12 : $$6) {
         foc $$13 = ((fqr)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
