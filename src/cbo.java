import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cbo<F extends K1, Value> {
   cfk<Value> a();

   cfl b();

   @Nullable
   cbn<F, Value> a(bxi<?> var1, Optional<Value> var2);

   public static record a<Value>(cfk<Value> a) implements cbo<Mu<Unit>, Value> {
      @Override
      public cfl b() {
         return cfl.b;
      }

      @Override
      public cbn<Mu<Unit>, Value> a(bxi<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cbn<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cfk<Value> a) implements cbo<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cfl b() {
         return cfl.a;
      }

      @Override
      public cbn<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bxi<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cbn<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cfk<Value> a) implements cbo<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cfl b() {
         return cfl.c;
      }

      @Override
      public cbn<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bxi<?> $$0, Optional<Value> $$1) {
         return new cbn<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
