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

public interface fbj extends fbk {
   List<? extends fbk> l();

   default Optional<fbk> b_(double $$0, double $$1) {
      for (fbk $$2 : this.l()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fbk $$3 : this.l()) {
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
      return this.aK_() != null && this.aJ_() && $$2 == 0 ? this.aK_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aJ_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aK_() != null && this.aK_().a($$0, $$1, $$2);
   }

   @Override
   default boolean b(int $$0, int $$1, int $$2) {
      return this.aK_() != null && this.aK_().b($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aK_() != null && this.aK_().a($$0, $$1);
   }

   @Nullable
   fbk aK_();

   void a(@Nullable fbk var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aL_() {
      return this.aK_() != null;
   }

   @Nullable
   @Override
   default eyy aM_() {
      fbk $$0 = this.aK_();
      return $$0 != null ? eyy.a(this, $$0.aM_()) : null;
   }

   @Nullable
   @Override
   default eyy a(fdp $$0) {
      fbk $$1 = this.aK_();
      if ($$1 != null) {
         eyy $$2 = $$1.a($$0);
         if ($$2 != null) {
            return eyy.a(this, $$2);
         }
      }

      if ($$0 instanceof fdp.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fdp.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private eyy a(fdp.c $$0) {
      boolean $$1 = $$0.b();
      fbk $$2 = this.aK_();
      List<? extends fbk> $$3 = new ArrayList<>(this.l());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.G()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends fbk> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fbk> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fbk $$11 = $$10.get();
         eyy $$12 = $$11.a($$0);
         if ($$12 != null) {
            return eyy.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private eyy a(fdp.a $$0) {
      fbk $$1 = this.aK_();
      if ($$1 == null) {
         fdr $$2 = $$0.b();
         fdt $$3 = this.F().c($$2.b());
         return eyy.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fdt $$4 = $$1.F();
         return eyy.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private eyy a(fdt $$0, fdr $$1, @Nullable fbk $$2, fdp $$3) {
      fdq $$4 = $$1.a();
      fdq $$5 = $$4.a();
      fdr $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fbk> $$8 = new ArrayList<>();

      for (fbk $$9 : this.l()) {
         if ($$9 != $$2) {
            fdt $$10 = $$9.F();
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

      Comparator<fbk> $$12 = Comparator.comparing($$1x -> $$1x.F().b($$1.b()), $$1.d());
      Comparator<fbk> $$13 = Comparator.comparing($$1x -> $$1x.F().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fbk $$14 : $$8) {
         eyy $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private eyy b(fdt $$0, fdr $$1, @Nullable fbk $$2, fdp $$3) {
      fdq $$4 = $$1.a();
      fdq $$5 = $$4.a();
      List<Pair<fbk, Long>> $$6 = new ArrayList<>();
      fds $$7 = fds.a($$4, $$0.b($$1), $$0.b($$5));

      for (fbk $$8 : this.l()) {
         if ($$8 != $$2) {
            fdt $$9 = $$8.F();
            fds $$10 = fds.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fbk, Long> $$12 : $$6) {
         eyy $$13 = ((fbk)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
