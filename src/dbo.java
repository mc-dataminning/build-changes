import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dbo(cxz<cyr> c) implements dcd {
   public static final Codec<dbo> a = cxz.a(mg.aT, cyr.c).xmap(dbo::new, dbo::a);
   public static final yw<wj, dbo> b = cxz.a(mg.aT, cyr.d).a(dbo::new, dbo::a);

   public dbo(je<cyr> $$0) {
      this(new cxz<>($$0));
   }

   @Deprecated
   public dbo(alf<cyr> $$0) {
      this(new cxz<>($$0));
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      jg.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<je<cyr>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            xm $$6 = $$5.get().a().d().f();
            xb.a($$6, xv.a.a(n.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<je<cyr>> a(jg.a $$0) {
      return this.c.a($$0);
   }

   public cxz<cyr> a() {
      return this.c;
   }
}
