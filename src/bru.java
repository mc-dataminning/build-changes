import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bru<F extends K1, Value> {
   bvq<Value> a();

   bvr b();

   @Nullable
   brt<F, Value> a(bno<?> var1, Optional<Value> var2);

   public static record a<Value>(bvq<Value> a) implements bru<Mu<Unit>, Value> {
      @Override
      public bvr b() {
         return bvr.b;
      }

      @Override
      public brt<Mu<Unit>, Value> a(bno<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new brt<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bvq<Value> a) implements bru<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bvr b() {
         return bvr.a;
      }

      @Override
      public brt<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bno<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new brt<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bvq<Value> a) implements bru<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bvr b() {
         return bvr.c;
      }

      @Override
      public brt<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bno<?> $$0, Optional<Value> $$1) {
         return new brt<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
