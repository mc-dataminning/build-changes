import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends ds<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(aql $$0, cua $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<cp> c) implements ds.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dr.a::a), cp.a.optionalFieldOf("item").forGetter(dr.a::b)).apply($$0, dr.a::new)
      );

      public static an<dr.a> a(Optional<cp> $$0) {
         return am.G.a(new dr.a(Optional.empty(), $$0));
      }

      public static an<dr.a> a(dcc $$0) {
         return am.G.a(new dr.a(Optional.empty(), Optional.of(cp.a.a().a($$0).b())));
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
