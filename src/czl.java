import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record czl(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<czl> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.y.optionalFieldOf("name").forGetter(czl::c),
               kk.a.optionalFieldOf("id").forGetter(czl::d),
               ayv.x.optionalFieldOf("properties", new PropertyMap()).forGetter(czl::e)
            )
            .apply($$0, czl::new)
   );
   public static final Codec<czl> a = Codec.withAlternative(g, ayv.y, $$0 -> new czl(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zh<ByteBuf, czl> b = zh.a(zf.b(16).a(zf::a), czl::c, kk.g.a(zf::a), czl::d, zf.w, czl::e, czl::new);

   public czl(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public czl(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<czl> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dum.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new czl($$1);
         }) : dum.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ae.e, this.c.get()));
            return new czl($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ae.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
