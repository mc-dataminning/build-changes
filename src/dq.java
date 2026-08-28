import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends dr<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(arg $$0, cur $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<cp> c) implements dr.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dq.a::a), cp.a.optionalFieldOf("item").forGetter(dq.a::b)).apply($$0, dq.a::new)
      );

      public static an<dq.a> a(Optional<cp> $$0) {
         return am.G.a(new dq.a(Optional.empty(), $$0));
      }

      public static an<dq.a> a(dbz $$0) {
         return am.G.a(new dq.a(Optional.empty(), Optional.of(cp.a.a().a($$0).b())));
      }

      public boolean a(cur $$0) {
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
