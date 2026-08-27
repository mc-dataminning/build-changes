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

public interface ffk extends ffl {
   List<? extends ffl> aF_();

   default Optional<ffl> b_(double $$0, double $$1) {
      for (ffl $$2 : this.aF_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (ffl $$3 : this.aF_()) {
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
   ffl aI_();

   void a(@Nullable ffl var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.aI_() != null;
   }

   @Nullable
   @Override
   default fcz aK_() {
      ffl $$0 = this.aI_();
      return $$0 != null ? fcz.a(this, $$0.aK_()) : null;
   }

   @Nullable
   @Override
   default fcz a(fhr $$0) {
      ffl $$1 = this.aI_();
      if ($$1 != null) {
         fcz $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fcz.a(this, $$2);
         }
      }

      if ($$0 instanceof fhr.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fhr.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fcz a(fhr.c $$0) {
      boolean $$1 = $$0.b();
      ffl $$2 = this.aI_();
      List<? extends ffl> $$3 = new ArrayList<>(this.aF_());
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

      ListIterator<? extends ffl> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends ffl> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         ffl $$11 = $$10.get();
         fcz $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fcz.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fcz a(fhr.a $$0) {
      ffl $$1 = this.aI_();
      if ($$1 == null) {
         fht $$2 = $$0.b();
         fhv $$3 = this.G().c($$2.b());
         return fcz.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fhv $$4 = $$1.G();
         return fcz.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fcz a(fhv $$0, fht $$1, @Nullable ffl $$2, fhr $$3) {
      fhs $$4 = $$1.a();
      fhs $$5 = $$4.a();
      fht $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<ffl> $$8 = new ArrayList<>();

      for (ffl $$9 : this.aF_()) {
         if ($$9 != $$2) {
            fhv $$10 = $$9.G();
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

      Comparator<ffl> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<ffl> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (ffl $$14 : $$8) {
         fcz $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fcz b(fhv $$0, fht $$1, @Nullable ffl $$2, fhr $$3) {
      fhs $$4 = $$1.a();
      fhs $$5 = $$4.a();
      List<Pair<ffl, Long>> $$6 = new ArrayList<>();
      fhu $$7 = fhu.a($$4, $$0.b($$1), $$0.b($$5));

      for (ffl $$8 : this.aF_()) {
         if ($$8 != $$2) {
            fhv $$9 = $$8.G();
            fhu $$10 = fhu.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<ffl, Long> $$12 : $$6) {
         fcz $$13 = ((ffl)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
