public interface fmo {
   fmq a();

   public static record a(fmq a) implements fmo {
      @Override
      public fmq a() {
         return this.a.a() == fmp.b ? this.a : fmq.b;
      }

      public fmq b() {
         return this.a;
      }
   }

   public static class b implements fmo {
      @Override
      public fmq a() {
         return fmq.b;
      }
   }

   public static record c(boolean a) implements fmo {
      @Override
      public fmq a() {
         return this.a ? fmq.b : fmq.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
