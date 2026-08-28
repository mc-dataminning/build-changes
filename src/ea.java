import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ea extends dr<ea.a> {
   @Override
   public Codec<ea.a> a() {
      return ea.a.a;
   }

   public void a(arf $$0, cfd $$1) {
      eqg $$2 = bu.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements dr.a {
      public static final Codec<ea.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ea.a::a), bu.b.optionalFieldOf("entity").forGetter(ea.a::c)).apply($$0, ea.a::new)
      );

      public static an<ea.a> b() {
         return am.y.a(new ea.a(Optional.empty(), Optional.empty()));
      }

      public static an<ea.a> a(bu.a $$0) {
         return am.y.a(new ea.a(Optional.empty(), Optional.of(bu.a($$0))));
      }

      public boolean a(eqg $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
