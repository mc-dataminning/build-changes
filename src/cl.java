import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cl extends cx<cl.a> {
   @Override
   public Codec<cl.a> a() {
      return cl.a.a;
   }

   public void a(apg $$0, ajh $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bc> b, ajh c) implements cx.a {
      public static final Codec<cl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(cl.a::a), ajh.a.fieldOf("loot_table").forGetter(cl.a::b)).apply($$0, cl.a::new)
      );

      public static an<cl.a> a(ajh $$0) {
         return am.Q.a(new cl.a(Optional.empty(), $$0));
      }

      public boolean b(ajh $$0) {
         return this.c.equals($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public ajh b() {
         return this.c;
      }
   }
}
