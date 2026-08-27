import com.mojang.serialization.MapCodec;

public class cyq extends cxu {
   public static final MapCodec<cyq> a = b(cyq::new);
   private static final ui b = ui.c("container.loom");

   @Override
   public MapCodec<cyq> a() {
      return a;
   }

   protected cyq(dga.d $$0) {
      super($$0);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqn.ax);
         return bib.b;
      }
   }

   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return new bij(($$2x, $$3, $$4) -> new cgs($$2x, $$3, cga.a($$1, $$2)), b);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(aE);
   }
}
