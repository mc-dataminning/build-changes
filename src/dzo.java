import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzo {
   public static final dzo a = new dzo(false, dew.gz.n(), dew.pL.n(), dew.ej.n(), dew.aQ.n());
   public static final Codec<dzo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dzo::a),
               drx.b.optionalFieldOf("air_state", a.b()).forGetter(dzo::b),
               drx.b.optionalFieldOf("water_state", a.b()).forGetter(dzo::c),
               drx.b.optionalFieldOf("lava_state", a.b()).forGetter(dzo::d),
               drx.b.optionalFieldOf("barrier_state", a.b()).forGetter(dzo::e)
            )
            .apply($$0, dzo::new)
   );
   private final boolean c;
   private final drx d;
   private final drx e;
   private final drx f;
   private final drx g;

   public static dzo a(boolean $$0, drx $$1, drx $$2, drx $$3, drx $$4) {
      return new dzo($$0, $$1, $$2, $$3, $$4);
   }

   public static dzo a(drx $$0, drx $$1, drx $$2, drx $$3) {
      return new dzo(false, $$0, $$1, $$2, $$3);
   }

   public static dzo a(boolean $$0, drx $$1) {
      return new dzo($$0, $$1, a.c(), a.d(), a.e());
   }

   private dzo(boolean $$0, drx $$1, drx $$2, drx $$3, drx $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public drx b() {
      return this.d;
   }

   public drx c() {
      return this.e;
   }

   public drx d() {
      return this.f;
   }

   public drx e() {
      return this.g;
   }
}
