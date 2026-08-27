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

public final class ctt {
   public static final ctt a = new ctt(new tm());
   public static final Codec<ctt> b = tm.a.xmap(ctt::new, $$0 -> $$0.e);
   public static final Codec<ctt> c = aws.b(
      b, (Function<ctt, DataResult<ctt>>)($$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0))
   );
   @Deprecated
   public static final ye<ByteBuf, ctt> d = yc.n.a(ctt::new, $$0 -> $$0.e);
   private final tm e;

   private ctt(tm $$0) {
      this.e = $$0;
   }

   public static ctt a(tm $$0) {
      return new ctt($$0.h());
   }

   public static Predicate<crj> a(jo<ctt> $$0, tm $$1) {
      return $$2 -> {
         ctt $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(tm $$0) {
      return ub.a($$0, this.e, true);
   }

   public static void a(jo<ctt> $$0, crj $$1, Consumer<tm> $$2) {
      ctt $$3 = $$1.a($$0, a).a($$2);
      if ($$3.e.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(jo<ctt> $$0, crj $$1, tm $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public ctt a(Consumer<tm> $$0) {
      tm $$1 = this.e.h();
      $$0.accept($$1);
      return new ctt($$1);
   }

   public void a(bpv $$0) {
      tm $$1 = $$0.f(new tm());
      UUID $$2 = $$0.cw();
      $$1.a(this.e);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dmf $$0, in.a $$1) {
      tm $$2 = $$0.d($$1);
      tm $$3 = $$2.h();
      $$2.a(this.e);
      if (!$$2.equals($$3)) {
         $$0.a($$2, $$1);
         $$0.e();
         return true;
      } else {
         return false;
      }
   }

   public <T> DataResult<ctt> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, ua.a, ua.a.mapBuilder()).build(this.e).map($$0x -> new ctt((tm)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<uj> $$1 = ac.a(ua.a.e(this.e), IllegalStateException::new);
      return $$0.decode(ua.a, $$1);
   }

   public int a() {
      return this.e.f();
   }

   public boolean b() {
      return this.e.g();
   }

   public tm c() {
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
         return $$0 instanceof ctt $$1 ? this.e.equals($$1.e) : false;
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
   public tm d() {
      return this.e;
   }
}
