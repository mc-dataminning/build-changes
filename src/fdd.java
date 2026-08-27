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

public interface fdd extends fde {
   List<? extends fde> l();

   default Optional<fde> b_(double $$0, double $$1) {
      for (fde $$2 : this.l()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fde $$3 : this.l()) {
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
      return this.aI_() != null && this.aH_() && $$2 == 0 ? this.aI_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aH_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aI_() != null && this.aI_().a($$0, $$1, $$2);
   }

   @Override
   default boolean b(int $$0, int $$1, int $$2) {
      return this.aI_() != null && this.aI_().b($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aI_() != null && this.aI_().a($$0, $$1);
   }

   @Nullable
   fde aI_();

   void a(@Nullable fde var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.aI_() != null;
   }

   @Nullable
   @Override
   default fas aK_() {
      fde $$0 = this.aI_();
      return $$0 != null ? fas.a(this, $$0.aK_()) : null;
   }

   @Nullable
   @Override
   default fas a(ffk $$0) {
      fde $$1 = this.aI_();
      if ($$1 != null) {
         fas $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fas.a(this, $$2);
         }
      }

      if ($$0 instanceof ffk.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof ffk.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fas a(ffk.c $$0) {
      boolean $$1 = $$0.b();
      fde $$2 = this.aI_();
      List<? extends fde> $$3 = new ArrayList<>(this.l());
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

      ListIterator<? extends fde> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fde> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fde $$11 = $$10.get();
         fas $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fas.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fas a(ffk.a $$0) {
      fde $$1 = this.aI_();
      if ($$1 == null) {
         ffm $$2 = $$0.b();
         ffo $$3 = this.F().c($$2.b());
         return fas.a(this, this.a($$3, $$2, null, $$0));
      } else {
         ffo $$4 = $$1.F();
         return fas.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fas a(ffo $$0, ffm $$1, @Nullable fde $$2, ffk $$3) {
      ffl $$4 = $$1.a();
      ffl $$5 = $$4.a();
      ffm $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fde> $$8 = new ArrayList<>();

      for (fde $$9 : this.l()) {
         if ($$9 != $$2) {
            ffo $$10 = $$9.F();
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

      Comparator<fde> $$12 = Comparator.comparing($$1x -> $$1x.F().b($$1.b()), $$1.d());
      Comparator<fde> $$13 = Comparator.comparing($$1x -> $$1x.F().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fde $$14 : $$8) {
         fas $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fas b(ffo $$0, ffm $$1, @Nullable fde $$2, ffk $$3) {
      ffl $$4 = $$1.a();
      ffl $$5 = $$4.a();
      List<Pair<fde, Long>> $$6 = new ArrayList<>();
      ffn $$7 = ffn.a($$4, $$0.b($$1), $$0.b($$5));

      for (fde $$8 : this.l()) {
         if ($$8 != $$2) {
            ffo $$9 = $$8.F();
            ffn $$10 = ffn.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fde, Long> $$12 : $$6) {
         fas $$13 = ((fde)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
