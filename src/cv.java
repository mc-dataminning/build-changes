import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cv(ud e) {
   public static final Codec<cv> a = vb.i.xmap(cv::new, cv::a);
   public static final Codec<cv> b = ud.a.xmap(cv::new, cv::a);
   public static final Codec<cv> c = Codec.withAlternative(a, b);
   public static final yv<ByteBuf, cv> d = yt.n.a(cv::new, cv::a);

   public boolean a(ctq $$0) {
      cwf $$1 = $$0.a(kb.a, cwf.a);
      return $$1.b(this.e);
   }

   public boolean a(brw $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable va $$0) {
      return $$0 != null && us.a(this.e, $$0, true);
   }

   public static ud b(brw $$0) {
      ud $$1 = $$0.f(new ud());
      if ($$0 instanceof cly) {
         ctq $$2 = ((cly)$$0).gc().f();
         if (!$$2.e()) {
            $$1.a("SelectedItem", $$2.a($$0.dR()));
         }
      }

      return $$1;
   }

   public ud a() {
      return this.e;
   }
}
