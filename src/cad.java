import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cad<F extends K1, Value> {
   cdz<Value> a();

   cea b();

   @Nullable
   cac<F, Value> a(bvx<?> var1, Optional<Value> var2);

   public static record a<Value>(cdz<Value> a) implements cad<Mu<Unit>, Value> {
      @Override
      public cea b() {
         return cea.b;
      }

      @Override
      public cac<Mu<Unit>, Value> a(bvx<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cac<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cdz<Value> a) implements cad<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cea b() {
         return cea.a;
      }

      @Override
      public cac<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bvx<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cac<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cdz<Value> a) implements cad<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cea b() {
         return cea.c;
      }

      @Override
      public cac<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bvx<?> $$0, Optional<Value> $$1) {
         return new cac<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
