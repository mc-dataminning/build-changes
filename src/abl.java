import java.time.Instant;
import javax.annotation.Nullable;

public record abl(String a, Instant b, long c, @Nullable tw d, tr.b e) implements vd<abd> {
   public abl(so $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), $$0.c(tw::a), new tr.b($$0));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, tw::a);
      this.e.a($$0);
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public tw f() {
      return this.d;
   }

   public tr.b g() {
      return this.e;
   }
}
