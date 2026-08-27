import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djj {
   public static final djj a = new djj(false, cpo.gz.n(), cpo.pL.n(), cpo.ek.n(), cpo.aQ.n());
   public static final Codec<djj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(djj::a),
               dcb.b.optionalFieldOf("air_state", a.b()).forGetter(djj::b),
               dcb.b.optionalFieldOf("water_state", a.b()).forGetter(djj::c),
               dcb.b.optionalFieldOf("lava_state", a.b()).forGetter(djj::d),
               dcb.b.optionalFieldOf("barrier_state", a.b()).forGetter(djj::e)
            )
            .apply($$0, djj::new)
   );
   private final boolean c;
   private final dcb d;
   private final dcb e;
   private final dcb f;
   private final dcb g;

   public static djj a(boolean $$0, dcb $$1, dcb $$2, dcb $$3, dcb $$4) {
      return new djj($$0, $$1, $$2, $$3, $$4);
   }

   public static djj a(dcb $$0, dcb $$1, dcb $$2, dcb $$3) {
      return new djj(false, $$0, $$1, $$2, $$3);
   }

   public static djj a(boolean $$0, dcb $$1) {
      return new djj($$0, $$1, a.c(), a.d(), a.e());
   }

   private djj(boolean $$0, dcb $$1, dcb $$2, dcb $$3, dcb $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dcb b() {
      return this.d;
   }

   public dcb c() {
      return this.e;
   }

   public dcb d() {
      return this.f;
   }

   public dcb e() {
      return this.g;
   }
}
