import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dda(czl<dad> c) implements ddp {
   public static final Codec<dda> a = czl.a(mi.aU, dad.c).xmap(dda::new, dda::a);
   public static final ze<wp, dda> b = czl.a(mi.aU, dad.d).a(dda::new, dda::a);

   public dda(jg<dad> $$0) {
      this(new czl<>($$0));
   }

   @Deprecated
   public dda(alq<dad> $$0) {
      this(new czl<>($$0));
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      ji.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<jg<dad>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            xu $$6 = $$5.get().a().d().f();
            xj.a($$6, yd.a.a(o.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<jg<dad>> a(ji.a $$0) {
      return this.c.a($$0);
   }

   public czl<dad> a() {
      return this.c;
   }
}
