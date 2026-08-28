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

public interface fkf extends fkg {
   List<? extends fkg> aK_();

   default Optional<fkg> b_(double $$0, double $$1) {
      for (fkg $$2 : this.aK_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fkg $$3 : this.aK_()) {
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
   fkg aN_();

   void a(@Nullable fkg var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aO_() {
      return this.aN_() != null;
   }

   @Nullable
   @Override
   default fhu aP_() {
      fkg $$0 = this.aN_();
      return $$0 != null ? fhu.a(this, $$0.aP_()) : null;
   }

   @Nullable
   @Override
   default fhu a(fmm $$0) {
      fkg $$1 = this.aN_();
      if ($$1 != null) {
         fhu $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fhu.a(this, $$2);
         }
      }

      if ($$0 instanceof fmm.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fmm.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fhu a(fmm.c $$0) {
      boolean $$1 = $$0.b();
      fkg $$2 = this.aN_();
      List<? extends fkg> $$3 = new ArrayList<>(this.aK_());
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

      ListIterator<? extends fkg> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fkg> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fkg $$11 = $$10.get();
         fhu $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fhu.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fhu a(fmm.a $$0) {
      fkg $$1 = this.aN_();
      if ($$1 == null) {
         fmo $$2 = $$0.b();
         fmq $$3 = this.H().c($$2.b());
         return fhu.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fmq $$4 = $$1.H();
         return fhu.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fhu a(fmq $$0, fmo $$1, @Nullable fkg $$2, fmm $$3) {
      fmn $$4 = $$1.a();
      fmn $$5 = $$4.a();
      fmo $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fkg> $$8 = new ArrayList<>();

      for (fkg $$9 : this.aK_()) {
         if ($$9 != $$2) {
            fmq $$10 = $$9.H();
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

      Comparator<fkg> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fkg> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fkg $$14 : $$8) {
         fhu $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fhu b(fmq $$0, fmo $$1, @Nullable fkg $$2, fmm $$3) {
      fmn $$4 = $$1.a();
      fmn $$5 = $$4.a();
      List<Pair<fkg, Long>> $$6 = new ArrayList<>();
      fmp $$7 = fmp.a($$4, $$0.b($$1), $$0.b($$5));

      for (fkg $$8 : this.aK_()) {
         if ($$8 != $$2) {
            fmq $$9 = $$8.H();
            fmp $$10 = fmp.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fkg, Long> $$12 : $$6) {
         fhu $$13 = ((fkg)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
