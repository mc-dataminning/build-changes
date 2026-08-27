import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cr extends dd<cr.a> {
   @Override
   public Codec<cr.a> a() {
      return cr.a.a;
   }

   public void a(aqf $$0, akf $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bc> b, akf c) implements dd.a {
      public static final Codec<cr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(cr.a::a), akf.a.fieldOf("loot_table").forGetter(cr.a::b)).apply($$0, cr.a::new)
      );

      public static an<cr.a> a(akf $$0) {
         return am.Q.a(new cr.a(Optional.empty(), $$0));
      }

      public boolean b(akf $$0) {
         return this.c.equals($$0);
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
