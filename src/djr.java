import com.mojang.serialization.MapCodec;

public class djr extends div {
   public static final MapCodec<djr> a = b(djr::new);
   private static final xp b = xp.c("container.loom");

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   protected djr(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.ax);
         return bqu.c;
      }
   }

   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return new bre(($$2x, $$3, $$4) -> new cqz($$2x, $$3, cqf.a($$1, $$2)), b);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(aE);
   }
}
