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

public interface fbc extends fbd {
   List<? extends fbd> l();

   default Optional<fbd> b_(double $$0, double $$1) {
      for (fbd $$2 : this.l()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fbd $$3 : this.l()) {
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
      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aK_() != null && this.aJ_() && $$2 == 0 ? this.aK_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aJ_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aK_() != null && this.aK_().a($$0, $$1, $$2);
   }

   @Override
   default boolean b(int $$0, int $$1, int $$2) {
      return this.aK_() != null && this.aK_().b($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aK_() != null && this.aK_().a($$0, $$1);
   }

   @Nullable
   fbd aK_();

   void a(@Nullable fbd var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aL_() {
      return this.aK_() != null;
   }

   @Nullable
   @Override
   default eyr aM_() {
      fbd $$0 = this.aK_();
      return $$0 != null ? eyr.a(this, $$0.aM_()) : null;
   }

   default void b(@Nullable fbd $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default eyr a(fdi $$0) {
      fbd $$1 = this.aK_();
      if ($$1 != null) {
         eyr $$2 = $$1.a($$0);
         if ($$2 != null) {
            return eyr.a(this, $$2);
         }
      }

      if ($$0 instanceof fdi.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fdi.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private eyr a(fdi.c $$0) {
      boolean $$1 = $$0.b();
      fbd $$2 = this.aK_();
      List<? extends fbd> $$3 = new ArrayList<>(this.l());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.G()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends fbd> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fbd> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fbd $$11 = $$10.get();
         eyr $$12 = $$11.a($$0);
         if ($$12 != null) {
            return eyr.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private eyr a(fdi.a $$0) {
      fbd $$1 = this.aK_();
      if ($$1 == null) {
         fdk $$2 = $$0.b();
         fdm $$3 = this.F().c($$2.b());
         return eyr.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fdm $$4 = $$1.F();
         return eyr.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private eyr a(fdm $$0, fdk $$1, @Nullable fbd $$2, fdi $$3) {
      fdj $$4 = $$1.a();
      fdj $$5 = $$4.a();
      fdk $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fbd> $$8 = new ArrayList<>();

      for (fbd $$9 : this.l()) {
         if ($$9 != $$2) {
            fdm $$10 = $$9.F();
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

      Comparator<fbd> $$12 = Comparator.comparing($$1x -> $$1x.F().b($$1.b()), $$1.d());
      Comparator<fbd> $$13 = Comparator.comparing($$1x -> $$1x.F().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fbd $$14 : $$8) {
         eyr $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private eyr b(fdm $$0, fdk $$1, @Nullable fbd $$2, fdi $$3) {
      fdj $$4 = $$1.a();
      fdj $$5 = $$4.a();
      List<Pair<fbd, Long>> $$6 = new ArrayList<>();
      fdl $$7 = fdl.a($$4, $$0.b($$1), $$0.b($$5));

      for (fbd $$8 : this.l()) {
         if ($$8 != $$2) {
            fdm $$9 = $$8.F();
            fdl $$10 = fdl.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fbd, Long> $$12 : $$6) {
         eyr $$13 = ((fbd)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
