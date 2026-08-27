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

public interface etz extends eua {
   List<? extends eua> i();

   default Optional<eua> d(double $$0, double $$1) {
      for (eua $$2 : this.i()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (eua $$3 : this.i()) {
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
      return this.t() != null && this.aw_() && $$2 == 0 ? this.t().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aw_();

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
   eua t();

   void a(@Nullable eua var1);

   @Override
   default void c_(boolean $$0) {
   }

   @Override
   default boolean ax_() {
      return this.t() != null;
   }

   @Nullable
   @Override
   default ert aC_() {
      eua $$0 = this.t();
      return $$0 != null ? ert.a(this, $$0.aC_()) : null;
   }

   default void b(@Nullable eua $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default ert a(ewd $$0) {
      eua $$1 = this.t();
      if ($$1 != null) {
         ert $$2 = $$1.a($$0);
         if ($$2 != null) {
            return ert.a(this, $$2);
         }
      }

      if ($$0 instanceof ewd.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof ewd.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private ert a(ewd.c $$0) {
      boolean $$1 = $$0.b();
      eua $$2 = this.t();
      List<? extends eua> $$3 = new ArrayList<>(this.i());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.ay_()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends eua> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends eua> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         eua $$11 = $$10.get();
         ert $$12 = $$11.a($$0);
         if ($$12 != null) {
            return ert.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private ert a(ewd.a $$0) {
      eua $$1 = this.t();
      if ($$1 == null) {
         ewf $$2 = $$0.b();
         ewh $$3 = this.s().c($$2.b());
         return ert.a(this, this.a($$3, $$2, null, $$0));
      } else {
         ewh $$4 = $$1.s();
         return ert.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private ert a(ewh $$0, ewf $$1, @Nullable eua $$2, ewd $$3) {
      ewe $$4 = $$1.a();
      ewe $$5 = $$4.a();
      ewf $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<eua> $$8 = new ArrayList<>();

      for (eua $$9 : this.i()) {
         if ($$9 != $$2) {
            ewh $$10 = $$9.s();
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

      Comparator<eua> $$12 = Comparator.comparing($$1x -> $$1x.s().b($$1.b()), $$1.d());
      Comparator<eua> $$13 = Comparator.comparing($$1x -> $$1x.s().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (eua $$14 : $$8) {
         ert $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private ert b(ewh $$0, ewf $$1, @Nullable eua $$2, ewd $$3) {
      ewe $$4 = $$1.a();
      ewe $$5 = $$4.a();
      List<Pair<eua, Long>> $$6 = new ArrayList<>();
      ewg $$7 = ewg.a($$4, $$0.b($$1), $$0.b($$5));

      for (eua $$8 : this.i()) {
         if ($$8 != $$2) {
            ewh $$9 = $$8.s();
            ewg $$10 = ewg.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<eua, Long> $$12 : $$6) {
         ert $$13 = ((eua)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
