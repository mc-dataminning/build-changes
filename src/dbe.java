import com.mojang.serialization.Codec;
import java.util.List;

public class dbe implements cuq {
   public static final Codec<jf<dbe>> a = mg.h.r();
   public static final yw<wj, jf<dbe>> b = yu.b(mh.ae);
   private final String c;
   private final List<bvm> d;
   private cut e = cuv.g;

   public dbe(String $$0, bvm... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public dbe a(cur... $$0) {
      this.e = cuv.e.a($$0);
      return this;
   }

   @Override
   public cut k() {
      return this.e;
   }

   public List<bvm> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bvm $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
