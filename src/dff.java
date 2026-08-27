public interface dff {
   boolean b(dcd var1, ir var2, dtc var3);

   boolean a(dca var1, ayt var2, ir var3, dtc var4);

   void a(aqt var1, ayt var2, ir var3, dtc var4);

   default ir a(ir $$0) {
      return switch (this.aq_()) {
         case a -> $$0.c();
         case b -> $$0;
      };
   }

   default dff.a aq_() {
      return dff.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
