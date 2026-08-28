import com.mojang.serialization.Codec;
import java.util.List;

public class cyc implements crg {
   public static final Codec<jq<cyc>> a = lz.h.r();
   public static final zj<ww, jq<cyc>> b = zh.b(ma.ad);
   private final String c;
   private final List<btn> d;
   private crj e = crl.h;

   public cyc(String $$0, btn... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cyc a(crh... $$0) {
      this.e = crl.f.a($$0);
      return this;
   }

   @Override
   public crj i() {
      return this.e;
   }

   public List<btn> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (btn $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
