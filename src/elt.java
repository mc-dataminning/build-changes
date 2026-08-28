import com.mojang.serialization.Codec;

public class elt extends ekw<enm> {
   public elt(Codec<enm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enm> $$0) {
      bai $$1 = $$0.d();
      enm $$2 = $$0.f();
      dli $$3 = $$0.b();
      edo $$4 = $$0.c();
      iw $$5 = $$0.e();
      boolean $$6 = $$1.h();
      return ($$6 ? $$2.b : $$2.c).a().a($$3, $$4, $$1, $$5);
   }
}
