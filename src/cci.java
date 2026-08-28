import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cci<F extends K1, Value> {
   cge<Value> a();

   cgf b();

   @Nullable
   cch<F, Value> a(byc<?> var1, Optional<Value> var2);

   public static record a<Value>(cge<Value> a) implements cci<Mu<Unit>, Value> {
      @Override
      public cgf b() {
         return cgf.b;
      }

      @Override
      public cch<Mu<Unit>, Value> a(byc<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cch<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cge<Value> a) implements cci<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cgf b() {
         return cgf.a;
      }

      @Override
      public cch<com.mojang.datafixers.kinds.IdF.Mu, Value> a(byc<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cch<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cge<Value> a) implements cci<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cgf b() {
         return cgf.c;
      }

      @Override
      public cch<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(byc<?> $$0, Optional<Value> $$1) {
         return new cch<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
