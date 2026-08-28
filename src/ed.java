import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ed extends dw<ed.a> {
   @Override
   public Codec<ed.a> a() {
      return ed.a.a;
   }

   public void a(ark $$0, btr $$1) {
      etl $$2 = bv.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dw.a {
      public static final Codec<ed.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ed.a::a), bv.b.optionalFieldOf("entity").forGetter(ed.a::b)).apply($$0, ed.a::new)
      );

      public static ao<ed.a> a(bv.a $$0) {
         return an.o.a(new ed.a(Optional.empty(), Optional.of(bv.a($$0))));
      }

      public boolean a(etl $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dw.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bg> b() {
         return this.c;
      }
   }
}
