import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecz {
   public static final ecz a = new ecz(false, dia.gz.m(), dia.pL.m(), dia.ej.m(), dia.aQ.m());
   public static final Codec<ecz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ecz::a),
               dvd.a.optionalFieldOf("air_state", a.b()).forGetter(ecz::b),
               dvd.a.optionalFieldOf("water_state", a.b()).forGetter(ecz::c),
               dvd.a.optionalFieldOf("lava_state", a.b()).forGetter(ecz::d),
               dvd.a.optionalFieldOf("barrier_state", a.b()).forGetter(ecz::e)
            )
            .apply($$0, ecz::new)
   );
   private final boolean c;
   private final dvd d;
   private final dvd e;
   private final dvd f;
   private final dvd g;

   public static ecz a(boolean $$0, dvd $$1, dvd $$2, dvd $$3, dvd $$4) {
      return new ecz($$0, $$1, $$2, $$3, $$4);
   }

   public static ecz a(dvd $$0, dvd $$1, dvd $$2, dvd $$3) {
      return new ecz(false, $$0, $$1, $$2, $$3);
   }

   public static ecz a(boolean $$0, dvd $$1) {
      return new ecz($$0, $$1, a.c(), a.d(), a.e());
   }

   private ecz(boolean $$0, dvd $$1, dvd $$2, dvd $$3, dvd $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dvd b() {
      return this.d;
   }

   public dvd c() {
      return this.e;
   }

   public dvd d() {
      return this.f;
   }

   public dvd e() {
      return this.g;
   }
}
