import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dox extends dme implements dlx, dsy {
   public static final MapCodec<dox> a = b(dox::new);
   public static final eam<ja> b = eae.T;
   public static final eao c = eae.U;
   private final Function<dzo, feq> g;

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   protected dox(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<dzo, feq> q() {
      return this.a(this.a(b, c));
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
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public eao c() {
      return c;
   }

   @Override
   public dzo a(dcl $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return true;
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cys(this));
      }
   }
}
