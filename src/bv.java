import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bv extends dy<bv.a> {
   @Override
   public Codec<bv.a> a() {
      return bv.a.a;
   }

   public void a(asi $$0, btz $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bh> b, Optional<bk> c) implements dy.a {
      public static final Codec<bv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(bv.a::a), bk.a.optionalFieldOf("damage").forGetter(bv.a::c)).apply($$0, bv.a::new)
      );

      public static ap<bv.a> b() {
         return ao.i.a(new bv.a(Optional.empty(), Optional.empty()));
      }

      public static ap<bv.a> a(bk $$0) {
         return ao.i.a(new bv.a(Optional.empty(), Optional.of($$0)));
      }

      public static ap<bv.a> a(bk.a $$0) {
         return ao.i.a(new bv.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(asi $$0, btz $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
