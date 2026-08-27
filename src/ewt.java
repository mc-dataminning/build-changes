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

public interface ewt extends ewu {
   List<? extends ewu> i();

   default Optional<ewu> d(double $$0, double $$1) {
      for (ewu $$2 : this.i()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (ewu $$3 : this.i()) {
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
      return this.t() != null && this.aI_() && $$2 == 0 ? this.t().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aI_();

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
   ewu t();

   void a(@Nullable ewu var1);

   @Override
   default void b_(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.t() != null;
   }

   @Nullable
   @Override
   default eul aN_() {
      ewu $$0 = this.t();
      return $$0 != null ? eul.a(this, $$0.aN_()) : null;
   }

   default void b(@Nullable ewu $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default eul a(eyy $$0) {
      ewu $$1 = this.t();
      if ($$1 != null) {
         eul $$2 = $$1.a($$0);
         if ($$2 != null) {
            return eul.a(this, $$2);
         }
      }

      if ($$0 instanceof eyy.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof eyy.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private eul a(eyy.c $$0) {
      boolean $$1 = $$0.b();
      ewu $$2 = this.t();
      List<? extends ewu> $$3 = new ArrayList<>(this.i());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.aK_()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends ewu> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends ewu> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         ewu $$11 = $$10.get();
         eul $$12 = $$11.a($$0);
         if ($$12 != null) {
            return eul.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private eul a(eyy.a $$0) {
      ewu $$1 = this.t();
      if ($$1 == null) {
         eza $$2 = $$0.b();
         ezc $$3 = this.s().c($$2.b());
         return eul.a(this, this.a($$3, $$2, null, $$0));
      } else {
         ezc $$4 = $$1.s();
         return eul.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private eul a(ezc $$0, eza $$1, @Nullable ewu $$2, eyy $$3) {
      eyz $$4 = $$1.a();
      eyz $$5 = $$4.a();
      eza $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<ewu> $$8 = new ArrayList<>();

      for (ewu $$9 : this.i()) {
         if ($$9 != $$2) {
            ezc $$10 = $$9.s();
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

      Comparator<ewu> $$12 = Comparator.comparing($$1x -> $$1x.s().b($$1.b()), $$1.d());
      Comparator<ewu> $$13 = Comparator.comparing($$1x -> $$1x.s().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (ewu $$14 : $$8) {
         eul $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private eul b(ezc $$0, eza $$1, @Nullable ewu $$2, eyy $$3) {
      eyz $$4 = $$1.a();
      eyz $$5 = $$4.a();
      List<Pair<ewu, Long>> $$6 = new ArrayList<>();
      ezb $$7 = ezb.a($$4, $$0.b($$1), $$0.b($$5));

      for (ewu $$8 : this.i()) {
         if ($$8 != $$2) {
            ezc $$9 = $$8.s();
            ezb $$10 = ezb.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<ewu, Long> $$12 : $$6) {
         eul $$13 = ((ewu)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
