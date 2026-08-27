import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class czt extends dbi implements cwm, ddj {
   public static final MapCodec<czt> a = b(czt::new);
   private static final djr c = djq.C;
   private final dbj d = new dbj(this);

   @Override
   public MapCodec<czt> a() {
      return a;
   }

   public czt(diz.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dja> b(int $$0) {
      return $$1 -> dbi.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      return !$$1.n().a(cmu.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return ic.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(dja $$0, cso $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public dbj c() {
      return this.d;
   }
}
