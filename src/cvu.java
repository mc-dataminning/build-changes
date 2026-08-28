import java.util.List;

public class cvu extends crw {
   public cvu(ctx.a $$0) {
      super($$0);
   }

   @Override
   public cuc w() {
      cuc $$0 = super.w();
      $$0.b(kn.G, new cwd(cwe.C));
      return $$0;
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      cwd $$4 = $$0.a(kn.G);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String h(cuc $$0) {
      return cwb.a($$0.a(kn.G, cwd.a).e(), this.a() + ".effect.");
   }
}
