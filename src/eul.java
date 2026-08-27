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

public interface eul extends eum {
   List<? extends eum> i();

   default Optional<eum> d(double $$0, double $$1) {
      for (eum $$2 : this.i()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (eum $$3 : this.i()) {
         if ($$3.a($$0, $$1, $$2)) {
            this.a($$3);
            if ($$2 == 0) {
               this.b(true);
            }

            return true;
         }
      }

      return false;
   }

   @Override
   default boolean b(double $$0, double $$1, int $$2) {
      this.b(false);
      return this.d($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.t() != null && this.aB_() && $$2 == 0 ? this.t().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aB_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.d($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.t() != null && this.t().a($$0, $$1, $$2);
   }

   @Override
   default boolean b(int $$0, int $$1, int $$2) {
      return this.t() != null && this.t().b($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.t() != null && this.t().a($$0, $$1);
   }

   @Nullable
   eum t();

   void a(@Nullable eum var1);

   @Override
   default void b_(boolean $$0) {
   }

   @Override
   default boolean aC_() {
      return this.t() != null;
   }

   @Nullable
   @Override
   default ese aF_() {
      eum $$0 = this.t();
      return $$0 != null ? ese.a(this, $$0.aF_()) : null;
   }

   default void b(@Nullable eum $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default ese a(ewq $$0) {
      eum $$1 = this.t();
      if ($$1 != null) {
         ese $$2 = $$1.a($$0);
         if ($$2 != null) {
            return ese.a(this, $$2);
         }
      }

      if ($$0 instanceof ewq.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof ewq.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private ese a(ewq.c $$0) {
      boolean $$1 = $$0.b();
      eum $$2 = this.t();
      List<? extends eum> $$3 = new ArrayList<>(this.i());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.u()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends eum> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends eum> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         eum $$11 = $$10.get();
         ese $$12 = $$11.a($$0);
         if ($$12 != null) {
            return ese.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private ese a(ewq.a $$0) {
      eum $$1 = this.t();
      if ($$1 == null) {
         ews $$2 = $$0.b();
         ewu $$3 = this.s().c($$2.b());
         return ese.a(this, this.a($$3, $$2, null, $$0));
      } else {
         ewu $$4 = $$1.s();
         return ese.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private ese a(ewu $$0, ews $$1, @Nullable eum $$2, ewq $$3) {
      ewr $$4 = $$1.a();
      ewr $$5 = $$4.a();
      ews $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<eum> $$8 = new ArrayList<>();

      for (eum $$9 : this.i()) {
         if ($$9 != $$2) {
            ewu $$10 = $$9.s();
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

      Comparator<eum> $$12 = Comparator.comparing($$1x -> $$1x.s().b($$1.b()), $$1.d());
      Comparator<eum> $$13 = Comparator.comparing($$1x -> $$1x.s().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (eum $$14 : $$8) {
         ese $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private ese b(ewu $$0, ews $$1, @Nullable eum $$2, ewq $$3) {
      ewr $$4 = $$1.a();
      ewr $$5 = $$4.a();
      List<Pair<eum, Long>> $$6 = new ArrayList<>();
      ewt $$7 = ewt.a($$4, $$0.b($$1), $$0.b($$5));

      for (eum $$8 : this.i()) {
         if ($$8 != $$2) {
            ewu $$9 = $$8.s();
            ewt $$10 = ewt.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<eum, Long> $$12 : $$6) {
         ese $$13 = ((eum)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
