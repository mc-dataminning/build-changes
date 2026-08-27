import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfe extends cwc {
   public static final MapCodec<dfe> a = b(dfe::new);
   public static final dkf<diu> b = djx.by;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, diu.a));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dio($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0 instanceof and $$3
         ? a($$2, dgx.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.d().b($$3, $$2x))
         : a($$2, dgx.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.d().a($$0x, $$1x));
   }

   @Override
   public void a(cmy $$0, @Nullable csv $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      cuh.a($$0, $$2, "spawn_data");
   }
}
