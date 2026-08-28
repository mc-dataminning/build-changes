import com.mojang.serialization.Codec;
import java.util.List;

public class czs implements ctb {
   public static final Codec<js<czs>> a = md.h.r();
   public static final yt<wg, js<czs>> b = yr.b(me.ad);
   private final String c;
   private final List<buw> d;
   private cte e = ctg.g;

   public czs(String $$0, buw... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public czs a(ctc... $$0) {
      this.e = ctg.e.a($$0);
      return this;
   }

   @Override
   public cte k() {
      return this.e;
   }

   public List<buw> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (buw $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
