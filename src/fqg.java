import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fqg implements bgy {
   private final fqx a;
   private final Set<bgw> b = new ObjectOpenHashSet();
   private final bhe c = new bhe();

   public fqg(LongSupplier $$0, fqx $$1) {
      this.a = $$1;
      this.b.add(bhf.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bhf.a());
      this.b.add(bgw.a("totalChunks", bgv.f, this.a, fqx::i));
      this.b.add(bgw.a("renderedChunks", bgv.f, this.a, fqx::k));
      this.b.add(bgw.a("lastViewDistance", bgv.f, this.a, fqx::j));
      ftx $$0 = this.a.h();
      this.b.add(bgw.a("toUpload", bgv.g, $$0, ftx::c));
      this.b.add(bgw.a("freeBufferCount", bgv.g, $$0, ftx::d));
      this.b.add(bgw.a("toBatchCount", bgv.g, $$0, ftx::b));
      if (enu.a().isPresent()) {
         this.b.add(bgw.a("gpuUtilization", bgv.i, eti.N(), eti::u));
      }
   }

   @Override
   public Set<bgw> a(Supplier<bfq> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
