import java.time.Instant;
import javax.annotation.Nullable;

public record abh(String a, Instant b, long c, @Nullable tt d, to.b e) implements va<aaz> {
   public abh(sl $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), $$0.c(tt::a), new to.b($$0));
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, tt::a);
      this.e.a($$0);
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public tt f() {
      return this.d;
   }

   public to.b g() {
      return this.e;
   }
}
