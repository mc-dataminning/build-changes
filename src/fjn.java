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

public interface fjn extends fjo {
   List<? extends fjo> aG_();

   default Optional<fjo> b_(double $$0, double $$1) {
      for (fjo $$2 : this.aG_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fjo $$3 : this.aG_()) {
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
      if ($$2 == 0 && this.aI_()) {
         this.b_(false);
         if (this.aJ_() != null) {
            return this.aJ_().b($$0, $$1, $$2);
         }
      }

      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aJ_() != null && this.aI_() && $$2 == 0 ? this.aJ_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aI_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aJ_() != null && this.aJ_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aJ_() != null && this.aJ_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aJ_() != null && this.aJ_().a($$0, $$1);
   }

   @Nullable
   fjo aJ_();

   void a(@Nullable fjo var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aK_() {
      return this.aJ_() != null;
   }

   @Nullable
   @Override
   default fhc aL_() {
      fjo $$0 = this.aJ_();
      return $$0 != null ? fhc.a(this, $$0.aL_()) : null;
   }

   @Nullable
   @Override
   default fhc a(flu $$0) {
      fjo $$1 = this.aJ_();
      if ($$1 != null) {
         fhc $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fhc.a(this, $$2);
         }
      }

      if ($$0 instanceof flu.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof flu.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fhc a(flu.c $$0) {
      boolean $$1 = $$0.b();
      fjo $$2 = this.aJ_();
      List<? extends fjo> $$3 = new ArrayList<>(this.aG_());
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

      ListIterator<? extends fjo> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fjo> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fjo $$11 = $$10.get();
         fhc $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fhc.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fhc a(flu.a $$0) {
      fjo $$1 = this.aJ_();
      if ($$1 == null) {
         flw $$2 = $$0.b();
         fly $$3 = this.H().c($$2.b());
         return fhc.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fly $$4 = $$1.H();
         return fhc.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fhc a(fly $$0, flw $$1, @Nullable fjo $$2, flu $$3) {
      flv $$4 = $$1.a();
      flv $$5 = $$4.a();
      flw $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fjo> $$8 = new ArrayList<>();

      for (fjo $$9 : this.aG_()) {
         if ($$9 != $$2) {
            fly $$10 = $$9.H();
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

      Comparator<fjo> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fjo> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fjo $$14 : $$8) {
         fhc $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fhc b(fly $$0, flw $$1, @Nullable fjo $$2, flu $$3) {
      flv $$4 = $$1.a();
      flv $$5 = $$4.a();
      List<Pair<fjo, Long>> $$6 = new ArrayList<>();
      flx $$7 = flx.a($$4, $$0.b($$1), $$0.b($$5));

      for (fjo $$8 : this.aG_()) {
         if ($$8 != $$2) {
            fly $$9 = $$8.H();
            flx $$10 = flx.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fjo, Long> $$12 : $$6) {
         fhc $$13 = ((fjo)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
