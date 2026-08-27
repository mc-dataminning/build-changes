import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class cwf {
   public static final cwf a = new cwf(new ud());
   public static final Codec<cwf> b = ud.a.xmap(cwf::new, $$0 -> $$0.e);
   public static final Codec<cwf> c = b.validate(
      $$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final yv<ByteBuf, cwf> d = yt.n.a(cwf::new, $$0 -> $$0.e);
   private final ud e;

   private cwf(ud $$0) {
      this.e = $$0;
   }

   public static cwf a(ud $$0) {
      return new cwf($$0.h());
   }

   public static Predicate<ctq> a(ka<cwf> $$0, ud $$1) {
      return $$2 -> {
         cwf $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(ud $$0) {
      return us.a($$0, this.e, true);
   }

   public static void a(ka<cwf> $$0, ctq $$1, Consumer<ud> $$2) {
      cwf $$3 = $$1.a($$0, a).a($$2);
      if ($$3.e.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(ka<cwf> $$0, ctq $$1, ud $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cwf a(Consumer<ud> $$0) {
      ud $$1 = this.e.h();
      $$0.accept($$1);
      return new cwf($$1);
   }

   public void a(brw $$0) {
      ud $$1 = $$0.f(new ud());
      UUID $$2 = $$0.cz();
      $$1.a(this.e);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(doi $$0, iz.a $$1) {
      ud $$2 = $$0.e($$1);
      ud $$3 = $$2.h();
      $$2.a(this.e);
      if (!$$2.equals($$3)) {
         $$0.d($$2, $$1);
         $$0.e();
         return true;
      } else {
         return false;
      }
   }

   public <T> DataResult<cwf> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, ur.a, ur.a.mapBuilder()).build(this.e).map($$0x -> new cwf((ud)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<va> $$1 = (MapLike<va>)ur.a.e(this.e).getOrThrow();
      return $$0.decode(ur.a, $$1);
   }

   public int a() {
      return this.e.f();
   }

   public boolean b() {
      return this.e.g();
   }

   public ud c() {
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
         return $$0 instanceof cwf $$1 ? this.e.equals($$1.e) : false;
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
   public ud d() {
      return this.e;
   }
}
