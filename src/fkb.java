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

public interface fkb extends fkc {
   List<? extends fkc> aG_();

   default Optional<fkc> b_(double $$0, double $$1) {
      for (fkc $$2 : this.aG_()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (fkc $$3 : this.aG_()) {
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
      if ($$2 == 0 && this.aI_()) {
         this.b_(false);
         if (this.aJ_() != null) {
            return this.aJ_().b($$0, $$1, $$2);
         }
      }

      return this.b_($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aJ_() != null && this.aI_() && $$2 == 0 ? this.aJ_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aI_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aJ_() != null && this.aJ_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aJ_() != null && this.aJ_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aJ_() != null && this.aJ_().a($$0, $$1);
   }

   @Nullable
   fkc aJ_();

   void a(@Nullable fkc var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aK_() {
      return this.aJ_() != null;
   }

   @Nullable
   @Override
   default fhq aL_() {
      fkc $$0 = this.aJ_();
      return $$0 != null ? fhq.a(this, $$0.aL_()) : null;
   }

   @Nullable
   @Override
   default fhq a(fmi $$0) {
      fkc $$1 = this.aJ_();
      if ($$1 != null) {
         fhq $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fhq.a(this, $$2);
         }
      }

      if ($$0 instanceof fmi.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fmi.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fhq a(fmi.c $$0) {
      boolean $$1 = $$0.b();
      fkc $$2 = this.aJ_();
      List<? extends fkc> $$3 = new ArrayList<>(this.aG_());
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

      ListIterator<? extends fkc> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fkc> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fkc $$11 = $$10.get();
         fhq $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fhq.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fhq a(fmi.a $$0) {
      fkc $$1 = this.aJ_();
      if ($$1 == null) {
         fmk $$2 = $$0.b();
         fmm $$3 = this.H().c($$2.b());
         return fhq.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fmm $$4 = $$1.H();
         return fhq.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fhq a(fmm $$0, fmk $$1, @Nullable fkc $$2, fmi $$3) {
      fmj $$4 = $$1.a();
      fmj $$5 = $$4.a();
      fmk $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fkc> $$8 = new ArrayList<>();

      for (fkc $$9 : this.aG_()) {
         if ($$9 != $$2) {
            fmm $$10 = $$9.H();
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

      Comparator<fkc> $$12 = Comparator.comparing($$1x -> $$1x.H().b($$1.b()), $$1.d());
      Comparator<fkc> $$13 = Comparator.comparing($$1x -> $$1x.H().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fkc $$14 : $$8) {
         fhq $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fhq b(fmm $$0, fmk $$1, @Nullable fkc $$2, fmi $$3) {
      fmj $$4 = $$1.a();
      fmj $$5 = $$4.a();
      List<Pair<fkc, Long>> $$6 = new ArrayList<>();
      fml $$7 = fml.a($$4, $$0.b($$1), $$0.b($$5));

      for (fkc $$8 : this.aG_()) {
         if ($$8 != $$2) {
            fmm $$9 = $$8.H();
            fml $$10 = fml.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fkc, Long> $$12 : $$6) {
         fhq $$13 = ((fkc)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
