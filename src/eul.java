public class eul extends euk {
   public static final int b = 5;
   public final int c;

   public eul(int $$0, int $$1) {
      super(esz.b.a($$1));
      if ($$0 >= 0 && $$0 <= 120) {
         this.c = $$0;
      } else {
         this.c = 5;
      }
   }
}
