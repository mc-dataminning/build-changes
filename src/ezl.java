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

public interface ezl extends ezm {
   List<? extends ezm> l();

   default Optional<ezm> b_(double $$0, double $$1) {
      for (ezm $$2 : this.l()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (ezm $$3 : this.l()) {
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
      return this.aJ_() != null && this.aI_() && $$2 == 0 ? this.aJ_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aI_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aJ_() != null && this.aJ_().a($$0, $$1, $$2);
   }

   @Override
   default boolean b(int $$0, int $$1, int $$2) {
      return this.aJ_() != null && this.aJ_().b($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aJ_() != null && this.aJ_().a($$0, $$1);
   }

   @Nullable
   ezm aJ_();

   void a(@Nullable ezm var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aK_() {
      return this.aJ_() != null;
   }

   @Nullable
   @Override
   default exb aL_() {
      ezm $$0 = this.aJ_();
      return $$0 != null ? exb.a(this, $$0.aL_()) : null;
   }

   default void b(@Nullable ezm $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default exb a(fbq $$0) {
      ezm $$1 = this.aJ_();
      if ($$1 != null) {
         exb $$2 = $$1.a($$0);
         if ($$2 != null) {
            return exb.a(this, $$2);
         }
      }

      if ($$0 instanceof fbq.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fbq.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private exb a(fbq.c $$0) {
      boolean $$1 = $$0.b();
      ezm $$2 = this.aJ_();
      List<? extends ezm> $$3 = new ArrayList<>(this.l());
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

      ListIterator<? extends ezm> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends ezm> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         ezm $$11 = $$10.get();
         exb $$12 = $$11.a($$0);
         if ($$12 != null) {
            return exb.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private exb a(fbq.a $$0) {
      ezm $$1 = this.aJ_();
      if ($$1 == null) {
         fbs $$2 = $$0.b();
         fbu $$3 = this.F().c($$2.b());
         return exb.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fbu $$4 = $$1.F();
         return exb.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private exb a(fbu $$0, fbs $$1, @Nullable ezm $$2, fbq $$3) {
      fbr $$4 = $$1.a();
      fbr $$5 = $$4.a();
      fbs $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<ezm> $$8 = new ArrayList<>();

      for (ezm $$9 : this.l()) {
         if ($$9 != $$2) {
            fbu $$10 = $$9.F();
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

      Comparator<ezm> $$12 = Comparator.comparing($$1x -> $$1x.F().b($$1.b()), $$1.d());
      Comparator<ezm> $$13 = Comparator.comparing($$1x -> $$1x.F().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (ezm $$14 : $$8) {
         exb $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private exb b(fbu $$0, fbs $$1, @Nullable ezm $$2, fbq $$3) {
      fbr $$4 = $$1.a();
      fbr $$5 = $$4.a();
      List<Pair<ezm, Long>> $$6 = new ArrayList<>();
      fbt $$7 = fbt.a($$4, $$0.b($$1), $$0.b($$5));

      for (ezm $$8 : this.l()) {
         if ($$8 != $$2) {
            fbu $$9 = $$8.F();
            fbt $$10 = fbt.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<ezm, Long> $$12 : $$6) {
         exb $$13 = ((ezm)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
