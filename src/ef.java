import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ef extends dw<ef.a> {
   @Override
   public Codec<ef.a> a() {
      return ef.a.a;
   }

   public void a(ark $$0, cgd $$1) {
      etl $$2 = bv.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dw.a {
      public static final Codec<ef.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ef.a::a), bv.b.optionalFieldOf("entity").forGetter(ef.a::c)).apply($$0, ef.a::new)
      );

      public static ao<ef.a> b() {
         return an.y.a(new ef.a(Optional.empty(), Optional.empty()));
      }

      public static ao<ef.a> a(bv.a $$0) {
         return an.y.a(new ef.a(Optional.empty(), Optional.of(bv.a($$0))));
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
   }
}
