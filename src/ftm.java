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

public interface ftm extends ftn {
   List<? extends ftn> aD_();

   default Optional<ftn> d(double $$0, double $$1) {
      for (ftn $$2 : this.aD_()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      Optional<ftn> $$3 = this.d($$0, $$1);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ftn $$4 = $$3.get();
         if ($$4.a($$0, $$1, $$2)) {
            this.a($$4);
            if ($$2 == 0) {
               this.b_(true);
            }
         }

         return true;
      }
   }

   @Override
   default boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0 && this.aG_()) {
         this.b_(false);
         if (this.aH_() != null) {
            return this.aH_().b($$0, $$1, $$2);
         }
      }

      return false;
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aH_() != null && this.aG_() && $$2 == 0 ? this.aH_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aG_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.d($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
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
   ftn aH_();

   void a(@Nullable ftn var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aI_() {
      return this.aH_() != null;
   }

   @Nullable
   @Override
   default fqz aJ_() {
      ftn $$0 = this.aH_();
      return $$0 != null ? fqz.a(this, $$0.aJ_()) : null;
   }

   @Nullable
   @Override
   default fqz a(fvt $$0) {
      ftn $$1 = this.aH_();
      if ($$1 != null) {
         fqz $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fqz.a(this, $$2);
         }
      }

      if ($$0 instanceof fvt.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fvt.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fqz a(fvt.c $$0) {
      boolean $$1 = $$0.b();
      ftn $$2 = this.aH_();
      List<? extends ftn> $$3 = new ArrayList<>(this.aD_());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.K()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends ftn> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends ftn> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         ftn $$11 = $$10.get();
         fqz $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fqz.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fqz a(fvt.a $$0) {
      ftn $$1 = this.aH_();
      if ($$1 == null) {
         fvv $$2 = $$0.b();
         fvx $$3 = this.b($$2.b());
         return fqz.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fvx $$4 = $$1.J();
         return fqz.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fqz a(fvx $$0, fvv $$1, @Nullable ftn $$2, fvt $$3) {
      fvu $$4 = $$1.a();
      fvu $$5 = $$4.a();
      fvv $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<ftn> $$8 = new ArrayList<>();

      for (ftn $$9 : this.aD_()) {
         if ($$9 != $$2) {
            fvx $$10 = $$9.J();
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

      Comparator<ftn> $$12 = Comparator.comparing($$1x -> $$1x.J().b($$1.b()), $$1.d());
      Comparator<ftn> $$13 = Comparator.comparing($$1x -> $$1x.J().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (ftn $$14 : $$8) {
         fqz $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fqz b(fvx $$0, fvv $$1, @Nullable ftn $$2, fvt $$3) {
      fvu $$4 = $$1.a();
      fvu $$5 = $$4.a();
      List<Pair<ftn, Long>> $$6 = new ArrayList<>();
      fvw $$7 = fvw.a($$4, $$0.b($$1), $$0.b($$5));

      for (ftn $$8 : this.aD_()) {
         if ($$8 != $$2) {
            fvx $$9 = $$8.J();
            fvw $$10 = fvw.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<ftn, Long> $$12 : $$6) {
         fqz $$13 = ((ftn)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
