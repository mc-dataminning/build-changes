import java.util.List;

public record aax(List<iv> c) implements aak {
   public static final yy<vw, aax> a = aak.a(aax::a, aax::new);
   public static final aak.b<aax> b = aak.a("debug/raids");

   private aax(vw $$0) {
      this($$0.a(iv.b));
   }

   private void a(vw $$0) {
      $$0.a(this.c, iv.b);
   }

   @Override
   public aak.b<aax> a() {
      return b;
   }

   public List<iv> b() {
      return this.c;
   }
}
