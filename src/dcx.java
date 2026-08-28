import com.mojang.serialization.Codec;
import java.util.Optional;

public record dcx(cyz<dil> c) {
   public static final Codec<dcx> a = cyz.a(mh.bk, dil.c).xmap(dcx::new, dcx::a);
   public static final yy<wl, dcx> b = cyz.a(mh.bk, dil.d).a(dcx::new, dcx::a);

   public dcx(jf<dil> $$0) {
      this(new cyz<>($$0));
   }

   @Deprecated
   public dcx(alh<dil> $$0) {
      this(new cyz<>($$0));
   }

   public Optional<jf<dil>> a(jh.a $$0) {
      return this.c.a($$0);
   }

   public cyz<dil> a() {
      return this.c;
   }
}
