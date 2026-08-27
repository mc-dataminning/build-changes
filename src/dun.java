import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dun {
   public static final dun a = new dun(false, dae.gz.o(), dae.pL.o(), dae.ej.o(), dae.aQ.o());
   public static final Codec<dun> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dun::a),
               dnb.b.optionalFieldOf("air_state", a.b()).forGetter(dun::b),
               dnb.b.optionalFieldOf("water_state", a.b()).forGetter(dun::c),
               dnb.b.optionalFieldOf("lava_state", a.b()).forGetter(dun::d),
               dnb.b.optionalFieldOf("barrier_state", a.b()).forGetter(dun::e)
            )
            .apply($$0, dun::new)
   );
   private final boolean c;
   private final dnb d;
   private final dnb e;
   private final dnb f;
   private final dnb g;

   public static dun a(boolean $$0, dnb $$1, dnb $$2, dnb $$3, dnb $$4) {
      return new dun($$0, $$1, $$2, $$3, $$4);
   }

   public static dun a(dnb $$0, dnb $$1, dnb $$2, dnb $$3) {
      return new dun(false, $$0, $$1, $$2, $$3);
   }

   public static dun a(boolean $$0, dnb $$1) {
      return new dun($$0, $$1, a.c(), a.d(), a.e());
   }

   private dun(boolean $$0, dnb $$1, dnb $$2, dnb $$3, dnb $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dnb b() {
      return this.d;
   }

   public dnb c() {
      return this.e;
   }

   public dnb d() {
      return this.f;
   }

   public dnb e() {
      return this.g;
   }
}
