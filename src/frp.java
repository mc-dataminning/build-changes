import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class frp implements bhi {
   private final fsg a;
   private final Set<bhg> b = new ObjectOpenHashSet();
   private final bho c = new bho();

   public frp(LongSupplier $$0, fsg $$1) {
      this.a = $$1;
      this.b.add(bhp.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bhp.a());
      this.b.add(bhg.a("totalChunks", bhf.f, this.a, fsg::i));
      this.b.add(bhg.a("renderedChunks", bhf.f, this.a, fsg::k));
      this.b.add(bhg.a("lastViewDistance", bhf.f, this.a, fsg::j));
      fvh $$0 = this.a.h();
      this.b.add(bhg.a("toUpload", bhf.g, $$0, fvh::c));
      this.b.add(bhg.a("freeBufferCount", bhf.g, $$0, fvh::d));
      this.b.add(bhg.a("toBatchCount", bhf.g, $$0, fvh::b));
      if (eow.a().isPresent()) {
         this.b.add(bhg.a("gpuUtilization", bhf.i, euk.N(), euk::u));
      }
   }

   @Override
   public Set<bhg> a(Supplier<bga> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
