import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record dcn(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<dcn> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.y.optionalFieldOf("name").forGetter(dcn::c),
               jz.a.optionalFieldOf("id").forGetter(dcn::d),
               ayu.x.optionalFieldOf("properties", new PropertyMap()).forGetter(dcn::e)
            )
            .apply($$0, dcn::new)
   );
   public static final Codec<dcn> a = Codec.withAlternative(g, ayu.y, $$0 -> new dcn(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yw<ByteBuf, dcn> b = yw.a(yu.b(16).a(yu::a), dcn::c, jz.g.a(yu::a), dcn::d, yu.y, dcn::e, dcn::new);

   public dcn(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dcn(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<dcn> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dzh.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new dcn($$1);
         }) : dzh.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ag.e, this.c.get()));
            return new dcn($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ag.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
