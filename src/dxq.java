import com.mojang.serialization.Codec;

public class dxq {
   public static enum a implements azu {
      a("air"),
      b("liquid");

      public static final Codec<dxq.a> c = azu.a(dxq.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static enum b implements azu {
      a("raw_generation"),
      b("lakes"),
      c("local_modifications"),
      d("underground_structures"),
      e("surface_structures"),
      f("strongholds"),
      g("underground_ores"),
      h("underground_decoration"),
      i("fluid_springs"),
      j("vegetal_decoration"),
      k("top_layer_modification");

      public static final Codec<dxq.b> l = azu.a(dxq.b::values);
      private final String m;

      private b(final String $$0) {
         this.m = $$0;
      }

      public String a() {
         return this.m;
      }

      @Override
      public String c() {
         return this.m;
      }
   }
}
