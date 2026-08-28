import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cdl<F extends K1, Value> {
   chh<Value> a();

   chi b();

   @Nullable
   cdk<F, Value> a(bzf<?> var1, Optional<Value> var2);

   public static record a<Value>(chh<Value> a) implements cdl<Mu<Unit>, Value> {
      @Override
      public chi b() {
         return chi.b;
      }

      @Override
      public cdk<Mu<Unit>, Value> a(bzf<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cdk<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(chh<Value> a) implements cdl<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public chi b() {
         return chi.a;
      }

      @Override
      public cdk<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bzf<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cdk<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(chh<Value> a) implements cdl<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public chi b() {
         return chi.c;
      }

      @Override
      public cdk<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bzf<?> $$0, Optional<Value> $$1) {
         return new cdk<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
