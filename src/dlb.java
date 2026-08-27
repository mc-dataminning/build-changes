import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends dde {
   public static final MapCodec<dlb> a = b(dlb::new);
   private static final wu d = wu.c("container.stonecutter");
   public static final drb b = dha.aE;
   protected static final eui c = dde.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c));
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avm.ay);
         return bpm.b;
      }
   }

   @Nullable
   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return new bpw(($$2x, $$3, $$4) -> new cqf($$2x, $$3, cop.a($$1, $$2)), d);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
