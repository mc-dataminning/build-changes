import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bwa<F extends K1, Value> {
   bzw<Value> a();

   bzx b();

   @Nullable
   bvz<F, Value> a(bru<?> var1, Optional<Value> var2);

   public static record a<Value>(bzw<Value> a) implements bwa<Mu<Unit>, Value> {
      @Override
      public bzx b() {
         return bzx.b;
      }

      @Override
      public bvz<Mu<Unit>, Value> a(bru<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bvz<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bzw<Value> a) implements bwa<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bzx b() {
         return bzx.a;
      }

      @Override
      public bvz<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bru<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bvz<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bzw<Value> a) implements bwa<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bzx b() {
         return bzx.c;
      }

      @Override
      public bvz<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bru<?> $$0, Optional<Value> $$1) {
         return new bvz<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
