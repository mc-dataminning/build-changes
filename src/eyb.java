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

public interface eyb extends eyc {
   List<? extends eyc> i();

   default Optional<eyc> d(double $$0, double $$1) {
      for (eyc $$2 : this.i()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (eyc $$3 : this.i()) {
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
      return this.t() != null && this.aI_() && $$2 == 0 ? this.t().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aI_();

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
   eyc t();

   void a(@Nullable eyc var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.t() != null;
   }

   @Nullable
   @Override
   default evt aN_() {
      eyc $$0 = this.t();
      return $$0 != null ? evt.a(this, $$0.aN_()) : null;
   }

   default void b(@Nullable eyc $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default evt a(fag $$0) {
      eyc $$1 = this.t();
      if ($$1 != null) {
         evt $$2 = $$1.a($$0);
         if ($$2 != null) {
            return evt.a(this, $$2);
         }
      }

      if ($$0 instanceof fag.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fag.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private evt a(fag.c $$0) {
      boolean $$1 = $$0.b();
      eyc $$2 = this.t();
      List<? extends eyc> $$3 = new ArrayList<>(this.i());
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

      ListIterator<? extends eyc> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends eyc> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         eyc $$11 = $$10.get();
         evt $$12 = $$11.a($$0);
         if ($$12 != null) {
            return evt.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private evt a(fag.a $$0) {
      eyc $$1 = this.t();
      if ($$1 == null) {
         fai $$2 = $$0.b();
         fak $$3 = this.s().c($$2.b());
         return evt.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fak $$4 = $$1.s();
         return evt.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private evt a(fak $$0, fai $$1, @Nullable eyc $$2, fag $$3) {
      fah $$4 = $$1.a();
      fah $$5 = $$4.a();
      fai $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<eyc> $$8 = new ArrayList<>();

      for (eyc $$9 : this.i()) {
         if ($$9 != $$2) {
            fak $$10 = $$9.s();
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

      Comparator<eyc> $$12 = Comparator.comparing($$1x -> $$1x.s().b($$1.b()), $$1.d());
      Comparator<eyc> $$13 = Comparator.comparing($$1x -> $$1x.s().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (eyc $$14 : $$8) {
         evt $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private evt b(fak $$0, fai $$1, @Nullable eyc $$2, fag $$3) {
      fah $$4 = $$1.a();
      fah $$5 = $$4.a();
      List<Pair<eyc, Long>> $$6 = new ArrayList<>();
      faj $$7 = faj.a($$4, $$0.b($$1), $$0.b($$5));

      for (eyc $$8 : this.i()) {
         if ($$8 != $$2) {
            fak $$9 = $$8.s();
            faj $$10 = faj.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<eyc, Long> $$12 : $$6) {
         evt $$13 = ((eyc)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
