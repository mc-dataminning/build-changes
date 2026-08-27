import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class czz extends dbo implements cws, ddp {
   public static final MapCodec<czz> a = b(czz::new);
   private static final djx c = djw.C;
   private final dbp d = new dbp(this);

   @Override
   public MapCodec<czz> a() {
      return a;
   }

   public czz(djf.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<djg> b(int $$0) {
      return $$1 -> dbo.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      return !$$1.n().a(cna.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return ic.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public dbp c() {
      return this.d;
   }
}
