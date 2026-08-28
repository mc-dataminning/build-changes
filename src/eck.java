import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eck {
   public static final eck a = new eck(false, dhl.gz.o(), dhl.pL.o(), dhl.ej.o(), dhl.aQ.o());
   public static final Codec<eck> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eck::a),
               duo.a.optionalFieldOf("air_state", a.b()).forGetter(eck::b),
               duo.a.optionalFieldOf("water_state", a.b()).forGetter(eck::c),
               duo.a.optionalFieldOf("lava_state", a.b()).forGetter(eck::d),
               duo.a.optionalFieldOf("barrier_state", a.b()).forGetter(eck::e)
            )
            .apply($$0, eck::new)
   );
   private final boolean c;
   private final duo d;
   private final duo e;
   private final duo f;
   private final duo g;

   public static eck a(boolean $$0, duo $$1, duo $$2, duo $$3, duo $$4) {
      return new eck($$0, $$1, $$2, $$3, $$4);
   }

   public static eck a(duo $$0, duo $$1, duo $$2, duo $$3) {
      return new eck(false, $$0, $$1, $$2, $$3);
   }

   public static eck a(boolean $$0, duo $$1) {
      return new eck($$0, $$1, a.c(), a.d(), a.e());
   }

   private eck(boolean $$0, duo $$1, duo $$2, duo $$3, duo $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public duo b() {
      return this.d;
   }

   public duo c() {
      return this.e;
   }

   public duo d() {
      return this.f;
   }

   public duo e() {
      return this.g;
   }
}
