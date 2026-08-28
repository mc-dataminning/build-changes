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

public interface fkh extends fki {
   List<? extends fki> aK_();

   default Optional<fki> b_(double $$0, double $$1) {
      for (fki $$2 : this.aK_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fki $$3 : this.aK_()) {
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
      if ($$2 == 0 && this.aM_()) {
         this.b_(false);
         if (this.aN_() != null) {
            return this.aN_().b($$0, $$1, $$2);
         }
      }

      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aN_() != null && this.aM_() && $$2 == 0 ? this.aN_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aM_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aN_() != null && this.aN_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aN_() != null && this.aN_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aN_() != null && this.aN_().a($$0, $$1);
   }

   @Nullable
   fki aN_();

   void a(@Nullable fki var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aO_() {
      return this.aN_() != null;
   }

   @Nullable
   @Override
   default fhw aP_() {
      fki $$0 = this.aN_();
      return $$0 != null ? fhw.a(this, $$0.aP_()) : null;
   }

   @Nullable
   @Override
   default fhw a(fmo $$0) {
      fki $$1 = this.aN_();
      if ($$1 != null) {
         fhw $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fhw.a(this, $$2);
         }
      }

      if ($$0 instanceof fmo.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fmo.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fhw a(fmo.c $$0) {
      boolean $$1 = $$0.b();
      fki $$2 = this.aN_();
      List<? extends fki> $$3 = new ArrayList<>(this.aK_());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.I()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends fki> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fki> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fki $$11 = $$10.get();
         fhw $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fhw.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fhw a(fmo.a $$0) {
      fki $$1 = this.aN_();
      if ($$1 == null) {
         fmq $$2 = $$0.b();
         fms $$3 = this.H().c($$2.b());
         return fhw.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fms $$4 = $$1.H();
         return fhw.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fhw a(fms $$0, fmq $$1, @Nullable fki $$2, fmo $$3) {
      fmp $$4 = $$1.a();
      fmp $$5 = $$4.a();
      fmq $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fki> $$8 = new ArrayList<>();

      for (fki $$9 : this.aK_()) {
         if ($$9 != $$2) {
            fms $$10 = $$9.H();
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

      Comparator<fki> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fki> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fki $$14 : $$8) {
         fhw $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fhw b(fms $$0, fmq $$1, @Nullable fki $$2, fmo $$3) {
      fmp $$4 = $$1.a();
      fmp $$5 = $$4.a();
      List<Pair<fki, Long>> $$6 = new ArrayList<>();
      fmr $$7 = fmr.a($$4, $$0.b($$1), $$0.b($$5));

      for (fki $$8 : this.aK_()) {
         if ($$8 != $$2) {
            fms $$9 = $$8.H();
            fmr $$10 = fmr.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fki, Long> $$12 : $$6) {
         fhw $$13 = ((fki)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
