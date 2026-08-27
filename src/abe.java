import java.time.Instant;
import javax.annotation.Nullable;

public record abe(String a, Instant b, long c, @Nullable tq d, tl.b e) implements ux<aaw> {
   public abe(si $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), $$0.c(tq::a), new tl.b($$0));
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, tq::a);
      this.e.a($$0);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public tq f() {
      return this.d;
   }

   public tl.b g() {
      return this.e;
   }
}
