import com.mojang.serialization.Codec;
import java.util.List;

public class dam implements cty {
   public static final Codec<je<dam>> a = mf.h.r();
   public static final yu<wh, je<dam>> b = ys.b(mg.ae);
   private final String c;
   private final List<bve> d;
   private cub e = cud.g;

   public dam(String $$0, bve... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public dam a(ctz... $$0) {
      this.e = cud.e.a($$0);
      return this;
   }

   @Override
   public cub k() {
      return this.e;
   }

   public List<bve> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bve $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
