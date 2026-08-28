import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dk(ug c) {
   public static final Codec<dk> a = ve.j.xmap(dk::new, dk::a);
   public static final zc<ByteBuf, dk> b = za.p.a(dk::new, dk::a);

   public boolean a(cvs $$0) {
      cyh $$1 = $$0.a(ks.b, cyh.a);
      return $$1.b(this.c);
   }

   public boolean a(btr $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vd $$0) {
      return $$0 != null && uv.a(this.c, $$0, true);
   }

   public static ug b(btr $$0) {
      ug $$1 = $$0.f(new ug());
      if ($$0 instanceof cnx) {
         cvs $$2 = ((cnx)$$0).gd().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dU()));
         }
      }

      return $$1;
   }

   public ug a() {
      return this.c;
   }
}
