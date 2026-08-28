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

public interface fpv extends fpw {
   List<? extends fpw> aI_();

   default Optional<fpw> b_(double $$0, double $$1) {
      for (fpw $$2 : this.aI_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fpw $$3 : this.aI_()) {
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
      if ($$2 == 0 && this.aL_()) {
         this.b_(false);
         if (this.aM_() != null) {
            return this.aM_().b($$0, $$1, $$2);
         }
      }

      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aM_() != null && this.aL_() && $$2 == 0 ? this.aM_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aL_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aM_() != null && this.aM_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aM_() != null && this.aM_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aM_() != null && this.aM_().a($$0, $$1);
   }

   @Nullable
   fpw aM_();

   void a(@Nullable fpw var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aN_() {
      return this.aM_() != null;
   }

   @Nullable
   @Override
   default fni aO_() {
      fpw $$0 = this.aM_();
      return $$0 != null ? fni.a(this, $$0.aO_()) : null;
   }

   @Nullable
   @Override
   default fni a(fsc $$0) {
      fpw $$1 = this.aM_();
      if ($$1 != null) {
         fni $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fni.a(this, $$2);
         }
      }

      if ($$0 instanceof fsc.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fsc.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fni a(fsc.c $$0) {
      boolean $$1 = $$0.b();
      fpw $$2 = this.aM_();
      List<? extends fpw> $$3 = new ArrayList<>(this.aI_());
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

      ListIterator<? extends fpw> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fpw> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fpw $$11 = $$10.get();
         fni $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fni.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fni a(fsc.a $$0) {
      fpw $$1 = this.aM_();
      if ($$1 == null) {
         fse $$2 = $$0.b();
         fsg $$3 = this.H().c($$2.b());
         return fni.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fsg $$4 = $$1.H();
         return fni.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fni a(fsg $$0, fse $$1, @Nullable fpw $$2, fsc $$3) {
      fsd $$4 = $$1.a();
      fsd $$5 = $$4.a();
      fse $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fpw> $$8 = new ArrayList<>();

      for (fpw $$9 : this.aI_()) {
         if ($$9 != $$2) {
            fsg $$10 = $$9.H();
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

      Comparator<fpw> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fpw> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fpw $$14 : $$8) {
         fni $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fni b(fsg $$0, fse $$1, @Nullable fpw $$2, fsc $$3) {
      fsd $$4 = $$1.a();
      fsd $$5 = $$4.a();
      List<Pair<fpw, Long>> $$6 = new ArrayList<>();
      fsf $$7 = fsf.a($$4, $$0.b($$1), $$0.b($$5));

      for (fpw $$8 : this.aI_()) {
         if ($$8 != $$2) {
            fsg $$9 = $$8.H();
            fsf $$10 = fsf.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fpw, Long> $$12 : $$6) {
         fni $$13 = ((fpw)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
