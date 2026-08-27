import javax.annotation.Nullable;

public record abo(akn b, @Nullable byte[] c) implements ze<abn> {
   public static final yv<vx, abo> a = ze.a(abo::a, abo::new);

   private abo(vx $$0) {
      this($$0.q(), $$0.c(zr.b));
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zr.b);
   }

   @Override
   public zg<abo> a() {
      return abm.b;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
