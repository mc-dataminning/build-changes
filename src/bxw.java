import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bxw<F extends K1, Value> {
   cbs<Value> a();

   cbt b();

   @Nullable
   bxv<F, Value> a(btq<?> var1, Optional<Value> var2);

   public static record a<Value>(cbs<Value> a) implements bxw<Mu<Unit>, Value> {
      @Override
      public cbt b() {
         return cbt.b;
      }

      @Override
      public bxv<Mu<Unit>, Value> a(btq<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bxv<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cbs<Value> a) implements bxw<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cbt b() {
         return cbt.a;
      }

      @Override
      public bxv<com.mojang.datafixers.kinds.IdF.Mu, Value> a(btq<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bxv<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cbs<Value> a) implements bxw<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cbt b() {
         return cbt.c;
      }

      @Override
      public bxv<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(btq<?> $$0, Optional<Value> $$1) {
         return new bxv<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
