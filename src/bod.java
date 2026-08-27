import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bod<F extends K1, Value> {
   brz<Value> a();

   bsa b();

   @Nullable
   boc<F, Value> a(bjy<?> var1, Optional<Value> var2);

   public static record a<Value>(brz<Value> a) implements bod<Mu<Unit>, Value> {
      @Override
      public bsa b() {
         return bsa.b;
      }

      @Override
      public boc<Mu<Unit>, Value> a(bjy<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new boc<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(brz<Value> a) implements bod<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bsa b() {
         return bsa.a;
      }

      @Override
      public boc<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bjy<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new boc<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(brz<Value> a) implements bod<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bsa b() {
         return bsa.c;
      }

      @Override
      public boc<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bjy<?> $$0, Optional<Value> $$1) {
         return new boc<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
