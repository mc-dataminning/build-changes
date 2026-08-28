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

public interface fqa extends fqb {
   List<? extends fqb> aI_();

   default Optional<fqb> b_(double $$0, double $$1) {
      for (fqb $$2 : this.aI_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fqb $$3 : this.aI_()) {
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
   fqb aM_();

   void a(@Nullable fqb var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aN_() {
      return this.aM_() != null;
   }

   @Nullable
   @Override
   default fnn aO_() {
      fqb $$0 = this.aM_();
      return $$0 != null ? fnn.a(this, $$0.aO_()) : null;
   }

   @Nullable
   @Override
   default fnn a(fsh $$0) {
      fqb $$1 = this.aM_();
      if ($$1 != null) {
         fnn $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fnn.a(this, $$2);
         }
      }

      if ($$0 instanceof fsh.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fsh.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fnn a(fsh.c $$0) {
      boolean $$1 = $$0.b();
      fqb $$2 = this.aM_();
      List<? extends fqb> $$3 = new ArrayList<>(this.aI_());
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

      ListIterator<? extends fqb> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fqb> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fqb $$11 = $$10.get();
         fnn $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fnn.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fnn a(fsh.a $$0) {
      fqb $$1 = this.aM_();
      if ($$1 == null) {
         fsj $$2 = $$0.b();
         fsl $$3 = this.H().c($$2.b());
         return fnn.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fsl $$4 = $$1.H();
         return fnn.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fnn a(fsl $$0, fsj $$1, @Nullable fqb $$2, fsh $$3) {
      fsi $$4 = $$1.a();
      fsi $$5 = $$4.a();
      fsj $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fqb> $$8 = new ArrayList<>();

      for (fqb $$9 : this.aI_()) {
         if ($$9 != $$2) {
            fsl $$10 = $$9.H();
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

      Comparator<fqb> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fqb> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fqb $$14 : $$8) {
         fnn $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fnn b(fsl $$0, fsj $$1, @Nullable fqb $$2, fsh $$3) {
      fsi $$4 = $$1.a();
      fsi $$5 = $$4.a();
      List<Pair<fqb, Long>> $$6 = new ArrayList<>();
      fsk $$7 = fsk.a($$4, $$0.b($$1), $$0.b($$5));

      for (fqb $$8 : this.aI_()) {
         if ($$8 != $$2) {
            fsl $$9 = $$8.H();
            fsk $$10 = fsk.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fqb, Long> $$12 : $$6) {
         fnn $$13 = ((fqb)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
