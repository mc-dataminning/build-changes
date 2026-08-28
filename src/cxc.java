import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class cxc {
   public static final cxc a = new cxc(new ur());
   public static final Codec<cxc> b = ur.a.xmap(cxc::new, $$0 -> $$0.e);
   public static final Codec<cxc> c = b.validate(
      $$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final zm<ByteBuf, cxc> d = zk.o.a(cxc::new, $$0 -> $$0.e);
   private final ur e;

   private cxc(ur $$0) {
      this.e = $$0;
   }

   public static cxc a(ur $$0) {
      return new cxc($$0.h());
   }

   public static Predicate<cun> a(kl<cxc> $$0, ur $$1) {
      return $$2 -> {
         cxc $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(ur $$0) {
      return vg.a($$0, this.e, true);
   }

   public static void a(kl<cxc> $$0, cun $$1, Consumer<ur> $$2) {
      cxc $$3 = $$1.a($$0, a).a($$2);
      if ($$3.e.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kl<cxc> $$0, cun $$1, ur $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cxc a(Consumer<ur> $$0) {
      ur $$1 = this.e.h();
      $$0.accept($$1);
      return new cxc($$1);
   }

   public void a(bss $$0) {
      ur $$1 = $$0.f(new ur());
      UUID $$2 = $$0.cz();
      $$1.a(this.e);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dpf $$0, jk.a $$1) {
      ur $$2 = $$0.e($$1);
      ur $$3 = $$2.h();
      $$2.a(this.e);
      if (!$$2.equals($$3)) {
         $$0.d($$2, $$1);
         $$0.e();
         return true;
      } else {
         return false;
      }
   }

   public <T> DataResult<cxc> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, vf.a, vf.a.mapBuilder()).build(this.e).map($$0x -> new cxc((ur)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<vo> $$1 = (MapLike<vo>)vf.a.e(this.e).getOrThrow();
      return $$0.decode(vf.a, $$1);
   }

   public int a() {
      return this.e.f();
   }

   public boolean b() {
      return this.e.g();
   }

   public ur c() {
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
         return $$0 instanceof cxc $$1 ? this.e.equals($$1.e) : false;
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
   public ur d() {
      return this.e;
   }
}
