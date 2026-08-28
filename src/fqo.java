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

public interface fqo extends fqp {
   List<? extends fqp> aH_();

   default Optional<fqp> d(double $$0, double $$1) {
      for (fqp $$2 : this.aH_()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      Optional<fqp> $$3 = this.d($$0, $$1);
      if ($$3.isEmpty()) {
         return false;
      } else {
         fqp $$4 = $$3.get();
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
   fqp aL_();

   void a(@Nullable fqp var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aM_() {
      return this.aL_() != null;
   }

   @Nullable
   @Override
   default foa aN_() {
      fqp $$0 = this.aL_();
      return $$0 != null ? foa.a(this, $$0.aN_()) : null;
   }

   @Nullable
   @Override
   default foa a(fsv $$0) {
      fqp $$1 = this.aL_();
      if ($$1 != null) {
         foa $$2 = $$1.a($$0);
         if ($$2 != null) {
            return foa.a(this, $$2);
         }
      }

      if ($$0 instanceof fsv.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fsv.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private foa a(fsv.c $$0) {
      boolean $$1 = $$0.b();
      fqp $$2 = this.aL_();
      List<? extends fqp> $$3 = new ArrayList<>(this.aH_());
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

      ListIterator<? extends fqp> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fqp> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fqp $$11 = $$10.get();
         foa $$12 = $$11.a($$0);
         if ($$12 != null) {
            return foa.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private foa a(fsv.a $$0) {
      fqp $$1 = this.aL_();
      if ($$1 == null) {
         fsx $$2 = $$0.b();
         fsz $$3 = this.b($$2.b());
         return foa.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fsz $$4 = $$1.J();
         return foa.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private foa a(fsz $$0, fsx $$1, @Nullable fqp $$2, fsv $$3) {
      fsw $$4 = $$1.a();
      fsw $$5 = $$4.a();
      fsx $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fqp> $$8 = new ArrayList<>();

      for (fqp $$9 : this.aH_()) {
         if ($$9 != $$2) {
            fsz $$10 = $$9.J();
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

      Comparator<fqp> $$12 = Comparator.comparing($$1x -> $$1x.J().b($$1.b()), $$1.d());
      Comparator<fqp> $$13 = Comparator.comparing($$1x -> $$1x.J().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fqp $$14 : $$8) {
         foa $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private foa b(fsz $$0, fsx $$1, @Nullable fqp $$2, fsv $$3) {
      fsw $$4 = $$1.a();
      fsw $$5 = $$4.a();
      List<Pair<fqp, Long>> $$6 = new ArrayList<>();
      fsy $$7 = fsy.a($$4, $$0.b($$1), $$0.b($$5));

      for (fqp $$8 : this.aH_()) {
         if ($$8 != $$2) {
            fsz $$9 = $$8.J();
            fsy $$10 = fsy.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fqp, Long> $$12 : $$6) {
         foa $$13 = ((fqp)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
