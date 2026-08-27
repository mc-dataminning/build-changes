import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ekz extends elg {
   public final awl<ddy> a;
   public static final MapCodec<ekz> b = awl.b(lf.f).xmap(ekz::new, $$0 -> $$0.a).fieldOf("value");

   public ekz(awl<ddy> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      return dzx.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eli<?> a() {
      return eli.n;
   }
}
