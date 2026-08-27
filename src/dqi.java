import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqi {
   public static final dqi a = new dqi(false, cwl.gz.o(), cwl.pL.o(), cwl.ej.o(), cwl.aQ.o());
   public static final Codec<dqi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dqi::a),
               dja.b.optionalFieldOf("air_state", a.b()).forGetter(dqi::b),
               dja.b.optionalFieldOf("water_state", a.b()).forGetter(dqi::c),
               dja.b.optionalFieldOf("lava_state", a.b()).forGetter(dqi::d),
               dja.b.optionalFieldOf("barrier_state", a.b()).forGetter(dqi::e)
            )
            .apply($$0, dqi::new)
   );
   private final boolean c;
   private final dja d;
   private final dja e;
   private final dja f;
   private final dja g;

   public static dqi a(boolean $$0, dja $$1, dja $$2, dja $$3, dja $$4) {
      return new dqi($$0, $$1, $$2, $$3, $$4);
   }

   public static dqi a(dja $$0, dja $$1, dja $$2, dja $$3) {
      return new dqi(false, $$0, $$1, $$2, $$3);
   }

   public static dqi a(boolean $$0, dja $$1) {
      return new dqi($$0, $$1, a.c(), a.d(), a.e());
   }

   private dqi(boolean $$0, dja $$1, dja $$2, dja $$3, dja $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dja b() {
      return this.d;
   }

   public dja c() {
      return this.e;
   }

   public dja d() {
      return this.f;
   }

   public dja e() {
      return this.g;
   }
}
