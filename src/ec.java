import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ec extends dv<ec.a> {
   @Override
   public Codec<ec.a> a() {
      return ec.a.a;
   }

   public void a(aqu $$0, bsq $$1) {
      erl $$2 = bv.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dv.a {
      public static final Codec<ec.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ec.a::a), bv.b.optionalFieldOf("entity").forGetter(ec.a::b)).apply($$0, ec.a::new)
      );

      public static ao<ec.a> a(bv.a $$0) {
         return an.o.a(new ec.a(Optional.empty(), Optional.of(bv.a($$0))));
      }

      public boolean a(erl $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
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
