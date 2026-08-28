import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bzm<F extends K1, Value> {
   cdi<Value> a();

   cdj b();

   @Nullable
   bzl<F, Value> a(bvg<?> var1, Optional<Value> var2);

   public static record a<Value>(cdi<Value> a) implements bzm<Mu<Unit>, Value> {
      @Override
      public cdj b() {
         return cdj.b;
      }

      @Override
      public bzl<Mu<Unit>, Value> a(bvg<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bzl<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cdi<Value> a) implements bzm<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cdj b() {
         return cdj.a;
      }

      @Override
      public bzl<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bvg<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bzl<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cdi<Value> a) implements bzm<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cdj b() {
         return cdj.c;
      }

      @Override
      public bzl<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bvg<?> $$0, Optional<Value> $$1) {
         return new bzl<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
