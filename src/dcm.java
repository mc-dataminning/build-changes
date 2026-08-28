import com.mojang.serialization.Codec;
import java.util.Optional;

public record dcm(cyo<dia> c) {
   public static final Codec<dcm> a = cyo.a(mh.bk, dia.c).xmap(dcm::new, dcm::a);
   public static final yw<wj, dcm> b = cyo.a(mh.bk, dia.d).a(dcm::new, dcm::a);

   public dcm(jf<dia> $$0) {
      this(new cyo<>($$0));
   }

   @Deprecated
   public dcm(alf<dia> $$0) {
      this(new cyo<>($$0));
   }

   public Optional<jf<dia>> a(jh.a $$0) {
      return this.c.a($$0);
   }

   public cyo<dia> a() {
      return this.c;
   }
}
