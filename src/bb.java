import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bb extends dh<bb.a> {
   @Override
   public Codec<bb.a> a() {
      return bb.a.a;
   }

   public void a(aqu $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, cu.d c) implements dh.a {
      public static final Codec<bb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(bb.a::a), axu.a(cu.d.d, "level", cu.d.c).forGetter(bb.a::c)).apply($$0, bb.a::new)
      );

      public static ao<bb.a> b() {
         return an.m.a(new bb.a(Optional.empty(), cu.d.c));
      }

      public static ao<bb.a> a(cu.d $$0) {
         return an.m.a(new bb.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.c.d($$0);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
