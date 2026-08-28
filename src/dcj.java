import com.mojang.serialization.Codec;
import java.util.Optional;

public record dcj(cyl<dhx> c) {
   public static final Codec<dcj> a = cyl.a(mh.bk, dhx.c).xmap(dcj::new, dcj::a);
   public static final yw<wj, dcj> b = cyl.a(mh.bk, dhx.d).a(dcj::new, dcj::a);

   public dcj(jf<dhx> $$0) {
      this(new cyl<>($$0));
   }

   @Deprecated
   public dcj(alf<dhx> $$0) {
      this(new cyl<>($$0));
   }

   public Optional<jf<dhx>> a(jh.a $$0) {
      return this.c.a($$0);
   }

   public cyl<dhx> a() {
      return this.c;
   }
}
