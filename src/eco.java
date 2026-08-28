import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eco {
   public static final eco a = new eco(false, dho.gz.n(), dho.pL.n(), dho.ej.n(), dho.aQ.n());
   public static final Codec<eco> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eco::a),
               dus.a.optionalFieldOf("air_state", a.b()).forGetter(eco::b),
               dus.a.optionalFieldOf("water_state", a.b()).forGetter(eco::c),
               dus.a.optionalFieldOf("lava_state", a.b()).forGetter(eco::d),
               dus.a.optionalFieldOf("barrier_state", a.b()).forGetter(eco::e)
            )
            .apply($$0, eco::new)
   );
   private final boolean c;
   private final dus d;
   private final dus e;
   private final dus f;
   private final dus g;

   public static eco a(boolean $$0, dus $$1, dus $$2, dus $$3, dus $$4) {
      return new eco($$0, $$1, $$2, $$3, $$4);
   }

   public static eco a(dus $$0, dus $$1, dus $$2, dus $$3) {
      return new eco(false, $$0, $$1, $$2, $$3);
   }

   public static eco a(boolean $$0, dus $$1) {
      return new eco($$0, $$1, a.c(), a.d(), a.e());
   }

   private eco(boolean $$0, dus $$1, dus $$2, dus $$3, dus $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dus b() {
      return this.d;
   }

   public dus c() {
      return this.e;
   }

   public dus d() {
      return this.f;
   }

   public dus e() {
      return this.g;
   }
}
