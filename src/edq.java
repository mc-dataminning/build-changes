import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edq {
   public static final edq a = new edq(false, dis.gz.m(), dis.pL.m(), dis.ej.m(), dis.aQ.m());
   public static final Codec<edq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(edq::a),
               dvv.a.optionalFieldOf("air_state", a.b()).forGetter(edq::b),
               dvv.a.optionalFieldOf("water_state", a.b()).forGetter(edq::c),
               dvv.a.optionalFieldOf("lava_state", a.b()).forGetter(edq::d),
               dvv.a.optionalFieldOf("barrier_state", a.b()).forGetter(edq::e)
            )
            .apply($$0, edq::new)
   );
   private final boolean c;
   private final dvv d;
   private final dvv e;
   private final dvv f;
   private final dvv g;

   public static edq a(boolean $$0, dvv $$1, dvv $$2, dvv $$3, dvv $$4) {
      return new edq($$0, $$1, $$2, $$3, $$4);
   }

   public static edq a(dvv $$0, dvv $$1, dvv $$2, dvv $$3) {
      return new edq(false, $$0, $$1, $$2, $$3);
   }

   public static edq a(boolean $$0, dvv $$1) {
      return new edq($$0, $$1, a.c(), a.d(), a.e());
   }

   private edq(boolean $$0, dvv $$1, dvv $$2, dvv $$3, dvv $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dvv b() {
      return this.d;
   }

   public dvv c() {
      return this.e;
   }

   public dvv d() {
      return this.f;
   }

   public dvv e() {
      return this.g;
   }
}
