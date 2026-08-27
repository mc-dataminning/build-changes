import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dcc extends ddr implements cyv, dfs {
   public static final MapCodec<dcc> a = b(dcc::new);
   private static final dma c = dlz.C;
   private final dds d = new dds(this);

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   public dcc(dli.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dlj> b(int $$0) {
      return $$1 -> ddr.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, crk $$1) {
      return !$$1.n().a(cpg.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return ie.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(c) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return $$0.u().c();
   }

   @Override
   public dds c() {
      return this.d;
   }
}
