import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzv {
   public static final dzv a = new dzv(false, dfd.gz.o(), dfd.pL.o(), dfd.ej.o(), dfd.aQ.o());
   public static final Codec<dzv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dzv::a),
               dse.b.optionalFieldOf("air_state", a.b()).forGetter(dzv::b),
               dse.b.optionalFieldOf("water_state", a.b()).forGetter(dzv::c),
               dse.b.optionalFieldOf("lava_state", a.b()).forGetter(dzv::d),
               dse.b.optionalFieldOf("barrier_state", a.b()).forGetter(dzv::e)
            )
            .apply($$0, dzv::new)
   );
   private final boolean c;
   private final dse d;
   private final dse e;
   private final dse f;
   private final dse g;

   public static dzv a(boolean $$0, dse $$1, dse $$2, dse $$3, dse $$4) {
      return new dzv($$0, $$1, $$2, $$3, $$4);
   }

   public static dzv a(dse $$0, dse $$1, dse $$2, dse $$3) {
      return new dzv(false, $$0, $$1, $$2, $$3);
   }

   public static dzv a(boolean $$0, dse $$1) {
      return new dzv($$0, $$1, a.c(), a.d(), a.e());
   }

   private dzv(boolean $$0, dse $$1, dse $$2, dse $$3, dse $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dse b() {
      return this.d;
   }

   public dse c() {
      return this.e;
   }

   public dse d() {
      return this.f;
   }

   public dse e() {
      return this.g;
   }
}
