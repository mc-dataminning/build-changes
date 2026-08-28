import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dk(ua c) {
   public static final Codec<dk> a = uy.j.xmap(dk::new, dk::a);
   public static final yw<ByteBuf, dk> b = yu.o.a(dk::new, dk::a);

   public boolean a(cuo $$0) {
      cxf $$1 = $$0.a(kq.b, cxf.a);
      return $$1.b(this.c);
   }

   public boolean a(bsq $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable ux $$0) {
      return $$0 != null && up.a(this.c, $$0, true);
   }

   public static ua b(bsq $$0) {
      ua $$1 = $$0.f(new ua());
      if ($$0 instanceof cmv) {
         cuo $$2 = ((cmv)$$0).fZ().f();
         if (!$$2.e()) {
            $$1.a("SelectedItem", $$2.a($$0.dS()));
         }
      }

      return $$1;
   }

   public ua a() {
      return this.c;
   }
}
