import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egl {
   public static final egl a = new egl(false, dkw.gV.m(), dkw.qp.m(), dkw.ew.m(), dkw.aX.m());
   public static final Codec<egl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(egl::a),
               dym.a.optionalFieldOf("air_state", a.b()).forGetter(egl::b),
               dym.a.optionalFieldOf("water_state", a.b()).forGetter(egl::c),
               dym.a.optionalFieldOf("lava_state", a.b()).forGetter(egl::d),
               dym.a.optionalFieldOf("barrier_state", a.b()).forGetter(egl::e)
            )
            .apply($$0, egl::new)
   );
   private final boolean c;
   private final dym d;
   private final dym e;
   private final dym f;
   private final dym g;

   public static egl a(boolean $$0, dym $$1, dym $$2, dym $$3, dym $$4) {
      return new egl($$0, $$1, $$2, $$3, $$4);
   }

   public static egl a(dym $$0, dym $$1, dym $$2, dym $$3) {
      return new egl(false, $$0, $$1, $$2, $$3);
   }

   public static egl a(boolean $$0, dym $$1) {
      return new egl($$0, $$1, a.c(), a.d(), a.e());
   }

   private egl(boolean $$0, dym $$1, dym $$2, dym $$3, dym $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dym b() {
      return this.d;
   }

   public dym c() {
      return this.e;
   }

   public dym d() {
      return this.f;
   }

   public dym e() {
      return this.g;
   }
}
