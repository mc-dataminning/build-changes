import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fmn implements bel {
   private final fne a;
   private final Set<bej> b = new ObjectOpenHashSet();
   private final ber c = new ber();

   public fmn(LongSupplier $$0, fne $$1) {
      this.a = $$1;
      this.b.add(bes.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bes.a());
      this.b.add(bej.a("totalChunks", bei.f, this.a, fne::i));
      this.b.add(bej.a("renderedChunks", bei.f, this.a, fne::k));
      this.b.add(bej.a("lastViewDistance", bei.f, this.a, fne::j));
      fqe $$0 = this.a.h();
      this.b.add(bej.a("toUpload", bei.g, $$0, fqe::c));
      this.b.add(bej.a("freeBufferCount", bei.g, $$0, fqe::d));
      this.b.add(bej.a("toBatchCount", bei.g, $$0, fqe::b));
      if (ela.a().isPresent()) {
         this.b.add(bej.a("gpuUtilization", bei.i, eqn.N(), eqn::u));
      }
   }

   @Override
   public Set<bej> a(Supplier<bdc> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
