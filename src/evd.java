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

public interface evd extends eve {
   List<? extends eve> i();

   default Optional<eve> d(double $$0, double $$1) {
      for (eve $$2 : this.i()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (eve $$3 : this.i()) {
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
      return this.d($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.t() != null && this.aF_() && $$2 == 0 ? this.t().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aF_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.d($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.t() != null && this.t().a($$0, $$1, $$2);
   }

   @Override
   default boolean b(int $$0, int $$1, int $$2) {
      return this.t() != null && this.t().b($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.t() != null && this.t().a($$0, $$1);
   }

   @Nullable
   eve t();

   void a(@Nullable eve var1);

   @Override
   default void b_(boolean $$0) {
   }

   @Override
   default boolean aG_() {
      return this.t() != null;
   }

   @Nullable
   @Override
   default esv aK_() {
      eve $$0 = this.t();
      return $$0 != null ? esv.a(this, $$0.aK_()) : null;
   }

   default void b(@Nullable eve $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default esv a(exi $$0) {
      eve $$1 = this.t();
      if ($$1 != null) {
         esv $$2 = $$1.a($$0);
         if ($$2 != null) {
            return esv.a(this, $$2);
         }
      }

      if ($$0 instanceof exi.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof exi.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private esv a(exi.c $$0) {
      boolean $$1 = $$0.b();
      eve $$2 = this.t();
      List<? extends eve> $$3 = new ArrayList<>(this.i());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.aH_()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends eve> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends eve> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         eve $$11 = $$10.get();
         esv $$12 = $$11.a($$0);
         if ($$12 != null) {
            return esv.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private esv a(exi.a $$0) {
      eve $$1 = this.t();
      if ($$1 == null) {
         exk $$2 = $$0.b();
         exm $$3 = this.s().c($$2.b());
         return esv.a(this, this.a($$3, $$2, null, $$0));
      } else {
         exm $$4 = $$1.s();
         return esv.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private esv a(exm $$0, exk $$1, @Nullable eve $$2, exi $$3) {
      exj $$4 = $$1.a();
      exj $$5 = $$4.a();
      exk $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<eve> $$8 = new ArrayList<>();

      for (eve $$9 : this.i()) {
         if ($$9 != $$2) {
            exm $$10 = $$9.s();
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

      Comparator<eve> $$12 = Comparator.comparing($$1x -> $$1x.s().b($$1.b()), $$1.d());
      Comparator<eve> $$13 = Comparator.comparing($$1x -> $$1x.s().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (eve $$14 : $$8) {
         esv $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private esv b(exm $$0, exk $$1, @Nullable eve $$2, exi $$3) {
      exj $$4 = $$1.a();
      exj $$5 = $$4.a();
      List<Pair<eve, Long>> $$6 = new ArrayList<>();
      exl $$7 = exl.a($$4, $$0.b($$1), $$0.b($$5));

      for (eve $$8 : this.i()) {
         if ($$8 != $$2) {
            exm $$9 = $$8.s();
            exl $$10 = exl.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<eve, Long> $$12 : $$6) {
         esv $$13 = ((eve)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
