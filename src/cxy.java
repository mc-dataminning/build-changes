import com.mojang.serialization.Codec;
import java.util.List;

public class cxy implements crc {
   public static final Codec<jq<cxy>> a = ly.h.r();
   public static final zg<wt, jq<cxy>> b = ze.b(lz.ad);
   private final String c;
   private final List<btj> d;
   private crf e = crh.h;

   public cxy(String $$0, btj... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cxy a(crd... $$0) {
      this.e = crh.f.a($$0);
      return this;
   }

   @Override
   public crf i() {
      return this.e;
   }

   public List<btj> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (btj $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
