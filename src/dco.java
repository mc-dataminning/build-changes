import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dco(cyz<czr> c) implements ddd {
   public static final Codec<dco> a = cyz.a(mh.aU, czr.c).xmap(dco::new, dco::a);
   public static final yy<wl, dco> b = cyz.a(mh.aU, czr.d).a(dco::new, dco::a);

   public dco(jf<czr> $$0) {
      this(new cyz<>($$0));
   }

   @Deprecated
   public dco(alh<czr> $$0) {
      this(new cyz<>($$0));
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      jh.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<jf<czr>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            xo $$6 = $$5.get().a().d().f();
            xd.a($$6, xx.a.a(o.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<jf<czr>> a(jh.a $$0) {
      return this.c.a($$0);
   }

   public cyz<czr> a() {
      return this.c;
   }
}
