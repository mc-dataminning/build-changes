import com.mojang.serialization.Codec;
import java.util.List;

public class czc implements csk {
   public static final Codec<jr<czc>> a = mb.h.r();
   public static final yn<wa, jr<czc>> b = yl.b(mc.ad);
   private final String c;
   private final List<bue> d;
   private csn e = csp.g;

   public czc(String $$0, bue... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public czc a(csl... $$0) {
      this.e = csp.e.a($$0);
      return this;
   }

   @Override
   public csn k() {
      return this.e;
   }

   public List<bue> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bue $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
