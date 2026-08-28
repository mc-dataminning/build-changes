import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bw extends dz<bw.a> {
   @Override
   public Codec<bw.a> a() {
      return bw.a.a;
   }

   public void a(ard $$0, bta $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bi> b, Optional<bl> c) implements dz.a {
      public static final Codec<bw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(bw.a::a), bl.a.optionalFieldOf("damage").forGetter(bw.a::c)).apply($$0, bw.a::new)
      );

      public static aq<bw.a> b() {
         return ap.i.a(new bw.a(Optional.empty(), Optional.empty()));
      }

      public static aq<bw.a> a(bl $$0) {
         return ap.i.a(new bw.a(Optional.empty(), Optional.of($$0)));
      }

      public static aq<bw.a> a(bl.a $$0) {
         return ap.i.a(new bw.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(ard $$0, bta $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
