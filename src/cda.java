import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cda<F extends K1, Value> {
   cgw<Value> a();

   cgx b();

   @Nullable
   ccz<F, Value> a(byu<?> var1, Optional<Value> var2);

   public static record a<Value>(cgw<Value> a) implements cda<Mu<Unit>, Value> {
      @Override
      public cgx b() {
         return cgx.b;
      }

      @Override
      public ccz<Mu<Unit>, Value> a(byu<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new ccz<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cgw<Value> a) implements cda<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cgx b() {
         return cgx.a;
      }

      @Override
      public ccz<com.mojang.datafixers.kinds.IdF.Mu, Value> a(byu<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new ccz<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cgw<Value> a) implements cda<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cgx b() {
         return cgx.c;
      }

      @Override
      public ccz<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(byu<?> $$0, Optional<Value> $$1) {
         return new ccz<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
