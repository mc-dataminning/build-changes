import java.time.Instant;
import javax.annotation.Nullable;

public record ado(String a, Instant b, long c, @Nullable vp d, vk.b e) implements xd<adg> {
   public ado(ug $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), $$0.c(vp::a), new vk.b($$0));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, vp::a);
      this.e.a($$0);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public vp f() {
      return this.d;
   }

   public vk.b g() {
      return this.e;
   }
}
