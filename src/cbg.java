import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cbg<F extends K1, Value> {
   cfc<Value> a();

   cfd b();

   @Nullable
   cbf<F, Value> a(bxa<?> var1, Optional<Value> var2);

   public static record a<Value>(cfc<Value> a) implements cbg<Mu<Unit>, Value> {
      @Override
      public cfd b() {
         return cfd.b;
      }

      @Override
      public cbf<Mu<Unit>, Value> a(bxa<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cbf<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cfc<Value> a) implements cbg<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cfd b() {
         return cfd.a;
      }

      @Override
      public cbf<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bxa<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cbf<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cfc<Value> a) implements cbg<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cfd b() {
         return cfd.c;
      }

      @Override
      public cbf<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bxa<?> $$0, Optional<Value> $$1) {
         return new cbf<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
