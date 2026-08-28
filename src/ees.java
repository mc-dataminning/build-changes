import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ees {
   public static final ees a = new ees(false, djo.gV.m(), djo.qn.m(), djo.ew.m(), djo.aX.m());
   public static final Codec<ees> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ees::a),
               dwx.a.optionalFieldOf("air_state", a.b()).forGetter(ees::b),
               dwx.a.optionalFieldOf("water_state", a.b()).forGetter(ees::c),
               dwx.a.optionalFieldOf("lava_state", a.b()).forGetter(ees::d),
               dwx.a.optionalFieldOf("barrier_state", a.b()).forGetter(ees::e)
            )
            .apply($$0, ees::new)
   );
   private final boolean c;
   private final dwx d;
   private final dwx e;
   private final dwx f;
   private final dwx g;

   public static ees a(boolean $$0, dwx $$1, dwx $$2, dwx $$3, dwx $$4) {
      return new ees($$0, $$1, $$2, $$3, $$4);
   }

   public static ees a(dwx $$0, dwx $$1, dwx $$2, dwx $$3) {
      return new ees(false, $$0, $$1, $$2, $$3);
   }

   public static ees a(boolean $$0, dwx $$1) {
      return new ees($$0, $$1, a.c(), a.d(), a.e());
   }

   private ees(boolean $$0, dwx $$1, dwx $$2, dwx $$3, dwx $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dwx b() {
      return this.d;
   }

   public dwx c() {
      return this.e;
   }

   public dwx d() {
      return this.f;
   }

   public dwx e() {
      return this.g;
   }
}
