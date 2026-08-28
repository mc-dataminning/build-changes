import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqh extends dme implements dsy {
   public static final MapCodec<dqh> a = b(dqh::new);
   public static final eam<ja> b = eae.T;
   private final Function<dzo, feq> c;

   public dqh(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<dzo, feq> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<dqh> a() {
      return a;
   }

   @Override
   public dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(dzo $$0, dcl $$1) {
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   public feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.c.apply($$0);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, this.c());
   }
}
