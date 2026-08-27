import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class df extends cx<df.a> {
   @Override
   public Codec<df.a> a() {
      return df.a.a;
   }

   public void a(apv $$0, cci $$1) {
      enk $$2 = br.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<df.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(df.a::a), awu.a(br.b, "entity").forGetter(df.a::c)).apply($$0, df.a::new)
      );

      public static an<df.a> b() {
         return am.y.a(new df.a(Optional.empty(), Optional.empty()));
      }

      public static an<df.a> a(br.a $$0) {
         return am.y.a(new df.a(Optional.empty(), Optional.of(br.a($$0))));
      }

      public boolean a(enk $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
