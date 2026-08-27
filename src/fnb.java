import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fnb implements ben {
   private final fns a;
   private final Set<bel> b = new ObjectOpenHashSet();
   private final bet c = new bet();

   public fnb(LongSupplier $$0, fns $$1) {
      this.a = $$1;
      this.b.add(beu.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(beu.a());
      this.b.add(bel.a("totalChunks", bek.f, this.a, fns::i));
      this.b.add(bel.a("renderedChunks", bek.f, this.a, fns::k));
      this.b.add(bel.a("lastViewDistance", bek.f, this.a, fns::j));
      fqs $$0 = this.a.h();
      this.b.add(bel.a("toUpload", bek.g, $$0, fqs::c));
      this.b.add(bel.a("freeBufferCount", bek.g, $$0, fqs::d));
      this.b.add(bel.a("toBatchCount", bek.g, $$0, fqs::b));
      if (eky.a().isPresent()) {
         this.b.add(bel.a("gpuUtilization", bek.i, eql.O(), eql::v));
      }
   }

   @Override
   public Set<bel> a(Supplier<bdf> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
