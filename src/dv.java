import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dv extends dl<dv.a> {
   @Override
   public Codec<dv.a> a() {
      return dv.a.a;
   }

   public void a(asc $$0, cjv $$1) {
      fat $$2 = bz.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dl.a {
      public static final Codec<dv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(dv.a::a), bz.b.optionalFieldOf("entity").forGetter(dv.a::c)).apply($$0, dv.a::new)
      );

      public static ar<dv.a> b() {
         return aq.y.a(new dv.a(Optional.empty(), Optional.empty()));
      }

      public static ar<dv.a> a(bz.a $$0) {
         return aq.y.a(new dv.a(Optional.empty(), Optional.of(bz.a($$0))));
      }

      public boolean a(fat $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
