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

public final class cye {
   private static final Logger e = LogUtils.getLogger();
   public static final cye a = new cye(new uf());
   public static final Codec<cye> b = Codec.withAlternative(uf.a, vd.i).xmap(cye::new, $$0 -> $$0.f);
   public static final Codec<cye> c = b.validate(
      $$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final zb<ByteBuf, cye> d = yz.o.a(cye::new, $$0 -> $$0.f);
   private final uf f;

   private cye(uf $$0) {
      this.f = $$0;
   }

   public static cye a(uf $$0) {
      return new cye($$0.i());
   }

   public static Predicate<cvp> a(kq<cye> $$0, uf $$1) {
      return $$2 -> {
         cye $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(uf $$0) {
      return uu.a($$0, this.f, true);
   }

   public static void a(kq<cye> $$0, cvp $$1, Consumer<uf> $$2) {
      cye $$3 = $$1.a($$0, a).a($$2);
      if ($$3.f.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kq<cye> $$0, cvp $$1, uf $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cye a(Consumer<uf> $$0) {
      uf $$1 = this.f.i();
      $$0.accept($$1);
      return new cye($$1);
   }

   public void a(bto $$0) {
      uf $$1 = $$0.f(new uf());
      UUID $$2 = $$0.cD();
      $$1.a(this.f);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(drs $$0, jp.a $$1) {
      uf $$2 = $$0.e($$1);
      uf $$3 = $$2.i();
      $$2.a(this.f);
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

   public <T> DataResult<cye> a(DynamicOps<vc> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.f).map($$0x -> new cye((uf)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(ut.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<vc> $$0, MapDecoder<T> $$1) {
      MapLike<vc> $$2 = (MapLike<vc>)$$0.getMap(this.f).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int a() {
      return this.f.f();
   }

   public boolean b() {
      return this.f.g();
   }

   public uf c() {
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
         return $$0 instanceof cye $$1 ? this.f.equals($$1.f) : false;
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
   public uf d() {
      return this.f;
   }
}
