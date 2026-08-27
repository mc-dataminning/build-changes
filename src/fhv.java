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

public interface fhv extends fhw {
   List<? extends fhw> aF_();

   default Optional<fhw> b_(double $$0, double $$1) {
      for (fhw $$2 : this.aF_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fhw $$3 : this.aF_()) {
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
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aI_() != null && this.aI_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aI_() != null && this.aI_().a($$0, $$1);
   }

   @Nullable
   fhw aI_();

   void a(@Nullable fhw var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.aI_() != null;
   }

   @Nullable
   @Override
   default ffk aK_() {
      fhw $$0 = this.aI_();
      return $$0 != null ? ffk.a(this, $$0.aK_()) : null;
   }

   @Nullable
   @Override
   default ffk a(fkc $$0) {
      fhw $$1 = this.aI_();
      if ($$1 != null) {
         ffk $$2 = $$1.a($$0);
         if ($$2 != null) {
            return ffk.a(this, $$2);
         }
      }

      if ($$0 instanceof fkc.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fkc.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private ffk a(fkc.c $$0) {
      boolean $$1 = $$0.b();
      fhw $$2 = this.aI_();
      List<? extends fhw> $$3 = new ArrayList<>(this.aF_());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.H()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends fhw> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fhw> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fhw $$11 = $$10.get();
         ffk $$12 = $$11.a($$0);
         if ($$12 != null) {
            return ffk.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private ffk a(fkc.a $$0) {
      fhw $$1 = this.aI_();
      if ($$1 == null) {
         fke $$2 = $$0.b();
         fkg $$3 = this.G().c($$2.b());
         return ffk.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fkg $$4 = $$1.G();
         return ffk.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private ffk a(fkg $$0, fke $$1, @Nullable fhw $$2, fkc $$3) {
      fkd $$4 = $$1.a();
      fkd $$5 = $$4.a();
      fke $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fhw> $$8 = new ArrayList<>();

      for (fhw $$9 : this.aF_()) {
         if ($$9 != $$2) {
            fkg $$10 = $$9.G();
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

      Comparator<fhw> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<fhw> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fhw $$14 : $$8) {
         ffk $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private ffk b(fkg $$0, fke $$1, @Nullable fhw $$2, fkc $$3) {
      fkd $$4 = $$1.a();
      fkd $$5 = $$4.a();
      List<Pair<fhw, Long>> $$6 = new ArrayList<>();
      fkf $$7 = fkf.a($$4, $$0.b($$1), $$0.b($$5));

      for (fhw $$8 : this.aF_()) {
         if ($$8 != $$2) {
            fkg $$9 = $$8.G();
            fkf $$10 = fkf.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fhw, Long> $$12 : $$6) {
         ffk $$13 = ((fhw)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
