import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eer {
   public static final eer a = new eer(false, djn.gV.m(), djn.qn.m(), djn.ew.m(), djn.aX.m());
   public static final Codec<eer> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eer::a),
               dww.a.optionalFieldOf("air_state", a.b()).forGetter(eer::b),
               dww.a.optionalFieldOf("water_state", a.b()).forGetter(eer::c),
               dww.a.optionalFieldOf("lava_state", a.b()).forGetter(eer::d),
               dww.a.optionalFieldOf("barrier_state", a.b()).forGetter(eer::e)
            )
            .apply($$0, eer::new)
   );
   private final boolean c;
   private final dww d;
   private final dww e;
   private final dww f;
   private final dww g;

   public static eer a(boolean $$0, dww $$1, dww $$2, dww $$3, dww $$4) {
      return new eer($$0, $$1, $$2, $$3, $$4);
   }

   public static eer a(dww $$0, dww $$1, dww $$2, dww $$3) {
      return new eer(false, $$0, $$1, $$2, $$3);
   }

   public static eer a(boolean $$0, dww $$1) {
      return new eer($$0, $$1, a.c(), a.d(), a.e());
   }

   private eer(boolean $$0, dww $$1, dww $$2, dww $$3, dww $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dww b() {
      return this.d;
   }

   public dww c() {
      return this.e;
   }

   public dww d() {
      return this.f;
   }

   public dww e() {
      return this.g;
   }
}
