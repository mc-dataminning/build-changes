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

public interface fmk extends fml {
   List<? extends fml> aJ_();

   default Optional<fml> b_(double $$0, double $$1) {
      for (fml $$2 : this.aJ_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fml $$3 : this.aJ_()) {
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
   fml aM_();

   void a(@Nullable fml var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aN_() {
      return this.aM_() != null;
   }

   @Nullable
   @Override
   default fjy aO_() {
      fml $$0 = this.aM_();
      return $$0 != null ? fjy.a(this, $$0.aO_()) : null;
   }

   @Nullable
   @Override
   default fjy a(fos $$0) {
      fml $$1 = this.aM_();
      if ($$1 != null) {
         fjy $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fjy.a(this, $$2);
         }
      }

      if ($$0 instanceof fos.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fos.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fjy a(fos.c $$0) {
      boolean $$1 = $$0.b();
      fml $$2 = this.aM_();
      List<? extends fml> $$3 = new ArrayList<>(this.aJ_());
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

      ListIterator<? extends fml> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fml> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fml $$11 = $$10.get();
         fjy $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fjy.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fjy a(fos.a $$0) {
      fml $$1 = this.aM_();
      if ($$1 == null) {
         fou $$2 = $$0.b();
         fow $$3 = this.H().c($$2.b());
         return fjy.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fow $$4 = $$1.H();
         return fjy.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fjy a(fow $$0, fou $$1, @Nullable fml $$2, fos $$3) {
      fot $$4 = $$1.a();
      fot $$5 = $$4.a();
      fou $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fml> $$8 = new ArrayList<>();

      for (fml $$9 : this.aJ_()) {
         if ($$9 != $$2) {
            fow $$10 = $$9.H();
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

      Comparator<fml> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fml> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fml $$14 : $$8) {
         fjy $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fjy b(fow $$0, fou $$1, @Nullable fml $$2, fos $$3) {
      fot $$4 = $$1.a();
      fot $$5 = $$4.a();
      List<Pair<fml, Long>> $$6 = new ArrayList<>();
      fov $$7 = fov.a($$4, $$0.b($$1), $$0.b($$5));

      for (fml $$8 : this.aJ_()) {
         if ($$8 != $$2) {
            fow $$9 = $$8.H();
            fov $$10 = fov.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fml, Long> $$12 : $$6) {
         fjy $$13 = ((fml)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
