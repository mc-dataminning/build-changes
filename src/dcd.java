import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dcd(cyo<czg> c) implements dcs {
   public static final Codec<dcd> a = cyo.a(mh.aU, czg.c).xmap(dcd::new, dcd::a);
   public static final yw<wj, dcd> b = cyo.a(mh.aU, czg.d).a(dcd::new, dcd::a);

   public dcd(jf<czg> $$0) {
      this(new cyo<>($$0));
   }

   @Deprecated
   public dcd(alf<czg> $$0) {
      this(new cyo<>($$0));
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      jh.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<jf<czg>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            xm $$6 = $$5.get().a().d().f();
            xb.a($$6, xv.a.a(o.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<jf<czg>> a(jh.a $$0) {
      return this.c.a($$0);
   }

   public cyo<czg> a() {
      return this.c;
   }
}
