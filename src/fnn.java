import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fnn implements bex {
   private final foe a;
   private final Set<bev> b = new ObjectOpenHashSet();
   private final bfd c = new bfd();

   public fnn(LongSupplier $$0, foe $$1) {
      this.a = $$1;
      this.b.add(bfe.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bfe.a());
      this.b.add(bev.a("totalChunks", beu.f, this.a, foe::i));
      this.b.add(bev.a("renderedChunks", beu.f, this.a, foe::k));
      this.b.add(bev.a("lastViewDistance", beu.f, this.a, foe::j));
      fre $$0 = this.a.h();
      this.b.add(bev.a("toUpload", beu.g, $$0, fre::c));
      this.b.add(bev.a("freeBufferCount", beu.g, $$0, fre::d));
      this.b.add(bev.a("toBatchCount", beu.g, $$0, fre::b));
      if (elk.a().isPresent()) {
         this.b.add(bev.a("gpuUtilization", beu.i, eqx.O(), eqx::v));
      }
   }

   @Override
   public Set<bev> a(Supplier<bdp> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
