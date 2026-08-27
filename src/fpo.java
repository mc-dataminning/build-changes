import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fpo implements bgn {
   private final fqf a;
   private final Set<bgl> b = new ObjectOpenHashSet();
   private final bgt c = new bgt();

   public fpo(LongSupplier $$0, fqf $$1) {
      this.a = $$1;
      this.b.add(bgu.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bgu.a());
      this.b.add(bgl.a("totalChunks", bgk.f, this.a, fqf::i));
      this.b.add(bgl.a("renderedChunks", bgk.f, this.a, fqf::k));
      this.b.add(bgl.a("lastViewDistance", bgk.f, this.a, fqf::j));
      ftf $$0 = this.a.h();
      this.b.add(bgl.a("toUpload", bgk.g, $$0, ftf::c));
      this.b.add(bgl.a("freeBufferCount", bgk.g, $$0, ftf::d));
      this.b.add(bgl.a("toBatchCount", bgk.g, $$0, ftf::b));
      if (end.a().isPresent()) {
         this.b.add(bgl.a("gpuUtilization", bgk.i, esr.N(), esr::u));
      }
   }

   @Override
   public Set<bgl> a(Supplier<bff> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
