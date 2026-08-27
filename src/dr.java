import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends dd<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(aqf $$0, csd $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<cg> c) implements dd.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(dr.a::a), axe.a(cg.a, "item").forGetter(dr.a::b)).apply($$0, dr.a::new)
      );

      public static an<dr.a> a(cg $$0) {
         return am.C.a(new dr.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<dr.a> a(czt $$0) {
         return am.C.a(new dr.a(Optional.empty(), Optional.of(cg.a.a().a($$0).b())));
      }

      public boolean a(csd $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cg> b() {
         return this.c;
      }
   }
}
