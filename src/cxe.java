import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class cxe {
   public static final cxe a = new cxe(new us());
   public static final Codec<cxe> b = us.a.xmap(cxe::new, $$0 -> $$0.e);
   public static final Codec<cxe> c = b.validate(
      $$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final zn<ByteBuf, cxe> d = zl.o.a(cxe::new, $$0 -> $$0.e);
   private final us e;

   private cxe(us $$0) {
      this.e = $$0;
   }

   public static cxe a(us $$0) {
      return new cxe($$0.i());
   }

   public static Predicate<cup> a(kl<cxe> $$0, us $$1) {
      return $$2 -> {
         cxe $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(us $$0) {
      return vh.a($$0, this.e, true);
   }

   public static void a(kl<cxe> $$0, cup $$1, Consumer<us> $$2) {
      cxe $$3 = $$1.a($$0, a).a($$2);
      if ($$3.e.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kl<cxe> $$0, cup $$1, us $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cxe a(Consumer<us> $$0) {
      us $$1 = this.e.i();
      $$0.accept($$1);
      return new cxe($$1);
   }

   public void a(bsu $$0) {
      us $$1 = $$0.f(new us());
      UUID $$2 = $$0.cz();
      $$1.a(this.e);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dph $$0, jk.a $$1) {
      us $$2 = $$0.e($$1);
      us $$3 = $$2.i();
      $$2.a(this.e);
      if (!$$2.equals($$3)) {
         $$0.d($$2, $$1);
         $$0.e();
         return true;
      } else {
         return false;
      }
   }

   public <T> DataResult<cxe> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, vg.a, vg.a.mapBuilder()).build(this.e).map($$0x -> new cxe((us)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<vp> $$1 = (MapLike<vp>)vg.a.e(this.e).getOrThrow();
      return $$0.decode(vg.a, $$1);
   }

   public int a() {
      return this.e.f();
   }

   public boolean b() {
      return this.e.g();
   }

   public us c() {
      return this.e.i();
   }

   public boolean a(String $$0) {
      return this.e.e($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof cxe $$1 ? this.e.equals($$1.e) : false;
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
   public us d() {
      return this.e;
   }
}
