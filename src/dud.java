import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dud extends dlr {
   public static final MapCodec<dud> a = b(dud::new);

   @Override
   public MapCodec<dud> a() {
      return a;
   }

   protected dud(eag.d $$0) {
      super($$0);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.j, $$0.C ? dyx::a : dyx::b);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, czd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
