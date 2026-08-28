import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface caq<F extends K1, Value> {
   cem<Value> a();

   cen b();

   @Nullable
   cap<F, Value> a(bwk<?> var1, Optional<Value> var2);

   public static record a<Value>(cem<Value> a) implements caq<Mu<Unit>, Value> {
      @Override
      public cen b() {
         return cen.b;
      }

      @Override
      public cap<Mu<Unit>, Value> a(bwk<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cap<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cem<Value> a) implements caq<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cen b() {
         return cen.a;
      }

      @Override
      public cap<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bwk<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cap<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cem<Value> a) implements caq<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cen b() {
         return cen.c;
      }

      @Override
      public cap<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bwk<?> $$0, Optional<Value> $$1) {
         return new cap<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
