import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bpo<F extends K1, Value> {
   btk<Value> a();

   btl b();

   @Nullable
   bpn<F, Value> a(blj<?> var1, Optional<Value> var2);

   public static record a<Value>(btk<Value> a) implements bpo<Mu<Unit>, Value> {
      @Override
      public btl b() {
         return btl.b;
      }

      @Override
      public bpn<Mu<Unit>, Value> a(blj<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bpn<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(btk<Value> a) implements bpo<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public btl b() {
         return btl.a;
      }

      @Override
      public bpn<com.mojang.datafixers.kinds.IdF.Mu, Value> a(blj<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bpn<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(btk<Value> a) implements bpo<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public btl b() {
         return btl.c;
      }

      @Override
      public bpn<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(blj<?> $$0, Optional<Value> $$1) {
         return new bpn<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
