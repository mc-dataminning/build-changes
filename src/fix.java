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

public interface fix extends fiy {
   List<? extends fiy> aE_();

   default Optional<fiy> b_(double $$0, double $$1) {
      for (fiy $$2 : this.aE_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fiy $$3 : this.aE_()) {
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
   fiy aH_();

   void a(@Nullable fiy var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aI_() {
      return this.aH_() != null;
   }

   @Nullable
   @Override
   default fgm aJ_() {
      fiy $$0 = this.aH_();
      return $$0 != null ? fgm.a(this, $$0.aJ_()) : null;
   }

   @Nullable
   @Override
   default fgm a(fle $$0) {
      fiy $$1 = this.aH_();
      if ($$1 != null) {
         fgm $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fgm.a(this, $$2);
         }
      }

      if ($$0 instanceof fle.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fle.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fgm a(fle.c $$0) {
      boolean $$1 = $$0.b();
      fiy $$2 = this.aH_();
      List<? extends fiy> $$3 = new ArrayList<>(this.aE_());
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

      ListIterator<? extends fiy> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fiy> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fiy $$11 = $$10.get();
         fgm $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fgm.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fgm a(fle.a $$0) {
      fiy $$1 = this.aH_();
      if ($$1 == null) {
         flg $$2 = $$0.b();
         fli $$3 = this.G().c($$2.b());
         return fgm.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fli $$4 = $$1.G();
         return fgm.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fgm a(fli $$0, flg $$1, @Nullable fiy $$2, fle $$3) {
      flf $$4 = $$1.a();
      flf $$5 = $$4.a();
      flg $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fiy> $$8 = new ArrayList<>();

      for (fiy $$9 : this.aE_()) {
         if ($$9 != $$2) {
            fli $$10 = $$9.G();
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

      Comparator<fiy> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<fiy> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fiy $$14 : $$8) {
         fgm $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fgm b(fli $$0, flg $$1, @Nullable fiy $$2, fle $$3) {
      flf $$4 = $$1.a();
      flf $$5 = $$4.a();
      List<Pair<fiy, Long>> $$6 = new ArrayList<>();
      flh $$7 = flh.a($$4, $$0.b($$1), $$0.b($$5));

      for (fiy $$8 : this.aE_()) {
         if ($$8 != $$2) {
            fli $$9 = $$8.G();
            flh $$10 = flh.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fiy, Long> $$12 : $$6) {
         fgm $$13 = ((fiy)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
