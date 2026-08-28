import java.util.List;

public class cwh extends csi {
   public cwh(cuk.a $$0) {
      super($$0);
   }

   @Override
   public cup w() {
      cup $$0 = super.w();
      $$0.b(km.G, new cwq(cwr.C));
      return $$0;
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      cwq $$4 = $$0.a(km.G);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String i(cup $$0) {
      return cwo.a($$0.a(km.G, cwq.a).e(), this.a() + ".effect.");
   }
}
