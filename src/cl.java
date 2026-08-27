import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cl extends cx<cl.a> {
   @Override
   public Codec<cl.a> a() {
      return cl.a.a;
   }

   public void a(apv $$0, ajv $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bc> b, ajv c) implements cx.a {
      public static final Codec<cl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(cl.a::a), ajv.a.fieldOf("loot_table").forGetter(cl.a::b)).apply($$0, cl.a::new)
      );

      public static an<cl.a> a(ajv $$0) {
         return am.Q.a(new cl.a(Optional.empty(), $$0));
      }

      public boolean b(ajv $$0) {
         return this.c.equals($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public ajv b() {
         return this.c;
      }
   }
}
