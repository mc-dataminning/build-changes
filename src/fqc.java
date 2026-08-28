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

public interface fqc extends fqd {
   List<? extends fqd> aI_();

   default Optional<fqd> b_(double $$0, double $$1) {
      for (fqd $$2 : this.aI_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fqd $$3 : this.aI_()) {
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
   fqd aM_();

   void a(@Nullable fqd var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aN_() {
      return this.aM_() != null;
   }

   @Nullable
   @Override
   default fnp aO_() {
      fqd $$0 = this.aM_();
      return $$0 != null ? fnp.a(this, $$0.aO_()) : null;
   }

   @Nullable
   @Override
   default fnp a(fsj $$0) {
      fqd $$1 = this.aM_();
      if ($$1 != null) {
         fnp $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fnp.a(this, $$2);
         }
      }

      if ($$0 instanceof fsj.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fsj.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fnp a(fsj.c $$0) {
      boolean $$1 = $$0.b();
      fqd $$2 = this.aM_();
      List<? extends fqd> $$3 = new ArrayList<>(this.aI_());
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

      ListIterator<? extends fqd> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fqd> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fqd $$11 = $$10.get();
         fnp $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fnp.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fnp a(fsj.a $$0) {
      fqd $$1 = this.aM_();
      if ($$1 == null) {
         fsl $$2 = $$0.b();
         fsn $$3 = this.H().c($$2.b());
         return fnp.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fsn $$4 = $$1.H();
         return fnp.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fnp a(fsn $$0, fsl $$1, @Nullable fqd $$2, fsj $$3) {
      fsk $$4 = $$1.a();
      fsk $$5 = $$4.a();
      fsl $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fqd> $$8 = new ArrayList<>();

      for (fqd $$9 : this.aI_()) {
         if ($$9 != $$2) {
            fsn $$10 = $$9.H();
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

      Comparator<fqd> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fqd> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fqd $$14 : $$8) {
         fnp $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fnp b(fsn $$0, fsl $$1, @Nullable fqd $$2, fsj $$3) {
      fsk $$4 = $$1.a();
      fsk $$5 = $$4.a();
      List<Pair<fqd, Long>> $$6 = new ArrayList<>();
      fsm $$7 = fsm.a($$4, $$0.b($$1), $$0.b($$5));

      for (fqd $$8 : this.aI_()) {
         if ($$8 != $$2) {
            fsn $$9 = $$8.H();
            fsm $$10 = fsm.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fqd, Long> $$12 : $$6) {
         fnp $$13 = ((fqd)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
