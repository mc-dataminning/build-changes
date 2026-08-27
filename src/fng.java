import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fng implements beq {
   private final fnx a;
   private final Set<beo> b = new ObjectOpenHashSet();
   private final bew c = new bew();

   public fng(LongSupplier $$0, fnx $$1) {
      this.a = $$1;
      this.b.add(bex.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bex.a());
      this.b.add(beo.a("totalChunks", ben.f, this.a, fnx::i));
      this.b.add(beo.a("renderedChunks", ben.f, this.a, fnx::k));
      this.b.add(beo.a("lastViewDistance", ben.f, this.a, fnx::j));
      fqx $$0 = this.a.h();
      this.b.add(beo.a("toUpload", ben.g, $$0, fqx::c));
      this.b.add(beo.a("freeBufferCount", ben.g, $$0, fqx::d));
      this.b.add(beo.a("toBatchCount", ben.g, $$0, fqx::b));
      if (eld.a().isPresent()) {
         this.b.add(beo.a("gpuUtilization", ben.i, eqq.O(), eqq::v));
      }
   }

   @Override
   public Set<beo> a(Supplier<bdi> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
