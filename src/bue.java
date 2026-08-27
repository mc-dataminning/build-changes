import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bue<F extends K1, Value> {
   bya<Value> a();

   byb b();

   @Nullable
   bud<F, Value> a(bpy<?> var1, Optional<Value> var2);

   public static record a<Value>(bya<Value> a) implements bue<Mu<Unit>, Value> {
      @Override
      public byb b() {
         return byb.b;
      }

      @Override
      public bud<Mu<Unit>, Value> a(bpy<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bud<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bya<Value> a) implements bue<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public byb b() {
         return byb.a;
      }

      @Override
      public bud<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bpy<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bud<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bya<Value> a) implements bue<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public byb b() {
         return byb.c;
      }

      @Override
      public bud<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bpy<?> $$0, Optional<Value> $$1) {
         return new bud<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
