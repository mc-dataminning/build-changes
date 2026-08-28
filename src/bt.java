import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bt extends ds<bt.a> {
   @Override
   public Codec<bt.a> a() {
      return bt.a.a;
   }

   public void a(aqn $$0, bra $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bf> b, Optional<bi> c) implements ds.a {
      public static final Codec<bt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(bt.a::a), bi.a.optionalFieldOf("damage").forGetter(bt.a::c)).apply($$0, bt.a::new)
      );

      public static an<bt.a> b() {
         return am.i.a(new bt.a(Optional.empty(), Optional.empty()));
      }

      public static an<bt.a> a(bi $$0) {
         return am.i.a(new bt.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<bt.a> a(bi.a $$0) {
         return am.i.a(new bt.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(aqn $$0, bra $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
