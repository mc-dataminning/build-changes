import com.mojang.serialization.Codec;
import java.util.List;

public class dce implements cvp {
   public static final Codec<jg<dce>> a = mh.h.r();
   public static final ze<wp, jg<dce>> b = zc.b(mi.ae);
   private final String c;
   private final List<bwi> d;
   private cvs e = cvu.g;

   public dce(String $$0, bwi... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public dce a(cvq... $$0) {
      this.e = cvu.e.a($$0);
      return this;
   }

   @Override
   public cvs k() {
      return this.e;
   }

   public List<bwi> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bwi $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
