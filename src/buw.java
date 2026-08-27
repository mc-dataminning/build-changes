import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface buw<F extends K1, Value> {
   bys<Value> a();

   byt b();

   @Nullable
   buv<F, Value> a(bqq<?> var1, Optional<Value> var2);

   public static record a<Value>(bys<Value> a) implements buw<Mu<Unit>, Value> {
      @Override
      public byt b() {
         return byt.b;
      }

      @Override
      public buv<Mu<Unit>, Value> a(bqq<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new buv<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bys<Value> a) implements buw<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public byt b() {
         return byt.a;
      }

      @Override
      public buv<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bqq<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new buv<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bys<Value> a) implements buw<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public byt b() {
         return byt.c;
      }

      @Override
      public buv<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bqq<?> $$0, Optional<Value> $$1) {
         return new buv<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
