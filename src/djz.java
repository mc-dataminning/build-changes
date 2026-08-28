import com.mojang.serialization.MapCodec;

public class djz extends djd {
   public static final MapCodec<djz> a = b(djz::new);
   private static final wu b = wu.c("container.loom");

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   protected djz(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.ax);
         return bqg.c;
      }
   }

   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return new bqq(($$2x, $$3, $$4) -> new cqn($$2x, $$3, cpt.a($$1, $$2)), b);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(aE);
   }
}
