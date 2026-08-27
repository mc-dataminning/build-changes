import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqo {
   public static final dqo a = new dqo(false, cwr.gz.o(), cwr.pL.o(), cwr.ej.o(), cwr.aQ.o());
   public static final Codec<dqo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dqo::a),
               djg.b.optionalFieldOf("air_state", a.b()).forGetter(dqo::b),
               djg.b.optionalFieldOf("water_state", a.b()).forGetter(dqo::c),
               djg.b.optionalFieldOf("lava_state", a.b()).forGetter(dqo::d),
               djg.b.optionalFieldOf("barrier_state", a.b()).forGetter(dqo::e)
            )
            .apply($$0, dqo::new)
   );
   private final boolean c;
   private final djg d;
   private final djg e;
   private final djg f;
   private final djg g;

   public static dqo a(boolean $$0, djg $$1, djg $$2, djg $$3, djg $$4) {
      return new dqo($$0, $$1, $$2, $$3, $$4);
   }

   public static dqo a(djg $$0, djg $$1, djg $$2, djg $$3) {
      return new dqo(false, $$0, $$1, $$2, $$3);
   }

   public static dqo a(boolean $$0, djg $$1) {
      return new dqo($$0, $$1, a.c(), a.d(), a.e());
   }

   private dqo(boolean $$0, djg $$1, djg $$2, djg $$3, djg $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public djg b() {
      return this.d;
   }

   public djg c() {
      return this.e;
   }

   public djg d() {
      return this.f;
   }

   public djg e() {
      return this.g;
   }
}
