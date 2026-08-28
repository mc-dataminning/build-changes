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

public interface fmg extends fmh {
   List<? extends fmh> aI_();

   default Optional<fmh> b_(double $$0, double $$1) {
      for (fmh $$2 : this.aI_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fmh $$3 : this.aI_()) {
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
      if ($$2 == 0 && this.aK_()) {
         this.b_(false);
         if (this.aL_() != null) {
            return this.aL_().b($$0, $$1, $$2);
         }
      }

      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aL_() != null && this.aK_() && $$2 == 0 ? this.aL_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aK_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aL_() != null && this.aL_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aL_() != null && this.aL_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aL_() != null && this.aL_().a($$0, $$1);
   }

   @Nullable
   fmh aL_();

   void a(@Nullable fmh var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aM_() {
      return this.aL_() != null;
   }

   @Nullable
   @Override
   default fju aN_() {
      fmh $$0 = this.aL_();
      return $$0 != null ? fju.a(this, $$0.aN_()) : null;
   }

   @Nullable
   @Override
   default fju a(fon $$0) {
      fmh $$1 = this.aL_();
      if ($$1 != null) {
         fju $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fju.a(this, $$2);
         }
      }

      if ($$0 instanceof fon.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fon.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fju a(fon.c $$0) {
      boolean $$1 = $$0.b();
      fmh $$2 = this.aL_();
      List<? extends fmh> $$3 = new ArrayList<>(this.aI_());
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

      ListIterator<? extends fmh> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fmh> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fmh $$11 = $$10.get();
         fju $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fju.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fju a(fon.a $$0) {
      fmh $$1 = this.aL_();
      if ($$1 == null) {
         fop $$2 = $$0.b();
         fos $$3 = this.H().c($$2.b());
         return fju.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fos $$4 = $$1.H();
         return fju.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fju a(fos $$0, fop $$1, @Nullable fmh $$2, fon $$3) {
      foo $$4 = $$1.a();
      foo $$5 = $$4.a();
      fop $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fmh> $$8 = new ArrayList<>();

      for (fmh $$9 : this.aI_()) {
         if ($$9 != $$2) {
            fos $$10 = $$9.H();
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

      Comparator<fmh> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fmh> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fmh $$14 : $$8) {
         fju $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fju b(fos $$0, fop $$1, @Nullable fmh $$2, fon $$3) {
      foo $$4 = $$1.a();
      foo $$5 = $$4.a();
      List<Pair<fmh, Long>> $$6 = new ArrayList<>();
      foq $$7 = foq.a($$4, $$0.b($$1), $$0.b($$5));

      for (fmh $$8 : this.aI_()) {
         if ($$8 != $$2) {
            fos $$9 = $$8.H();
            foq $$10 = foq.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fmh, Long> $$12 : $$6) {
         fju $$13 = ((fmh)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
