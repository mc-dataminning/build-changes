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

public interface fja extends fjb {
   List<? extends fjb> aD_();

   default Optional<fjb> b_(double $$0, double $$1) {
      for (fjb $$2 : this.aD_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fjb $$3 : this.aD_()) {
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
   fjb aG_();

   void a(@Nullable fjb var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aH_() {
      return this.aG_() != null;
   }

   @Nullable
   @Override
   default fgp aI_() {
      fjb $$0 = this.aG_();
      return $$0 != null ? fgp.a(this, $$0.aI_()) : null;
   }

   @Nullable
   @Override
   default fgp a(flh $$0) {
      fjb $$1 = this.aG_();
      if ($$1 != null) {
         fgp $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fgp.a(this, $$2);
         }
      }

      if ($$0 instanceof flh.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof flh.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fgp a(flh.c $$0) {
      boolean $$1 = $$0.b();
      fjb $$2 = this.aG_();
      List<? extends fjb> $$3 = new ArrayList<>(this.aD_());
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

      ListIterator<? extends fjb> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fjb> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fjb $$11 = $$10.get();
         fgp $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fgp.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fgp a(flh.a $$0) {
      fjb $$1 = this.aG_();
      if ($$1 == null) {
         flj $$2 = $$0.b();
         fll $$3 = this.G().c($$2.b());
         return fgp.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fll $$4 = $$1.G();
         return fgp.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fgp a(fll $$0, flj $$1, @Nullable fjb $$2, flh $$3) {
      fli $$4 = $$1.a();
      fli $$5 = $$4.a();
      flj $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fjb> $$8 = new ArrayList<>();

      for (fjb $$9 : this.aD_()) {
         if ($$9 != $$2) {
            fll $$10 = $$9.G();
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

      Comparator<fjb> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<fjb> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fjb $$14 : $$8) {
         fgp $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fgp b(fll $$0, flj $$1, @Nullable fjb $$2, flh $$3) {
      fli $$4 = $$1.a();
      fli $$5 = $$4.a();
      List<Pair<fjb, Long>> $$6 = new ArrayList<>();
      flk $$7 = flk.a($$4, $$0.b($$1), $$0.b($$5));

      for (fjb $$8 : this.aD_()) {
         if ($$8 != $$2) {
            fll $$9 = $$8.G();
            flk $$10 = flk.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fjb, Long> $$12 : $$6) {
         fgp $$13 = ((fjb)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
