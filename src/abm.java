import java.time.Instant;
import javax.annotation.Nullable;

public record abm(String a, Instant b, long c, @Nullable ty d, tt.b e) implements vf<abe> {
   public abm(sq $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), $$0.c(ty::a), new tt.b($$0));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, ty::a);
      this.e.a($$0);
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public ty f() {
      return this.d;
   }

   public tt.b g() {
      return this.e;
   }
}
