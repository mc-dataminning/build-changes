import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bor<F extends K1, Value> {
   bsn<Value> a();

   bso b();

   @Nullable
   boq<F, Value> a(bkm<?> var1, Optional<Value> var2);

   public static record a<Value>(bsn<Value> a) implements bor<Mu<Unit>, Value> {
      @Override
      public bso b() {
         return bso.b;
      }

      @Override
      public boq<Mu<Unit>, Value> a(bkm<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new boq<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bsn<Value> a) implements bor<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bso b() {
         return bso.a;
      }

      @Override
      public boq<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bkm<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new boq<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bsn<Value> a) implements bor<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bso b() {
         return bso.c;
      }

      @Override
      public boq<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bkm<?> $$0, Optional<Value> $$1) {
         return new boq<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
