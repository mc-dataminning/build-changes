import com.mojang.serialization.MapCodec;

public class dli extends djc {
   public static final MapCodec<dli> b = b(dli::new);
   public static final dtw c = djc.aE;

   @Override
   public MapCodec<? extends dli> a() {
      return b;
   }

   protected dli(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, iw.c));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }
}
