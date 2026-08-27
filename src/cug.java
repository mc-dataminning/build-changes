import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cug(String c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   public static final Codec<cug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.u.fieldOf("name").forGetter(cug::c), aws.a(jf.a, "id").forGetter(cug::d), aws.a(aws.t, "properties", new PropertyMap()).forGetter(cug::e)
            )
            .apply($$0, cug::new)
   );
   public static final ye<ByteBuf, cug> b = ye.a(yc.b(16), cug::c, jf.g.a(yc::a), cug::d, yc.s, cug::e, cug::new);

   public cug(String $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cug(GameProfile $$0) {
      this($$0.getName(), Optional.ofNullable($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cug> a() {
      return this.b() ? CompletableFuture.completedFuture(this) : dnr.a(this.c).thenApply($$0 -> {
         GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c));
         return new cug($$1);
      });
   }

   private static GameProfile a(String $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ac.e), $$0);
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return this.d.isPresent() || !this.e.isEmpty();
   }
}
