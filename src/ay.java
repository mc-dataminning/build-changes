import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends dh<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(aqu $$0, ja<cwp> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ja<cwp>> c) implements dh.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(ay.a::a), axu.a(lh.i.r(), "potion").forGetter(ay.a::c)).apply($$0, ay.a::new)
      );

      public static ao<ay.a> b() {
         return an.l.a(new ay.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(ja<cwp> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
