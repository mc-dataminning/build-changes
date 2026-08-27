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

public final class cxf {
   public static final cxf a = new cxf(new uk());
   public static final Codec<cxf> b = uk.a.xmap(cxf::new, $$0 -> $$0.e);
   public static final Codec<cxf> c = axu.b(
      b, (Function<cxf, DataResult<cxf>>)($$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0))
   );
   @Deprecated
   public static final zc<ByteBuf, cxf> d = za.o.a(cxf::new, $$0 -> $$0.e);
   private final uk e;

   private cxf(uk $$0) {
      this.e = $$0;
   }

   public static cxf a(uk $$0) {
      return new cxf($$0.h());
   }

   public static Predicate<cuh> a(kd<cxf> $$0, uk $$1) {
      return $$2 -> {
         cxf $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(uk $$0) {
      return uz.a($$0, this.e, true);
   }

   public static void a(kd<cxf> $$0, cuh $$1, Consumer<uk> $$2) {
      cxf $$3 = $$1.a($$0, a).a($$2);
      if ($$3.e.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kd<cxf> $$0, cuh $$1, uk $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cxf a(Consumer<uk> $$0) {
      uk $$1 = this.e.h();
      $$0.accept($$1);
      return new cxf($$1);
   }

   public void a(brv $$0) {
      uk $$1 = $$0.f(new uk());
      UUID $$2 = $$0.cE();
      $$1.a(this.e);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dqc $$0, jc.a $$1) {
      uk $$2 = $$0.d($$1);
      uk $$3 = $$2.h();
      $$2.a(this.e);
      if (!$$2.equals($$3)) {
         $$0.a($$2, $$1);
         $$0.e();
         return true;
      } else {
         return false;
      }
   }

   public <T> DataResult<cxf> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, uy.a, uy.a.mapBuilder()).build(this.e).map($$0x -> new cxf((uk)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<vh> $$1 = ad.a(uy.a.e(this.e), IllegalStateException::new);
      return $$0.decode(uy.a, $$1);
   }

   public int a() {
      return this.e.f();
   }

   public boolean b() {
      return this.e.g();
   }

   public uk c() {
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
         return $$0 instanceof cxf $$1 ? this.e.equals($$1.e) : false;
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
   public uk d() {
      return this.e;
   }
}
