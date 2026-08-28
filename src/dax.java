import com.mojang.serialization.Codec;
import java.util.List;

public class dax implements cuj {
   public static final Codec<je<dax>> a = mf.h.r();
   public static final yw<wj, je<dax>> b = yu.b(mg.ae);
   private final String c;
   private final List<bvj> d;
   private cum e = cuo.g;

   public dax(String $$0, bvj... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public dax a(cuk... $$0) {
      this.e = cuo.e.a($$0);
      return this;
   }

   @Override
   public cum k() {
      return this.e;
   }

   public List<bvj> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bvj $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
