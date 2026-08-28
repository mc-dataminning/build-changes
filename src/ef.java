import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ef extends ds<ef.a> {
   @Override
   public Codec<ef.a> a() {
      return ef.a.a;
   }

   public void a(aql $$0, cua $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<cp> c) implements ds.a {
      public static final Codec<ef.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ef.a::a), cp.a.optionalFieldOf("item").forGetter(ef.a::b)).apply($$0, ef.a::new)
      );

      public static an<ef.a> a(cp $$0) {
         return am.C.a(new ef.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<ef.a> a(dcc $$0) {
         return am.C.a(new ef.a(Optional.empty(), Optional.of(cp.a.a().a($$0).b())));
      }

      public boolean a(cua $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
