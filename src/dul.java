import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dul {
   public static final dul a = new dul(false, dac.gz.o(), dac.pL.o(), dac.ej.o(), dac.aQ.o());
   public static final Codec<dul> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dul::a),
               dmz.b.optionalFieldOf("air_state", a.b()).forGetter(dul::b),
               dmz.b.optionalFieldOf("water_state", a.b()).forGetter(dul::c),
               dmz.b.optionalFieldOf("lava_state", a.b()).forGetter(dul::d),
               dmz.b.optionalFieldOf("barrier_state", a.b()).forGetter(dul::e)
            )
            .apply($$0, dul::new)
   );
   private final boolean c;
   private final dmz d;
   private final dmz e;
   private final dmz f;
   private final dmz g;

   public static dul a(boolean $$0, dmz $$1, dmz $$2, dmz $$3, dmz $$4) {
      return new dul($$0, $$1, $$2, $$3, $$4);
   }

   public static dul a(dmz $$0, dmz $$1, dmz $$2, dmz $$3) {
      return new dul(false, $$0, $$1, $$2, $$3);
   }

   public static dul a(boolean $$0, dmz $$1) {
      return new dul($$0, $$1, a.c(), a.d(), a.e());
   }

   private dul(boolean $$0, dmz $$1, dmz $$2, dmz $$3, dmz $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dmz b() {
      return this.d;
   }

   public dmz c() {
      return this.e;
   }

   public dmz d() {
      return this.f;
   }

   public dmz e() {
      return this.g;
   }
}
