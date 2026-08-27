import com.mojang.serialization.Codec;

public class duw {
   public static enum a implements ayg {
      a("air"),
      b("liquid");

      public static final Codec<duw.a> c = ayg.a(duw.a::values);
      private final String d;

      private a(String $$0) {
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

   public static enum b implements ayg {
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

      public static final Codec<duw.b> l = ayg.a(duw.b::values);
      private final String m;

      private b(String $$0) {
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
