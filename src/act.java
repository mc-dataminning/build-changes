import java.time.Instant;
import javax.annotation.Nullable;

public record act(String a, Instant b, long c, @Nullable vd d, uy.b e) implements wk<acl> {
   public act(tu $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), $$0.c(vd::a), new uy.b($$0));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, vd::a);
      this.e.a($$0);
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public vd f() {
      return this.d;
   }

   public uy.b g() {
      return this.e;
   }
}
