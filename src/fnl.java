import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fnl implements bev {
   private final foc a;
   private final Set<bet> b = new ObjectOpenHashSet();
   private final bfb c = new bfb();

   public fnl(LongSupplier $$0, foc $$1) {
      this.a = $$1;
      this.b.add(bfc.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bfc.a());
      this.b.add(bet.a("totalChunks", bes.f, this.a, foc::i));
      this.b.add(bet.a("renderedChunks", bes.f, this.a, foc::k));
      this.b.add(bet.a("lastViewDistance", bes.f, this.a, foc::j));
      frc $$0 = this.a.h();
      this.b.add(bet.a("toUpload", bes.g, $$0, frc::c));
      this.b.add(bet.a("freeBufferCount", bes.g, $$0, frc::d));
      this.b.add(bet.a("toBatchCount", bes.g, $$0, frc::b));
      if (eli.a().isPresent()) {
         this.b.add(bet.a("gpuUtilization", bes.i, eqv.O(), eqv::v));
      }
   }

   @Override
   public Set<bet> a(Supplier<bdn> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
