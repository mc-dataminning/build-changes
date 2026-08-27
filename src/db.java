import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class db extends cx<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(apv $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bc> b) implements cx.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create($$0 -> $$0.group(awu.a(br.b, "player").forGetter(db.a::a)).apply($$0, db.a::new));

      public static an<db.a> a(br.a $$0) {
         return am.U.a(new db.a(Optional.of(br.a($$0))));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
