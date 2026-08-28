import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxt(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxt> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.w.optionalFieldOf("name").forGetter(cxt::c),
               kc.a.optionalFieldOf("id").forGetter(cxt::d),
               ayh.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxt::e)
            )
            .apply($$0, cxt::new)
   );
   public static final Codec<cxt> a = Codec.withAlternative(g, ayh.w, $$0 -> new cxt(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zn<ByteBuf, cxt> b = zn.a(zl.b(16).a(zl::a), cxt::c, kc.g.a(zl::a), cxt::d, zl.t, cxt::e, cxt::new);

   public cxt(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxt(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxt> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dqv.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxt($$1);
         }) : dqv.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cxt($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ac.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
