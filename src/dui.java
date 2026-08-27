import com.mojang.serialization.Codec;

public class dui<P extends duh> {
   public static final dui<duk> a = a("two_layers_feature_size", duk.d);
   public static final dui<duj> b = a("three_layers_feature_size", duj.d);
   private final Codec<P> c;

   private static <P extends duh> dui<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.aa, $$0, new dui<>($$1));
   }

   private dui(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
