import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dy extends dr<dy.a> {
   @Override
   public Codec<dy.a> a() {
      return dy.a.a;
   }

   public void a(arg $$0, bsu $$1) {
      eqi $$2 = bu.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements dr.a {
      public static final Codec<dy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dy.a::a), bu.b.optionalFieldOf("entity").forGetter(dy.a::b)).apply($$0, dy.a::new)
      );

      public static an<dy.a> a(bu.a $$0) {
         return am.o.a(new dy.a(Optional.empty(), Optional.of(bu.a($$0))));
      }

      public boolean a(eqi $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<bf> b() {
         return this.c;
      }
   }
}
