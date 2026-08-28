import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dmx extends dop implements djp {
   public static final MapCodec<dmx> a = b(dmx::new);
   private final doq e = new doq(this);

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dww.d $$0) {
      super($$0);
   }

   public static ToIntFunction<dwx> b(int $$0) {
      return $$1 -> doo.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return jn.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(dwx $$0) {
      return $$0.y().c();
   }

   @Override
   public doq c() {
      return this.e;
   }
}
