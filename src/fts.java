import java.util.List;

public class fts<T extends bxs, M extends fdr<T>> extends ftg<T, M> {
   private final acq a;
   private final fts.a<T> b;
   private final fts.b<T, M> c;

   public fts(fqt<T, M> $$0, acq $$1, fts.a<T> $$2, fts.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cb()) {
         this.a();
         ein $$10 = $$1.getBuffer(fkf.i(this.a));
         this.c().a($$0, $$10, $$2, fpz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fee> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends bxs> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends bxs, M extends fbf<T>> {
      List<fee> getPartsToDraw(M var1);
   }
}
