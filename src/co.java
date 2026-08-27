import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record co(tm c) {
   public static final Codec<co> a = uk.i.xmap(co::new, co::a);
   public static final ye<ByteBuf, co> b = yc.n.a(co::new, co::a);

   public boolean a(crj $$0) {
      ctt $$1 = $$0.a(jp.a, ctt.a);
      return $$1.b(this.c);
   }

   public boolean a(bpv $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uj $$0) {
      return $$0 != null && ub.a(this.c, $$0, true);
   }

   public static tm b(bpv $$0) {
      tm $$1 = $$0.f(new tm());
      if ($$0 instanceof cjt) {
         crj $$2 = ((cjt)$$0).fZ().f();
         if (!$$2.d()) {
            $$1.a("SelectedItem", $$2.a($$0.dO()));
         }
      }

      return $$1;
   }

   public tm a() {
      return this.c;
   }
}
