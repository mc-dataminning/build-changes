import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxr(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxr> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.w.optionalFieldOf("name").forGetter(cxr::c),
               kc.a.optionalFieldOf("id").forGetter(cxr::d),
               ayh.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxr::e)
            )
            .apply($$0, cxr::new)
   );
   public static final Codec<cxr> a = Codec.withAlternative(g, ayh.w, $$0 -> new cxr(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zn<ByteBuf, cxr> b = zn.a(zl.b(16).a(zl::a), cxr::c, kc.g.a(zl::a), cxr::d, zl.t, cxr::e, cxr::new);

   public cxr(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxr(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxr> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dqt.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxr($$1);
         }) : dqt.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cxr($$1);
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
