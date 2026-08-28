import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class die extends dju implements dex, dlv {
   public static final MapCodec<die> a = b(die::new);
   private static final dso c = dsn.C;
   private final djv d = new djv(this);

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(drw.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<drx> b(int $$0) {
      return $$1 -> dju.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      return !$$1.n().a(cun.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return je.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   public djv c() {
      return this.d;
   }
}
