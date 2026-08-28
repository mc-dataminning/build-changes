import java.util.List;

public class cwj extends csh {
   public cwj(cuj.a $$0) {
      super($$0);
   }

   @Override
   public cuo w() {
      cuo $$0 = super.w();
      $$0.b(kq.G, new cws(cwt.C));
      return $$0;
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      cws $$4 = $$0.a(kq.G);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String h(cuo $$0) {
      return cwq.a($$0.a(kq.G, cws.a).e(), this.a() + ".effect.");
   }
}
