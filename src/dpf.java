import com.mojang.serialization.MapCodec;

public class dpf extends dpt {
   public static final MapCodec<dpf> a = b(dpf::new);

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   public dpf(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
