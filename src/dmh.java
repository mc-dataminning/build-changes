import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmh {
   public static final dmh a = new dmh(false, csm.gz.n(), csm.pL.n(), csm.ek.n(), csm.aQ.n());
   public static final Codec<dmh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dmh::a),
               dez.b.optionalFieldOf("air_state", a.b()).forGetter(dmh::b),
               dez.b.optionalFieldOf("water_state", a.b()).forGetter(dmh::c),
               dez.b.optionalFieldOf("lava_state", a.b()).forGetter(dmh::d),
               dez.b.optionalFieldOf("barrier_state", a.b()).forGetter(dmh::e)
            )
            .apply($$0, dmh::new)
   );
   private final boolean c;
   private final dez d;
   private final dez e;
   private final dez f;
   private final dez g;

   public static dmh a(boolean $$0, dez $$1, dez $$2, dez $$3, dez $$4) {
      return new dmh($$0, $$1, $$2, $$3, $$4);
   }

   public static dmh a(dez $$0, dez $$1, dez $$2, dez $$3) {
      return new dmh(false, $$0, $$1, $$2, $$3);
   }

   public static dmh a(boolean $$0, dez $$1) {
      return new dmh($$0, $$1, a.c(), a.d(), a.e());
   }

   private dmh(boolean $$0, dez $$1, dez $$2, dez $$3, dez $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dez b() {
      return this.d;
   }

   public dez c() {
      return this.e;
   }

   public dez d() {
      return this.f;
   }

   public dez e() {
      return this.g;
   }
}
