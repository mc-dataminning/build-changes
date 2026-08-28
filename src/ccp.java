import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ccp<F extends K1, Value> {
   cgl<Value> a();

   cgm b();

   @Nullable
   cco<F, Value> a(byj<?> var1, Optional<Value> var2);

   public static record a<Value>(cgl<Value> a) implements ccp<Mu<Unit>, Value> {
      @Override
      public cgm b() {
         return cgm.b;
      }

      @Override
      public cco<Mu<Unit>, Value> a(byj<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cco<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cgl<Value> a) implements ccp<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cgm b() {
         return cgm.a;
      }

      @Override
      public cco<com.mojang.datafixers.kinds.IdF.Mu, Value> a(byj<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cco<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cgl<Value> a) implements ccp<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cgm b() {
         return cgm.c;
      }

      @Override
      public cco<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(byj<?> $$0, Optional<Value> $$1) {
         return new cco<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
