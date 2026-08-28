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

public interface fiy extends fiz {
   List<? extends fiz> aD_();

   default Optional<fiz> b_(double $$0, double $$1) {
      for (fiz $$2 : this.aD_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fiz $$3 : this.aD_()) {
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
   fiz aG_();

   void a(@Nullable fiz var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aH_() {
      return this.aG_() != null;
   }

   @Nullable
   @Override
   default fgn aI_() {
      fiz $$0 = this.aG_();
      return $$0 != null ? fgn.a(this, $$0.aI_()) : null;
   }

   @Nullable
   @Override
   default fgn a(flf $$0) {
      fiz $$1 = this.aG_();
      if ($$1 != null) {
         fgn $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fgn.a(this, $$2);
         }
      }

      if ($$0 instanceof flf.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof flf.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fgn a(flf.c $$0) {
      boolean $$1 = $$0.b();
      fiz $$2 = this.aG_();
      List<? extends fiz> $$3 = new ArrayList<>(this.aD_());
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

      ListIterator<? extends fiz> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fiz> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fiz $$11 = $$10.get();
         fgn $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fgn.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fgn a(flf.a $$0) {
      fiz $$1 = this.aG_();
      if ($$1 == null) {
         flh $$2 = $$0.b();
         flj $$3 = this.G().c($$2.b());
         return fgn.a(this, this.a($$3, $$2, null, $$0));
      } else {
         flj $$4 = $$1.G();
         return fgn.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fgn a(flj $$0, flh $$1, @Nullable fiz $$2, flf $$3) {
      flg $$4 = $$1.a();
      flg $$5 = $$4.a();
      flh $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fiz> $$8 = new ArrayList<>();

      for (fiz $$9 : this.aD_()) {
         if ($$9 != $$2) {
            flj $$10 = $$9.G();
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

      Comparator<fiz> $$12 = Comparator.comparing($$1x -> $$1x.G().b($$1.b()), $$1.d());
      Comparator<fiz> $$13 = Comparator.comparing($$1x -> $$1x.G().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fiz $$14 : $$8) {
         fgn $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fgn b(flj $$0, flh $$1, @Nullable fiz $$2, flf $$3) {
      flg $$4 = $$1.a();
      flg $$5 = $$4.a();
      List<Pair<fiz, Long>> $$6 = new ArrayList<>();
      fli $$7 = fli.a($$4, $$0.b($$1), $$0.b($$5));

      for (fiz $$8 : this.aD_()) {
         if ($$8 != $$2) {
            flj $$9 = $$8.G();
            fli $$10 = fli.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fiz, Long> $$12 : $$6) {
         fgn $$13 = ((fiz)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
