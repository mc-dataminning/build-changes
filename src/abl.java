import java.time.Instant;
import javax.annotation.Nullable;

public record abl(String a, Instant b, long c, @Nullable tx d, ts.b e) implements ve<abd> {
   public abl(sp $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), $$0.c(tx::a), new ts.b($$0));
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, tx::a);
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
   public tx f() {
      return this.d;
   }

   public ts.b g() {
      return this.e;
   }
}
