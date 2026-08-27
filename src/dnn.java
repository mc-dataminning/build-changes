import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnn extends dfc {
   public static final MapCodec<dnn> a = b(dnn::new);
   private static final xe d = xe.c("container.stonecutter");
   public static final dtw b = djc.aE;
   protected static final exn c = dfc.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.az);
         return bqa.b;
      }
   }

   @Nullable
   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return new bqk(($$2x, $$3, $$4) -> new crk($$2x, $$3, cpr.a($$1, $$2)), d);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
