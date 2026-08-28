import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dl(uj c) {
   public static final Codec<dl> a = vh.j.xmap(dl::new, dl::a);
   public static final zf<ByteBuf, dl> b = zd.p.a(dl::new, dl::a);

   public boolean a(cvx $$0) {
      cyg $$1 = $$0.a(kt.b, cyg.a);
      return $$1.b(this.c);
   }

   public boolean a(btz $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vg $$0) {
      return $$0 != null && uy.a(this.c, $$0, true);
   }

   public static uj b(btz $$0) {
      uj $$1 = $$0.f(new uj());
      if ($$0 instanceof coh) {
         cvx $$2 = ((coh)$$0).gk().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dZ()));
         }
      }

      return $$1;
   }

   public uj a() {
      return this.c;
   }
}
