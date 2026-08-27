import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface buv<F extends K1, Value> {
   byr<Value> a();

   bys b();

   @Nullable
   buu<F, Value> a(bqp<?> var1, Optional<Value> var2);

   public static record a<Value>(byr<Value> a) implements buv<Mu<Unit>, Value> {
      @Override
      public bys b() {
         return bys.b;
      }

      @Override
      public buu<Mu<Unit>, Value> a(bqp<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new buu<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(byr<Value> a) implements buv<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bys b() {
         return bys.a;
      }

      @Override
      public buu<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bqp<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new buu<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(byr<Value> a) implements buv<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bys b() {
         return bys.c;
      }

      @Override
      public buu<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bqp<?> $$0, Optional<Value> $$1) {
         return new buu<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
