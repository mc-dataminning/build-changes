import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxe(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxe> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.w.optionalFieldOf("name").forGetter(cxe::c),
               kd.a.optionalFieldOf("id").forGetter(cxe::d),
               axo.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxe::e)
            )
            .apply($$0, cxe::new)
   );
   public static final Codec<cxe> a = Codec.withAlternative(g, axo.w, $$0 -> new cxe(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final ys<ByteBuf, cxe> b = ys.a(yq.b(16).a(yq::a), cxe::c, kd.g.a(yq::a), cxe::d, yq.t, cxe::e, cxe::new);

   public cxe(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxe(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxe> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? drd.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxe($$1);
         }) : drd.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cxe($$1);
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
