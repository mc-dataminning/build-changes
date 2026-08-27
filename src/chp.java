public interface chp extends bpw<chs> {
   cho gw();

   void a(cho var1);

   default chs a() {
      return this.gw().a();
   }

   default void a(chs $$0) {
      this.a(this.gw().a($$0));
   }
}
