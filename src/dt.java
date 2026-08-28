import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dt extends dl<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(arv $$0, bwv $$1) {
      faj $$2 = bz.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dl.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(dt.a::a), bz.b.optionalFieldOf("entity").forGetter(dt.a::b)).apply($$0, dt.a::new)
      );

      public static ar<dt.a> a(bz.a $$0) {
         return aq.o.a(new dt.a(Optional.empty(), Optional.of(bz.a($$0))));
      }

      public boolean a(faj $$0) {
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

      public Optional<bj> b() {
         return this.c;
      }
   }
}
