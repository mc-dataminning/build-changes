import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byg<F extends K1, Value> {
   ccc<Value> a();

   ccd b();

   @Nullable
   byf<F, Value> a(bua<?> var1, Optional<Value> var2);

   public static record a<Value>(ccc<Value> a) implements byg<Mu<Unit>, Value> {
      @Override
      public ccd b() {
         return ccd.b;
      }

      @Override
      public byf<Mu<Unit>, Value> a(bua<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byf<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(ccc<Value> a) implements byg<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public ccd b() {
         return ccd.a;
      }

      @Override
      public byf<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bua<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byf<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(ccc<Value> a) implements byg<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public ccd b() {
         return ccd.c;
      }

      @Override
      public byf<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bua<?> $$0, Optional<Value> $$1) {
         return new byf<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
