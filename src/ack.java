import java.util.List;

public record ack(ack.a b, List<String> c) implements yw<abl> {
   public static final yn<vl, ack> a = yw.a(ack::a, ack::new);

   private ack(vl $$0) {
      this($$0.b(ack.a.class), $$0.a(vl::p));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vl::a);
   }

   @Override
   public yy<ack> a() {
      return age.y;
   }

   public void a(abl $$0) {
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
