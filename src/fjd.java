import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fjd implements bbu {
   private final fjv a;
   private final Set<bbs> b = new ObjectOpenHashSet();
   private final bca c = new bca();

   public fjd(LongSupplier $$0, fjv $$1) {
      this.a = $$1;
      this.b.add(bcb.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bcb.a());
      this.b.add(bbs.a("totalChunks", bbr.f, this.a, fjv::i));
      this.b.add(bbs.a("renderedChunks", bbr.f, this.a, fjv::k));
      this.b.add(bbs.a("lastViewDistance", bbr.f, this.a, fjv::j));
      fmp $$0 = this.a.h();
      this.b.add(bbs.a("toUpload", bbr.g, $$0, fmp::c));
      this.b.add(bbs.a("freeBufferCount", bbr.g, $$0, fmp::d));
      this.b.add(bbs.a("toBatchCount", bbr.g, $$0, fmp::b));
      if (eic.a().isPresent()) {
         this.b.add(bbs.a("gpuUtilization", bbr.i, enn.N(), enn::u));
      }
   }

   @Override
   public Set<bbs> a(Supplier<bal> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
