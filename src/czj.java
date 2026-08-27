import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class czj extends day implements cwc, dcz {
   public static final MapCodec<czj> a = b(czj::new);
   private static final djg c = djf.C;
   private final daz d = new daz(this);

   @Override
   public MapCodec<czj> a() {
      return a;
   }

   public czj(dio.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dip> b(int $$0) {
      return $$1 -> day.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return !$$1.n().a(cmk.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return ia.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(c) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return $$0.u().c();
   }

   @Override
   public daz c() {
      return this.d;
   }
}
