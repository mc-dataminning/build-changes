import com.mojang.serialization.Codec;
import java.util.List;

public class czh implements csl {
   public static final Codec<jq<czh>> a = ma.h.r();
   public static final zt<xg, jq<czh>> b = zr.b(mb.ad);
   private final String c;
   private final List<buk> d;
   private cso e = csq.h;

   public czh(String $$0, buk... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public czh a(csm... $$0) {
      this.e = csq.f.a($$0);
      return this;
   }

   @Override
   public cso i() {
      return this.e;
   }

   public List<buk> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (buk $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
