import com.mojang.serialization.Codec;

public class dwe extends dws {
   public static final Codec<dwe> a = bic.b(0, 256).fieldOf("count").xmap(dwe::new, $$0 -> $$0.c).codec();
   private final bic c;

   private dwe(bic $$0) {
      this.c = $$0;
   }

   public static dwe a(bic $$0) {
      return new dwe($$0);
   }

   public static dwe a(int $$0) {
      return a(bhz.a($$0));
   }

   @Override
   protected int a(ats $$0, ht $$1) {
      return this.c.a($$0);
   }

   @Override
   public dwp<?> b() {
      return dwp.f;
   }
}
