import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class foh implements bfy {
   private final foz a;
   private final Set<bfw> b = new ObjectOpenHashSet();
   private final bge c = new bge();

   public foh(LongSupplier $$0, foz $$1) {
      this.a = $$1;
      this.b.add(bgf.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bgf.a());
      this.b.add(bfw.a("totalChunks", bfv.f, this.a, foz::i));
      this.b.add(bfw.a("renderedChunks", bfv.f, this.a, foz::k));
      this.b.add(bfw.a("lastViewDistance", bfv.f, this.a, foz::j));
      fry $$0 = this.a.h();
      this.b.add(bfw.a("toUpload", bfv.g, $$0, fry::c));
      this.b.add(bfw.a("freeBufferCount", bfv.g, $$0, fry::d));
      this.b.add(bfw.a("toBatchCount", bfv.g, $$0, fry::b));
      if (ema.a().isPresent()) {
         this.b.add(bfw.a("gpuUtilization", bfv.i, ero.O(), ero::v));
      }
   }

   @Override
   public Set<bfw> a(Supplier<beq> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
