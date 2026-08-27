import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmr {
   public static final dmr a = new dmr(false, csw.gz.n(), csw.pL.n(), csw.ek.n(), csw.aQ.n());
   public static final Codec<dmr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dmr::a),
               dfj.b.optionalFieldOf("air_state", a.b()).forGetter(dmr::b),
               dfj.b.optionalFieldOf("water_state", a.b()).forGetter(dmr::c),
               dfj.b.optionalFieldOf("lava_state", a.b()).forGetter(dmr::d),
               dfj.b.optionalFieldOf("barrier_state", a.b()).forGetter(dmr::e)
            )
            .apply($$0, dmr::new)
   );
   private final boolean c;
   private final dfj d;
   private final dfj e;
   private final dfj f;
   private final dfj g;

   public static dmr a(boolean $$0, dfj $$1, dfj $$2, dfj $$3, dfj $$4) {
      return new dmr($$0, $$1, $$2, $$3, $$4);
   }

   public static dmr a(dfj $$0, dfj $$1, dfj $$2, dfj $$3) {
      return new dmr(false, $$0, $$1, $$2, $$3);
   }

   public static dmr a(boolean $$0, dfj $$1) {
      return new dmr($$0, $$1, a.c(), a.d(), a.e());
   }

   private dmr(boolean $$0, dfj $$1, dfj $$2, dfj $$3, dfj $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dfj b() {
      return this.d;
   }

   public dfj c() {
      return this.e;
   }

   public dfj d() {
      return this.f;
   }

   public dfj e() {
      return this.g;
   }
}
