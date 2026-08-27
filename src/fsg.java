import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fsg implements bhs {
   private final fsx a;
   private final Set<bhq> b = new ObjectOpenHashSet();
   private final bhy c = new bhy();

   public fsg(LongSupplier $$0, fsx $$1) {
      this.a = $$1;
      this.b.add(bhz.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bhz.a());
      this.b.add(bhq.a("totalChunks", bhp.f, this.a, fsx::i));
      this.b.add(bhq.a("renderedChunks", bhp.f, this.a, fsx::k));
      this.b.add(bhq.a("lastViewDistance", bhp.f, this.a, fsx::j));
      fvy $$0 = this.a.h();
      this.b.add(bhq.a("toUpload", bhp.g, $$0, fvy::c));
      this.b.add(bhq.a("freeBufferCount", bhp.g, $$0, fvy::d));
      this.b.add(bhq.a("toBatchCount", bhp.g, $$0, fvy::b));
      if (epm.a().isPresent()) {
         this.b.add(bhq.a("gpuUtilization", bhp.i, eva.N(), eva::u));
      }
   }

   @Override
   public Set<bhq> a(Supplier<bgk> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
