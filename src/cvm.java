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

public final class cvm {
   public static final cvm a = new cvm(new ua());
   public static final Codec<cvm> b = ua.a.xmap(cvm::new, $$0 -> $$0.e);
   public static final Codec<cvm> c = axh.b(
      b, (Function<cvm, DataResult<cvm>>)($$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0))
   );
   @Deprecated
   public static final ys<ByteBuf, cvm> d = yq.n.a(cvm::new, $$0 -> $$0.e);
   private final ua e;

   private cvm(ua $$0) {
      this.e = $$0;
   }

   public static cvm a(ua $$0) {
      return new cvm($$0.h());
   }

   public static Predicate<csz> a(jz<cvm> $$0, ua $$1) {
      return $$2 -> {
         cvm $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(ua $$0) {
      return up.a($$0, this.e, true);
   }

   public static void a(jz<cvm> $$0, csz $$1, Consumer<ua> $$2) {
      cvm $$3 = $$1.a($$0, a).a($$2);
      if ($$3.e.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(jz<cvm> $$0, csz $$1, ua $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cvm a(Consumer<ua> $$0) {
      ua $$1 = this.e.h();
      $$0.accept($$1);
      return new cvm($$1);
   }

   public void a(brh $$0) {
      ua $$1 = $$0.f(new ua());
      UUID $$2 = $$0.cx();
      $$1.a(this.e);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dnm $$0, iy.a $$1) {
      ua $$2 = $$0.d($$1);
      ua $$3 = $$2.h();
      $$2.a(this.e);
      if (!$$2.equals($$3)) {
         $$0.a($$2, $$1);
         $$0.e();
         return true;
      } else {
         return false;
      }
   }

   public <T> DataResult<cvm> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, uo.a, uo.a.mapBuilder()).build(this.e).map($$0x -> new cvm((ua)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<ux> $$1 = ac.a(uo.a.e(this.e), IllegalStateException::new);
      return $$0.decode(uo.a, $$1);
   }

   public int a() {
      return this.e.f();
   }

   public boolean b() {
      return this.e.g();
   }

   public ua c() {
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
         return $$0 instanceof cvm $$1 ? this.e.equals($$1.e) : false;
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
   public ua d() {
      return this.e;
   }
}
