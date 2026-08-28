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

public interface fmv extends fmw {
   List<? extends fmw> aJ_();

   default Optional<fmw> b_(double $$0, double $$1) {
      for (fmw $$2 : this.aJ_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fmw $$3 : this.aJ_()) {
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
   fmw aM_();

   void a(@Nullable fmw var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aN_() {
      return this.aM_() != null;
   }

   @Nullable
   @Override
   default fkj aO_() {
      fmw $$0 = this.aM_();
      return $$0 != null ? fkj.a(this, $$0.aO_()) : null;
   }

   @Nullable
   @Override
   default fkj a(fpd $$0) {
      fmw $$1 = this.aM_();
      if ($$1 != null) {
         fkj $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fkj.a(this, $$2);
         }
      }

      if ($$0 instanceof fpd.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fpd.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fkj a(fpd.c $$0) {
      boolean $$1 = $$0.b();
      fmw $$2 = this.aM_();
      List<? extends fmw> $$3 = new ArrayList<>(this.aJ_());
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

      ListIterator<? extends fmw> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fmw> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fmw $$11 = $$10.get();
         fkj $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fkj.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fkj a(fpd.a $$0) {
      fmw $$1 = this.aM_();
      if ($$1 == null) {
         fpf $$2 = $$0.b();
         fph $$3 = this.H().c($$2.b());
         return fkj.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fph $$4 = $$1.H();
         return fkj.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fkj a(fph $$0, fpf $$1, @Nullable fmw $$2, fpd $$3) {
      fpe $$4 = $$1.a();
      fpe $$5 = $$4.a();
      fpf $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fmw> $$8 = new ArrayList<>();

      for (fmw $$9 : this.aJ_()) {
         if ($$9 != $$2) {
            fph $$10 = $$9.H();
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

      Comparator<fmw> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fmw> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fmw $$14 : $$8) {
         fkj $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fkj b(fph $$0, fpf $$1, @Nullable fmw $$2, fpd $$3) {
      fpe $$4 = $$1.a();
      fpe $$5 = $$4.a();
      List<Pair<fmw, Long>> $$6 = new ArrayList<>();
      fpg $$7 = fpg.a($$4, $$0.b($$1), $$0.b($$5));

      for (fmw $$8 : this.aJ_()) {
         if ($$8 != $$2) {
            fph $$9 = $$8.H();
            fpg $$10 = fpg.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fmw, Long> $$12 : $$6) {
         fkj $$13 = ((fmw)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
