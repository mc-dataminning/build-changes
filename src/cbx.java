import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cbx<F extends K1, Value> {
   cft<Value> a();

   cfu b();

   @Nullable
   cbw<F, Value> a(bxr<?> var1, Optional<Value> var2);

   public static record a<Value>(cft<Value> a) implements cbx<Mu<Unit>, Value> {
      @Override
      public cfu b() {
         return cfu.b;
      }

      @Override
      public cbw<Mu<Unit>, Value> a(bxr<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cbw<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cft<Value> a) implements cbx<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cfu b() {
         return cfu.a;
      }

      @Override
      public cbw<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bxr<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cbw<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cft<Value> a) implements cbx<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cfu b() {
         return cfu.c;
      }

      @Override
      public cbw<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bxr<?> $$0, Optional<Value> $$1) {
         return new cbw<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
