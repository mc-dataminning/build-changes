import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class az extends dw<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(ark $$0, ald<dej> $$1, ald<dej> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<ald<dej>> c, Optional<ald<dej>> d) implements dw.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(az.a::a),
                  ald.a(lw.bc).optionalFieldOf("from").forGetter(az.a::c),
                  ald.a(lw.bc).optionalFieldOf("to").forGetter(az.a::d)
               )
               .apply($$0, az.a::new)
      );

      public static ao<az.a> b() {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<az.a> a(ald<dej> $$0, ald<dej> $$1) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ao<az.a> a(ald<dej> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ao<az.a> b(ald<dej> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(ald<dej> $$0, ald<dej> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
