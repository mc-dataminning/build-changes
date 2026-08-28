import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class by extends dr<by.a> {
   @Override
   public Codec<by.a> a() {
      return by.a.a;
   }

   public void a(arf $$0, evq $$1, @Nullable bst $$2) {
      evq $$3 = $$0.dn();
      eqh $$4 = $$2 != null ? bu.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.z(), $$1, $$3, $$4));
   }

   public static record a(Optional<bf> b, Optional<dc> c, Optional<bl> d, Optional<bf> e) implements dr.a {
      public static final Codec<by.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(by.a::a),
                  dc.a.optionalFieldOf("start_position").forGetter(by.a::b),
                  bl.a.optionalFieldOf("distance").forGetter(by.a::c),
                  bu.b.optionalFieldOf("cause").forGetter(by.a::d)
               )
               .apply($$0, by.a::new)
      );

      public static an<by.a> a(bl $$0, bu.a $$1) {
         return am.ae.a(new by.a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(bu.a($$1))));
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(are $$0, evq $$1, evq $$2, @Nullable eqh $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<dc> b() {
         return this.c;
      }

      public Optional<bl> c() {
         return this.d;
      }

      public Optional<bf> d() {
         return this.e;
      }
   }
}
