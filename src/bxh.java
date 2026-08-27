import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bxh<F extends K1, Value> {
   cbd<Value> a();

   cbe b();

   @Nullable
   bxg<F, Value> a(btb<?> var1, Optional<Value> var2);

   public static record a<Value>(cbd<Value> a) implements bxh<Mu<Unit>, Value> {
      @Override
      public cbe b() {
         return cbe.b;
      }

      @Override
      public bxg<Mu<Unit>, Value> a(btb<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bxg<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cbd<Value> a) implements bxh<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cbe b() {
         return cbe.a;
      }

      @Override
      public bxg<com.mojang.datafixers.kinds.IdF.Mu, Value> a(btb<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bxg<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cbd<Value> a) implements bxh<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cbe b() {
         return cbe.c;
      }

      @Override
      public bxg<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(btb<?> $$0, Optional<Value> $$1) {
         return new bxg<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
