import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dpg extends dqz implements dlx {
   public static final MapCodec<dpg> a = b(dpg::new);
   private final dra e = new dra(this);

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   public dpg(dzn.d $$0) {
      super($$0);
   }

   public static ToIntFunction<dzo> b(int $$0) {
      return $$1 -> dqy.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return ja.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(dzo $$0) {
      return $$0.y().c();
   }

   @Override
   public dra c() {
      return this.e;
   }
}
