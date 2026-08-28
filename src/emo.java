import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class emo extends eko {
   public static final MapCodec<emo> d = a(emo::new);

   public emo(eko.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      return a($$0, dzw.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(elg $$0, eko.a $$1) {
      dcy $$2 = $$1.h();
      eav $$3 = $$1.f();
      je $$4 = new je($$2.d(), 90, $$2.e());
      dnj $$5 = dnj.a($$3);
      emn.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ekx<?> e() {
      return ekx.e;
   }
}
