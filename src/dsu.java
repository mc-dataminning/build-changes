import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsu {
   public static final dsu a = new dsu(false, cyu.gz.o(), cyu.pL.o(), cyu.ej.o(), cyu.aQ.o());
   public static final Codec<dsu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dsu::a),
               dlj.b.optionalFieldOf("air_state", a.b()).forGetter(dsu::b),
               dlj.b.optionalFieldOf("water_state", a.b()).forGetter(dsu::c),
               dlj.b.optionalFieldOf("lava_state", a.b()).forGetter(dsu::d),
               dlj.b.optionalFieldOf("barrier_state", a.b()).forGetter(dsu::e)
            )
            .apply($$0, dsu::new)
   );
   private final boolean c;
   private final dlj d;
   private final dlj e;
   private final dlj f;
   private final dlj g;

   public static dsu a(boolean $$0, dlj $$1, dlj $$2, dlj $$3, dlj $$4) {
      return new dsu($$0, $$1, $$2, $$3, $$4);
   }

   public static dsu a(dlj $$0, dlj $$1, dlj $$2, dlj $$3) {
      return new dsu(false, $$0, $$1, $$2, $$3);
   }

   public static dsu a(boolean $$0, dlj $$1) {
      return new dsu($$0, $$1, a.c(), a.d(), a.e());
   }

   private dsu(boolean $$0, dlj $$1, dlj $$2, dlj $$3, dlj $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dlj b() {
      return this.d;
   }

   public dlj c() {
      return this.e;
   }

   public dlj d() {
      return this.f;
   }

   public dlj e() {
      return this.g;
   }
}
