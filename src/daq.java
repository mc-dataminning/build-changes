import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record daq(Map<String, daq.a> c) {
   public static final daq a = new daq(Map.of());
   public static final Codec<daq> b = Codec.unboundedMap(Codec.STRING, daq.a.a).xmap(daq::new, daq::a);

   public daq a(String $$0, daq.a $$1) {
      return new daq(af.a(this.c, $$0, $$1));
   }

   public Map<String, daq.a> a() {
      return this.c;
   }

   public static record a(js<ewi> b, double c, double d, float e) {
      public static final Codec<daq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ewi.b.fieldOf("type").forGetter(daq.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(daq.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(daq.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(daq.a::d)
               )
               .apply($$0, daq.a::new)
      );

      public js<ewi> a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }

      public double c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }
}
