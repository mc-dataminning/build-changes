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

public interface fhu extends fhv {
   List<? extends fhv> aE_();

   default Optional<fhv> b_(double $$0, double $$1) {
      for (fhv $$2 : this.aE_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fhv $$3 : this.aE_()) {
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
      return this.aH_() != null && this.aG_() && $$2 == 0 ? this.aH_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aG_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
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
   fhv aH_();

   void a(@Nullable fhv var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aI_() {
      return this.aH_() != null;
   }

   @Nullable
   @Override
   default ffj aJ_() {
      fhv $$0 = this.aH_();
      return $$0 != null ? ffj.a(this, $$0.aJ_()) : null;
   }

   @Nullable
   @Override
   default ffj a(fkb $$0) {
      fhv $$1 = this.aH_();
      if ($$1 != null) {
         ffj $$2 = $$1.a($$0);
         if ($$2 != null) {
            return ffj.a(this, $$2);
         }
      }

      if ($$0 instanceof fkb.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fkb.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private ffj a(fkb.c $$0) {
      boolean $$1 = $$0.b();
      fhv $$2 = this.aH_();
      List<? extends fhv> $$3 = new ArrayList<>(this.aE_());
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

      ListIterator<? extends fhv> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fhv> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fhv $$11 = $$10.get();
         ffj $$12 = $$11.a($$0);
         if ($$12 != null) {
            return ffj.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private ffj a(fkb.a $$0) {
      fhv $$1 = this.aH_();
      if ($$1 == null) {
         fkd $$2 = $$0.b();
         fkf $$3 = this.G().c($$2.b());
         return ffj.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fkf $$4 = $$1.G();
         return ffj.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private ffj a(fkf $$0, fkd $$1, @Nullable fhv $$2, fkb $$3) {
      fkc $$4 = $$1.a();
      fkc $$5 = $$4.a();
      fkd $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fhv> $$8 = new ArrayList<>();

      for (fhv $$9 : this.aE_()) {
         if ($$9 != $$2) {
            fkf $$10 = $$9.G();
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

      Comparator<fhv> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<fhv> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fhv $$14 : $$8) {
         ffj $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private ffj b(fkf $$0, fkd $$1, @Nullable fhv $$2, fkb $$3) {
      fkc $$4 = $$1.a();
      fkc $$5 = $$4.a();
      List<Pair<fhv, Long>> $$6 = new ArrayList<>();
      fke $$7 = fke.a($$4, $$0.b($$1), $$0.b($$5));

      for (fhv $$8 : this.aE_()) {
         if ($$8 != $$2) {
            fkf $$9 = $$8.G();
            fke $$10 = fke.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fhv, Long> $$12 : $$6) {
         ffj $$13 = ((fhv)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
