import com.mojang.serialization.Codec;

public class eee extends ees {
   public static final Codec<eee> a = bnf.b(0, 256).fieldOf("count").xmap(eee::new, $$0 -> $$0.c).codec();
   private final bnf c;

   private eee(bnf $$0) {
      this.c = $$0;
   }

   public static eee a(bnf $$0) {
      return new eee($$0);
   }

   public static eee a(int $$0) {
      return a(bnc.a($$0));
   }

   @Override
   protected int a(axr $$0, ib $$1) {
      return this.c.a($$0);
   }

   @Override
   public eep<?> b() {
      return eep.f;
   }
}
