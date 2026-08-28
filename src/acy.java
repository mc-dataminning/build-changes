import java.util.List;

public record acy(acy.a b, List<String> c) implements zk<abz> {
   public static final zb<wa, acy> a = zk.a(acy::a, acy::new);

   private acy(wa $$0) {
      this($$0.b(acy.a.class), $$0.a(wa::p));
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wa::a);
   }

   @Override
   public zm<acy> a() {
      return ago.y;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
