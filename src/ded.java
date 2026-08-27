public interface ded {
   boolean b(dbc var1, io var2, drd var3);

   boolean a(daz var1, aym var2, io var3, drd var4);

   void a(aqn var1, aym var2, io var3, drd var4);

   default io a(io $$0) {
      return switch (this.ar_()) {
         case a -> $$0.c();
         case b -> $$0;
      };
   }

   default ded.a ar_() {
      return ded.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
