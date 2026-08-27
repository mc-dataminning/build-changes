import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fsn implements bhx {
   private final fte a;
   private final Set<bhv> b = new ObjectOpenHashSet();
   private final bid c = new bid();

   public fsn(LongSupplier $$0, fte $$1) {
      this.a = $$1;
      this.b.add(bie.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bie.a());
      this.b.add(bhv.a("totalChunks", bhu.f, this.a, fte::i));
      this.b.add(bhv.a("renderedChunks", bhu.f, this.a, fte::k));
      this.b.add(bhv.a("lastViewDistance", bhu.f, this.a, fte::j));
      fwf $$0 = this.a.h();
      this.b.add(bhv.a("toUpload", bhu.g, $$0, fwf::c));
      this.b.add(bhv.a("freeBufferCount", bhu.g, $$0, fwf::d));
      this.b.add(bhv.a("toBatchCount", bhu.g, $$0, fwf::b));
      if (ept.a().isPresent()) {
         this.b.add(bhv.a("gpuUtilization", bhu.i, evh.O(), evh::u));
      }
   }

   @Override
   public Set<bhv> a(Supplier<bgp> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
