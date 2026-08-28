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

public interface fiu extends fiv {
   List<? extends fiv> aF_();

   default Optional<fiv> b_(double $$0, double $$1) {
      for (fiv $$2 : this.aF_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fiv $$3 : this.aF_()) {
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
      return this.aI_() != null && this.aH_() && $$2 == 0 ? this.aI_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aH_();

   void b(boolean var1);

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
   fiv aI_();

   void a(@Nullable fiv var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.aI_() != null;
   }

   @Nullable
   @Override
   default fgj aK_() {
      fiv $$0 = this.aI_();
      return $$0 != null ? fgj.a(this, $$0.aK_()) : null;
   }

   @Nullable
   @Override
   default fgj a(flb $$0) {
      fiv $$1 = this.aI_();
      if ($$1 != null) {
         fgj $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fgj.a(this, $$2);
         }
      }

      if ($$0 instanceof flb.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof flb.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fgj a(flb.c $$0) {
      boolean $$1 = $$0.b();
      fiv $$2 = this.aI_();
      List<? extends fiv> $$3 = new ArrayList<>(this.aF_());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.H()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends fiv> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fiv> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fiv $$11 = $$10.get();
         fgj $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fgj.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fgj a(flb.a $$0) {
      fiv $$1 = this.aI_();
      if ($$1 == null) {
         fld $$2 = $$0.b();
         flf $$3 = this.G().c($$2.b());
         return fgj.a(this, this.a($$3, $$2, null, $$0));
      } else {
         flf $$4 = $$1.G();
         return fgj.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fgj a(flf $$0, fld $$1, @Nullable fiv $$2, flb $$3) {
      flc $$4 = $$1.a();
      flc $$5 = $$4.a();
      fld $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fiv> $$8 = new ArrayList<>();

      for (fiv $$9 : this.aF_()) {
         if ($$9 != $$2) {
            flf $$10 = $$9.G();
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

      Comparator<fiv> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<fiv> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fiv $$14 : $$8) {
         fgj $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fgj b(flf $$0, fld $$1, @Nullable fiv $$2, flb $$3) {
      flc $$4 = $$1.a();
      flc $$5 = $$4.a();
      List<Pair<fiv, Long>> $$6 = new ArrayList<>();
      fle $$7 = fle.a($$4, $$0.b($$1), $$0.b($$5));

      for (fiv $$8 : this.aF_()) {
         if ($$8 != $$2) {
            flf $$9 = $$8.G();
            fle $$10 = fle.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fiv, Long> $$12 : $$6) {
         fgj $$13 = ((fiv)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
