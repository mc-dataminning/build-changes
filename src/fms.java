import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fms implements ben {
   private final fnj a;
   private final Set<bel> b = new ObjectOpenHashSet();
   private final bet c = new bet();

   public fms(LongSupplier $$0, fnj $$1) {
      this.a = $$1;
      this.b.add(beu.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(beu.a());
      this.b.add(bel.a("totalChunks", bek.f, this.a, fnj::i));
      this.b.add(bel.a("renderedChunks", bek.f, this.a, fnj::k));
      this.b.add(bel.a("lastViewDistance", bek.f, this.a, fnj::j));
      fqj $$0 = this.a.h();
      this.b.add(bel.a("toUpload", bek.g, $$0, fqj::c));
      this.b.add(bel.a("freeBufferCount", bek.g, $$0, fqj::d));
      this.b.add(bel.a("toBatchCount", bek.g, $$0, fqj::b));
      if (ekz.a().isPresent()) {
         this.b.add(bel.a("gpuUtilization", bek.i, eqm.O(), eqm::v));
      }
   }

   @Override
   public Set<bel> a(Supplier<bdf> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
