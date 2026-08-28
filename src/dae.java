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

public final class dae {
   private static final Logger e = LogUtils.getLogger();
   public static final dae a = new dae(new tw());
   private static final String f = "id";
   public static final Codec<dae> b = Codec.withAlternative(tw.a, uu.i).xmap(dae::new, $$0 -> $$0.g);
   public static final Codec<dae> c = b.validate(
      $$0 -> $$0.e().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final yt<ByteBuf, dae> d = yr.r.a(dae::new, $$0 -> $$0.g);
   private final tw g;

   private dae(tw $$0) {
      this.g = $$0;
   }

   public static dae a(tw $$0) {
      return new dae($$0.i());
   }

   public static Predicate<cxy> a(kw<dae> $$0, tw $$1) {
      return $$2 -> {
         dae $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(tw $$0) {
      return ul.a($$0, this.g, true);
   }

   public static void a(kw<dae> $$0, cxy $$1, Consumer<tw> $$2) {
      dae $$3 = $$1.a($$0, a).a($$2);
      if ($$3.g.g()) {
         $$1.e($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kw<dae> $$0, cxy $$1, tw $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.e($$0);
      }
   }

   public dae a(Consumer<tw> $$0) {
      tw $$1 = this.g.i();
      $$0.accept($$1);
      return new dae($$1);
   }

   @Nullable
   public ald a() {
      return !this.g.b("id", 8) ? null : ald.c(this.g.l("id"));
   }

   @Nullable
   public <T> T a(ju.a $$0, alc<? extends kf<T>> $$1) {
      ald $$2 = this.a();
      return $$2 == null ? null : $$0.a($$1).flatMap($$2x -> $$2x.a(alc.a($$1, $$2))).map(js::a).orElse(null);
   }

   public void a(bvs $$0) {
      tw $$1 = $$0.f(new tw());
      UUID $$2 = $$0.cG();
      $$1.a(this.g);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dvl $$0, ju.a $$1) {
      tw $$2 = $$0.e($$1);
      tw $$3 = $$2.i();
      $$2.a(this.g);
      if (!$$2.equals($$3)) {
         try {
            $$0.d($$2, $$1);
            $$0.e();
            return true;
         } catch (Exception var8) {
            e.warn("Failed to apply custom data to block entity at {}", $$0.aw_(), var8);

            try {
               $$0.d($$3, $$1);
            } catch (Exception var7) {
               e.warn("Failed to rollback block entity at {} after failure", $$0.aw_(), var7);
            }
         }
      }

      return false;
   }

   public <T> DataResult<dae> a(DynamicOps<ut> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.g).map($$0x -> new dae((tw)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(uk.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<ut> $$0, MapDecoder<T> $$1) {
      MapLike<ut> $$2 = (MapLike<ut>)$$0.getMap(this.g).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int b() {
      return this.g.f();
   }

   public boolean c() {
      return this.g.g();
   }

   public tw d() {
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
         return $$0 instanceof dae $$1 ? this.g.equals($$1.g) : false;
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
   public tw e() {
      return this.g;
   }
}
