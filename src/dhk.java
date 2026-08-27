import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dhk extends dja implements ded, dlb {
   public static final MapCodec<dhk> a = b(dhk::new);
   private static final dru c = drt.C;
   private final djb d = new djb(this);

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   public dhk(drc.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<drd> b(int $$0) {
      return $$1 -> dja.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, cxb $$1) {
      return !$$1.n().a(ctt.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return it.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return $$0.u().c();
   }

   @Override
   public djb c() {
      return this.d;
   }
}
