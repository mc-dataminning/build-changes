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
import org.slf4j.Logger;

public final class cwr {
   private static final Logger e = LogUtils.getLogger();
   public static final cwr a = new cwr(new tx());
   public static final Codec<cwr> b = Codec.withAlternative(tx.a, uv.i).xmap(cwr::new, $$0 -> $$0.f);
   public static final Codec<cwr> c = b.validate(
      $$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final ys<ByteBuf, cwr> d = yq.o.a(cwr::new, $$0 -> $$0.f);
   private final tx f;

   private cwr(tx $$0) {
      this.f = $$0;
   }

   public static cwr a(tx $$0) {
      return new cwr($$0.i());
   }

   public static Predicate<cud> a(km<cwr> $$0, tx $$1) {
      return $$2 -> {
         cwr $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(tx $$0) {
      return um.a($$0, this.f, true);
   }

   public static void a(km<cwr> $$0, cud $$1, Consumer<tx> $$2) {
      cwr $$3 = $$1.a($$0, a).a($$2);
      if ($$3.f.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(km<cwr> $$0, cud $$1, tx $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cwr a(Consumer<tx> $$0) {
      tx $$1 = this.f.i();
      $$0.accept($$1);
      return new cwr($$1);
   }

   public void a(bsh $$0) {
      tx $$1 = $$0.f(new tx());
      UUID $$2 = $$0.cB();
      $$1.a(this.f);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dpq $$0, jl.a $$1) {
      tx $$2 = $$0.e($$1);
      tx $$3 = $$2.i();
      $$2.a(this.f);
      if (!$$2.equals($$3)) {
         try {
            $$0.d($$2, $$1);
            $$0.e();
            return true;
         } catch (Exception var8) {
            e.warn("Failed to apply custom data to block entity at {}", $$0.az_(), var8);

            try {
               $$0.d($$3, $$1);
            } catch (Exception var7) {
               e.warn("Failed to rollback block entity at {} after failure", $$0.az_(), var7);
            }
         }
      }

      return false;
   }

   public <T> DataResult<cwr> a(DynamicOps<uu> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.f).map($$0x -> new cwr((tx)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(ul.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<uu> $$0, MapDecoder<T> $$1) {
      MapLike<uu> $$2 = (MapLike<uu>)$$0.getMap(this.f).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int a() {
      return this.f.f();
   }

   public boolean b() {
      return this.f.g();
   }

   public tx c() {
      return this.f.i();
   }

   public boolean a(String $$0) {
      return this.f.e($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof cwr $$1 ? this.f.equals($$1.f) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.f.hashCode();
   }

   @Override
   public String toString() {
      return this.f.toString();
   }

   @Deprecated
   public tx d() {
      return this.f;
   }
}
