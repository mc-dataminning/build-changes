public record afs(int b) implements yp<afn> {
   public static final yg<vi, afs> a = yp.a(afs::a, afs::new);

   private afs(vi $$0) {
      this($$0.l());
   }

   private void a(vi $$0) {
      $$0.c(this.b);
   }

   @Override
   public yr<afs> a() {
      return afl.bh;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }
}
