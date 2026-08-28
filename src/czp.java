import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class czp {
   private static final Logger e = LogUtils.getLogger();
   public static final czp a = new czp(new um());
   private static final String f = "id";
   public static final Codec<czp> b = Codec.withAlternative(um.a, vk.i).xmap(czp::new, $$0 -> $$0.g);
   public static final Codec<czp> c = b.validate(
      $$0 -> $$0.e().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final zi<ByteBuf, czp> d = zg.r.a(czp::new, $$0 -> $$0.g);
   private final um g;

   private czp(um $$0) {
      this.g = $$0;
   }

   public static czp a(um $$0) {
      return new czp($$0.i());
   }

   public static Predicate<cxg> a(kt<czp> $$0, um $$1) {
      return $$2 -> {
         czp $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(um $$0) {
      return vb.a($$0, this.g, true);
   }

   public static void a(kt<czp> $$0, cxg $$1, Consumer<um> $$2) {
      czp $$3 = $$1.a($$0, a).a($$2);
      if ($$3.g.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kt<czp> $$0, cxg $$1, um $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public czp a(Consumer<um> $$0) {
      um $$1 = this.g.i();
      $$0.accept($$1);
      return new czp($$1);
   }

   @Nullable
   public alp a() {
      return !this.g.b("id", 8) ? null : alp.c(this.g.l("id"));
   }

   public void a(bvb $$0) {
      um $$1 = $$0.f(new um());
      UUID $$2 = $$0.cG();
      $$1.a(this.g);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(duq $$0, js.a $$1) {
      um $$2 = $$0.e($$1);
      um $$3 = $$2.i();
      $$2.a(this.g);
      if (!$$2.equals($$3)) {
         try {
            $$0.d($$2, $$1);
            $$0.e();
            return true;
         } catch (Exception var8) {
            e.warn("Failed to apply custom data to block entity at {}", $$0.aB_(), var8);

            try {
               $$0.d($$3, $$1);
            } catch (Exception var7) {
               e.warn("Failed to rollback block entity at {} after failure", $$0.aB_(), var7);
            }
         }
      }

      return false;
   }

   public <T> DataResult<czp> a(DynamicOps<vj> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.g).map($$0x -> new czp((um)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(va.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<vj> $$0, MapDecoder<T> $$1) {
      MapLike<vj> $$2 = (MapLike<vj>)$$0.getMap(this.g).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int b() {
      return this.g.f();
   }

   public boolean c() {
      return this.g.g();
   }

   public um d() {
      return this.g.i();
   }

   public boolean a(String $$0) {
      return this.g.e($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof czp $$1 ? this.g.equals($$1.g) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.g.hashCode();
   }

   @Override
   public String toString() {
      return this.g.toString();
   }

   @Deprecated
   public um e() {
      return this.g;
   }
}
