import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cw(uk e) {
   public static final Codec<cw> a = vi.i.xmap(cw::new, cw::a);
   public static final Codec<cw> b = uk.a.xmap(cw::new, cw::a);
   public static final Codec<cw> c = axu.e(a, b);
   public static final zc<ByteBuf, cw> d = za.o.a(cw::new, cw::a);

   public boolean a(cuh $$0) {
      cxf $$1 = $$0.a(ke.a, cxf.a);
      return $$1.b(this.e);
   }

   public boolean a(brv $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vh $$0) {
      return $$0 != null && uz.a(this.e, $$0, true);
   }

   public static uk b(brv $$0) {
      uk $$1 = $$0.f(new uk());
      if ($$0 instanceof cly) {
         cuh $$2 = ((cly)$$0).gl().f();
         if (!$$2.d()) {
            $$1.a("SelectedItem", $$2.a($$0.dY()));
         }
      }

      return $$1;
   }

   public uk a() {
      return this.e;
   }
}
