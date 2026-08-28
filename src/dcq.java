import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dcq(czb<czt> c) implements ddf {
   public static final Codec<dcq> a = czb.a(mi.aU, czt.c).xmap(dcq::new, dcq::a);
   public static final za<wn, dcq> b = czb.a(mi.aU, czt.d).a(dcq::new, dcq::a);

   public dcq(jg<czt> $$0) {
      this(new czb<>($$0));
   }

   @Deprecated
   public dcq(alj<czt> $$0) {
      this(new czb<>($$0));
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      ji.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<jg<czt>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            xq $$6 = $$5.get().a().d().f();
            xf.a($$6, xz.a.a(o.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<jg<czt>> a(ji.a $$0) {
      return this.c.a($$0);
   }

   public czb<czt> a() {
      return this.c;
   }
}
