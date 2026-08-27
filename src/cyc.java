import com.mojang.serialization.MapCodec;

public class cyc extends cyo {
   public static final MapCodec<cyc> a = b(cyc::new);

   @Override
   public MapCodec<cyc> a() {
      return a;
   }

   public cyc(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
