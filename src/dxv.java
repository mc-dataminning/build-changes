import com.mojang.serialization.Codec;

public class dxv {
   public static enum a implements ayz {
      a("air"),
      b("liquid");

      public static final Codec<dxv.a> c = ayz.a(dxv.a::values);
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

   public static enum b implements ayz {
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

      public static final Codec<dxv.b> l = ayz.a(dxv.b::values);
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
