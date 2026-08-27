import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aw extends cv<aw.a> {
   @Override
   public Codec<aw.a> a() {
      return aw.a.a;
   }

   public void a(ane $$0, ih<cow> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ih<cow>> c) implements cv.a {
      public static final Codec<aw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atw.a(bp.b, "player").forGetter(aw.a::a), atw.a(kd.i.r(), "potion").forGetter(aw.a::c)).apply($$0, aw.a::new)
      );

      public static an<aw.a> b() {
         return am.l.a(new aw.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(ih<cow> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
