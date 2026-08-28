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

public final class cyh {
   private static final Logger e = LogUtils.getLogger();
   public static final cyh a = new cyh(new ug());
   public static final Codec<cyh> b = Codec.withAlternative(ug.a, ve.i).xmap(cyh::new, $$0 -> $$0.f);
   public static final Codec<cyh> c = b.validate(
      $$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final zc<ByteBuf, cyh> d = za.p.a(cyh::new, $$0 -> $$0.f);
   private final ug f;

   private cyh(ug $$0) {
      this.f = $$0;
   }

   public static cyh a(ug $$0) {
      return new cyh($$0.i());
   }

   public static Predicate<cvs> a(kr<cyh> $$0, ug $$1) {
      return $$2 -> {
         cyh $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(ug $$0) {
      return uv.a($$0, this.f, true);
   }

   public static void a(kr<cyh> $$0, cvs $$1, Consumer<ug> $$2) {
      cyh $$3 = $$1.a($$0, a).a($$2);
      if ($$3.f.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kr<cyh> $$0, cvs $$1, ug $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cyh a(Consumer<ug> $$0) {
      ug $$1 = this.f.i();
      $$0.accept($$1);
      return new cyh($$1);
   }

   public void a(btr $$0) {
      ug $$1 = $$0.f(new ug());
      UUID $$2 = $$0.cD();
      $$1.a(this.f);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(drv $$0, jq.a $$1) {
      ug $$2 = $$0.e($$1);
      ug $$3 = $$2.i();
      $$2.a(this.f);
      if (!$$2.equals($$3)) {
         try {
            $$0.d($$2, $$1);
            $$0.e();
            return true;
         } catch (Exception var8) {
            e.warn("Failed to apply custom data to block entity at {}", $$0.aC_(), var8);

            try {
               $$0.d($$3, $$1);
            } catch (Exception var7) {
               e.warn("Failed to rollback block entity at {} after failure", $$0.aC_(), var7);
            }
         }
      }

      return false;
   }

   public <T> DataResult<cyh> a(DynamicOps<vd> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.f).map($$0x -> new cyh((ug)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(uu.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<vd> $$0, MapDecoder<T> $$1) {
      MapLike<vd> $$2 = (MapLike<vd>)$$0.getMap(this.f).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int a() {
      return this.f.f();
   }

   public boolean b() {
      return this.f.g();
   }

   public ug c() {
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
         return $$0 instanceof cyh $$1 ? this.f.equals($$1.f) : false;
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
   public ug d() {
      return this.f;
   }
}
