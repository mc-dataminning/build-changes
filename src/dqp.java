import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqp {
   public static final dqp a = new dqp(false, cws.gz.o(), cws.pL.o(), cws.ej.o(), cws.aQ.o());
   public static final Codec<dqp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dqp::a),
               djh.b.optionalFieldOf("air_state", a.b()).forGetter(dqp::b),
               djh.b.optionalFieldOf("water_state", a.b()).forGetter(dqp::c),
               djh.b.optionalFieldOf("lava_state", a.b()).forGetter(dqp::d),
               djh.b.optionalFieldOf("barrier_state", a.b()).forGetter(dqp::e)
            )
            .apply($$0, dqp::new)
   );
   private final boolean c;
   private final djh d;
   private final djh e;
   private final djh f;
   private final djh g;

   public static dqp a(boolean $$0, djh $$1, djh $$2, djh $$3, djh $$4) {
      return new dqp($$0, $$1, $$2, $$3, $$4);
   }

   public static dqp a(djh $$0, djh $$1, djh $$2, djh $$3) {
      return new dqp(false, $$0, $$1, $$2, $$3);
   }

   public static dqp a(boolean $$0, djh $$1) {
      return new dqp($$0, $$1, a.c(), a.d(), a.e());
   }

   private dqp(boolean $$0, djh $$1, djh $$2, djh $$3, djh $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public djh b() {
      return this.d;
   }

   public djh c() {
      return this.e;
   }

   public djh d() {
      return this.f;
   }

   public djh e() {
      return this.g;
   }
}
