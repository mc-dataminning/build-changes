import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drb extends djq {
   public static final MapCodec<drb> a = b(drb::new);
   public static final dyh b = dyg.c;
   private final bsd c = bsa.a(5);

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0.C ? null : a($$2, duu.L, dwb::a);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, cxh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
