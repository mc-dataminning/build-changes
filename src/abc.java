import java.time.Instant;
import javax.annotation.Nullable;

public record abc(String a, Instant b, long c, @Nullable tp d, tk.b e) implements uw<aav> {
   public abc(sh $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), $$0.c(tp::a), new tk.b($$0));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, tp::a);
      this.e.a($$0);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public tp f() {
      return this.d;
   }

   public tk.b g() {
      return this.e;
   }
}
