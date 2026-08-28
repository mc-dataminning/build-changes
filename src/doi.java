import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doi extends djk implements dqq {
   public static final MapCodec<doi> a = b(doi::new);
   public static final dxm b = dxl.J;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   protected doi(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dwv $$0, dwv $$1, jn $$2) {
      return $$1.a(djm.ag) && $$2.o() == jn.a.b;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esy.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(b) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }
}
