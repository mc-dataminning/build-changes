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

public interface fjb extends fjc {
   List<? extends fjc> aD_();

   default Optional<fjc> b_(double $$0, double $$1) {
      for (fjc $$2 : this.aD_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fjc $$3 : this.aD_()) {
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
      return this.aG_() != null && this.aF_() && $$2 == 0 ? this.aG_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aF_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aG_() != null && this.aG_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aG_() != null && this.aG_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aG_() != null && this.aG_().a($$0, $$1);
   }

   @Nullable
   fjc aG_();

   void a(@Nullable fjc var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aH_() {
      return this.aG_() != null;
   }

   @Nullable
   @Override
   default fgq aI_() {
      fjc $$0 = this.aG_();
      return $$0 != null ? fgq.a(this, $$0.aI_()) : null;
   }

   @Nullable
   @Override
   default fgq a(fli $$0) {
      fjc $$1 = this.aG_();
      if ($$1 != null) {
         fgq $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fgq.a(this, $$2);
         }
      }

      if ($$0 instanceof fli.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fli.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fgq a(fli.c $$0) {
      boolean $$1 = $$0.b();
      fjc $$2 = this.aG_();
      List<? extends fjc> $$3 = new ArrayList<>(this.aD_());
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

      ListIterator<? extends fjc> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fjc> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fjc $$11 = $$10.get();
         fgq $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fgq.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fgq a(fli.a $$0) {
      fjc $$1 = this.aG_();
      if ($$1 == null) {
         flk $$2 = $$0.b();
         flm $$3 = this.G().c($$2.b());
         return fgq.a(this, this.a($$3, $$2, null, $$0));
      } else {
         flm $$4 = $$1.G();
         return fgq.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fgq a(flm $$0, flk $$1, @Nullable fjc $$2, fli $$3) {
      flj $$4 = $$1.a();
      flj $$5 = $$4.a();
      flk $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fjc> $$8 = new ArrayList<>();

      for (fjc $$9 : this.aD_()) {
         if ($$9 != $$2) {
            flm $$10 = $$9.G();
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

      Comparator<fjc> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<fjc> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fjc $$14 : $$8) {
         fgq $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fgq b(flm $$0, flk $$1, @Nullable fjc $$2, fli $$3) {
      flj $$4 = $$1.a();
      flj $$5 = $$4.a();
      List<Pair<fjc, Long>> $$6 = new ArrayList<>();
      fll $$7 = fll.a($$4, $$0.b($$1), $$0.b($$5));

      for (fjc $$8 : this.aD_()) {
         if ($$8 != $$2) {
            flm $$9 = $$8.G();
            fll $$10 = fll.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fjc, Long> $$12 : $$6) {
         fgq $$13 = ((fjc)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
