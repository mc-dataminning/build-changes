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
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dcs {
   private static final Logger e = LogUtils.getLogger();
   public static final dcs a = new dcs(new ua());
   private static final String f = "id";
   public static final Codec<dcs> b = Codec.withAlternative(ua.a, vb.e).xmap(dcs::new, $$0 -> $$0.g);
   public static final Codec<dcs> c = b.validate(
      $$0 -> $$0.e().i("id").isPresent() ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final ze<ByteBuf, dcs> d = zc.s.a(dcs::new, $$0 -> $$0.g);
   private final ua g;

   private dcs(ua $$0) {
      this.g = $$0;
   }

   public static dcs a(ua $$0) {
      return new dcs($$0.l());
   }

   public boolean b(ua $$0) {
      return up.a($$0, this.g, true);
   }

   public static void a(kk<dcs> $$0, dak $$1, Consumer<ua> $$2) {
      dcs $$3 = $$1.a($$0, a).a($$2);
      if ($$3.g.j()) {
         $$1.e($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kk<dcs> $$0, dak $$1, ua $$2) {
      if (!$$2.j()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.e($$0);
      }
   }

   public dcs a(Consumer<ua> $$0) {
      ua $$1 = this.g.l();
      $$0.accept($$1);
      return new dcs($$1);
   }

   @Nullable
   public alr a() {
      return this.g.<alr>a("id", alr.a).orElse(null);
   }

   @Nullable
   public <T> T a(ji.a $$0, alq<? extends jt<T>> $$1) {
      alr $$2 = this.a();
      return $$2 == null ? null : $$0.a($$1).flatMap($$2x -> $$2x.a(alq.a($$1, $$2))).map(jg::a).orElse(null);
   }

   public void a(bxe $$0) {
      ua $$1 = $$0.h(new ua());
      UUID $$2 = $$0.cG();
      $$1.a(this.g);
      $$0.i($$1);
      $$0.a_($$2);
   }

   public boolean a(dyo $$0, ji.a $$1) {
      ua $$2 = $$0.e($$1);
      ua $$3 = $$2.l();
      $$2.a(this.g);
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

   public <T> DataResult<dcs> a(DynamicOps<va> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.g).map($$0x -> new dcs((ua)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(uo.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<va> $$0, MapDecoder<T> $$1) {
      MapLike<va> $$2 = (MapLike<va>)$$0.getMap(this.g).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int b() {
      return this.g.i();
   }

   public boolean c() {
      return this.g.j();
   }

   public ua d() {
      return this.g.l();
   }

   public boolean a(String $$0) {
      return this.g.b($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof dcs $$1 ? this.g.equals($$1.g) : false;
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
   public ua e() {
      return this.g;
   }
}
