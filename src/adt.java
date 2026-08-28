public class adt implements zg<abu> {
   public static final yx<vw, adt> a = zg.a(adt::a, adt::new);
   private final int b;
   private final akr c;

   public adt(int $$0, czb<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private adt(vw $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(vw $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<adt> a() {
      return agg.Y;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public akr b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
