import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bzu<F extends K1, Value> {
   cdq<Value> a();

   cdr b();

   @Nullable
   bzt<F, Value> a(bvo<?> var1, Optional<Value> var2);

   public static record a<Value>(cdq<Value> a) implements bzu<Mu<Unit>, Value> {
      @Override
      public cdr b() {
         return cdr.b;
      }

      @Override
      public bzt<Mu<Unit>, Value> a(bvo<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bzt<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cdq<Value> a) implements bzu<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cdr b() {
         return cdr.a;
      }

      @Override
      public bzt<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bvo<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bzt<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cdq<Value> a) implements bzu<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cdr b() {
         return cdr.c;
      }

      @Override
      public bzt<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bvo<?> $$0, Optional<Value> $$1) {
         return new bzt<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
