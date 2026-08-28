public interface dhp {
   boolean b(dem var1, jf var2, dus var3);

   boolean a(dej var1, azn var2, jf var3, dus var4);

   void a(arj var1, azn var2, jf var3, dus var4);

   default jf a(jf $$0) {
      return switch (this.as_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dhp.a as_() {
      return dhp.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
