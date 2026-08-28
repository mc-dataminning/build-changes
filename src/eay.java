import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eay {
   public static final eay a = new eay(false, dga.gz.o(), dga.pL.o(), dga.ej.o(), dga.aQ.o());
   public static final Codec<eay> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eay::a),
               dtc.b.optionalFieldOf("air_state", a.b()).forGetter(eay::b),
               dtc.b.optionalFieldOf("water_state", a.b()).forGetter(eay::c),
               dtc.b.optionalFieldOf("lava_state", a.b()).forGetter(eay::d),
               dtc.b.optionalFieldOf("barrier_state", a.b()).forGetter(eay::e)
            )
            .apply($$0, eay::new)
   );
   private final boolean c;
   private final dtc d;
   private final dtc e;
   private final dtc f;
   private final dtc g;

   public static eay a(boolean $$0, dtc $$1, dtc $$2, dtc $$3, dtc $$4) {
      return new eay($$0, $$1, $$2, $$3, $$4);
   }

   public static eay a(dtc $$0, dtc $$1, dtc $$2, dtc $$3) {
      return new eay(false, $$0, $$1, $$2, $$3);
   }

   public static eay a(boolean $$0, dtc $$1) {
      return new eay($$0, $$1, a.c(), a.d(), a.e());
   }

   private eay(boolean $$0, dtc $$1, dtc $$2, dtc $$3, dtc $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dtc b() {
      return this.d;
   }

   public dtc c() {
      return this.e;
   }

   public dtc d() {
      return this.f;
   }

   public dtc e() {
      return this.g;
   }
}
