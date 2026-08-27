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

public interface euj extends euk {
   List<? extends euk> i();

   default Optional<euk> d(double $$0, double $$1) {
      for (euk $$2 : this.i()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (euk $$3 : this.i()) {
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
      return this.t() != null && this.aC_() && $$2 == 0 ? this.t().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aC_();

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
   euk t();

   void a(@Nullable euk var1);

   @Override
   default void b_(boolean $$0) {
   }

   @Override
   default boolean aD_() {
      return this.t() != null;
   }

   @Nullable
   @Override
   default esc aG_() {
      euk $$0 = this.t();
      return $$0 != null ? esc.a(this, $$0.aG_()) : null;
   }

   default void b(@Nullable euk $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default esc a(ewo $$0) {
      euk $$1 = this.t();
      if ($$1 != null) {
         esc $$2 = $$1.a($$0);
         if ($$2 != null) {
            return esc.a(this, $$2);
         }
      }

      if ($$0 instanceof ewo.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof ewo.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private esc a(ewo.c $$0) {
      boolean $$1 = $$0.b();
      euk $$2 = this.t();
      List<? extends euk> $$3 = new ArrayList<>(this.i());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.u()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends euk> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends euk> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         euk $$11 = $$10.get();
         esc $$12 = $$11.a($$0);
         if ($$12 != null) {
            return esc.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private esc a(ewo.a $$0) {
      euk $$1 = this.t();
      if ($$1 == null) {
         ewq $$2 = $$0.b();
         ews $$3 = this.s().c($$2.b());
         return esc.a(this, this.a($$3, $$2, null, $$0));
      } else {
         ews $$4 = $$1.s();
         return esc.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private esc a(ews $$0, ewq $$1, @Nullable euk $$2, ewo $$3) {
      ewp $$4 = $$1.a();
      ewp $$5 = $$4.a();
      ewq $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<euk> $$8 = new ArrayList<>();

      for (euk $$9 : this.i()) {
         if ($$9 != $$2) {
            ews $$10 = $$9.s();
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

      Comparator<euk> $$12 = Comparator.comparing($$1x -> $$1x.s().b($$1.b()), $$1.d());
      Comparator<euk> $$13 = Comparator.comparing($$1x -> $$1x.s().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (euk $$14 : $$8) {
         esc $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private esc b(ews $$0, ewq $$1, @Nullable euk $$2, ewo $$3) {
      ewp $$4 = $$1.a();
      ewp $$5 = $$4.a();
      List<Pair<euk, Long>> $$6 = new ArrayList<>();
      ewr $$7 = ewr.a($$4, $$0.b($$1), $$0.b($$5));

      for (euk $$8 : this.i()) {
         if ($$8 != $$2) {
            ews $$9 = $$8.s();
            ewr $$10 = ewr.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<euk, Long> $$12 : $$6) {
         esc $$13 = ((euk)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
