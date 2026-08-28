import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class di extends ds<di.a> {
   @Override
   public Codec<di.a> a() {
      return di.a.a;
   }

   public void a(aqn $$0, cuc $$1, @Nullable bsg $$2) {
      equ $$3 = bu.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bf> b, Optional<cp> c, Optional<bf> d) implements ds.a {
      public static final Codec<di.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(di.a::a),
                  cp.a.optionalFieldOf("item").forGetter(di.a::b),
                  bu.b.optionalFieldOf("entity").forGetter(di.a::c)
               )
               .apply($$0, di.a::new)
      );

      public static an<di.a> a(bf $$0, Optional<cp> $$1, Optional<bf> $$2) {
         return am.R.a(new di.a(Optional.of($$0), $$1, $$2));
      }

      public static an<di.a> a(Optional<bf> $$0, Optional<cp> $$1, Optional<bf> $$2) {
         return am.S.a(new di.a($$0, $$1, $$2));
      }

      public boolean a(aqn $$0, cuc $$1, equ $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<cp> b() {
         return this.c;
      }

      public Optional<bf> c() {
         return this.d;
      }
   }
}
