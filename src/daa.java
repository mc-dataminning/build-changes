import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class daa extends dbp implements cwt, ddq {
   public static final MapCodec<daa> a = b(daa::new);
   private static final djy c = djx.C;
   private final dbq d = new dbq(this);

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   public daa(djg.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<djh> b(int $$0) {
      return $$1 -> dbp.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      return !$$1.n().a(cnb.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return ic.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public dbq c() {
      return this.d;
   }
}
