import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fsn {
   @Nullable
   private fsn.a a;
   @Nullable
   private fsr b;

   public void a(ajg<? extends iy<?>> $$0, List<jc.a> $$1) {
      if (this.a == null) {
         this.a = new fsn.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ajg<? extends iy<?>>, avg.a> $$0) {
      if (this.b == null) {
         this.b = new fsr();
      }

      $$0.forEach(this.b::a);
   }

   public iz.b a(asr $$0, iz $$1, boolean $$2) {
      is<fsc> $$3 = fsc.a();
      iz $$6;
      if (this.a != null) {
         iz.b $$4 = $$3.b(fsc.b);
         iz.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fsc.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<ajg<? extends iy<?>>, List<jc.a>> a = new HashMap<>();

      public void a(ajg<? extends iy<?>> $$0, List<jc.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public iz a(asr $$0, iz $$1) {
         return ajc.a(this.a, $$0, $$1, ajc.c);
      }
   }
}
