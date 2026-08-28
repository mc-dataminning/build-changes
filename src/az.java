import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class az extends dv<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(arh $$0, ala<dds> $$1, ala<dds> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<ala<dds>> c, Optional<ala<dds>> d) implements dv.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(az.a::a),
                  ala.a(lv.ba).optionalFieldOf("from").forGetter(az.a::c),
                  ala.a(lv.ba).optionalFieldOf("to").forGetter(az.a::d)
               )
               .apply($$0, az.a::new)
      );

      public static ao<az.a> b() {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<az.a> a(ala<dds> $$0, ala<dds> $$1) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ao<az.a> a(ala<dds> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ao<az.a> b(ala<dds> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(ala<dds> $$0, ala<dds> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
