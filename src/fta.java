import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fta implements bhz {
   private final ftr a;
   private final Set<bhx> b = new ObjectOpenHashSet();
   private final bif c = new bif();

   public fta(LongSupplier $$0, ftr $$1) {
      this.a = $$1;
      this.b.add(big.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(big.a());
      this.b.add(bhx.a("totalChunks", bhw.f, this.a, ftr::i));
      this.b.add(bhx.a("renderedChunks", bhw.f, this.a, ftr::k));
      this.b.add(bhx.a("lastViewDistance", bhw.f, this.a, ftr::j));
      fws $$0 = this.a.h();
      this.b.add(bhx.a("toUpload", bhw.g, $$0, fws::c));
      this.b.add(bhx.a("freeBufferCount", bhw.g, $$0, fws::d));
      this.b.add(bhx.a("toBatchCount", bhw.g, $$0, fws::b));
      if (eqd.a().isPresent()) {
         this.b.add(bhx.a("gpuUtilization", bhw.i, evr.O(), evr::u));
      }
   }

   @Override
   public Set<bhx> a(Supplier<bgr> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
