import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ds extends dk<ds.a> {
   @Override
   public Codec<ds.a> a() {
      return ds.a.a;
   }

   public void a(art $$0, bwt $$1) {
      fah $$2 = by.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<ds.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(ds.a::a), by.b.optionalFieldOf("entity").forGetter(ds.a::b)).apply($$0, ds.a::new)
      );

      public static ar<ds.a> a(by.a $$0) {
         return aq.o.a(new ds.a(Optional.empty(), Optional.of(by.a($$0))));
      }

      public boolean a(fah $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
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
