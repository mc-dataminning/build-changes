import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eag {
   public static final eag a = new eag(false, dfk.gz.o(), dfk.pL.o(), dfk.ej.o(), dfk.aQ.o());
   public static final Codec<eag> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eag::a),
               dsl.b.optionalFieldOf("air_state", a.b()).forGetter(eag::b),
               dsl.b.optionalFieldOf("water_state", a.b()).forGetter(eag::c),
               dsl.b.optionalFieldOf("lava_state", a.b()).forGetter(eag::d),
               dsl.b.optionalFieldOf("barrier_state", a.b()).forGetter(eag::e)
            )
            .apply($$0, eag::new)
   );
   private final boolean c;
   private final dsl d;
   private final dsl e;
   private final dsl f;
   private final dsl g;

   public static eag a(boolean $$0, dsl $$1, dsl $$2, dsl $$3, dsl $$4) {
      return new eag($$0, $$1, $$2, $$3, $$4);
   }

   public static eag a(dsl $$0, dsl $$1, dsl $$2, dsl $$3) {
      return new eag(false, $$0, $$1, $$2, $$3);
   }

   public static eag a(boolean $$0, dsl $$1) {
      return new eag($$0, $$1, a.c(), a.d(), a.e());
   }

   private eag(boolean $$0, dsl $$1, dsl $$2, dsl $$3, dsl $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dsl b() {
      return this.d;
   }

   public dsl c() {
      return this.e;
   }

   public dsl d() {
      return this.f;
   }

   public dsl e() {
      return this.g;
   }
}
