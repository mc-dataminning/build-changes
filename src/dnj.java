import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnj {
   public static final dnj a = new dnj(false, cuc.gz.o(), cuc.pL.o(), cuc.ej.o(), cuc.aQ.o());
   public static final Codec<dnj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dnj::a),
               dgb.b.optionalFieldOf("air_state", a.b()).forGetter(dnj::b),
               dgb.b.optionalFieldOf("water_state", a.b()).forGetter(dnj::c),
               dgb.b.optionalFieldOf("lava_state", a.b()).forGetter(dnj::d),
               dgb.b.optionalFieldOf("barrier_state", a.b()).forGetter(dnj::e)
            )
            .apply($$0, dnj::new)
   );
   private final boolean c;
   private final dgb d;
   private final dgb e;
   private final dgb f;
   private final dgb g;

   public static dnj a(boolean $$0, dgb $$1, dgb $$2, dgb $$3, dgb $$4) {
      return new dnj($$0, $$1, $$2, $$3, $$4);
   }

   public static dnj a(dgb $$0, dgb $$1, dgb $$2, dgb $$3) {
      return new dnj(false, $$0, $$1, $$2, $$3);
   }

   public static dnj a(boolean $$0, dgb $$1) {
      return new dnj($$0, $$1, a.c(), a.d(), a.e());
   }

   private dnj(boolean $$0, dgb $$1, dgb $$2, dgb $$3, dgb $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dgb b() {
      return this.d;
   }

   public dgb c() {
      return this.e;
   }

   public dgb d() {
      return this.f;
   }

   public dgb e() {
      return this.g;
   }
}
