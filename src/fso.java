import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fso implements bhy {
   private final ftf a;
   private final Set<bhw> b = new ObjectOpenHashSet();
   private final bie c = new bie();

   public fso(LongSupplier $$0, ftf $$1) {
      this.a = $$1;
      this.b.add(bif.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bif.a());
      this.b.add(bhw.a("totalChunks", bhv.f, this.a, ftf::i));
      this.b.add(bhw.a("renderedChunks", bhv.f, this.a, ftf::k));
      this.b.add(bhw.a("lastViewDistance", bhv.f, this.a, ftf::j));
      fwg $$0 = this.a.h();
      this.b.add(bhw.a("toUpload", bhv.g, $$0, fwg::c));
      this.b.add(bhw.a("freeBufferCount", bhv.g, $$0, fwg::d));
      this.b.add(bhw.a("toBatchCount", bhv.g, $$0, fwg::b));
      if (epu.a().isPresent()) {
         this.b.add(bhw.a("gpuUtilization", bhv.i, evi.O(), evi::u));
      }
   }

   @Override
   public Set<bhw> a(Supplier<bgq> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
