import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ef extends dr<ef.a> {
   @Override
   public Codec<ef.a> a() {
      return ef.a.a;
   }

   public void a(arg $$0, cuq $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<cp> c) implements dr.a {
      public static final Codec<ef.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ef.a::a), cp.a.optionalFieldOf("item").forGetter(ef.a::b)).apply($$0, ef.a::new)
      );

      public static an<ef.a> a(bu.a $$0, cp.a $$1) {
         return am.W.a(new ef.a(Optional.of(bu.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cuq $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<cp> b() {
         return this.c;
      }
   }
}
