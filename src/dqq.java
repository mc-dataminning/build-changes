import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dqq extends dsj implements dnf {
   public static final MapCodec<dqq> a = b(dqq::new);
   private final dsk e = new dsk(this);

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(ebd.d $$0) {
      super($$0);
   }

   public static ToIntFunction<ebe> b(int $$0) {
      return $$1 -> dsi.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return jb.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(ebe $$0) {
      return $$0.y().c();
   }

   @Override
   public dsk c() {
      return this.e;
   }
}
