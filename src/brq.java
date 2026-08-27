import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface brq<F extends K1, Value> {
   bvm<Value> a();

   bvn b();

   @Nullable
   brp<F, Value> a(bnk<?> var1, Optional<Value> var2);

   public static record a<Value>(bvm<Value> a) implements brq<Mu<Unit>, Value> {
      @Override
      public bvn b() {
         return bvn.b;
      }

      @Override
      public brp<Mu<Unit>, Value> a(bnk<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new brp<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bvm<Value> a) implements brq<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bvn b() {
         return bvn.a;
      }

      @Override
      public brp<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bnk<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new brp<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bvm<Value> a) implements brq<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bvn b() {
         return bvn.c;
      }

      @Override
      public brp<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bnk<?> $$0, Optional<Value> $$1) {
         return new brp<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
