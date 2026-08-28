import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class enh extends eno {
   public final awu<dfy> a;
   public static final MapCodec<enh> b = awu.b(lu.f).xmap(enh::new, $$0 -> $$0.a).fieldOf("value");

   public enh(awu<dfy> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public enr.c a(dcz $$0, jd $$1, jd $$2, enr.c $$3, enr.c $$4, enn $$5) {
      return ecd.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected enq<?> a() {
      return enq.n;
   }
}
