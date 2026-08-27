import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxy {
   public static final dxy a = new dxy(false, ddg.gz.n(), ddg.pL.n(), ddg.ej.n(), ddg.aQ.n());
   public static final Codec<dxy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dxy::a),
               dqh.b.optionalFieldOf("air_state", a.b()).forGetter(dxy::b),
               dqh.b.optionalFieldOf("water_state", a.b()).forGetter(dxy::c),
               dqh.b.optionalFieldOf("lava_state", a.b()).forGetter(dxy::d),
               dqh.b.optionalFieldOf("barrier_state", a.b()).forGetter(dxy::e)
            )
            .apply($$0, dxy::new)
   );
   private final boolean c;
   private final dqh d;
   private final dqh e;
   private final dqh f;
   private final dqh g;

   public static dxy a(boolean $$0, dqh $$1, dqh $$2, dqh $$3, dqh $$4) {
      return new dxy($$0, $$1, $$2, $$3, $$4);
   }

   public static dxy a(dqh $$0, dqh $$1, dqh $$2, dqh $$3) {
      return new dxy(false, $$0, $$1, $$2, $$3);
   }

   public static dxy a(boolean $$0, dqh $$1) {
      return new dxy($$0, $$1, a.c(), a.d(), a.e());
   }

   private dxy(boolean $$0, dqh $$1, dqh $$2, dqh $$3, dqh $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dqh b() {
      return this.d;
   }

   public dqh c() {
      return this.e;
   }

   public dqh d() {
      return this.f;
   }

   public dqh e() {
      return this.g;
   }
}
