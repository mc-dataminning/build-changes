import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface boc<F extends K1, Value> {
   bry<Value> a();

   brz b();

   @Nullable
   bob<F, Value> a(bjx<?> var1, Optional<Value> var2);

   public static record a<Value>(bry<Value> a) implements boc<Mu<Unit>, Value> {
      @Override
      public brz b() {
         return brz.b;
      }

      @Override
      public bob<Mu<Unit>, Value> a(bjx<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bob<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bry<Value> a) implements boc<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public brz b() {
         return brz.a;
      }

      @Override
      public bob<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bjx<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bob<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bry<Value> a) implements boc<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public brz b() {
         return brz.c;
      }

      @Override
      public bob<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bjx<?> $$0, Optional<Value> $$1) {
         return new bob<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
