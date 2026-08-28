import com.mojang.serialization.Codec;
import java.util.List;

public class czm implements csq {
   public static final Codec<jq<czm>> a = ma.h.r();
   public static final zt<xg, jq<czm>> b = zr.b(mb.ad);
   private final String c;
   private final List<bup> d;
   private cst e = csv.h;

   public czm(String $$0, bup... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public czm a(csr... $$0) {
      this.e = csv.f.a($$0);
      return this;
   }

   @Override
   public cst i() {
      return this.e;
   }

   public List<bup> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bup $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
