import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dpt extends drm implements dmi {
   public static final MapCodec<dpt> a = b(dpt::new);
   private final drn e = new drn(this);

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(eag.d $$0) {
      super($$0);
   }

   public static ToIntFunction<eah> b(int $$0) {
      return $$1 -> drl.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return ja.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(eah $$0) {
      return $$0.y().c();
   }

   @Override
   public drn c() {
      return this.e;
   }
}
