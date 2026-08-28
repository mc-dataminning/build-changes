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

public interface fiz extends fja {
   List<? extends fja> aD_();

   default Optional<fja> b_(double $$0, double $$1) {
      for (fja $$2 : this.aD_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fja $$3 : this.aD_()) {
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
   fja aG_();

   void a(@Nullable fja var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aH_() {
      return this.aG_() != null;
   }

   @Nullable
   @Override
   default fgo aI_() {
      fja $$0 = this.aG_();
      return $$0 != null ? fgo.a(this, $$0.aI_()) : null;
   }

   @Nullable
   @Override
   default fgo a(flg $$0) {
      fja $$1 = this.aG_();
      if ($$1 != null) {
         fgo $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fgo.a(this, $$2);
         }
      }

      if ($$0 instanceof flg.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof flg.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fgo a(flg.c $$0) {
      boolean $$1 = $$0.b();
      fja $$2 = this.aG_();
      List<? extends fja> $$3 = new ArrayList<>(this.aD_());
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

      ListIterator<? extends fja> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fja> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fja $$11 = $$10.get();
         fgo $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fgo.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fgo a(flg.a $$0) {
      fja $$1 = this.aG_();
      if ($$1 == null) {
         fli $$2 = $$0.b();
         flk $$3 = this.G().c($$2.b());
         return fgo.a(this, this.a($$3, $$2, null, $$0));
      } else {
         flk $$4 = $$1.G();
         return fgo.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fgo a(flk $$0, fli $$1, @Nullable fja $$2, flg $$3) {
      flh $$4 = $$1.a();
      flh $$5 = $$4.a();
      fli $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fja> $$8 = new ArrayList<>();

      for (fja $$9 : this.aD_()) {
         if ($$9 != $$2) {
            flk $$10 = $$9.G();
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

      Comparator<fja> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<fja> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fja $$14 : $$8) {
         fgo $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fgo b(flk $$0, fli $$1, @Nullable fja $$2, flg $$3) {
      flh $$4 = $$1.a();
      flh $$5 = $$4.a();
      List<Pair<fja, Long>> $$6 = new ArrayList<>();
      flj $$7 = flj.a($$4, $$0.b($$1), $$0.b($$5));

      for (fja $$8 : this.aD_()) {
         if ($$8 != $$2) {
            flk $$9 = $$8.G();
            flj $$10 = flj.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fja, Long> $$12 : $$6) {
         fgo $$13 = ((fja)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
