import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxb {
   private final dgl a;
   private final ji b;
   private final boolean c;
   @Nullable
   private dwx d;
   @Nullable
   private dtz e;
   private boolean f;

   public dxb(dgl $$0, ji $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dwx a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dtz b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dgl c() {
      return this.a;
   }

   public ji d() {
      return this.b;
   }

   public static Predicate<dxb> a(Predicate<dwx> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
