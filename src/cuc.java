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

public final class cuc {
   public static final cuc a = new cuc(new to());
   public static final Codec<cuc> b = to.a.xmap(cuc::new, $$0 -> $$0.e);
   public static final Codec<cuc> c = awu.b(
      b, (Function<cuc, DataResult<cuc>>)($$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0))
   );
   @Deprecated
   public static final yg<ByteBuf, cuc> d = ye.n.a(cuc::new, $$0 -> $$0.e);
   private final to e;

   private cuc(to $$0) {
      this.e = $$0;
   }

   public static cuc a(to $$0) {
      return new cuc($$0.h());
   }

   public static Predicate<crs> a(jq<cuc> $$0, to $$1) {
      return $$2 -> {
         cuc $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(to $$0) {
      return ud.a($$0, this.e, true);
   }

   public static void a(jq<cuc> $$0, crs $$1, Consumer<to> $$2) {
      cuc $$3 = $$1.a($$0, a).a($$2);
      if ($$3.e.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(jq<cuc> $$0, crs $$1, to $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cuc a(Consumer<to> $$0) {
      to $$1 = this.e.h();
      $$0.accept($$1);
      return new cuc($$1);
   }

   public void a(bqa $$0) {
      to $$1 = $$0.f(new to());
      UUID $$2 = $$0.cw();
      $$1.a(this.e);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dmo $$0, ip.a $$1) {
      to $$2 = $$0.d($$1);
      to $$3 = $$2.h();
      $$2.a(this.e);
      if (!$$2.equals($$3)) {
         $$0.a($$2, $$1);
         $$0.e();
         return true;
      } else {
         return false;
      }
   }

   public <T> DataResult<cuc> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, uc.a, uc.a.mapBuilder()).build(this.e).map($$0x -> new cuc((to)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<ul> $$1 = ac.a(uc.a.e(this.e), IllegalStateException::new);
      return $$0.decode(uc.a, $$1);
   }

   public int a() {
      return this.e.f();
   }

   public boolean b() {
      return this.e.g();
   }

   public to c() {
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
         return $$0 instanceof cuc $$1 ? this.e.equals($$1.e) : false;
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
   public to d() {
      return this.e;
   }
}
