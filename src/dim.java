public interface dim {
   boolean b(dfi var1, jh var2, dvo var3);

   boolean a(dff var1, azv var2, jh var3, dvo var4);

   void a(arq var1, azv var2, jh var3, dvo var4);

   default jh a(jh $$0) {
      return switch (this.ar_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dim.a ar_() {
      return dim.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
