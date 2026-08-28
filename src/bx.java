import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bx extends dk<bx.a> {
   @Override
   public Codec<bx.a> a() {
      return bx.a.a;
   }

   public void a(arr $$0, bux $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bj> b, Optional<bm> c) implements dk.a {
      public static final Codec<bx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(bx.a::a), bm.a.optionalFieldOf("damage").forGetter(bx.a::c)).apply($$0, bx.a::new)
      );

      public static ar<bx.a> b() {
         return aq.i.a(new bx.a(Optional.empty(), Optional.empty()));
      }

      public static ar<bx.a> a(bm $$0) {
         return aq.i.a(new bx.a(Optional.empty(), Optional.of($$0)));
      }

      public static ar<bx.a> a(bm.a $$0) {
         return aq.i.a(new bx.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(arr $$0, bux $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
