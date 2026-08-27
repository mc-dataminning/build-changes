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

public interface ewy extends ewz {
   List<? extends ewz> i();

   default Optional<ewz> d(double $$0, double $$1) {
      for (ewz $$2 : this.i()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (ewz $$3 : this.i()) {
         if ($$3.a($$0, $$1, $$2)) {
            this.a($$3);
            if ($$2 == 0) {
               this.b_(true);
            }

            return true;
         }
      }

      return false;
   }

   @Override
   default boolean b(double $$0, double $$1, int $$2) {
      this.b_(false);
      return this.d($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.t() != null && this.aJ_() && $$2 == 0 ? this.t().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aJ_();

   void b_(boolean var1);

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
   ewz t();

   void a(@Nullable ewz var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aK_() {
      return this.t() != null;
   }

   @Nullable
   @Override
   default euq aO_() {
      ewz $$0 = this.t();
      return $$0 != null ? euq.a(this, $$0.aO_()) : null;
   }

   default void b(@Nullable ewz $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default euq a(ezd $$0) {
      ewz $$1 = this.t();
      if ($$1 != null) {
         euq $$2 = $$1.a($$0);
         if ($$2 != null) {
            return euq.a(this, $$2);
         }
      }

      if ($$0 instanceof ezd.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof ezd.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private euq a(ezd.c $$0) {
      boolean $$1 = $$0.b();
      ewz $$2 = this.t();
      List<? extends ewz> $$3 = new ArrayList<>(this.i());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.aL_()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends ewz> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends ewz> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         ewz $$11 = $$10.get();
         euq $$12 = $$11.a($$0);
         if ($$12 != null) {
            return euq.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private euq a(ezd.a $$0) {
      ewz $$1 = this.t();
      if ($$1 == null) {
         ezf $$2 = $$0.b();
         ezh $$3 = this.s().c($$2.b());
         return euq.a(this, this.a($$3, $$2, null, $$0));
      } else {
         ezh $$4 = $$1.s();
         return euq.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private euq a(ezh $$0, ezf $$1, @Nullable ewz $$2, ezd $$3) {
      eze $$4 = $$1.a();
      eze $$5 = $$4.a();
      ezf $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<ewz> $$8 = new ArrayList<>();

      for (ewz $$9 : this.i()) {
         if ($$9 != $$2) {
            ezh $$10 = $$9.s();
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

      Comparator<ewz> $$12 = Comparator.comparing($$1x -> $$1x.s().b($$1.b()), $$1.d());
      Comparator<ewz> $$13 = Comparator.comparing($$1x -> $$1x.s().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (ewz $$14 : $$8) {
         euq $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private euq b(ezh $$0, ezf $$1, @Nullable ewz $$2, ezd $$3) {
      eze $$4 = $$1.a();
      eze $$5 = $$4.a();
      List<Pair<ewz, Long>> $$6 = new ArrayList<>();
      ezg $$7 = ezg.a($$4, $$0.b($$1), $$0.b($$5));

      for (ewz $$8 : this.i()) {
         if ($$8 != $$2) {
            ezh $$9 = $$8.s();
            ezg $$10 = ezg.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<ewz, Long> $$12 : $$6) {
         euq $$13 = ((ewz)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
