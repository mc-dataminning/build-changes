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

public interface eyy extends eyz {
   List<? extends eyz> l();

   default Optional<eyz> b_(double $$0, double $$1) {
      for (eyz $$2 : this.l()) {
         if ($$2.c($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      for (eyz $$3 : this.l()) {
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
      return this.aH_() != null && this.aG_() && $$2 == 0 ? this.aH_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aG_();

   void b(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.b_($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aH_() != null && this.aH_().a($$0, $$1, $$2);
   }

   @Override
   default boolean b(int $$0, int $$1, int $$2) {
      return this.aH_() != null && this.aH_().b($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aH_() != null && this.aH_().a($$0, $$1);
   }

   @Nullable
   eyz aH_();

   void a(@Nullable eyz var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aI_() {
      return this.aH_() != null;
   }

   @Nullable
   @Override
   default ewp aJ_() {
      eyz $$0 = this.aH_();
      return $$0 != null ? ewp.a(this, $$0.aJ_()) : null;
   }

   default void b(@Nullable eyz $$0) {
      this.a($$0);
   }

   @Nullable
   @Override
   default ewp a(fbd $$0) {
      eyz $$1 = this.aH_();
      if ($$1 != null) {
         ewp $$2 = $$1.a($$0);
         if ($$2 != null) {
            return ewp.a(this, $$2);
         }
      }

      if ($$0 instanceof fbd.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fbd.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private ewp a(fbd.c $$0) {
      boolean $$1 = $$0.b();
      eyz $$2 = this.aH_();
      List<? extends eyz> $$3 = new ArrayList<>(this.l());
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

      ListIterator<? extends eyz> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends eyz> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         eyz $$11 = $$10.get();
         ewp $$12 = $$11.a($$0);
         if ($$12 != null) {
            return ewp.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private ewp a(fbd.a $$0) {
      eyz $$1 = this.aH_();
      if ($$1 == null) {
         fbf $$2 = $$0.b();
         fbh $$3 = this.F().c($$2.b());
         return ewp.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fbh $$4 = $$1.F();
         return ewp.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private ewp a(fbh $$0, fbf $$1, @Nullable eyz $$2, fbd $$3) {
      fbe $$4 = $$1.a();
      fbe $$5 = $$4.a();
      fbf $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<eyz> $$8 = new ArrayList<>();

      for (eyz $$9 : this.l()) {
         if ($$9 != $$2) {
            fbh $$10 = $$9.F();
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

      Comparator<eyz> $$12 = Comparator.comparing($$1x -> $$1x.F().b($$1.b()), $$1.d());
      Comparator<eyz> $$13 = Comparator.comparing($$1x -> $$1x.F().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (eyz $$14 : $$8) {
         ewp $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private ewp b(fbh $$0, fbf $$1, @Nullable eyz $$2, fbd $$3) {
      fbe $$4 = $$1.a();
      fbe $$5 = $$4.a();
      List<Pair<eyz, Long>> $$6 = new ArrayList<>();
      fbg $$7 = fbg.a($$4, $$0.b($$1), $$0.b($$5));

      for (eyz $$8 : this.l()) {
         if ($$8 != $$2) {
            fbh $$9 = $$8.F();
            fbg $$10 = fbg.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<eyz, Long> $$12 : $$6) {
         ewp $$13 = ((eyz)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
