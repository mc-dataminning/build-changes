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

public interface fty extends ftz {
   List<? extends ftz> aD_();

   default Optional<ftz> d(double $$0, double $$1) {
      for (ftz $$2 : this.aD_()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      Optional<ftz> $$3 = this.d($$0, $$1);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ftz $$4 = $$3.get();
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
   ftz aH_();

   void a(@Nullable ftz var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aI_() {
      return this.aH_() != null;
   }

   @Nullable
   @Override
   default frl aJ_() {
      ftz $$0 = this.aH_();
      return $$0 != null ? frl.a(this, $$0.aJ_()) : null;
   }

   @Nullable
   @Override
   default frl a(fwf $$0) {
      ftz $$1 = this.aH_();
      if ($$1 != null) {
         frl $$2 = $$1.a($$0);
         if ($$2 != null) {
            return frl.a(this, $$2);
         }
      }

      if ($$0 instanceof fwf.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fwf.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private frl a(fwf.c $$0) {
      boolean $$1 = $$0.b();
      ftz $$2 = this.aH_();
      List<? extends ftz> $$3 = new ArrayList<>(this.aD_());
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

      ListIterator<? extends ftz> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends ftz> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         ftz $$11 = $$10.get();
         frl $$12 = $$11.a($$0);
         if ($$12 != null) {
            return frl.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private frl a(fwf.a $$0) {
      ftz $$1 = this.aH_();
      if ($$1 == null) {
         fwh $$2 = $$0.b();
         fwj $$3 = this.b($$2.b());
         return frl.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fwj $$4 = $$1.J();
         return frl.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private frl a(fwj $$0, fwh $$1, @Nullable ftz $$2, fwf $$3) {
      fwg $$4 = $$1.a();
      fwg $$5 = $$4.a();
      fwh $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<ftz> $$8 = new ArrayList<>();

      for (ftz $$9 : this.aD_()) {
         if ($$9 != $$2) {
            fwj $$10 = $$9.J();
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

      Comparator<ftz> $$12 = Comparator.comparing($$1x -> $$1x.J().b($$1.b()), $$1.d());
      Comparator<ftz> $$13 = Comparator.comparing($$1x -> $$1x.J().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (ftz $$14 : $$8) {
         frl $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private frl b(fwj $$0, fwh $$1, @Nullable ftz $$2, fwf $$3) {
      fwg $$4 = $$1.a();
      fwg $$5 = $$4.a();
      List<Pair<ftz, Long>> $$6 = new ArrayList<>();
      fwi $$7 = fwi.a($$4, $$0.b($$1), $$0.b($$5));

      for (ftz $$8 : this.aD_()) {
         if ($$8 != $$2) {
            fwj $$9 = $$8.J();
            fwi $$10 = fwi.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<ftz, Long> $$12 : $$6) {
         frl $$13 = ((ftz)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
