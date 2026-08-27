import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface brb<F extends K1, Value> {
   bux<Value> a();

   buy b();

   @Nullable
   bra<F, Value> a(bmv<?> var1, Optional<Value> var2);

   public static record a<Value>(bux<Value> a) implements brb<Mu<Unit>, Value> {
      @Override
      public buy b() {
         return buy.b;
      }

      @Override
      public bra<Mu<Unit>, Value> a(bmv<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bra<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bux<Value> a) implements brb<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public buy b() {
         return buy.a;
      }

      @Override
      public bra<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bmv<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bra<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bux<Value> a) implements brb<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public buy b() {
         return buy.c;
      }

      @Override
      public bra<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bmv<?> $$0, Optional<Value> $$1) {
         return new bra<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
