import java.util.List;

public record aad(List<id> c) implements zq {
   public static final yg<vi, aad> a = zq.a(aad::a, aad::new);
   public static final zq.b<aad> b = zq.a("debug/raids");

   private aad(vi $$0) {
      this($$0.a(id.b));
   }

   private void a(vi $$0) {
      $$0.a(this.c, id.b);
   }

   @Override
   public zq.b<aad> a() {
      return b;
   }

   public List<id> b() {
      return this.c;
   }
}
