import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface can<F extends K1, Value> {
   cej<Value> a();

   cek b();

   @Nullable
   cam<F, Value> a(bwh<?> var1, Optional<Value> var2);

   public static record a<Value>(cej<Value> a) implements can<Mu<Unit>, Value> {
      @Override
      public cek b() {
         return cek.b;
      }

      @Override
      public cam<Mu<Unit>, Value> a(bwh<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cam<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cej<Value> a) implements can<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cek b() {
         return cek.a;
      }

      @Override
      public cam<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bwh<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cam<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cej<Value> a) implements can<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cek b() {
         return cek.c;
      }

      @Override
      public cam<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bwh<?> $$0, Optional<Value> $$1) {
         return new cam<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
