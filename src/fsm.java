import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fsm implements bhx {
   private final ftd a;
   private final Set<bhv> b = new ObjectOpenHashSet();
   private final bid c = new bid();

   public fsm(LongSupplier $$0, ftd $$1) {
      this.a = $$1;
      this.b.add(bie.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bie.a());
      this.b.add(bhv.a("totalChunks", bhu.f, this.a, ftd::i));
      this.b.add(bhv.a("renderedChunks", bhu.f, this.a, ftd::k));
      this.b.add(bhv.a("lastViewDistance", bhu.f, this.a, ftd::j));
      fwe $$0 = this.a.h();
      this.b.add(bhv.a("toUpload", bhu.g, $$0, fwe::c));
      this.b.add(bhv.a("freeBufferCount", bhu.g, $$0, fwe::d));
      this.b.add(bhv.a("toBatchCount", bhu.g, $$0, fwe::b));
      if (eps.a().isPresent()) {
         this.b.add(bhv.a("gpuUtilization", bhu.i, evg.O(), evg::u));
      }
   }

   @Override
   public Set<bhv> a(Supplier<bgp> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
