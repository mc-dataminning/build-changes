import javax.annotation.Nullable;

public class agv implements aac<acr> {
   public static final zt<ws, agv> a = aac.a(agv::a, agv::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alz d;
   @Nullable
   private final axg e;

   public agv(@Nullable alz $$0, @Nullable axg $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agv(ws $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(axg.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(ws $$0) {
      if (this.e != null) {
         if (this.d != null) {
            $$0.l(3);
            $$0.a(this.e);
            $$0.a(this.d);
         } else {
            $$0.l(1);
            $$0.a(this.e);
         }
      } else if (this.d != null) {
         $$0.l(2);
         $$0.a(this.d);
      } else {
         $$0.l(0);
      }
   }

   @Override
   public aae<agv> a() {
      return ahk.aY;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   @Nullable
   public alz b() {
      return this.d;
   }

   @Nullable
   public axg e() {
      return this.e;
   }
}
