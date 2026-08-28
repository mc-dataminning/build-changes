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

public interface fjh extends fji {
   List<? extends fji> aF_();

   default Optional<fji> b_(double $$0, double $$1) {
      for (fji $$2 : this.aF_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fji $$3 : this.aF_()) {
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
      if ($$2 == 0 && this.aH_()) {
         this.b_(false);
         if (this.aI_() != null) {
            return this.aI_().b($$0, $$1, $$2);
         }
      }

      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aI_() != null && this.aH_() && $$2 == 0 ? this.aI_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aH_();

   void b_(boolean var1);

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
   fji aI_();

   void a(@Nullable fji var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.aI_() != null;
   }

   @Nullable
   @Override
   default fgw aK_() {
      fji $$0 = this.aI_();
      return $$0 != null ? fgw.a(this, $$0.aK_()) : null;
   }

   @Nullable
   @Override
   default fgw a(flo $$0) {
      fji $$1 = this.aI_();
      if ($$1 != null) {
         fgw $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fgw.a(this, $$2);
         }
      }

      if ($$0 instanceof flo.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof flo.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fgw a(flo.c $$0) {
      boolean $$1 = $$0.b();
      fji $$2 = this.aI_();
      List<? extends fji> $$3 = new ArrayList<>(this.aF_());
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

      ListIterator<? extends fji> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fji> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fji $$11 = $$10.get();
         fgw $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fgw.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fgw a(flo.a $$0) {
      fji $$1 = this.aI_();
      if ($$1 == null) {
         flq $$2 = $$0.b();
         fls $$3 = this.H().c($$2.b());
         return fgw.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fls $$4 = $$1.H();
         return fgw.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fgw a(fls $$0, flq $$1, @Nullable fji $$2, flo $$3) {
      flp $$4 = $$1.a();
      flp $$5 = $$4.a();
      flq $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fji> $$8 = new ArrayList<>();

      for (fji $$9 : this.aF_()) {
         if ($$9 != $$2) {
            fls $$10 = $$9.H();
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

      Comparator<fji> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fji> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fji $$14 : $$8) {
         fgw $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fgw b(fls $$0, flq $$1, @Nullable fji $$2, flo $$3) {
      flp $$4 = $$1.a();
      flp $$5 = $$4.a();
      List<Pair<fji, Long>> $$6 = new ArrayList<>();
      flr $$7 = flr.a($$4, $$0.b($$1), $$0.b($$5));

      for (fji $$8 : this.aF_()) {
         if ($$8 != $$2) {
            fls $$9 = $$8.H();
            flr $$10 = flr.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fji, Long> $$12 : $$6) {
         fgw $$13 = ((fji)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
