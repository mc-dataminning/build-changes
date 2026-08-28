import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ee extends dr<ee.a> {
   @Override
   public Codec<ee.a> a() {
      return ee.a.a;
   }

   public void a(arf $$0, cun $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<cp> c) implements dr.a {
      public static final Codec<ee.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ee.a::a), cp.a.optionalFieldOf("item").forGetter(ee.a::b)).apply($$0, ee.a::new)
      );

      public static an<ee.a> a(cp $$0) {
         return am.C.a(new ee.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<ee.a> a(dbv $$0) {
         return am.C.a(new ee.a(Optional.empty(), Optional.of(cp.a.a().a($$0).b())));
      }

      public boolean a(cun $$0) {
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
