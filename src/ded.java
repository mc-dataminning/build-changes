import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ded extends cwc {
   public static final MapCodec<ded> a = b(ded::new);

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   protected ded(djg.d $$0) {
      super($$0);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dii($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.j, $$0.B ? dii::a : dii::b);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, cmy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public void a(cmy $$0, @Nullable csv $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      cuh.a($$0, $$2, "SpawnData");
   }
}
