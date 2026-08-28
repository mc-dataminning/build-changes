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

public final class dbl implements dci {
   private static final Logger e = LogUtils.getLogger();
   public static final dbl a = new dbl(new tz());
   private static final String f = "id";
   public static final Codec<dbl> b = Codec.withAlternative(tz.a, ux.i).xmap(dbl::new, $$0 -> $$0.i);
   public static final Codec<dbl> c = b.validate(
      $$0 -> $$0.e().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final yw<ByteBuf, dbl> d = yu.r.a(dbl::new, $$0 -> $$0.i);
   private static final alg g = dxh.j.a().h().a();
   private static final alg h = dxh.R.a().h().a();
   private final tz i;

   private dbl(tz $$0) {
      this.i = $$0;
   }

   public static dbl a(tz $$0) {
      return new dbl($$0.i());
   }

   public static Predicate<czd> a(ki<dbl> $$0, tz $$1) {
      return $$2 -> {
         dbl $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(tz $$0) {
      return uo.a($$0, this.i, true);
   }

   public static void a(ki<dbl> $$0, czd $$1, Consumer<tz> $$2) {
      dbl $$3 = $$1.a($$0, a).a($$2);
      if ($$3.i.g()) {
         $$1.e($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(ki<dbl> $$0, czd $$1, tz $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.e($$0);
      }
   }

   public dbl a(Consumer<tz> $$0) {
      tz $$1 = this.i.i();
      $$0.accept($$1);
      return new dbl($$1);
   }

   @Nullable
   public alg a() {
      return !this.i.b("id", 8) ? null : alg.c(this.i.l("id"));
   }

   @Nullable
   public <T> T a(jg.a $$0, alf<? extends jr<T>> $$1) {
      alg $$2 = this.a();
      return $$2 == null ? null : $$0.a($$1).flatMap($$2x -> $$2x.a(alf.a($$1, $$2))).map(je::a).orElse(null);
   }

   public void a(bwf $$0) {
      tz $$1 = $$0.f(new tz());
      UUID $$2 = $$0.cG();
      $$1.a(this.i);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dxf $$0, jg.a $$1) {
      tz $$2 = $$0.e($$1);
      tz $$3 = $$2.i();
      $$2.a(this.i);
      if (!$$2.equals($$3)) {
         try {
            $$0.d($$2, $$1);
            $$0.e();
            return true;
         } catch (Exception var8) {
            e.warn("Failed to apply custom data to block entity at {}", $$0.ax_(), var8);

            try {
               $$0.d($$3, $$1);
            } catch (Exception var7) {
               e.warn("Failed to rollback block entity at {} after failure", $$0.ax_(), var7);
            }
         }
      }

      return false;
   }

   public <T> DataResult<dbl> a(DynamicOps<uw> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.i).map($$0x -> new dbl((tz)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(un.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<uw> $$0, MapDecoder<T> $$1) {
      MapLike<uw> $$2 = (MapLike<uw>)$$0.getMap(this.i).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int b() {
      return this.i.f();
   }

   public boolean c() {
      return this.i.g();
   }

   public tz d() {
      return this.i.i();
   }

   public boolean a(String $$0) {
      return this.i.e($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof dbl $$1 ? this.i.equals($$1.i) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.i.hashCode();
   }

   @Override
   public String toString() {
      return this.i.toString();
   }

   @Deprecated
   public tz e() {
      return this.i;
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      alg $$4 = alg.c(this.i.l("id"));
      if (g.equals($$4) || h.equals($$4)) {
         djv.a(this, $$1, "SpawnData");
      }
   }
}
