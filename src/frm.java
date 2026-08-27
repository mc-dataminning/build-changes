import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class frm {
   @Nullable
   private frm.a a;
   @Nullable
   private frm.b b;

   public void a(ajb<? extends ix<?>> $$0, List<jb.a> $$1) {
      if (this.a == null) {
         this.a = new frm.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ajb<? extends ix<?>>, auw.a> $$0) {
      if (this.b == null) {
         this.b = new frm.b();
      }

      $$0.forEach(this.b::a);
   }

   public iy.b a(iy $$0, boolean $$1) {
      is<frc> $$2 = frc.a();
      iy $$4;
      if (this.a != null) {
         iy.b $$3 = this.a.a($$2.b(frc.b)).d();
         $$4 = $$2.a(frc.b, $$3).a();
      } else {
         $$4 = $$0;
      }

      if (this.b != null && !$$1) {
         $$2.a(frc.a).c().forEach($$0x -> $$0x.b().m());
         this.b.a($$4);
      }

      return $$4.d();
   }

   static class a {
      private final Map<ajb<? extends ix<?>>, List<jb.a>> a = new HashMap<>();

      public void a(ajb<? extends ix<?>> $$0, List<jb.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public iy a(iy $$0) {
         return aix.a(this.a, $$0, aix.c);
      }
   }

   static class b {
      private final Map<ajb<? extends ix<?>>, auw.a> a = new HashMap<>();

      public void a(ajb<? extends ix<?>> $$0, auw.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(iy $$0) {
         this.a.forEach(($$1, $$2) -> $$2.a($$0.d((ajb<? extends ix<?>>)$$1)));
      }
   }
}
