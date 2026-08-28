import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cai<F extends K1, Value> {
   cee<Value> a();

   cef b();

   @Nullable
   cah<F, Value> a(bwc<?> var1, Optional<Value> var2);

   public static record a<Value>(cee<Value> a) implements cai<Mu<Unit>, Value> {
      @Override
      public cef b() {
         return cef.b;
      }

      @Override
      public cah<Mu<Unit>, Value> a(bwc<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cah<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cee<Value> a) implements cai<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cef b() {
         return cef.a;
      }

      @Override
      public cah<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bwc<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cah<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cee<Value> a) implements cai<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cef b() {
         return cef.c;
      }

      @Override
      public cah<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bwc<?> $$0, Optional<Value> $$1) {
         return new cah<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
