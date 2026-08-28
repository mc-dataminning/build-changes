import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ef extends dy<ef.a> {
   @Override
   public Codec<ef.a> a() {
      return ef.a.a;
   }

   public void a(asi $$0, bvf $$1) {
      ewh $$2 = bw.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<ef.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(ef.a::a), bw.b.optionalFieldOf("entity").forGetter(ef.a::b)).apply($$0, ef.a::new)
      );

      public static ap<ef.a> a(bw.a $$0) {
         return ao.o.a(new ef.a(Optional.empty(), Optional.of(bw.a($$0))));
      }

      public boolean a(ewh $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<bh> b() {
         return this.c;
      }
   }
}
