import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtp {
   public static final dtp a = new dtp(false, czh.gz.o(), czh.pL.o(), czh.ej.o(), czh.aQ.o());
   public static final Codec<dtp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dtp::a),
               dme.b.optionalFieldOf("air_state", a.b()).forGetter(dtp::b),
               dme.b.optionalFieldOf("water_state", a.b()).forGetter(dtp::c),
               dme.b.optionalFieldOf("lava_state", a.b()).forGetter(dtp::d),
               dme.b.optionalFieldOf("barrier_state", a.b()).forGetter(dtp::e)
            )
            .apply($$0, dtp::new)
   );
   private final boolean c;
   private final dme d;
   private final dme e;
   private final dme f;
   private final dme g;

   public static dtp a(boolean $$0, dme $$1, dme $$2, dme $$3, dme $$4) {
      return new dtp($$0, $$1, $$2, $$3, $$4);
   }

   public static dtp a(dme $$0, dme $$1, dme $$2, dme $$3) {
      return new dtp(false, $$0, $$1, $$2, $$3);
   }

   public static dtp a(boolean $$0, dme $$1) {
      return new dtp($$0, $$1, a.c(), a.d(), a.e());
   }

   private dtp(boolean $$0, dme $$1, dme $$2, dme $$3, dme $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dme b() {
      return this.d;
   }

   public dme c() {
      return this.e;
   }

   public dme d() {
      return this.f;
   }

   public dme e() {
      return this.g;
   }
}
