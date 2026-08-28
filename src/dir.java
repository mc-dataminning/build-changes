import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dir extends dkh implements dfk, dmi {
   public static final MapCodec<dir> a = b(dir::new);
   private static final dtb c = dta.C;
   private final dki d = new dki(this);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dsk> b(int $$0) {
      return $$1 -> dkh.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      return !$$1.n().a(cuf.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return jf.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(c) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   public dki c() {
      return this.d;
   }
}
