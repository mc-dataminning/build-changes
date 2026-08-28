import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ccf<F extends K1, Value> {
   cgb<Value> a();

   cgc b();

   @Nullable
   cce<F, Value> a(bxz<?> var1, Optional<Value> var2);

   public static record a<Value>(cgb<Value> a) implements ccf<Mu<Unit>, Value> {
      @Override
      public cgc b() {
         return cgc.b;
      }

      @Override
      public cce<Mu<Unit>, Value> a(bxz<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cce<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cgb<Value> a) implements ccf<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cgc b() {
         return cgc.a;
      }

      @Override
      public cce<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bxz<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cce<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cgb<Value> a) implements ccf<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cgc b() {
         return cgc.c;
      }

      @Override
      public cce<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bxz<?> $$0, Optional<Value> $$1) {
         return new cce<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
