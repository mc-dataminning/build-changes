import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class db extends dd<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(aqf $$0, cwi<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static an<db.a> a(akf $$0) {
      return am.g.a(new db.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bc> b, akf c) implements dd.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(db.a::a), akf.a.fieldOf("recipe").forGetter(db.a::b)).apply($$0, db.a::new)
      );

      public boolean a(cwi<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public akf b() {
         return this.c;
      }
   }
}
