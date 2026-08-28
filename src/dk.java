import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dk(uf c) {
   public static final Codec<dk> a = vd.j.xmap(dk::new, dk::a);
   public static final zb<ByteBuf, dk> b = yz.o.a(dk::new, dk::a);

   public boolean a(cvp $$0) {
      cye $$1 = $$0.a(kr.b, cye.a);
      return $$1.b(this.c);
   }

   public boolean a(bto $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vc $$0) {
      return $$0 != null && uu.a(this.c, $$0, true);
   }

   public static uf b(bto $$0) {
      uf $$1 = $$0.f(new uf());
      if ($$0 instanceof cnu) {
         cvp $$2 = ((cnu)$$0).gc().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dU()));
         }
      }

      return $$1;
   }

   public uf a() {
      return this.c;
   }
}
