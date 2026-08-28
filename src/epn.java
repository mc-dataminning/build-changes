import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epn extends enn {
   public static final MapCodec<epn> d = a(epn::new);

   public epn(enn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      return a($$0, ect.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eof $$0, enn.a $$1) {
      dfp $$2 = $$1.h();
      eds $$3 = $$1.f();
      ji $$4 = new ji($$2.d(), 90, $$2.e());
      dqf $$5 = dqf.a($$3);
      epm.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public enw<?> e() {
      return enw.e;
   }
}
