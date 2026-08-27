import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doe {
   public static final doe a = new doe(false, cuv.gz.o(), cuv.pL.o(), cuv.ej.o(), cuv.aQ.o());
   public static final Codec<doe> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(doe::a),
               dgw.b.optionalFieldOf("air_state", a.b()).forGetter(doe::b),
               dgw.b.optionalFieldOf("water_state", a.b()).forGetter(doe::c),
               dgw.b.optionalFieldOf("lava_state", a.b()).forGetter(doe::d),
               dgw.b.optionalFieldOf("barrier_state", a.b()).forGetter(doe::e)
            )
            .apply($$0, doe::new)
   );
   private final boolean c;
   private final dgw d;
   private final dgw e;
   private final dgw f;
   private final dgw g;

   public static doe a(boolean $$0, dgw $$1, dgw $$2, dgw $$3, dgw $$4) {
      return new doe($$0, $$1, $$2, $$3, $$4);
   }

   public static doe a(dgw $$0, dgw $$1, dgw $$2, dgw $$3) {
      return new doe(false, $$0, $$1, $$2, $$3);
   }

   public static doe a(boolean $$0, dgw $$1) {
      return new doe($$0, $$1, a.c(), a.d(), a.e());
   }

   private doe(boolean $$0, dgw $$1, dgw $$2, dgw $$3, dgw $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dgw b() {
      return this.d;
   }

   public dgw c() {
      return this.e;
   }

   public dgw d() {
      return this.f;
   }

   public dgw e() {
      return this.g;
   }
}
