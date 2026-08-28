public interface cma extends buc<cmd> {
   clz gy();

   void a(clz var1);

   default cmd a() {
      return this.gy().a();
   }

   default void a(cmd $$0) {
      this.a(this.gy().a($$0));
   }
}
