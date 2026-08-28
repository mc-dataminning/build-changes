import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqi extends dix {
   public static final MapCodec<dqi> a = b(dqi::new);
   public static final dxn b = dxm.d;
   private final bro c = brl.a(5);

   @Override
   public MapCodec<dqi> a() {
      return a;
   }

   public dqi(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0.C ? null : a($$2, dua.L, dvh::a);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, cwo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
