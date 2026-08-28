import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dca(cyl<czd> c) implements dcp {
   public static final Codec<dca> a = cyl.a(mh.aU, czd.c).xmap(dca::new, dca::a);
   public static final yw<wj, dca> b = cyl.a(mh.aU, czd.d).a(dca::new, dca::a);

   public dca(jf<czd> $$0) {
      this(new cyl<>($$0));
   }

   @Deprecated
   public dca(alf<czd> $$0) {
      this(new cyl<>($$0));
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      jh.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<jf<czd>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            xm $$6 = $$5.get().a().d().f();
            xb.a($$6, xv.a.a(o.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<jf<czd>> a(jh.a $$0) {
      return this.c.a($$0);
   }

   public cyl<czd> a() {
      return this.c;
   }
}
