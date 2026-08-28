import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxu(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxu> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.w.optionalFieldOf("name").forGetter(cxu::c),
               kg.a.optionalFieldOf("id").forGetter(cxu::d),
               axw.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxu::e)
            )
            .apply($$0, cxu::new)
   );
   public static final Codec<cxu> a = Codec.withAlternative(g, axw.w, $$0 -> new cxu(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yx<ByteBuf, cxu> b = yx.a(yv.b(16).a(yv::a), cxu::c, kg.g.a(yv::a), cxu::d, yv.t, cxu::e, cxu::new);

   public cxu(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxu(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxu> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dru.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxu($$1);
         }) : dru.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ad.e, this.c.get()));
            return new cxu($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ad.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
