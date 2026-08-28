import com.mojang.serialization.Codec;
import java.util.List;

public class dbs implements cve {
   public static final Codec<jf<dbs>> a = mg.h.r();
   public static final yy<wl, jf<dbs>> b = yw.b(mh.ae);
   private final String c;
   private final List<bvx> d;
   private cvh e = cvj.g;

   public dbs(String $$0, bvx... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public dbs a(cvf... $$0) {
      this.e = cvj.e.a($$0);
      return this;
   }

   @Override
   public cvh k() {
      return this.e;
   }

   public List<bvx> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bvx $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
