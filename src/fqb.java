import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fqb implements bgu {
   private final fqs a;
   private final Set<bgs> b = new ObjectOpenHashSet();
   private final bha c = new bha();

   public fqb(LongSupplier $$0, fqs $$1) {
      this.a = $$1;
      this.b.add(bhb.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bhb.a());
      this.b.add(bgs.a("totalChunks", bgr.f, this.a, fqs::i));
      this.b.add(bgs.a("renderedChunks", bgr.f, this.a, fqs::k));
      this.b.add(bgs.a("lastViewDistance", bgr.f, this.a, fqs::j));
      fts $$0 = this.a.h();
      this.b.add(bgs.a("toUpload", bgr.g, $$0, fts::c));
      this.b.add(bgs.a("freeBufferCount", bgr.g, $$0, fts::d));
      this.b.add(bgs.a("toBatchCount", bgr.g, $$0, fts::b));
      if (enp.a().isPresent()) {
         this.b.add(bgs.a("gpuUtilization", bgr.i, etd.N(), etd::u));
      }
   }

   @Override
   public Set<bgs> a(Supplier<bfm> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
