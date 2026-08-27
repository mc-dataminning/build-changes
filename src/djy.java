import com.mojang.serialization.MapCodec;

public class djy extends djc {
   public static final MapCodec<djy> a = b(djy::new);
   private static final xe b = xe.c("container.loom");

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   protected djy(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.ay);
         return bqa.b;
      }
   }

   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return new bqk(($$2x, $$3, $$4) -> new cqm($$2x, $$3, cpr.a($$1, $$2)), b);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(aE);
   }
}
