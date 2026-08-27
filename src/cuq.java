import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public final class cuq {
   public static final cuq a = new cuq(new ty());
   public static final Codec<cuq> b = ty.a.xmap(cuq::new, $$0 -> $$0.e);
   public static final Codec<cuq> c = axe.b(
      b, (Function<cuq, DataResult<cuq>>)($$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0))
   );
   @Deprecated
   public static final yq<ByteBuf, cuq> d = yo.n.a(cuq::new, $$0 -> $$0.e);
   private final ty e;

   private cuq(ty $$0) {
      this.e = $$0;
   }

   public static cuq a(ty $$0) {
      return new cuq($$0.h());
   }

   public static Predicate<csd> a(jy<cuq> $$0, ty $$1) {
      return $$2 -> {
         cuq $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(ty $$0) {
      return un.a($$0, this.e, true);
   }

   public static void a(jy<cuq> $$0, csd $$1, Consumer<ty> $$2) {
      cuq $$3 = $$1.a($$0, a).a($$2);
      if ($$3.e.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(jy<cuq> $$0, csd $$1, ty $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cuq a(Consumer<ty> $$0) {
      ty $$1 = this.e.h();
      $$0.accept($$1);
      return new cuq($$1);
   }

   public void a(bql $$0) {
      ty $$1 = $$0.f(new ty());
      UUID $$2 = $$0.cx();
      $$1.a(this.e);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dnd $$0, ix.a $$1) {
      ty $$2 = $$0.d($$1);
      ty $$3 = $$2.h();
      $$2.a(this.e);
      if (!$$2.equals($$3)) {
         $$0.a($$2, $$1);
         $$0.e();
         return true;
      } else {
         return false;
      }
   }

   public <T> DataResult<cuq> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, um.a, um.a.mapBuilder()).build(this.e).map($$0x -> new cuq((ty)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<uv> $$1 = ac.a(um.a.e(this.e), IllegalStateException::new);
      return $$0.decode(um.a, $$1);
   }

   public int a() {
      return this.e.f();
   }

   public boolean b() {
      return this.e.g();
   }

   public ty c() {
      return this.e.h();
   }

   public boolean a(String $$0) {
      return this.e.e($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof cuq $$1 ? this.e.equals($$1.e) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.e.hashCode();
   }

   @Override
   public String toString() {
      return this.e.toString();
   }

   @Deprecated
   public ty d() {
      return this.e;
   }
}
