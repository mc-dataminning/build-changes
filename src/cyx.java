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

public final class cyx {
   private static final Logger e = LogUtils.getLogger();
   public static final cyx a = new cyx(new tq());
   private static final String f = "id";
   public static final Codec<cyx> b = Codec.withAlternative(tq.a, uo.i).xmap(cyx::new, $$0 -> $$0.g);
   public static final Codec<cyx> c = b.validate(
      $$0 -> $$0.e().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final yn<ByteBuf, cyx> d = yl.r.a(cyx::new, $$0 -> $$0.g);
   private final tq g;

   private cyx(tq $$0) {
      this.g = $$0;
   }

   public static cyx a(tq $$0) {
      return new cyx($$0.i());
   }

   public static Predicate<cwo> a(ku<cyx> $$0, tq $$1) {
      return $$2 -> {
         cyx $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(tq $$0) {
      return uf.a($$0, this.g, true);
   }

   public static void a(ku<cyx> $$0, cwo $$1, Consumer<tq> $$2) {
      cyx $$3 = $$1.a($$0, a).a($$2);
      if ($$3.g.g()) {
         $$1.d($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(ku<cyx> $$0, cwo $$1, tq $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.d($$0);
      }
   }

   public cyx a(Consumer<tq> $$0) {
      tq $$1 = this.g.i();
      $$0.accept($$1);
      return new cyx($$1);
   }

   @Nullable
   public akv a() {
      return !this.g.b("id", 8) ? null : akv.c(this.g.l("id"));
   }

   @Nullable
   public <T> T a(jt.a $$0, aku<? extends ke<T>> $$1) {
      akv $$2 = this.a();
      return $$2 == null ? null : $$0.a($$1).flatMap($$2x -> $$2x.a(aku.a($$1, $$2))).map(jr::a).orElse(null);
   }

   public void a(buk $$0) {
      tq $$1 = $$0.f(new tq());
      UUID $$2 = $$0.cG();
      $$1.a(this.g);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dty $$0, jt.a $$1) {
      tq $$2 = $$0.e($$1);
      tq $$3 = $$2.i();
      $$2.a(this.g);
      if (!$$2.equals($$3)) {
         try {
            $$0.d($$2, $$1);
            $$0.e();
            return true;
         } catch (Exception var8) {
            e.warn("Failed to apply custom data to block entity at {}", $$0.aA_(), var8);

            try {
               $$0.d($$3, $$1);
            } catch (Exception var7) {
               e.warn("Failed to rollback block entity at {} after failure", $$0.aA_(), var7);
            }
         }
      }

      return false;
   }

   public <T> DataResult<cyx> a(DynamicOps<un> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.g).map($$0x -> new cyx((tq)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(ue.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<un> $$0, MapDecoder<T> $$1) {
      MapLike<un> $$2 = (MapLike<un>)$$0.getMap(this.g).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int b() {
      return this.g.f();
   }

   public boolean c() {
      return this.g.g();
   }

   public tq d() {
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
         return $$0 instanceof cyx $$1 ? this.g.equals($$1.g) : false;
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
   public tq e() {
      return this.g;
   }
}
