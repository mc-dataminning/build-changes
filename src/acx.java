import java.time.Instant;
import javax.annotation.Nullable;

public record acx(String a, Instant b, long c, @Nullable vh d, vc.b e) implements wo<acp> {
   public acx(ty $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), $$0.c(vh::a), new vc.b($$0));
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, vh::a);
      this.e.a($$0);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public vh f() {
      return this.d;
   }

   public vc.b g() {
      return this.e;
   }
}
