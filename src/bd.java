import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bd extends dr<bd.a> {
   @Override
   public Codec<bd.a> a() {
      return bd.a.a;
   }

   public void a(arf $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, de.d c) implements dr.a {
      public static final Codec<bd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(bd.a::a), de.d.d.optionalFieldOf("level", de.d.c).forGetter(bd.a::c)).apply($$0, bd.a::new)
      );

      public static an<bd.a> b() {
         return am.m.a(new bd.a(Optional.empty(), de.d.c));
      }

      public static an<bd.a> a(de.d $$0) {
         return am.m.a(new bd.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.c.d($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
