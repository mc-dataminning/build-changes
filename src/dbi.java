import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dbi(cxt<cyl> c) implements dbx {
   public static final Codec<dbi> a = cxt.a(mg.aS, cyl.c).xmap(dbi::new, dbi::a);
   public static final yu<wh, dbi> b = cxt.a(mg.aS, cyl.d).a(dbi::new, dbi::a);

   public dbi(je<cyl> $$0) {
      this(new cxt<>($$0));
   }

   @Deprecated
   public dbi(ald<cyl> $$0) {
      this(new cxt<>($$0));
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      jg.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<je<cyl>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            xk $$6 = $$5.get().a().d().f();
            wz.a($$6, xt.a.a(n.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<je<cyl>> a(jg.a $$0) {
      return this.c.a($$0);
   }

   public cxt<cyl> a() {
      return this.c;
   }
}
