import java.util.List;

public record aan(List<im> c) implements aaa {
   public static final yq<vs, aan> a = aaa.a(aan::a, aan::new);
   public static final aaa.b<aan> b = aaa.a("debug/raids");

   private aan(vs $$0) {
      this($$0.a(im.b));
   }

   private void a(vs $$0) {
      $$0.a(this.c, im.b);
   }

   @Override
   public aaa.b<aan> a() {
      return b;
   }

   public List<im> b() {
      return this.c;
   }
}
