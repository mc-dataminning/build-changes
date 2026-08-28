import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnf extends dfi {
   public static final MapCodec<dnf> a = b(dnf::new);
   private static final wu d = wu.c("container.stonecutter");
   public static final dtf b = dje.aE;
   protected static final exa c = dfi.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   public dnf(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.ay);
         return bqh.c;
      }
   }

   @Nullable
   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return new bqr(($$2x, $$3, $$4) -> new crk($$2x, $$3, cpu.a($$1, $$2)), d);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
