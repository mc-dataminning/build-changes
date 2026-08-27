import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dai extends dbx implements cxb, ddy {
   public static final MapCodec<dai> a = b(dai::new);
   private static final dkg c = dkf.C;
   private final dby d = new dby(this);

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public dai(djo.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<djp> b(int $$0) {
      return $$1 -> dbx.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      return !$$1.n().a(cnj.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return ic.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public dby c() {
      return this.d;
   }
}
