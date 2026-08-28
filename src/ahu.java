import java.time.Instant;
import javax.annotation.Nullable;

public record ahu(String b, Instant c, long d, @Nullable yh e, yc.b f) implements aac<ahm> {
   public static final zt<ws, ahu> a = aac.a(ahu::a, ahu::new);

   private ahu(ws $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(yh::a), new yc.b($$0));
   }

   private void a(ws $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, yh::a);
      this.f.a($$0);
   }

   @Override
   public aae<ahu> a() {
      return ahk.br;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public yh g() {
      return this.e;
   }

   public yc.b h() {
      return this.f;
   }
}
