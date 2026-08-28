import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzt {
   public static final dzt a = new dzt(false, dfb.gz.o(), dfb.pL.o(), dfb.ej.o(), dfb.aQ.o());
   public static final Codec<dzt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dzt::a),
               dsc.b.optionalFieldOf("air_state", a.b()).forGetter(dzt::b),
               dsc.b.optionalFieldOf("water_state", a.b()).forGetter(dzt::c),
               dsc.b.optionalFieldOf("lava_state", a.b()).forGetter(dzt::d),
               dsc.b.optionalFieldOf("barrier_state", a.b()).forGetter(dzt::e)
            )
            .apply($$0, dzt::new)
   );
   private final boolean c;
   private final dsc d;
   private final dsc e;
   private final dsc f;
   private final dsc g;

   public static dzt a(boolean $$0, dsc $$1, dsc $$2, dsc $$3, dsc $$4) {
      return new dzt($$0, $$1, $$2, $$3, $$4);
   }

   public static dzt a(dsc $$0, dsc $$1, dsc $$2, dsc $$3) {
      return new dzt(false, $$0, $$1, $$2, $$3);
   }

   public static dzt a(boolean $$0, dsc $$1) {
      return new dzt($$0, $$1, a.c(), a.d(), a.e());
   }

   private dzt(boolean $$0, dsc $$1, dsc $$2, dsc $$3, dsc $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dsc b() {
      return this.d;
   }

   public dsc c() {
      return this.e;
   }

   public dsc d() {
      return this.f;
   }

   public dsc e() {
      return this.g;
   }
}
