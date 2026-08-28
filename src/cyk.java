import com.mojang.serialization.Codec;
import java.util.List;

public class cyk implements cro {
   public static final Codec<jr<cyk>> a = mb.h.r();
   public static final ym<vz, jr<cyk>> b = yk.b(mc.ad);
   private final String c;
   private final List<bto> d;
   private crr e = crt.g;

   public cyk(String $$0, bto... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cyk a(crp... $$0) {
      this.e = crt.e.a($$0);
      return this;
   }

   @Override
   public crr i() {
      return this.e;
   }

   public List<bto> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bto $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
