import com.mojang.serialization.MapCodec;

public class drb extends drp {
   public static final MapCodec<drb> a = b(drb::new);

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
