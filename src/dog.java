import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dog extends dpz implements dkx {
   public static final MapCodec<dog> a = b(dog::new);
   private final dqa e = new dqa(this);

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(dyl.d $$0) {
      super($$0);
   }

   public static ToIntFunction<dym> b(int $$0) {
      return $$1 -> dpy.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return jo.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(dym $$0) {
      return $$0.y().c();
   }

   @Override
   public dqa c() {
      return this.e;
   }
}
