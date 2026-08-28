import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.slf4j.Logger;

public final class cxg {
   private static final Logger e = LogUtils.getLogger();
   public static final cxg a = new cxg(new us());
   public static final Codec<cxg> b = us.a.xmap(cxg::new, $$0 -> $$0.f);
   public static final Codec<cxg> c = b.validate(
      $$0 -> $$0.d().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final zn<ByteBuf, cxg> d = zl.o.a(cxg::new, $$0 -> $$0.f);
   private final us f;

   private cxg(us $$0) {
      this.f = $$0;
   }

   public static cxg a(us $$0) {
      return new cxg($$0.i());
   }

   public static Predicate<cur> a(kl<cxg> $$0, us $$1) {
      return $$2 -> {
         cxg $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(us $$0) {
      return vh.a($$0, this.f, true);
   }

   public static void a(kl<cxg> $$0, cur $$1, Consumer<us> $$2) {
      cxg $$3 = $$1.a($$0, a).a($$2);
      if ($$3.f.g()) {
         $$1.c($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kl<cxg> $$0, cur $$1, us $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.c($$0);
      }
   }

   public cxg a(Consumer<us> $$0) {
      us $$1 = this.f.i();
      $$0.accept($$1);
      return new cxg($$1);
   }

   public void a(bsw $$0) {
      us $$1 = $$0.f(new us());
      UUID $$2 = $$0.cz();
      $$1.a(this.f);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dpj $$0, jk.a $$1) {
      us $$2 = $$0.e($$1);
      us $$3 = $$2.i();
      $$2.a(this.f);
      if (!$$2.equals($$3)) {
         try {
            $$0.d($$2, $$1);
            $$0.e();
            return true;
         } catch (Exception var8) {
            e.warn("Failed to apply custom data to block entity at {}", $$0.ay_(), var8);

            try {
               $$0.d($$3, $$1);
            } catch (Exception var7) {
               e.warn("Failed to rollback block entity at {} after failure", $$0.ay_(), var7);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public <T> DataResult<cxg> a(MapEncoder<T> $$0, T $$1) {
      return $$0.encode($$1, vg.a, vg.a.mapBuilder()).build(this.f).map($$0x -> new cxg((us)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      MapLike<vp> $$1 = (MapLike<vp>)vg.a.e(this.f).getOrThrow();
      return $$0.decode(vg.a, $$1);
   }

   public int a() {
      return this.f.f();
   }

   public boolean b() {
      return this.f.g();
   }

   public us c() {
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
         return $$0 instanceof cxg $$1 ? this.f.equals($$1.f) : false;
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
   public us d() {
      return this.f;
   }
}
