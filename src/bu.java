import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bu extends dw<bu.a> {
   @Override
   public Codec<bu.a> a() {
      return bu.a.a;
   }

   public void a(ark $$0, bsj $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bg> b, Optional<bj> c) implements dw.a {
      public static final Codec<bu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(bu.a::a), bj.a.optionalFieldOf("damage").forGetter(bu.a::c)).apply($$0, bu.a::new)
      );

      public static ao<bu.a> b() {
         return an.i.a(new bu.a(Optional.empty(), Optional.empty()));
      }

      public static ao<bu.a> a(bj $$0) {
         return an.i.a(new bu.a(Optional.empty(), Optional.of($$0)));
      }

      public static ao<bu.a> a(bj.a $$0) {
         return an.i.a(new bu.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(ark $$0, bsj $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
