import java.time.Instant;

public record agz(String b, Instant c, long d, ew e, xs.b f) implements zs<ags> {
   public static final zj<wl, agz> a = zs.a(agz::a, agz::new);

   private agz(wl $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new ew($$0), new xs.b($$0));
   }

   private void a(wl $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zu<agz> a() {
      return agq.bk;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public ew g() {
      return this.e;
   }

   public xs.b h() {
      return this.f;
   }
}
