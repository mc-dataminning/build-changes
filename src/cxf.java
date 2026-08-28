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

public final class cxf {
   private static final Logger e = LogUtils.getLogger();
   public static final cxf a = new cxf(new ua());
   public static final Codec<cxf> b = Codec.withAlternative(ua.a, uy.i).xmap(cxf::new, $$0 -> $$0.f);
   public static final Codec<cxf> c = b.validate(
      $$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final yw<ByteBuf, cxf> d = yu.o.a(cxf::new, $$0 -> $$0.f);
   private final ua f;

   private cxf(ua $$0) {
      this.f = $$0;
   }

   public static cxf a(ua $$0) {
      return new cxf($$0.i());
   }

   public static Predicate<cuo> a(kp<cxf> $$0, ua $$1) {
      return $$2 -> {
         cxf $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(ua $$0) {
      return up.a($$0, this.f, true);
   }

   public static void a(kp<cxf> $$0, cuo $$1, Consumer<ua> $$2) {
      cxf $$3 = $$1.a($$0, a).a($$2);
      if ($$3.f.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kp<cxf> $$0, cuo $$1, ua $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cxf a(Consumer<ua> $$0) {
      ua $$1 = this.f.i();
      $$0.accept($$1);
      return new cxf($$1);
   }

   public void a(bsq $$0) {
      ua $$1 = $$0.f(new ua());
      UUID $$2 = $$0.cA();
      $$1.a(this.f);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dqf $$0, jo.a $$1) {
      ua $$2 = $$0.e($$1);
      ua $$3 = $$2.i();
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

   public <T> DataResult<cxf> a(DynamicOps<ux> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.f).map($$0x -> new cxf((ua)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(uo.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<ux> $$0, MapDecoder<T> $$1) {
      MapLike<ux> $$2 = (MapLike<ux>)$$0.getMap(this.f).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int a() {
      return this.f.f();
   }

   public boolean b() {
      return this.f.g();
   }

   public ua c() {
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
         return $$0 instanceof cxf $$1 ? this.f.equals($$1.f) : false;
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
   public ua d() {
      return this.f;
   }
}
