import com.mojang.serialization.Codec;
import java.util.List;

public class czd implements csh {
   public static final Codec<jq<czd>> a = ma.h.r();
   public static final zi<wv, jq<czd>> b = zg.b(mb.ad);
   private final String c;
   private final List<bug> d;
   private csk e = csm.g;

   public czd(String $$0, bug... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public czd a(csi... $$0) {
      this.e = csm.e.a($$0);
      return this;
   }

   @Override
   public csk i() {
      return this.e;
   }

   public List<bug> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bug $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
