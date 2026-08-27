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

public interface eue extends euf {
   List<? extends euf> i();

   default Optional<euf> d(double $$0, double $$1) {
      for (euf $$2 : this.i()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (euf $$3 : this.i()) {
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
      return this.t() != null && this.ax_() && $$2 == 0 ? this.t().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean ax_();

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
   euf t();

   void a(@Nullable euf var1);

   @Override
   default void b_(boolean $$0) {
   }

   @Override
   default boolean ay_() {
      return this.t() != null;
   }

   @Nullable
   @Override
   default erx aB_() {
      euf $$0 = this.t();
      return $$0 != null ? erx.a(this, $$0.aB_()) : null;
   }

   default void b(@Nullable euf $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default erx a(ewj $$0) {
      euf $$1 = this.t();
      if ($$1 != null) {
         erx $$2 = $$1.a($$0);
         if ($$2 != null) {
            return erx.a(this, $$2);
         }
      }

      if ($$0 instanceof ewj.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof ewj.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private erx a(ewj.c $$0) {
      boolean $$1 = $$0.b();
      euf $$2 = this.t();
      List<? extends euf> $$3 = new ArrayList<>(this.i());
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

      ListIterator<? extends euf> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends euf> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         euf $$11 = $$10.get();
         erx $$12 = $$11.a($$0);
         if ($$12 != null) {
            return erx.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private erx a(ewj.a $$0) {
      euf $$1 = this.t();
      if ($$1 == null) {
         ewl $$2 = $$0.b();
         ewn $$3 = this.s().c($$2.b());
         return erx.a(this, this.a($$3, $$2, null, $$0));
      } else {
         ewn $$4 = $$1.s();
         return erx.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private erx a(ewn $$0, ewl $$1, @Nullable euf $$2, ewj $$3) {
      ewk $$4 = $$1.a();
      ewk $$5 = $$4.a();
      ewl $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<euf> $$8 = new ArrayList<>();

      for (euf $$9 : this.i()) {
         if ($$9 != $$2) {
            ewn $$10 = $$9.s();
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

      Comparator<euf> $$12 = Comparator.comparing($$1x -> $$1x.s().b($$1.b()), $$1.d());
      Comparator<euf> $$13 = Comparator.comparing($$1x -> $$1x.s().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (euf $$14 : $$8) {
         erx $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private erx b(ewn $$0, ewl $$1, @Nullable euf $$2, ewj $$3) {
      ewk $$4 = $$1.a();
      ewk $$5 = $$4.a();
      List<Pair<euf, Long>> $$6 = new ArrayList<>();
      ewm $$7 = ewm.a($$4, $$0.b($$1), $$0.b($$5));

      for (euf $$8 : this.i()) {
         if ($$8 != $$2) {
            ewn $$9 = $$8.s();
            ewm $$10 = ewm.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<euf, Long> $$12 : $$6) {
         erx $$13 = ((euf)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
