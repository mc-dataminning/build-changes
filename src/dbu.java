import com.mojang.serialization.Codec;
import java.util.List;

public class dbu implements cvg {
   public static final Codec<jg<dbu>> a = mh.h.r();
   public static final za<wn, jg<dbu>> b = yy.b(mi.ae);
   private final String c;
   private final List<bvz> d;
   private cvj e = cvl.g;

   public dbu(String $$0, bvz... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public dbu a(cvh... $$0) {
      this.e = cvl.e.a($$0);
      return this;
   }

   @Override
   public cvj k() {
      return this.e;
   }

   public List<bvz> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bvz $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
