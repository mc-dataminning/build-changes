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

public interface fsj extends fsk {
   List<? extends fsk> aD_();

   default Optional<fsk> d(double $$0, double $$1) {
      for (fsk $$2 : this.aD_()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      Optional<fsk> $$3 = this.d($$0, $$1);
      if ($$3.isEmpty()) {
         return false;
      } else {
         fsk $$4 = $$3.get();
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
      if ($$2 == 0 && this.aG_()) {
         this.b_(false);
         if (this.aH_() != null) {
            return this.aH_().b($$0, $$1, $$2);
         }
      }

      return false;
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aH_() != null && this.aG_() && $$2 == 0 ? this.aH_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aG_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.d($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aH_() != null && this.aH_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aH_() != null && this.aH_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aH_() != null && this.aH_().a($$0, $$1);
   }

   @Nullable
   fsk aH_();

   void a(@Nullable fsk var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aI_() {
      return this.aH_() != null;
   }

   @Nullable
   @Override
   default fpw aJ_() {
      fsk $$0 = this.aH_();
      return $$0 != null ? fpw.a(this, $$0.aJ_()) : null;
   }

   @Nullable
   @Override
   default fpw a(fuq $$0) {
      fsk $$1 = this.aH_();
      if ($$1 != null) {
         fpw $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fpw.a(this, $$2);
         }
      }

      if ($$0 instanceof fuq.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fuq.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fpw a(fuq.c $$0) {
      boolean $$1 = $$0.b();
      fsk $$2 = this.aH_();
      List<? extends fsk> $$3 = new ArrayList<>(this.aD_());
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

      ListIterator<? extends fsk> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fsk> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fsk $$11 = $$10.get();
         fpw $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fpw.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fpw a(fuq.a $$0) {
      fsk $$1 = this.aH_();
      if ($$1 == null) {
         fus $$2 = $$0.b();
         fuu $$3 = this.b($$2.b());
         return fpw.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fuu $$4 = $$1.J();
         return fpw.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fpw a(fuu $$0, fus $$1, @Nullable fsk $$2, fuq $$3) {
      fur $$4 = $$1.a();
      fur $$5 = $$4.a();
      fus $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fsk> $$8 = new ArrayList<>();

      for (fsk $$9 : this.aD_()) {
         if ($$9 != $$2) {
            fuu $$10 = $$9.J();
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

      Comparator<fsk> $$12 = Comparator.comparing($$1x -> $$1x.J().b($$1.b()), $$1.d());
      Comparator<fsk> $$13 = Comparator.comparing($$1x -> $$1x.J().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fsk $$14 : $$8) {
         fpw $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fpw b(fuu $$0, fus $$1, @Nullable fsk $$2, fuq $$3) {
      fur $$4 = $$1.a();
      fur $$5 = $$4.a();
      List<Pair<fsk, Long>> $$6 = new ArrayList<>();
      fut $$7 = fut.a($$4, $$0.b($$1), $$0.b($$5));

      for (fsk $$8 : this.aD_()) {
         if ($$8 != $$2) {
            fuu $$9 = $$8.J();
            fut $$10 = fut.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fsk, Long> $$12 : $$6) {
         fpw $$13 = ((fsk)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
