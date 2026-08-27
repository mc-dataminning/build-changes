import java.time.Instant;
import javax.annotation.Nullable;

public record adr(String a, Instant b, long c, @Nullable vr d, vm.b e) implements xf<adj> {
   public adr(ui $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), $$0.c(vr::a), new vm.b($$0));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, vr::a);
      this.e.a($$0);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public vr f() {
      return this.d;
   }

   public vm.b g() {
      return this.e;
   }
}
