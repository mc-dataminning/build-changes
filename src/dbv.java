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

public final class dbv implements dcs {
   private static final Logger e = LogUtils.getLogger();
   public static final dbv a = new dbv(new tz());
   private static final String f = "id";
   public static final Codec<dbv> b = Codec.withAlternative(tz.a, ux.i).xmap(dbv::new, $$0 -> $$0.i);
   public static final Codec<dbv> c = b.validate(
      $$0 -> $$0.e().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final yw<ByteBuf, dbv> d = yu.s.a(dbv::new, $$0 -> $$0.i);
   private static final alg g = dxt.j.a().h().a();
   private static final alg h = dxt.R.a().h().a();
   private final tz i;

   private dbv(tz $$0) {
      this.i = $$0;
   }

   public static dbv a(tz $$0) {
      return new dbv($$0.i());
   }

   public static Predicate<czn> a(kj<dbv> $$0, tz $$1) {
      return $$2 -> {
         dbv $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(tz $$0) {
      return uo.a($$0, this.i, true);
   }

   public static void a(kj<dbv> $$0, czn $$1, Consumer<tz> $$2) {
      dbv $$3 = $$1.a($$0, a).a($$2);
      if ($$3.i.g()) {
         $$1.e($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kj<dbv> $$0, czn $$1, tz $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.e($$0);
      }
   }

   public dbv a(Consumer<tz> $$0) {
      tz $$1 = this.i.i();
      $$0.accept($$1);
      return new dbv($$1);
   }

   @Nullable
   public alg a() {
      return this.i.<alg>a("id", alg.a).orElse(null);
   }

   @Nullable
   public <T> T a(jh.a $$0, alf<? extends js<T>> $$1) {
      alg $$2 = this.a();
      return $$2 == null ? null : $$0.a($$1).flatMap($$2x -> $$2x.a(alf.a($$1, $$2))).map(jf::a).orElse(null);
   }

   public void a(bwi $$0) {
      tz $$1 = $$0.f(new tz());
      UUID $$2 = $$0.cF();
      $$1.a(this.i);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dxr $$0, jh.a $$1) {
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

   public <T> DataResult<dbv> a(DynamicOps<uw> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.i).map($$0x -> new dbv((tz)$$0x));
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
      return this.i.c($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof dbv $$1 ? this.i.equals($$1.i) : false;
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
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      alg $$4 = alg.c(this.i.j("id"));
      if (g.equals($$4) || h.equals($$4)) {
         dkh.a(this, $$1, "SpawnData");
      }
   }
}
