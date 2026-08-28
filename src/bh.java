import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends dz<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(are $$0, cwq $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<cv> c) implements dz.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(bh.a::a), cv.a.optionalFieldOf("item").forGetter(bh.a::c)).apply($$0, bh.a::new)
      );

      public static aq<bh.a> b() {
         return ap.A.a(new bh.a(Optional.empty(), Optional.empty()));
      }

      public static aq<bh.a> a(js<cwm> $$0, dgi $$1) {
         return a(cv.a.a().a($$0, $$1.j()));
      }

      public static aq<bh.a> a(cv.a $$0) {
         return ap.A.a(new bh.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cwq $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
