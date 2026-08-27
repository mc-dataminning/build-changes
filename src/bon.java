import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bon<F extends K1, Value> {
   bsj<Value> a();

   bsk b();

   @Nullable
   bom<F, Value> a(bki<?> var1, Optional<Value> var2);

   public static record a<Value>(bsj<Value> a) implements bon<Mu<Unit>, Value> {
      @Override
      public bsk b() {
         return bsk.b;
      }

      @Override
      public bom<Mu<Unit>, Value> a(bki<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bom<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bsj<Value> a) implements bon<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bsk b() {
         return bsk.a;
      }

      @Override
      public bom<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bki<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bom<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bsj<Value> a) implements bon<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bsk b() {
         return bsk.c;
      }

      @Override
      public bom<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bki<?> $$0, Optional<Value> $$1) {
         return new bom<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
