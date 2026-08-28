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

public interface fns extends fnt {
   List<? extends fnt> aI_();

   default Optional<fnt> b_(double $$0, double $$1) {
      for (fnt $$2 : this.aI_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fnt $$3 : this.aI_()) {
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
      if ($$2 == 0 && this.aK_()) {
         this.b_(false);
         if (this.aL_() != null) {
            return this.aL_().b($$0, $$1, $$2);
         }
      }

      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aL_() != null && this.aK_() && $$2 == 0 ? this.aL_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aK_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aL_() != null && this.aL_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aL_() != null && this.aL_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aL_() != null && this.aL_().a($$0, $$1);
   }

   @Nullable
   fnt aL_();

   void a(@Nullable fnt var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aM_() {
      return this.aL_() != null;
   }

   @Nullable
   @Override
   default flg aN_() {
      fnt $$0 = this.aL_();
      return $$0 != null ? flg.a(this, $$0.aN_()) : null;
   }

   @Nullable
   @Override
   default flg a(fqa $$0) {
      fnt $$1 = this.aL_();
      if ($$1 != null) {
         flg $$2 = $$1.a($$0);
         if ($$2 != null) {
            return flg.a(this, $$2);
         }
      }

      if ($$0 instanceof fqa.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fqa.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private flg a(fqa.c $$0) {
      boolean $$1 = $$0.b();
      fnt $$2 = this.aL_();
      List<? extends fnt> $$3 = new ArrayList<>(this.aI_());
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

      ListIterator<? extends fnt> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fnt> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fnt $$11 = $$10.get();
         flg $$12 = $$11.a($$0);
         if ($$12 != null) {
            return flg.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private flg a(fqa.a $$0) {
      fnt $$1 = this.aL_();
      if ($$1 == null) {
         fqc $$2 = $$0.b();
         fqe $$3 = this.H().c($$2.b());
         return flg.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fqe $$4 = $$1.H();
         return flg.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private flg a(fqe $$0, fqc $$1, @Nullable fnt $$2, fqa $$3) {
      fqb $$4 = $$1.a();
      fqb $$5 = $$4.a();
      fqc $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fnt> $$8 = new ArrayList<>();

      for (fnt $$9 : this.aI_()) {
         if ($$9 != $$2) {
            fqe $$10 = $$9.H();
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

      Comparator<fnt> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fnt> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fnt $$14 : $$8) {
         flg $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private flg b(fqe $$0, fqc $$1, @Nullable fnt $$2, fqa $$3) {
      fqb $$4 = $$1.a();
      fqb $$5 = $$4.a();
      List<Pair<fnt, Long>> $$6 = new ArrayList<>();
      fqd $$7 = fqd.a($$4, $$0.b($$1), $$0.b($$5));

      for (fnt $$8 : this.aI_()) {
         if ($$8 != $$2) {
            fqe $$9 = $$8.H();
            fqd $$10 = fqd.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fnt, Long> $$12 : $$6) {
         flg $$13 = ((fnt)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
