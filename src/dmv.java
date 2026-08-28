import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dmv extends don implements djn {
   public static final MapCodec<dmv> a = b(dmv::new);
   private final doo e = new doo(this);

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(dwu.d $$0) {
      super($$0);
   }

   public static ToIntFunction<dwv> b(int $$0) {
      return $$1 -> dom.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return jn.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(dwv $$0) {
      return $$0.y().c();
   }

   @Override
   public doo c() {
      return this.e;
   }
}
