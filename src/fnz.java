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

public interface fnz extends foa {
   List<? extends foa> aH_();

   default Optional<foa> b_(double $$0, double $$1) {
      for (foa $$2 : this.aH_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (foa $$3 : this.aH_()) {
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
      if ($$2 == 0 && this.aJ_()) {
         this.b_(false);
         if (this.aK_() != null) {
            return this.aK_().b($$0, $$1, $$2);
         }
      }

      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aK_() != null && this.aJ_() && $$2 == 0 ? this.aK_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aJ_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aK_() != null && this.aK_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aK_() != null && this.aK_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aK_() != null && this.aK_().a($$0, $$1);
   }

   @Nullable
   foa aK_();

   void a(@Nullable foa var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aL_() {
      return this.aK_() != null;
   }

   @Nullable
   @Override
   default fln aM_() {
      foa $$0 = this.aK_();
      return $$0 != null ? fln.a(this, $$0.aM_()) : null;
   }

   @Nullable
   @Override
   default fln a(fqh $$0) {
      foa $$1 = this.aK_();
      if ($$1 != null) {
         fln $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fln.a(this, $$2);
         }
      }

      if ($$0 instanceof fqh.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fqh.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fln a(fqh.c $$0) {
      boolean $$1 = $$0.b();
      foa $$2 = this.aK_();
      List<? extends foa> $$3 = new ArrayList<>(this.aH_());
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

      ListIterator<? extends foa> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends foa> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         foa $$11 = $$10.get();
         fln $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fln.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fln a(fqh.a $$0) {
      foa $$1 = this.aK_();
      if ($$1 == null) {
         fqj $$2 = $$0.b();
         fql $$3 = this.H().c($$2.b());
         return fln.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fql $$4 = $$1.H();
         return fln.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fln a(fql $$0, fqj $$1, @Nullable foa $$2, fqh $$3) {
      fqi $$4 = $$1.a();
      fqi $$5 = $$4.a();
      fqj $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<foa> $$8 = new ArrayList<>();

      for (foa $$9 : this.aH_()) {
         if ($$9 != $$2) {
            fql $$10 = $$9.H();
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

      Comparator<foa> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<foa> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (foa $$14 : $$8) {
         fln $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fln b(fql $$0, fqj $$1, @Nullable foa $$2, fqh $$3) {
      fqi $$4 = $$1.a();
      fqi $$5 = $$4.a();
      List<Pair<foa, Long>> $$6 = new ArrayList<>();
      fqk $$7 = fqk.a($$4, $$0.b($$1), $$0.b($$5));

      for (foa $$8 : this.aH_()) {
         if ($$8 != $$2) {
            fql $$9 = $$8.H();
            fqk $$10 = fqk.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<foa, Long> $$12 : $$6) {
         fln $$13 = ((foa)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
