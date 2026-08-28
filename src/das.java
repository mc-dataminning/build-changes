import com.mojang.serialization.Codec;
import java.util.List;

public class das implements cue {
   public static final Codec<je<das>> a = mf.h.r();
   public static final yw<wj, je<das>> b = yu.b(mg.ae);
   private final String c;
   private final List<bvh> d;
   private cuh e = cuj.g;

   public das(String $$0, bvh... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public das a(cuf... $$0) {
      this.e = cuj.e.a($$0);
      return this;
   }

   @Override
   public cuh k() {
      return this.e;
   }

   public List<bvh> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bvh $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
