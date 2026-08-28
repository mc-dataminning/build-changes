import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dqf extends dry implements dmu {
   public static final MapCodec<dqf> a = b(dqf::new);
   private final drz e = new drz(this);

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   public dqf(eas.d $$0) {
      super($$0);
   }

   public static ToIntFunction<eat> b(int $$0) {
      return $$1 -> drx.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return jb.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(eat $$0) {
      return $$0.y().c();
   }

   @Override
   public drz c() {
      return this.e;
   }
}
