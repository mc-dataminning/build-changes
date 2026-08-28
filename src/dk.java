import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dk(ub c) {
   public static final Codec<dk> a = uz.j.xmap(dk::new, dk::a);
   public static final yx<ByteBuf, dk> b = yv.o.a(dk::new, dk::a);

   public boolean a(cuq $$0) {
      cxh $$1 = $$0.a(kq.b, cxh.a);
      return $$1.b(this.c);
   }

   public boolean a(bsr $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uy $$0) {
      return $$0 != null && uq.a(this.c, $$0, true);
   }

   public static ub b(bsr $$0) {
      ub $$1 = $$0.f(new ub());
      if ($$0 instanceof cmx) {
         cuq $$2 = ((cmx)$$0).fY().f();
         if (!$$2.e()) {
            $$1.a("SelectedItem", $$2.a($$0.dQ()));
         }
      }

      return $$1;
   }

   public ub a() {
      return this.c;
   }
}
