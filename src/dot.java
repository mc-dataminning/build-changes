import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dot extends dgv {
   public static final MapCodec<dot> a = b(dot::new);
   private static final xd d = xd.c("container.stonecutter");
   public static final duu b = dkr.aE;
   protected static final eyx c = dgv.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   public dot(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c));
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.g().g());
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awn.ay);
      }

      return brk.a;
   }

   @Nullable
   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      return new brs(($$2x, $$3, $$4) -> new cst($$2x, $$3, crd.a($$1, $$2)), d);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
