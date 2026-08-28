import com.mojang.serialization.Codec;
import java.util.List;

public class dbh implements cut {
   public static final Codec<jf<dbh>> a = mg.h.r();
   public static final yw<wj, jf<dbh>> b = yu.b(mh.ae);
   private final String c;
   private final List<bvm> d;
   private cuw e = cuy.g;

   public dbh(String $$0, bvm... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public dbh a(cuu... $$0) {
      this.e = cuy.e.a($$0);
      return this;
   }

   @Override
   public cuw k() {
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
