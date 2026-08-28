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

public final class dba implements dbx {
   private static final Logger e = LogUtils.getLogger();
   public static final dba a = new dba(new tx());
   private static final String f = "id";
   public static final Codec<dba> b = Codec.withAlternative(tx.a, uv.i).xmap(dba::new, $$0 -> $$0.i);
   public static final Codec<dba> c = b.validate(
      $$0 -> $$0.e().b("id", 8) ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final yu<ByteBuf, dba> d = ys.r.a(dba::new, $$0 -> $$0.i);
   private static final ale g = dwp.j.a().h().a();
   private static final ale h = dwp.R.a().h().a();
   private final tx i;

   private dba(tx $$0) {
      this.i = $$0;
   }

   public static dba a(tx $$0) {
      return new dba($$0.i());
   }

   public static Predicate<cys> a(ki<dba> $$0, tx $$1) {
      return $$2 -> {
         dba $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(tx $$0) {
      return um.a($$0, this.i, true);
   }

   public static void a(ki<dba> $$0, cys $$1, Consumer<tx> $$2) {
      dba $$3 = $$1.a($$0, a).a($$2);
      if ($$3.i.g()) {
         $$1.e($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(ki<dba> $$0, cys $$1, tx $$2) {
      if (!$$2.g()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.e($$0);
      }
   }

   public dba a(Consumer<tx> $$0) {
      tx $$1 = this.i.i();
      $$0.accept($$1);
      return new dba($$1);
   }

   @Nullable
   public ale a() {
      return !this.i.b("id", 8) ? null : ale.c(this.i.l("id"));
   }

   @Nullable
   public <T> T a(jg.a $$0, ald<? extends jr<T>> $$1) {
      ale $$2 = this.a();
      return $$2 == null ? null : $$0.a($$1).flatMap($$2x -> $$2x.a(ald.a($$1, $$2))).map(je::a).orElse(null);
   }

   public void a(bwa $$0) {
      tx $$1 = $$0.f(new tx());
      UUID $$2 = $$0.cG();
      $$1.a(this.i);
      $$0.g($$1);
      $$0.a_($$2);
   }

   public boolean a(dwn $$0, jg.a $$1) {
      tx $$2 = $$0.e($$1);
      tx $$3 = $$2.i();
      $$2.a(this.i);
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

   public <T> DataResult<dba> a(DynamicOps<uu> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.i).map($$0x -> new dba((tx)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(ul.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<uu> $$0, MapDecoder<T> $$1) {
      MapLike<uu> $$2 = (MapLike<uu>)$$0.getMap(this.i).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int b() {
      return this.i.f();
   }

   public boolean c() {
      return this.i.g();
   }

   public tx d() {
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
         return $$0 instanceof dba $$1 ? this.i.equals($$1.i) : false;
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
   public tx e() {
      return this.i;
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      ale $$4 = ale.c(this.i.l("id"));
      if (g.equals($$4) || h.equals($$4)) {
         djk.a(this, $$1, "SpawnData");
      }
   }
}
