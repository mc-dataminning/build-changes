import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fnh implements bfb {
   private final fny a;
   private final Set<bez> b = new ObjectOpenHashSet();
   private final bfh c = new bfh();

   public fnh(LongSupplier $$0, fny $$1) {
      this.a = $$1;
      this.b.add(bfi.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bfi.a());
      this.b.add(bez.a("totalChunks", bey.f, this.a, fny::i));
      this.b.add(bez.a("renderedChunks", bey.f, this.a, fny::k));
      this.b.add(bez.a("lastViewDistance", bey.f, this.a, fny::j));
      fqy $$0 = this.a.h();
      this.b.add(bez.a("toUpload", bey.g, $$0, fqy::c));
      this.b.add(bez.a("freeBufferCount", bey.g, $$0, fqy::d));
      this.b.add(bez.a("toBatchCount", bey.g, $$0, fqy::b));
      if (elc.a().isPresent()) {
         this.b.add(bez.a("gpuUtilization", bey.i, eqp.O(), eqp::v));
      }
   }

   @Override
   public Set<bez> a(Supplier<bdt> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
