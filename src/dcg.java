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

public final class dcg implements ddd {
   private static final Logger e = LogUtils.getLogger();
   public static final dcg a = new dcg(new tz());
   private static final String f = "id";
   public static final Codec<dcg> b = Codec.withAlternative(tz.a, uz.e).xmap(dcg::new, $$0 -> $$0.i);
   public static final Codec<dcg> c = b.validate(
      $$0 -> $$0.e().i("id").isPresent() ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final yy<ByteBuf, dcg> d = yw.s.a(dcg::new, $$0 -> $$0.i);
   private static final ali g = dye.j.a().h().a();
   private static final ali h = dye.R.a().h().a();
   private final tz i;

   private dcg(tz $$0) {
      this.i = $$0;
   }

   public static dcg a(tz $$0) {
      return new dcg($$0.l());
   }

   public static Predicate<czy> a(kj<dcg> $$0, tz $$1) {
      return $$2 -> {
         dcg $$3 = $$2.a($$0, a);
         return $$3.b($$1);
      };
   }

   public boolean b(tz $$0) {
      return uo.a($$0, this.i, true);
   }

   public static void a(kj<dcg> $$0, czy $$1, Consumer<tz> $$2) {
      dcg $$3 = $$1.a($$0, a).a($$2);
      if ($$3.i.j()) {
         $$1.e($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kj<dcg> $$0, czy $$1, tz $$2) {
      if (!$$2.j()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.e($$0);
      }
   }

   public dcg a(Consumer<tz> $$0) {
      tz $$1 = this.i.l();
      $$0.accept($$1);
      return new dcg($$1);
   }

   @Nullable
   public ali a() {
      return this.i.<ali>a("id", ali.a).orElse(null);
   }

   @Nullable
   public <T> T a(jh.a $$0, alh<? extends js<T>> $$1) {
      ali $$2 = this.a();
      return $$2 == null ? null : $$0.a($$1).flatMap($$2x -> $$2x.a(alh.a($$1, $$2))).map(jf::a).orElse(null);
   }

   public void a(bwt $$0) {
      tz $$1 = $$0.h(new tz());
      UUID $$2 = $$0.cG();
      $$1.a(this.i);
      $$0.i($$1);
      $$0.a_($$2);
   }

   public boolean a(dyc $$0, jh.a $$1) {
      tz $$2 = $$0.e($$1);
      tz $$3 = $$2.l();
      $$2.a(this.i);
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

   public <T> DataResult<dcg> a(DynamicOps<uy> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.i).map($$0x -> new dcg((tz)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(un.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<uy> $$0, MapDecoder<T> $$1) {
      MapLike<uy> $$2 = (MapLike<uy>)$$0.getMap(this.i).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int b() {
      return this.i.i();
   }

   public boolean c() {
      return this.i.j();
   }

   public tz d() {
      return this.i.l();
   }

   public boolean a(String $$0) {
      return this.i.b($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof dcg $$1 ? this.i.equals($$1.i) : false;
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
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      ali $$4 = this.i.<ali>a("id", ali.a).orElse(null);
      if (g.equals($$4) || h.equals($$4)) {
         dks.a(this, $$1, "SpawnData");
      }
   }
}
