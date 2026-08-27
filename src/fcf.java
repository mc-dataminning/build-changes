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

public interface fcf extends fcg {
   List<? extends fcg> l();

   default Optional<fcg> b_(double $$0, double $$1) {
      for (fcg $$2 : this.l()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fcg $$3 : this.l()) {
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
      return this.aJ_() != null && this.aI_() && $$2 == 0 ? this.aJ_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aI_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aJ_() != null && this.aJ_().a($$0, $$1, $$2);
   }

   @Override
   default boolean b(int $$0, int $$1, int $$2) {
      return this.aJ_() != null && this.aJ_().b($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aJ_() != null && this.aJ_().a($$0, $$1);
   }

   @Nullable
   fcg aJ_();

   void a(@Nullable fcg var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aK_() {
      return this.aJ_() != null;
   }

   @Nullable
   @Override
   default ezu aL_() {
      fcg $$0 = this.aJ_();
      return $$0 != null ? ezu.a(this, $$0.aL_()) : null;
   }

   @Nullable
   @Override
   default ezu a(fel $$0) {
      fcg $$1 = this.aJ_();
      if ($$1 != null) {
         ezu $$2 = $$1.a($$0);
         if ($$2 != null) {
            return ezu.a(this, $$2);
         }
      }

      if ($$0 instanceof fel.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fel.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private ezu a(fel.c $$0) {
      boolean $$1 = $$0.b();
      fcg $$2 = this.aJ_();
      List<? extends fcg> $$3 = new ArrayList<>(this.l());
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

      ListIterator<? extends fcg> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fcg> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fcg $$11 = $$10.get();
         ezu $$12 = $$11.a($$0);
         if ($$12 != null) {
            return ezu.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private ezu a(fel.a $$0) {
      fcg $$1 = this.aJ_();
      if ($$1 == null) {
         fen $$2 = $$0.b();
         fep $$3 = this.F().c($$2.b());
         return ezu.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fep $$4 = $$1.F();
         return ezu.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private ezu a(fep $$0, fen $$1, @Nullable fcg $$2, fel $$3) {
      fem $$4 = $$1.a();
      fem $$5 = $$4.a();
      fen $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fcg> $$8 = new ArrayList<>();

      for (fcg $$9 : this.l()) {
         if ($$9 != $$2) {
            fep $$10 = $$9.F();
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

      Comparator<fcg> $$12 = Comparator.comparing($$1x -> $$1x.F().b($$1.b()), $$1.d());
      Comparator<fcg> $$13 = Comparator.comparing($$1x -> $$1x.F().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fcg $$14 : $$8) {
         ezu $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private ezu b(fep $$0, fen $$1, @Nullable fcg $$2, fel $$3) {
      fem $$4 = $$1.a();
      fem $$5 = $$4.a();
      List<Pair<fcg, Long>> $$6 = new ArrayList<>();
      feo $$7 = feo.a($$4, $$0.b($$1), $$0.b($$5));

      for (fcg $$8 : this.l()) {
         if ($$8 != $$2) {
            fep $$9 = $$8.F();
            feo $$10 = feo.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fcg, Long> $$12 : $$6) {
         ezu $$13 = ((fcg)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
