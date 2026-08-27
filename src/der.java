import com.mojang.serialization.MapCodec;

public class der extends ddv {
   public static final MapCodec<der> a = b(der::new);
   private static final vu b = vu.c("container.loom");

   @Override
   public MapCodec<der> a() {
      return a;
   }

   protected der(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.ax);
         return bnc.b;
      }
   }

   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return new bnm(($$2x, $$3, $$4) -> new cmt($$2x, $$3, clz.a($$1, $$2)), b);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(aE);
   }
}
