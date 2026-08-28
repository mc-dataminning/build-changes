import com.mojang.serialization.Codec;
import java.util.List;

public class czl implements csp {
   public static final Codec<jq<czl>> a = ma.h.r();
   public static final zt<xg, jq<czl>> b = zr.b(mb.ad);
   private final String c;
   private final List<buo> d;
   private css e = csu.h;

   public czl(String $$0, buo... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public czl a(csq... $$0) {
      this.e = csu.f.a($$0);
      return this;
   }

   @Override
   public css i() {
      return this.e;
   }

   public List<buo> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (buo $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
