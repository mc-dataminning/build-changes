import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dm extends dx<dm.a> {
   @Override
   public Codec<dm.a> a() {
      return dm.a.a;
   }

   public void a(arn $$0, cvx $$1, @Nullable btz $$2) {
      etw $$3 = bv.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bg> b, Optional<ct> c, Optional<bg> d) implements dx.a {
      public static final Codec<dm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(dm.a::a),
                  ct.a.optionalFieldOf("item").forGetter(dm.a::b),
                  bv.b.optionalFieldOf("entity").forGetter(dm.a::c)
               )
               .apply($$0, dm.a::new)
      );

      public static ao<dm.a> a(bg $$0, Optional<ct> $$1, Optional<bg> $$2) {
         return an.R.a(new dm.a(Optional.of($$0), $$1, $$2));
      }

      public static ao<dm.a> a(Optional<bg> $$0, Optional<ct> $$1, Optional<bg> $$2) {
         return an.S.a(new dm.a($$0, $$1, $$2));
      }

      public boolean a(arn $$0, cvx $$1, etw $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<ct> b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
