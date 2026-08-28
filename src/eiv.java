import com.mojang.serialization.Codec;

public class eiv implements eja {
   public static final Codec<eiv> a = bso.b(0, 256).fieldOf("count").xmap(eiv::new, eiv::a).codec();
   private final bso b;

   public eiv(int $$0) {
      this.b = bsl.a($$0);
   }

   public eiv(bso $$0) {
      this.b = $$0;
   }

   public bso a() {
      return this.b;
   }
}
