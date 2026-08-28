import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dh extends dr<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(arg $$0, cur $$1, @Nullable bsw $$2) {
      eqk $$3 = bu.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bf> b, Optional<cp> c, Optional<bf> d) implements dr.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(dh.a::a),
                  cp.a.optionalFieldOf("item").forGetter(dh.a::b),
                  bu.b.optionalFieldOf("entity").forGetter(dh.a::c)
               )
               .apply($$0, dh.a::new)
      );

      public static an<dh.a> a(bf $$0, Optional<cp> $$1, Optional<bf> $$2) {
         return am.R.a(new dh.a(Optional.of($$0), $$1, $$2));
      }

      public static an<dh.a> a(Optional<bf> $$0, Optional<cp> $$1, Optional<bf> $$2) {
         return am.S.a(new dh.a($$0, $$1, $$2));
      }

      public boolean a(arg $$0, cur $$1, eqk $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
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
